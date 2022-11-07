// Generated from C:/Users/Kevin/Documents/GitHub/LP-2022-2/interpreter/grammar\interpreter.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link interpreterParser}.
 */
public interface interpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link interpreterParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(interpreterParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(interpreterParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(interpreterParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(interpreterParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#bodyblock}.
	 * @param ctx the parse tree
	 */
	void enterBodyblock(interpreterParser.BodyblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#bodyblock}.
	 * @param ctx the parse tree
	 */
	void exitBodyblock(interpreterParser.BodyblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArraydeclaration(interpreterParser.ArraydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArraydeclaration(interpreterParser.ArraydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#functioncreation}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncreation(interpreterParser.FunctioncreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#functioncreation}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncreation(interpreterParser.FunctioncreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#maincreation}.
	 * @param ctx the parse tree
	 */
	void enterMaincreation(interpreterParser.MaincreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#maincreation}.
	 * @param ctx the parse tree
	 */
	void exitMaincreation(interpreterParser.MaincreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(interpreterParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(interpreterParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#returndt}.
	 * @param ctx the parse tree
	 */
	void enterReturndt(interpreterParser.ReturndtContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#returndt}.
	 * @param ctx the parse tree
	 */
	void exitReturndt(interpreterParser.ReturndtContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(interpreterParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(interpreterParser.VardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#datatypedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDatatypedeclaration(interpreterParser.DatatypedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#datatypedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDatatypedeclaration(interpreterParser.DatatypedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(interpreterParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(interpreterParser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(interpreterParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(interpreterParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintstatement(interpreterParser.PrintstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintstatement(interpreterParser.PrintstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#asignationstatement}.
	 * @param ctx the parse tree
	 */
	void enterAsignationstatement(interpreterParser.AsignationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#asignationstatement}.
	 * @param ctx the parse tree
	 */
	void exitAsignationstatement(interpreterParser.AsignationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(interpreterParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(interpreterParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#inputstatement}.
	 * @param ctx the parse tree
	 */
	void enterInputstatement(interpreterParser.InputstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#inputstatement}.
	 * @param ctx the parse tree
	 */
	void exitInputstatement(interpreterParser.InputstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicexpr(interpreterParser.LogicexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicexpr(interpreterParser.LogicexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link interpreterParser#mathexpr}.
	 * @param ctx the parse tree
	 */
	void enterMathexpr(interpreterParser.MathexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link interpreterParser#mathexpr}.
	 * @param ctx the parse tree
	 */
	void exitMathexpr(interpreterParser.MathexprContext ctx);
}