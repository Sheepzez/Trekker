package me.isaacjordan.TrekPlusPlus.Compiler;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusLexer;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser;

/**
 * Main class to begin complete compilation of a Trek++ program.
 * 
 * @author Isaac Jordan (Sheepzez)
 *
 */
public class TrekPPCompile {
	private static boolean tracing = true;

	private static PrintStream out = System.out;
	static String sourceFileName;

	public static void main(String[] args) {
		try {
			if (args.length == 0) throw new TrekPPException("No source file provided.");
			File sourceFile = new File(args[0]);
			if (!sourceFile.exists()) System.out.println("Error: File '" + sourceFile.getPath() + "' cannot be found.");
			sourceFileName = sourceFile.getName().replace(".trekpp", "");
			System.out.println("Compiling source file: " + sourceFileName);
			InputStream sourceStream = new FileInputStream(sourceFile);
			DataOutputStream dout = new DataOutputStream(new FileOutputStream(sourceFile.getParentFile() + "/" + sourceFileName + ".class"));
			dout.write(compile(sourceStream));
			dout.flush();
			dout.close();
		} catch (TrekPPException x) {
			out.println("Compilation failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}

	private static byte[] compile (InputStream source) throws Exception {
		TrekPlusPlusLexer lexer = new TrekPlusPlusLexer(new ANTLRInputStream(source));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ParseTree ast = syntacticAnalyse(tokens);
		contextualAnalyse(ast,tokens);
		byte[] objprog = codeGenerate(ast);
		return objprog;
	}

	private static ParseTree syntacticAnalyse(CommonTokenStream tokens) throws Exception {
		out.println("Syntactic analysis ...");
		TrekPlusPlusParser parser = new TrekPlusPlusParser(tokens);
		ParseTree ast = parser.program();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0) throw new TrekPPException();
		return ast;
	}

    private static void contextualAnalyse (ParseTree ast, CommonTokenStream tokens) throws Exception {
		out.println("Contextual analysis ...");
		TrekPPCheckerVisitor checker = new TrekPPCheckerVisitor(tokens);
		checker.visit(ast);
		int errors = checker.getNumberOfContextualErrors();
		out.println(errors + " scope/type errors");
		if (errors > 0) throw new TrekPPException();
	}

	private static byte[] codeGenerate (ParseTree ast) throws Exception  {
		out.println("Code generation ...");
		TrekPPEncoderVisitor encoder = new TrekPPEncoderVisitor();
		encoder.programFileName = sourceFileName;
		encoder.visit(ast);
		byte[] result = encoder.getClassByteArray();
		return result;
	}
}