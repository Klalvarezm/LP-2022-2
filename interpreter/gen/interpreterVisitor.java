// Generated from C:/Users/Kevin/Documents/GitHub/LP-2022-2/interpreter/grammar\interpreter.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link interpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface interpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link interpreterParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(interpreterParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(interpreterParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#bodyblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyblock(interpreterParser.BodyblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#arraydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydeclaration(interpreterParser.ArraydeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#functioncreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncreation(interpreterParser.FunctioncreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#maincreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaincreation(interpreterParser.MaincreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(interpreterParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#returndt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturndt(interpreterParser.ReturndtContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#vardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclaration(interpreterParser.VardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#datatypedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypedeclaration(interpreterParser.DatatypedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(interpreterParser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(interpreterParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#printstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstatement(interpreterParser.PrintstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#asignationstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignationstatement(interpreterParser.AsignationstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(interpreterParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#inputstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputstatement(interpreterParser.InputstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#logicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicexpr(interpreterParser.LogicexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link interpreterParser#mathexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathexpr(interpreterParser.MathexprContext ctx);
}