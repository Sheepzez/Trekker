package me.isaacjordan.TrekPlusPlus.Compiler;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Array_declContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.CommandContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.ExprContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.FuncContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Func_callContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Func_declContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Func_endContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.LiteralContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.ProcContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Proc_declContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Proc_endContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.ProgramContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Return_statementContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Seq_comContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Var_declContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusParser.Var_setContext;
import me.isaacjordan.TrekPlusPlus.Generated.TrekPlusPlusVisitor;

public class TrekPPCheckerVisitor extends AbstractParseTreeVisitor<Type> implements TrekPlusPlusVisitor<Type>{

	int errorCount = 0;
	
	public int getNumberOfContextualErrors() {
		return errorCount;
	}
	
	public TrekPPCheckerVisitor(CommonTokenStream tokens) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Type visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitFunc(FuncContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitFunc_decl(Func_declContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitFunc_end(Func_endContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitFunc_call(Func_callContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitProc(ProcContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitProc_decl(Proc_declContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitProc_end(Proc_endContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitVar_decl(Var_declContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitVar_set(Var_setContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitArray_decl(Array_declContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitSeq_com(Seq_comContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitCommand(CommandContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitReturn_statement(Return_statementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visitLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
