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
	 * Enter a parse tree produced by {@link CheckListParser#simple_placeholder}.
	 * @param ctx the parse tree
	 */
	void enterSimple_placeholder(CheckListParser.Simple_placeholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#simple_placeholder}.
	 * @param ctx the parse tree
	 */
	void exitSimple_placeholder(CheckListParser.Simple_placeholderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#placeholder_with_body}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder_with_body(CheckListParser.Placeholder_with_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#placeholder_with_body}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder_with_body(CheckListParser.Placeholder_with_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#placeholder_body}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder_body(CheckListParser.Placeholder_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#placeholder_body}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder_body(CheckListParser.Placeholder_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(CheckListParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(CheckListParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#var_ref}.
	 * @param ctx the parse tree
	 */
	void enterVar_ref(CheckListParser.Var_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#var_ref}.
	 * @param ctx the parse tree
	 */
	void exitVar_ref(CheckListParser.Var_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(CheckListParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(CheckListParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(CheckListParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(CheckListParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(CheckListParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(CheckListParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(CheckListParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(CheckListParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(CheckListParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(CheckListParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CheckListParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CheckListParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(CheckListParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(CheckListParser.ArgContext ctx);
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
	 * Enter a parse tree produced by the {@code comparatorAtom}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparatorAtom(CheckListParser.ComparatorAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparatorAtom}
	 * labeled alternative in {@link CheckListParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparatorAtom(CheckListParser.ComparatorAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpressionParens}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionParens(CheckListParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpressionParens}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionParens(CheckListParser.ArithmeticExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticMultDivExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticMultDivExpression(CheckListParser.ArithmeticMultDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticMultDivExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticMultDivExpression(CheckListParser.ArithmeticMultDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticAtomExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAtomExpression(CheckListParser.ArithmeticAtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticAtomExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAtomExpression(CheckListParser.ArithmeticAtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpressionNegation}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionNegation(CheckListParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpressionNegation}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionNegation(CheckListParser.ArithmeticExpressionNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticPlusMinusExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticPlusMinusExpression(CheckListParser.ArithmeticPlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticPlusMinusExpression}
	 * labeled alternative in {@link CheckListParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticPlusMinusExpression(CheckListParser.ArithmeticPlusMinusExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CheckListParser#arithm_muldiv}.
	 * @param ctx the parse tree
	 */
	void enterArithm_muldiv(CheckListParser.Arithm_muldivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#arithm_muldiv}.
	 * @param ctx the parse tree
	 */
	void exitArithm_muldiv(CheckListParser.Arithm_muldivContext ctx);
	/**
	 * Enter a parse tree produced by {@link CheckListParser#arithm_plusminus}.
	 * @param ctx the parse tree
	 */
	void enterArithm_plusminus(CheckListParser.Arithm_plusminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CheckListParser#arithm_plusminus}.
	 * @param ctx the parse tree
	 */
	void exitArithm_plusminus(CheckListParser.Arithm_plusminusContext ctx);
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