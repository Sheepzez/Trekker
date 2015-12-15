package me.isaacjordan.TrekPlusPlus.Compiler;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

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

public class TrekPPEncoderVisitor extends AbstractParseTreeVisitor<Void> implements TrekPlusPlusVisitor<Void> {
	
	ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
	public String programFileName;
	MethodVisitor currentMethodVisitor;
	
	public byte[] getClassByteArray() {
		return classWriter.toByteArray();
	}
	
	@Override
	public Void visitProgram(ProgramContext ctx) {
		classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, programFileName, null, "java/lang/Object", null);
		visitChildren(ctx); // Visit all procedures and functions
		return null;
	}

	@Override
	public Void visitFunc(FuncContext ctx) {
		String funcName = ctx.func_decl().ID().getText();
		currentMethodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, funcName, Type.getMethodDescriptor(Type.VOID_TYPE, new Type[0]), null, null);
		currentMethodVisitor.visitInsn(Opcodes.RETURN);
		return null;
	}

	@Override
	public Void visitFunc_decl(Func_declContext ctx) {
		return null;
	}

	@Override
	public Void visitFunc_end(Func_endContext ctx) {
		return null;
	}

	@Override
	public Void visitFunc_call(Func_callContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitProc(ProcContext ctx) {
		String procName = ctx.proc_decl().ID().getText();
		if (procName.toLowerCase().equals("main")) {
			currentMethodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, procName, Type.getMethodDescriptor(Type.VOID_TYPE, Type.getType(String[].class)), null, null);
		} else {
			currentMethodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, procName, Type.getMethodDescriptor(Type.VOID_TYPE, new Type[0]), null, null);
		}
		currentMethodVisitor.visitInsn(Opcodes.RETURN);
		return null;
	}

	@Override
	public Void visitProc_decl(Proc_declContext ctx) {
		return null;
	}

	@Override
	public Void visitProc_end(Proc_endContext ctx) {
		return null;
	}

	@Override
	public Void visitVar_decl(Var_declContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitVar_set(Var_setContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitArray_decl(Array_declContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitReturn_statement(Return_statementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitSeq_com(Seq_comContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitCommand(CommandContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
