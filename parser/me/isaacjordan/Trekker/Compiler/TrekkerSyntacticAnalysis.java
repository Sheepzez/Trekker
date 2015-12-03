package me.isaacjordan.Trekker.Compiler;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import me.isaacjordan.Trekker.Generated.TrekkerLexer;
import me.isaacjordan.Trekker.Generated.TrekkerParser;

public class TrekkerSyntacticAnalysis {

	private static boolean tracing = false;

	public static void main(String[] args) {
	// Compile a Fun source program to SVM code, 
	// then interpret it if it compiles successfully.
	// The source file name must be given as the 
	// first program argument.
		try {
			if (args.length == 0)
				throw new TrekkerException();
			InputStream source =
			   new FileInputStream(args[0]);
			ParseTree ast =
			   syntacticAnalyse(source);
		} catch (TrekkerException x) {
			System.out.println("Compilation failed");
		} catch (Exception x) {
			x.printStackTrace(System.err);
		}
	}

	private static ParseTree syntacticAnalyse
			(InputStream source)
			throws Exception {
	// Perform syntactic analysis of a Fun source program.
	// Print any error messages.
	// Return an AST representation of the Fun program.
		System.out.println();
		System.out.println("Syntactic analysis ...");
		TrekkerLexer lexer = new TrekkerLexer(
		   new ANTLRInputStream(source));
		CommonTokenStream tokens = 
		   new CommonTokenStream(lexer);
		TrekkerParser parser = new TrekkerParser(tokens);
		ParseTree ast = parser.program();
		int errors = parser.getNumberOfSyntaxErrors();
		System.out.println(errors + " syntactic errors");
		if (errors > 0)
			throw new TrekkerException();
		return ast;
	}

	private static class TrekkerException extends Exception {
	}

}
