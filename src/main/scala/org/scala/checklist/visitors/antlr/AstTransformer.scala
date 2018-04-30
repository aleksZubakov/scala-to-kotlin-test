package org.scala.checklist.visitors.antlr

import org.antlr.generated._
import org.antlr.v4.runtime.misc.Interval
import org.antlr.v4.runtime.tree.{ParseTree, TerminalNode}
import org.scala.checklist.ast.nodes._
import org.scala.checklist.ast.nodes.atomic.VariableType.VariableType
import org.scala.checklist.ast.nodes.atomic.{AtomicNode, DecimalConstNode, VarReferenceNode, VariableType}
import org.scala.checklist.ast.nodes.item.{ItemElementNode, ItemNode, PlaceholderNode, TextNode}
import org.scala.checklist.ast.nodes.operations._

import scala.collection.JavaConversions._


class AstTransformer extends CheckListBaseVisitor[ASTNode] {

  override def visitTemplate(ctx: CheckList.TemplateContext): ASTNode = {
    val headingText = visitHeading(ctx.heading)
    val stmts = ctx.stmt.filter(_.getChildCount > 0).map(visitStmt).toList

    new TemplateNode(headingText, stmts)
  }

  override def visitStmt(ctx: CheckList.StmtContext): ASTNode = {
    val child = firstNotNull(ctx.item(), ctx.compound_stmt())
    child match {
      case item: CheckList.ItemContext => visitItem(item)
      case compoundStmt: CheckList.Compound_stmtContext => visitCompound_stmt(compoundStmt)
    }

  }

  override def visitBinaryExpression(ctx: CheckList.BinaryExpressionContext): ExpressionNode = {
    val left = ctx.left.accept(this).asInstanceOf[LogicalOpNode]
    val right = ctx.right.accept(this).asInstanceOf[LogicalOpNode]

    val op = ctx.op
    val opType = firstNotNull(op.AND(), op.OR()).asInstanceOf[TerminalNode].getSymbol.getType

    opType match {
      case CheckList.AND => new LogicalOpNode(left, LogicalOperation.AND, right)
      case CheckList.OR => new LogicalOpNode(left, LogicalOperation.OR, right)
    }
  }

  override def visitNotExpression(ctx: CheckList.NotExpressionContext): ExpressionNode = {
    new NotOpNode(ctx.logical_expr().accept(this).asInstanceOf[LogicalOpNode])
  }

  override def visitParenExpression(ctx: CheckList.ParenExpressionContext): ExpressionNode = {
    ctx.logical_expr().accept(this).asInstanceOf[ExpressionNode]
  }

  override def visitComparatorAtom(ctx: CheckList.ComparatorAtomContext): ExpressionNode = {
    val left = ctx.left.accept(this).asInstanceOf[ExpressionNode]
    val right = ctx.right.accept(this).asInstanceOf[ExpressionNode]

    val op = ctx.op

    val opType = firstNotNull(op.LT(), op.GT(), op.EQ(), op.LE(), op.GE())
      .asInstanceOf[TerminalNode].getSymbol.getType

    opType match {
      case CheckList.LT => new CompareOpNode(left, CompareOperation.LT, right)
      case CheckList.LE => new CompareOpNode(left, CompareOperation.LE, right)
      case CheckList.GT => new CompareOpNode(left, CompareOperation.GT, right)
      case CheckList.GE => new CompareOpNode(left, CompareOperation.GE, right)
      case CheckList.EQ => new CompareOpNode(left, CompareOperation.EQ, right)
    }

  }

  private def firstNotNull(ops: ParseTree*) = {
    ops.find(_ != null).get
  }

  override def visitCompound_stmt(ctx: CheckList.Compound_stmtContext): ASTNode = {
    val child = firstNotNull(ctx.if_stmt(), ctx.var_assign(), ctx.func_def())
    child match {
      case ifStmt: CheckList.If_stmtContext => ifStmt.accept(this)
      case varAssign: CheckList.Var_assignContext => varAssign.accept(this)
      case funcDef: CheckList.Func_defContext => funcDef.accept(this)
    }
  }

  override def visitAtom(ctx: CheckList.AtomContext): ExpressionNode = {
    val child = firstNotNull(ctx.DECIMAL(), ctx.arithmetic_expr(), ctx.word())
    child match {
      case word: CheckList.WordContext => new VarReferenceNode(wordToString(word))
      case expr: CheckList.Arithmetic_exprContext => expr.accept(this).asInstanceOf[ExpressionNode]
      case decimal: TerminalNode => new DecimalConstNode(decimal.toString)
    }
  }

  override def visitArithmeticExpressionParens(ctx: CheckList.ArithmeticExpressionParensContext): ExpressionNode = {
    ctx.arithmetic_expr().accept(this).asInstanceOf[ExpressionNode]
  }

  override def visitArithmeticAtomExpression(ctx: CheckList.ArithmeticAtomExpressionContext): ExpressionNode = {
    ctx.atom().accept(this).asInstanceOf[ExpressionNode]
  }

  override def visitArithmeticMultDivExpression(ctx: CheckList.ArithmeticMultDivExpressionContext): ArithmeticOpNode = {

    val left = ctx.left.accept(this).asInstanceOf[ExpressionNode]
    val right = ctx.right.accept(this).asInstanceOf[ExpressionNode]

    val op = ctx.op
    val opType = firstNotNull(op.DIV(), op.MULT())
      .asInstanceOf[TerminalNode].getSymbol.getType

    val arithmOp = opType match {
      case CheckList.MULT => ArithmeticOperation.MULT
      case CheckList.DIV => ArithmeticOperation.DIV
    }
    new ArithmeticOpNode(left, arithmOp, right)
  }

  override def visitArithmeticPlusMinusExpression(ctx: CheckList.ArithmeticPlusMinusExpressionContext): ArithmeticOpNode = {
    val left = ctx.left.accept(this).asInstanceOf[ExpressionNode]
    val right = ctx.right.accept(this).asInstanceOf[ExpressionNode]

    val op = ctx.op
    val opType = firstNotNull(op.MINUS(), op.PLUS())
      .asInstanceOf[TerminalNode].getSymbol.getType

    val arithmOp = opType match {
      case CheckList.MINUS => ArithmeticOperation.MINUS
      case CheckList.PLUS => ArithmeticOperation.PLUS
    }
    new ArithmeticOpNode(left, arithmOp, right)
  }

  override def visitArithmeticExpressionNegation(ctx: CheckList.ArithmeticExpressionNegationContext): ExpressionNode = {
    new NegationOpNode(ctx.arithmetic_expr.accept(this).asInstanceOf[ExpressionNode])
  }

  override def visitIf_stmt(ctx: CheckList.If_stmtContext): ASTNode = {
    val dummyCondition = ctx.logical_expr().accept(this).asInstanceOf[BooleanOpNode]
    val body = visitBody(ctx.body())
    new IfNode(dummyCondition, body)
  }


  override def visitBody(ctx: CheckList.BodyContext): BodyNode = {
    val stmts = ctx.stmt.toList.map(_.accept(this))
    new BodyNode(stmts)
  }


  override def visitHeading(ctx: CheckList.HeadingContext): TextNode = {
    val collectedText = ctx.text()
      .map { it => it.accept(this).asInstanceOf[TextNode].text }
      .mkString("")
    new TextNode(collectedText)
  }


  override def visitText(ctx: CheckList.TextContext): TextNode = {

    val startIndex = ctx.start.getStartIndex
    val stopIndex = if (ctx.PUNCTUATION() != null) {
      ctx.stop.getStopIndex + 1
    } else {
      ctx.stop.getStopIndex
    }

    val collectedText = ctx.start.getTokenSource
      .getInputStream.getText(
      new Interval(startIndex, stopIndex)
    )

    new TextNode(collectedText)
  }

  override def visitPlaceholder(ctx: CheckList.PlaceholderContext): ItemElementNode = {
    val expr = firstNotNull(ctx.simple_placeholder(), ctx.placeholder_with_body())
    expr.accept(this).asInstanceOf[PlaceholderNode]
  }

  override def visitSimple_placeholder(ctx: CheckList.Simple_placeholderContext): PlaceholderNode = {
    val varRef = new VarReferenceNode(wordToString(ctx.word()))
    new PlaceholderNode(varRef)
  }

  override def visitPlaceholder_with_body(ctx: CheckList.Placeholder_with_bodyContext): PlaceholderNode = {
    val expr = ctx.placeholder_body().accept(this).asInstanceOf[ExpressionNode]
    new PlaceholderNode(expr)
  }

  override def visitPlaceholder_body(ctx: CheckList.Placeholder_bodyContext): ExpressionNode = {
    ctx.arithmetic_expr().accept(this).asInstanceOf[ExpressionNode]
  }


  override def visitFunction_call(ctx: CheckList.Function_callContext): FuncCallNode = {
    val funName = wordToString(ctx.func_name)
    val args = ctx.var_ref.rvalue.map(_.accept(this).asInstanceOf[AtomicNode])
    new FuncCallNode(funName, args.toList)
  }

  override def visitVar_assign(ctx: CheckList.Var_assignContext): ASTNode = {
    val varDef = ctx.var_def().accept(this).asInstanceOf[VarDefinitionNode]
    val rValue = visitRvalue(ctx.rvalue())

    new VarAssignmentNode(varDef, rValue)
  }


  override def visitVar_def(ctx: CheckList.Var_defContext): ASTNode = {
    val varDescription = ctx.description().text.flatMap(visitText(_).text).mkString("")
    val (varName, varType) = varDef(ctx.lval, ctx.varType)
    new VarDefinitionNode(varDescription, varName, varType)
  }

  def varDef(lval: CheckList.WordContext, variableType: CheckList.WordContext): (String, VariableType) = {
    val varName = wordToString(lval)
    val varType = wordToString(variableType).toLowerCase


    varType match {
      case "число" => (varName, VariableType.Numeric)
      case "строка" => (varName, VariableType.String)
    }
  }

  override def visitRvalue(ctx: CheckList.RvalueContext): ExpressionNode = {
    val op = firstNotNull(ctx.DECIMAL(), ctx.word(), ctx.arithmetic_expr())
    op match {
      case decimal: TerminalNode => new DecimalConstNode(decimal.toString)
      case word: CheckList.WordContext => new VarReferenceNode(wordToString(word))
      case expr: CheckList.Arithmetic_exprContext => expr.accept(this).asInstanceOf[ArithmeticOpNode]
    }
  }

  override def visitFunc_def(ctx: CheckList.Func_defContext): ASTNode = {
    val args = ctx.args.arg.map(visitArg)
    val body = visitBody(ctx.body())
    val name = wordToString(ctx.name)

    new FuncDefinitionNode(name, args.toList, body)
  }

  override def visitArg(ctx: CheckList.ArgContext): VarDefinitionNode = {
    val (varName, varType) = varDef(ctx.lval, ctx.varType)
    new VarDefinitionNode("", varName, varType)
  }

  override def visitItem(ctx: CheckList.ItemContext): ASTNode = {
    val nodes = ctx.children
      .filter(node => {
        node.isInstanceOf[CheckList.TextContext] ||
          node.isInstanceOf[CheckList.PlaceholderContext] ||
          node.isInstanceOf[CheckList.Function_callContext]
      })
      .map {
        case text: CheckList.TextContext => visitText(text)
        case placeholder: CheckList.PlaceholderContext => visitPlaceholder(placeholder)
        case funcCall: CheckList.Function_callContext => visitFunction_call(funcCall)
      }
    new ItemNode(nodes.toList)
  }

  def wordToString(word: CheckList.WordContext): String = word.CHAR.toList.mkString("")


}