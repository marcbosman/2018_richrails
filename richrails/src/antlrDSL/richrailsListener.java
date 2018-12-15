package antlrDSL;
// Generated from richrails.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link richrailsParser}.
 */
public interface richrailsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link richrailsParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(richrailsParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(richrailsParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link richrailsParser#newcommand}.
	 * @param ctx the parse tree
	 */
	void enterNewcommand(richrailsParser.NewcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#newcommand}.
	 * @param ctx the parse tree
	 */
	void exitNewcommand(richrailsParser.NewcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link richrailsParser#newtraincommand}.
	 * @param ctx the parse tree
	 */
	void enterNewtraincommand(richrailsParser.NewtraincommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#newtraincommand}.
	 * @param ctx the parse tree
	 */
	void exitNewtraincommand(richrailsParser.NewtraincommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link richrailsParser#newwagoncommand}.
	 * @param ctx the parse tree
	 */
	void enterNewwagoncommand(richrailsParser.NewwagoncommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#newwagoncommand}.
	 * @param ctx the parse tree
	 */
	void exitNewwagoncommand(richrailsParser.NewwagoncommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link richrailsParser#delcommand}.
	 * @param ctx the parse tree
	 */
	void enterDelcommand(richrailsParser.DelcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#delcommand}.
	 * @param ctx the parse tree
	 */
	void exitDelcommand(richrailsParser.DelcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link richrailsParser#addcommand}.
	 * @param ctx the parse tree
	 */
	void enterAddcommand(richrailsParser.AddcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#addcommand}.
	 * @param ctx the parse tree
	 */
	void exitAddcommand(richrailsParser.AddcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link richrailsParser#getcommand}.
	 * @param ctx the parse tree
	 */
	void enterGetcommand(richrailsParser.GetcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#getcommand}.
	 * @param ctx the parse tree
	 */
	void exitGetcommand(richrailsParser.GetcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link richrailsParser#remcommand}.
	 * @param ctx the parse tree
	 */
	void enterRemcommand(richrailsParser.RemcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#remcommand}.
	 * @param ctx the parse tree
	 */
	void exitRemcommand(richrailsParser.RemcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link richrailsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(richrailsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link richrailsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(richrailsParser.TypeContext ctx);
}