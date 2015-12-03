// Generated from Trekker.g4 by ANTLR 4.5.1
package me.isaacjordan.Trekker.Generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrekkerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrekkerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code prog}
	 * labeled alternative in {@link TrekkerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TrekkerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#func_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_end(TrekkerParser.Func_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(TrekkerParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#proc_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_decl(TrekkerParser.Proc_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#proc_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_end(TrekkerParser.Proc_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(TrekkerParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#var_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_set(TrekkerParser.Var_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#array_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_decl(TrekkerParser.Array_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(TrekkerParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#seq_com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_com(TrekkerParser.Seq_comContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(TrekkerParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#num_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_decl(TrekkerParser.Num_declContext ctx);
}