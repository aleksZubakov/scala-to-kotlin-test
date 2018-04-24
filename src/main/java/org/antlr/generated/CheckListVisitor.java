// Generated from /Users/alekseyzubakov/Documents/programming/internship_test/src/main/java/org.antlr/grammar/CheckList.g4 by ANTLR 4.7
package org.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CheckListParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CheckListVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CheckListParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(CheckListParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(CheckListParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CheckListParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(CheckListParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(CheckListParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeading(CheckListParser.HeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CheckListParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(CheckListParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(CheckListParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CheckListParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CheckListParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(CheckListParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(CheckListParser.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(CheckListParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(CheckListParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(CheckListParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorExpression(CheckListParser.ComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CheckListParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(CheckListParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(CheckListParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CheckListParser.BoolContext ctx);
}