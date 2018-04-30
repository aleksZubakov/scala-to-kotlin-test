// Generated from /Users/alekseyzubakov/Documents/programming/internship_test/src/main/java/org.antlr/grammar/CheckList.g4 by ANTLR 4.7
package org.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CheckList}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CheckListVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CheckList#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(CheckList.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#punc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunc(CheckList.PuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(CheckList.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(CheckList.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder(CheckList.PlaceholderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#simple_placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_placeholder(CheckList.Simple_placeholderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#placeholder_with_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder_with_body(CheckList.Placeholder_with_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#placeholder_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder_body(CheckList.Placeholder_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(CheckList.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#var_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_ref(CheckList.Var_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(CheckList.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(CheckList.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(CheckList.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(CheckList.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(CheckList.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CheckList.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(CheckList.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeading(CheckList.HeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CheckList.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(CheckList.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(CheckList.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CheckList.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CheckList.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(CheckList.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(CheckList.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(CheckList.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparatorAtom}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorAtom(CheckList.ComparatorAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpressionParens}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionParens(CheckList.ArithmeticExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticMultDivExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticMultDivExpression(CheckList.ArithmeticMultDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticAtomExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAtomExpression(CheckList.ArithmeticAtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpressionNegation}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionNegation(CheckList.ArithmeticExpressionNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticPlusMinusExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticPlusMinusExpression(CheckList.ArithmeticPlusMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CheckList.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(CheckList.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#arithm_muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm_muldiv(CheckList.Arithm_muldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#arithm_plusminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm_plusminus(CheckList.Arithm_plusminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CheckList#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(CheckList.BinaryContext ctx);
}