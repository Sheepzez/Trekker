// Generated from Trekker.g4 by ANTLR 4.5.1
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
	 * Visit a parse tree produced by {@link TrekkerParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(TrekkerParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(TrekkerParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link TrekkerParser#main_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_func(TrekkerParser.Main_funcContext ctx);
}