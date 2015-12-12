package me.isaacjordan.TrekPlusPlus.Compiler;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusLexer;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser;

/**
 * Main class to start syntactic analysis of a Trek++ program.
 * 
 * @author Isaac Jordan (Sheepzez)
 *
 */
public class TrekkPPSyntacticAnalysis {

	private static boolean tracing = false;

	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new TrekPPException("Error: No program file to parse given.");
			InputStream source = new FileInputStream(args[0]);
			ParseTree ast = syntacticAnalyse(source);
		} catch (TrekPPException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
	}

	private static ParseTree syntacticAnalyse(InputStream source) throws Exception {
		System.out.println("Syntactic analysis starting.");
		TrekPlusPlusLexer lexer = new TrekPlusPlusLexer(new ANTLRInputStream(source));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TrekPlusPlusParser parser = new TrekPlusPlusParser(tokens);
		ParseTree ast = parser.program();
		int errors = parser.getNumberOfSyntaxErrors();
		System.out.println(errors + " syntactic errors.");
		if (errors > 0)
			throw new TrekPPException("Compilation Failed.");
		return ast;
	}

}
