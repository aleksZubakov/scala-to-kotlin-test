// Generated from /Users/alekseyzubakov/Documents/programming/internship_test/src/main/java/org.antlr/grammar/CheckList.g4 by ANTLR 4.7
package org.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CheckList}.
 */
public interface CheckListListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CheckList#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(CheckList.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(CheckList.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#punc}.
	 * @param ctx the parse tree
	 */
	void enterPunc(CheckList.PuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#punc}.
	 * @param ctx the parse tree
	 */
	void exitPunc(CheckList.PuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(CheckList.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(CheckList.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#text}.
	 * @param ctx the parse tree
	 */
	void enterText(CheckList.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#text}.
	 * @param ctx the parse tree
	 */
	void exitText(CheckList.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(CheckList.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(CheckList.PlaceholderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#simple_placeholder}.
	 * @param ctx the parse tree
	 */
	void enterSimple_placeholder(CheckList.Simple_placeholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#simple_placeholder}.
	 * @param ctx the parse tree
	 */
	void exitSimple_placeholder(CheckList.Simple_placeholderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#placeholder_with_body}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder_with_body(CheckList.Placeholder_with_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#placeholder_with_body}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder_with_body(CheckList.Placeholder_with_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#placeholder_body}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder_body(CheckList.Placeholder_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#placeholder_body}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder_body(CheckList.Placeholder_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(CheckList.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(CheckList.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#var_ref}.
	 * @param ctx the parse tree
	 */
	void enterVar_ref(CheckList.Var_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#var_ref}.
	 * @param ctx the parse tree
	 */
	void exitVar_ref(CheckList.Var_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(CheckList.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(CheckList.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(CheckList.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(CheckList.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(CheckList.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(CheckList.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(CheckList.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(CheckList.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(CheckList.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(CheckList.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CheckList.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CheckList.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(CheckList.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(CheckList.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(CheckList.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(CheckList.HeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CheckList.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CheckList.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(CheckList.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(CheckList.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CheckList.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CheckList.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CheckList.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CheckList.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CheckList.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CheckList.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(CheckList.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(CheckList.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(CheckList.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(CheckList.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(CheckList.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(CheckList.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparatorAtom}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparatorAtom(CheckList.ComparatorAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparatorAtom}
	 * labeled alternative in {@link CheckList#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparatorAtom(CheckList.ComparatorAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpressionParens}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionParens(CheckList.ArithmeticExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpressionParens}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionParens(CheckList.ArithmeticExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticMultDivExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticMultDivExpression(CheckList.ArithmeticMultDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticMultDivExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticMultDivExpression(CheckList.ArithmeticMultDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticAtomExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAtomExpression(CheckList.ArithmeticAtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticAtomExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAtomExpression(CheckList.ArithmeticAtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpressionNegation}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionNegation(CheckList.ArithmeticExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpressionNegation}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionNegation(CheckList.ArithmeticExpressionNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticPlusMinusExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticPlusMinusExpression(CheckList.ArithmeticPlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticPlusMinusExpression}
	 * labeled alternative in {@link CheckList#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticPlusMinusExpression(CheckList.ArithmeticPlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CheckList.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CheckList.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(CheckList.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(CheckList.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#arithm_muldiv}.
	 * @param ctx the parse tree
	 */
	void enterArithm_muldiv(CheckList.Arithm_muldivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#arithm_muldiv}.
	 * @param ctx the parse tree
	 */
	void exitArithm_muldiv(CheckList.Arithm_muldivContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#arithm_plusminus}.
	 * @param ctx the parse tree
	 */
	void enterArithm_plusminus(CheckList.Arithm_plusminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#arithm_plusminus}.
	 * @param ctx the parse tree
	 */
	void exitArithm_plusminus(CheckList.Arithm_plusminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckList#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(CheckList.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckList#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(CheckList.BinaryContext ctx);
}