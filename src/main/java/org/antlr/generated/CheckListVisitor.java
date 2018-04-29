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
	 * Visit a parse tree produced by {@link CheckListParser#placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder(CheckListParser.PlaceholderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#simple_placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_placeholder(CheckListParser.Simple_placeholderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#placeholder_with_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder_with_body(CheckListParser.Placeholder_with_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#placeholder_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder_body(CheckListParser.Placeholder_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(CheckListParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#var_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_ref(CheckListParser.Var_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(CheckListParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(CheckListParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(CheckListParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(CheckListParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(CheckListParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CheckListParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(CheckListParser.ArgContext ctx);
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
	 * Visit a parse tree produced by the {@code comparatorAtom}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorAtom(CheckListParser.ComparatorAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpressionParens}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionParens(CheckListParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticMultDivExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticMultDivExpression(CheckListParser.ArithmeticMultDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticAtomExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAtomExpression(CheckListParser.ArithmeticAtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpressionNegation}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionNegation(CheckListParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticPlusMinusExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticPlusMinusExpression(CheckListParser.ArithmeticPlusMinusExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link CheckListParser#arithm_muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm_muldiv(CheckListParser.Arithm_muldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#arithm_plusminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm_plusminus(CheckListParser.Arithm_plusminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckListParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(CheckListParser.BinaryContext ctx);
}