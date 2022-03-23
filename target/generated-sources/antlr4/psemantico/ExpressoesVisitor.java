// Generated from psemantico\Expressoes.g4 by ANTLR 4.7.2
package psemantico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressoesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressoesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ExpressoesParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(ExpressoesParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExpressoesParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(ExpressoesParser.TermoContext ctx);
}