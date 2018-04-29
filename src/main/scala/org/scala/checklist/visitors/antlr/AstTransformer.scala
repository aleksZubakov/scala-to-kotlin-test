package org.scala.checklist.visitors.antlr

import org.antlr.generated._
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.{ParseTree, RuleNode, TerminalNode}
import org.scala.checklist.ast.nodes._
import org.scala.checklist.ast.nodes.atomic.VariableType.VariableType
import org.scala.checklist.ast.nodes.atomic.{AtomicNode, DecimalConstNode, VarReferenceNode, VariableType}
import org.scala.checklist.ast.nodes.item.{ItemElementNode, ItemNode, PlaceholderNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations._

import scala.collection.JavaConversions._


class AstTransformer extends CheckListBaseVisitor[ASTNode] {

  override def visitTemplate(ctx: CheckListParser.TemplateContext): ASTNode = {
    val headingText = visitHeading(ctx.heading)
    val stmts = ctx.stmt.filter(_.getChildCount > 0).map(visitStmt).toList

    new TemplateNode(headingText, stmts)
  }

  override def visitStmt(ctx: CheckListParser.StmtContext): ASTNode = {
    val child = firstNotNull(ctx.item(), ctx.compound_stmt())
    child match {
      case item: CheckListParser.ItemContext => visitItem(item)
      case compoundStmt: CheckListParser.Compound_stmtContext => visitCompound_stmt(compoundStmt)
    }

  }

  override def visitBinaryExpression(ctx: CheckListParser.BinaryExpressionContext): ExpressionNode = {
    val left = ctx.left.accept(this).asInstanceOf[LogicalOpNode]
    val right = ctx.right.accept(this).asInstanceOf[LogicalOpNode]

    val op = ctx.op
    val opType = firstNotNull(op.AND(), op.OR()).asInstanceOf[TerminalNode].getSymbol.getType

    opType match {
      case CheckListParser.AND => new LogicalOpNode(left, LogicalOperation.AND, right)
      case CheckListParser.OR => new LogicalOpNode(left, LogicalOperation.OR, right)
    }
  }

  override def visitNotExpression(ctx: CheckListParser.NotExpressionContext): ExpressionNode = {
    new NotOpNode(ctx.logical_expr().accept(this).asInstanceOf[LogicalOpNode])
  }

  override def visitParenExpression(ctx: CheckListParser.ParenExpressionContext): ExpressionNode = {
    ctx.logical_expr().accept(this).asInstanceOf[ExpressionNode]
  }

  override def visitComparatorAtom(ctx: CheckListParser.ComparatorAtomContext): ExpressionNode = {
    val left = ctx.left.accept(this).asInstanceOf[ExpressionNode]
    val right = ctx.right.accept(this).asInstanceOf[ExpressionNode]

    val op = ctx.op

    val opType = firstNotNull(op.LT(), op.GT(), op.EQ(), op.LE(), op.GE())
      .asInstanceOf[TerminalNode].getSymbol.getType

    opType match {
      case CheckListParser.LT => new CompareOpNode(left, CompareOperation.LT, right)
      case CheckListParser.LE => new CompareOpNode(left, CompareOperation.LE, right)
      case CheckListParser.GT => new CompareOpNode(left, CompareOperation.GT, right)
      case CheckListParser.GE => new CompareOpNode(left, CompareOperation.GE, right)
      case CheckListParser.EQ => new CompareOpNode(left, CompareOperation.EQ, right)
    }

  }

  private def firstNotNull(ops: ParseTree*) = {
    ops.find(_ != null).get
  }

  override def visitCompound_stmt(ctx: CheckListParser.Compound_stmtContext): ASTNode = {
    val child = firstNotNull(ctx.if_stmt(), ctx.var_assign(), ctx.func_def())
    child match {
      case ifStmt: CheckListParser.If_stmtContext => ifStmt.accept(this)
      case varAssign: CheckListParser.Var_assignContext => varAssign.accept(this)
      case funcDef: CheckListParser.Func_defContext => funcDef.accept(this)
    }
  }

  override def visitAtom(ctx: CheckListParser.AtomContext): ExpressionNode = {
    val child = firstNotNull(ctx.DECIMAL(), ctx.arithmetic_expr(), ctx.word())
    child match {
      case word: CheckListParser.WordContext => new VarReferenceNode(wordToString(word))
      case expr: CheckListParser.Arithmetic_exprContext => expr.accept(this).asInstanceOf[ExpressionNode]
      case decimal: TerminalNode => new DecimalConstNode(decimal.toString)
    }
  }

  override def visitArithmeticExpressionParens(ctx: CheckListParser.ArithmeticExpressionParensContext): ExpressionNode = {
    ctx.arithmetic_expr().accept(this).asInstanceOf[ExpressionNode]
  }

  override def visitArithmeticAtomExpression(ctx: CheckListParser.ArithmeticAtomExpressionContext): ExpressionNode = {
    ctx.atom().accept(this).asInstanceOf[ExpressionNode]
  }

//  override def visitArithmeticExpression(ctx: CheckListParser.ArithmeticExpressionContext): ArithmeticOpNode = {
//    val left = ctx.left.accept(this).asInstanceOf[ExpressionNode]
//    val right = ctx.right.accept(this).asInstanceOf[ExpressionNode]
//
//    val op = ctx.op
//    val opType = firstNotNull(op.DIV(), op.MINUS(), op.PLUS(), op.MULT())
//      .asInstanceOf[TerminalNode].getSymbol.getType
//
//    opType match {
//      case CheckListParser.MULT => new ArithmeticOpNode(left, ArithmeticOperation.MULT, right)
//      case CheckListParser.DIV => new ArithmeticOpNode(left, ArithmeticOperation.DIV, right)
//      case CheckListParser.PLUS => new ArithmeticOpNode(left, ArithmeticOperation.PLUS, right)
//      case CheckListParser.MINUS => new ArithmeticOpNode(left, ArithmeticOperation.MINUS, right)
//    }
//
//  }

  override def visitArithmeticMultDivExpression(ctx: CheckListParser.ArithmeticMultDivExpressionContext): ArithmeticOpNode = {

    val left = ctx.left.accept(this).asInstanceOf[ExpressionNode]
    val right = ctx.right.accept(this).asInstanceOf[ExpressionNode]

    val op = ctx.op
    val opType = firstNotNull(op.DIV(), op.MULT())
      .asInstanceOf[TerminalNode].getSymbol.getType

    val arithmOp = opType match {
      case CheckListParser.MULT => ArithmeticOperation.MULT
      case CheckListParser.DIV => ArithmeticOperation.DIV
    }
    new ArithmeticOpNode(left, arithmOp, right)
  }

  override def visitArithmeticPlusMinusExpression(ctx: CheckListParser.ArithmeticPlusMinusExpressionContext): ArithmeticOpNode = {
    val left = ctx.left.accept(this).asInstanceOf[ExpressionNode]
    val right = ctx.right.accept(this).asInstanceOf[ExpressionNode]

    val op = ctx.op
    val opType = firstNotNull(op.MINUS(), op.PLUS())
      .asInstanceOf[TerminalNode].getSymbol.getType

    val arithmOp = opType match {
      case CheckListParser.MINUS => ArithmeticOperation.MINUS
      case CheckListParser.PLUS => ArithmeticOperation.PLUS
    }
    new ArithmeticOpNode(left, arithmOp, right)
  }

  override def visitArithmeticExpressionNegation(ctx: CheckListParser.ArithmeticExpressionNegationContext): ExpressionNode = {
    new NegationOpNode(ctx.arithmetic_expr.accept(this).asInstanceOf[ExpressionNode])
  }

  override def visitIf_stmt(ctx: CheckListParser.If_stmtContext): ASTNode = {
    val dummyCondition = ctx.logical_expr().accept(this).asInstanceOf[BooleanOpNode]
    val body = visitBody(ctx.body())
    new IfNode(dummyCondition, body)
  }


  override def visitBody(ctx: CheckListParser.BodyContext): BodyNode = {
    val stmts = ctx.stmt.toList.map(_.accept(this))
    new BodyNode(stmts)
  }


  override def visitHeading(ctx: CheckListParser.HeadingContext): TextNode = {
    val collectedText = ctx.children.subList(1, ctx.children.size()).flatMap {
      case text: CheckListParser.TextContext => visitText(text).text
      case _ => ""
    }.mkString("")
    new TextNode(collectedText)
  }


  override def visitText(ctx: CheckListParser.TextContext): TextNode = {
    val collectedText = ctx.children.flatMap {
      case node: TerminalNode => node.toString
      case word: CheckListParser.WordContext => wordToString(word)
    }.mkString("")

    new TextNode(collectedText)
  }

  override def visitPlaceholder(ctx: CheckListParser.PlaceholderContext): ItemElementNode = {
    val expr = firstNotNull(ctx.simple_placeholder(), ctx.placeholder_with_body())
    expr.accept(this).asInstanceOf[PlaceholderNode]
  }

  override def visitSimple_placeholder(ctx: CheckListParser.Simple_placeholderContext): PlaceholderNode = {
    val varRef = new VarReferenceNode(wordToString(ctx.word()))
    new PlaceholderNode(varRef)
  }

  override def visitPlaceholder_with_body(ctx: CheckListParser.Placeholder_with_bodyContext): PlaceholderNode = {
    val expr = ctx.placeholder_body().accept(this).asInstanceOf[ExpressionNode]
    new PlaceholderNode(expr)
  }

  override def visitPlaceholder_body(ctx: CheckListParser.Placeholder_bodyContext): ExpressionNode = {
    ctx.arithmetic_expr().accept(this).asInstanceOf[ExpressionNode]
  }


  override def visitFunction_call(ctx: CheckListParser.Function_callContext): FuncCallNode = {
    val funName = wordToString(ctx.func_name)
    val args = ctx.var_ref.rvalue.map(_.accept(this).asInstanceOf[AtomicNode])
    new FuncCallNode(funName, args.toList)
  }

  override def visitVar_assign(ctx: CheckListParser.Var_assignContext): ASTNode = {
    val varDef = ctx.var_def().accept(this).asInstanceOf[VarDefinitionNode]
    val rValue = visitRvalue(ctx.rvalue())

    new VarAssignmentNode(varDef, rValue)
  }


  override def visitVar_def(ctx: CheckListParser.Var_defContext): ASTNode = {
    val varDescription = ctx.description().text.flatMap(visitText(_).text).mkString("")
    val (varName, varType) = varDef(ctx.lval, ctx.varType)
    new VarDefinitionNode(varDescription, varName, varType)
  }

  def varDef(lval: CheckListParser.WordContext, variableType: CheckListParser.WordContext): (String, VariableType) = {
    val varName = wordToString(lval)
    val varType = wordToString(variableType).toLowerCase


    varType match {
      case "число" => (varName, VariableType.Numeric)
      case "строка" => (varName, VariableType.String)
    }
  }

  override def visitRvalue(ctx: CheckListParser.RvalueContext): ExpressionNode = {
    val op = firstNotNull(ctx.DECIMAL(), ctx.word(), ctx.arithmetic_expr())
    op match {
      case decimal: TerminalNode => new DecimalConstNode(decimal.toString)
      case word: CheckListParser.WordContext => new VarReferenceNode(wordToString(word))
      case expr: CheckListParser.Arithmetic_exprContext => expr.accept(this).asInstanceOf[ArithmeticOpNode]
    }
  }

  override def visitFunc_def(ctx: CheckListParser.Func_defContext): ASTNode = {
    val args = ctx.args.arg.map(visitArg)
    val body = visitBody(ctx.body())
    val name = wordToString(ctx.name)

    new FuncDefinitionNode(name, args.toList, body)
  }

  override def visitArg(ctx: CheckListParser.ArgContext): VarDefinitionNode = {
    val (varName, varType) = varDef(ctx.lval, ctx.varType)
    new VarDefinitionNode("", varName, varType)
  }

  override def visitItem(ctx: CheckListParser.ItemContext): ASTNode = {
    val nodes = ctx.children
      .filter(node => {
        node.isInstanceOf[CheckListParser.TextContext] ||
          node.isInstanceOf[CheckListParser.PlaceholderContext] ||
          node.isInstanceOf[CheckListParser.Function_callContext]
      })
      .map {
        case text: CheckListParser.TextContext => visitText(text)
        case placeholder: CheckListParser.PlaceholderContext => visitPlaceholder(placeholder)
        case funcCall: CheckListParser.Function_callContext => visitFunction_call(funcCall)
      }
    new ItemNode(nodes.toList)
  }

  def wordToString(word: CheckListParser.WordContext): String = word.CHAR.toList.mkString("")


}