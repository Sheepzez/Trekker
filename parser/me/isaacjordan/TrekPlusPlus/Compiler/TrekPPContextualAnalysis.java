package me.isaacjordan.TrekPlusPlus.Compiler;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusLexer;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser;

/**
 * Main class to begin syntactic and contextual analysis of a Trek++ program.
 * 
 * @author Isaac Jordan (Sheepzez)
 *
 */
public class TrekPPContextualAnalysis {
	private static boolean tracing = false;

	private static PrintStream out = System.out;

	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new TrekPPException();
			InputStream source = new FileInputStream(args[0]);
			check(source);
		} catch (TrekPPException x) {
			out.println("Contextual analysis failed");
		} catch (Exception x) {
			x.printStackTrace(out);
		}
	}

	private static void check (InputStream source) throws Exception {
		TrekPlusPlusLexer lexer = new TrekPlusPlusLexer(new ANTLRInputStream(source));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ParseTree ast = syntacticAnalyse(tokens);
		contextualAnalyse(ast,tokens);
	}

	private static ParseTree syntacticAnalyse(CommonTokenStream tokens) throws Exception {
		out.println();
		out.println("Syntactic analysis ...");
		TrekPlusPlusParser parser = new TrekPlusPlusParser(tokens);
		ParseTree ast = parser.program();
		int errors = parser.getNumberOfSyntaxErrors();
		out.println(errors + " syntactic errors");
		if (errors > 0)
			throw new TrekPPException();
		return ast;
	}

    private static void contextualAnalyse (ParseTree ast, CommonTokenStream tokens) throws Exception {
		out.println("Contextual analysis ...");
		TrekPPCheckerVisitor checker = new TrekPPCheckerVisitor(tokens);
		checker.visit(ast);
		int errors = checker.getNumberOfContextualErrors();
		out.println(errors + " scope/type errors");
		out.println();
		if (errors > 0)
			throw new TrekPPException();
	}
}
