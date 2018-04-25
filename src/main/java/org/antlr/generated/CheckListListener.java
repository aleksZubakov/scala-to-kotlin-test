// Generated from /Users/alekseyzubakov/Documents/programming/internship_test/src/main/java/org.antlr/grammar/CheckList.g4 by ANTLR 4.7
package org.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CheckListParser}.
 */
public interface CheckListListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CheckListParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(CheckListParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(CheckListParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(CheckListParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(CheckListParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(CheckListParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(CheckListParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(CheckListParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(CheckListParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(CheckListParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(CheckListParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(CheckListParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(CheckListParser.PlaceholderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(CheckListParser.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(CheckListParser.HeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CheckListParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CheckListParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(CheckListParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(CheckListParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CheckListParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CheckListParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CheckListParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CheckListParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CheckListParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CheckListParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(CheckListParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(CheckListParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(CheckListParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(CheckListParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(CheckListParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(CheckListParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparatorExpression(CheckListParser.ComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparatorExpression(CheckListParser.ComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CheckListParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CheckListParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(CheckListParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(CheckListParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(CheckListParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(CheckListParser.BinaryContext ctx);
}