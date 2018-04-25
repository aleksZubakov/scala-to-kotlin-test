package org.scala.checklist.visitors.antlr

import org.antlr.generated._
import org.antlr.v4.runtime.tree.TerminalNode
import org.scala.checklist.ast.nodes._
import org.scala.checklist.ast.nodes.atomic.{AtomicNode, DecimalConstNode, VarNode}
import org.scala.checklist.ast.nodes.operations.{BinaryOpNode, CompareOpNode, ExpressionNode, NotOpNode}

import scala.collection.JavaConversions._


class AstTransformer extends CheckListBaseVisitor[ASTNode] {

  override def visitTemplate(ctx: CheckListParser.TemplateContext): ASTNode = {
    val headingText = visitHeading(ctx.heading)
    val stmts = ctx.stmt.toList.map(visitStmt)

    new TemplateNode(headingText, stmts)
  }

  override def visitStmt(ctx: CheckListParser.StmtContext): ASTNode = {
    val child = ctx.children.get(0)
    child match {
      case item: CheckListParser.ItemContext => visitItem(item)
      case compoundStmt: CheckListParser.Compound_stmtContext => visitCompound_stmt(compoundStmt)
    }

  }

  override def visitBinaryExpression(ctx: CheckListParser.BinaryExpressionContext): ExpressionNode = {
    val left = ctx.left.accept(this).asInstanceOf[ExpressionNode]
    val right = ctx.right.accept(this).asInstanceOf[ExpressionNode]
    val opType = Option(ctx.op.AND())
      .getOrElse(ctx.op.OR()).getSymbol.getType

    opType match {
      case CheckListParser.AND => new BinaryOpNode(left, BinaryOperation.AND, right)
      case CheckListParser.OR => new BinaryOpNode(left, BinaryOperation.OR, right)
    }
  }

  override def visitNotExpression(ctx: CheckListParser.NotExpressionContext): ExpressionNode = {
    new NotOpNode(ctx.logical_expr().accept(this).asInstanceOf[ExpressionNode])
  }

  override def visitParenExpression(ctx: CheckListParser.ParenExpressionContext): ExpressionNode = {
    ctx.logical_expr().accept(this).asInstanceOf[ExpressionNode]
  }

  override def visitComparatorExpression(ctx: CheckListParser.ComparatorExpressionContext): ExpressionNode = {
    val left = ctx.left.accept(this).asInstanceOf[AtomicNode]
    val right = ctx.right.accept(this).asInstanceOf[AtomicNode]

    val op = ctx.op

    val opType = Option(op.LT())
      .orElse(Option(op.LE()))
      .orElse(Option(op.GT()))
      .orElse(Option(op.GE()))
      .orElse(Option(op.EQ()))
      .get
      .getSymbol.getType

    opType match {
      case CheckListParser.LT => new CompareOpNode(left, CompareOperation.LT, right)
      case CheckListParser.LE => new CompareOpNode(left, CompareOperation.LT, right)
      case CheckListParser.GT => new CompareOpNode(left, CompareOperation.LT, right)
      case CheckListParser.GE => new CompareOpNode(left, CompareOperation.LT, right)
      case CheckListParser.EQ => new CompareOpNode(left, CompareOperation.LT, right)
    }

  }


  override def visitCompound_stmt(ctx: CheckListParser.Compound_stmtContext): ASTNode = {
    val child = ctx.children.get(0)
    child match {
      case ifStmt: CheckListParser.If_stmtContext => visitIf_stmt(ifStmt)
    }
  }

  override def visitAtom(ctx: CheckListParser.AtomContext): AtomicNode = {
    val child = ctx.children.get(0)
    child match {
      case word: CheckListParser.WordContext => new VarNode(word.CHAR.toList.mkString(""))
      case decimal: TerminalNode => new DecimalConstNode(decimal.toString.toDouble)
    }
  }

  override def visitIf_stmt(ctx: CheckListParser.If_stmtContext): ASTNode = {
    val dummyCondition = ctx.logical_expr().accept(this).asInstanceOf[ExpressionNode]
    val body = visitBody(ctx.body())
    new IfNode(dummyCondition, body)
  }


  override def visitBody(ctx: CheckListParser.BodyContext): BodyNode = {
    val stmts = ctx.stmt.toList.map(_.accept(this))
    new BodyNode(stmts)
  }


  override def visitHeading(ctx: CheckListParser.HeadingContext): TextNode = {
    val collectedText = ctx.children.subList(1, ctx.children.size()).toList.flatMap {
      case text: CheckListParser.TextContext => visitText(text).text
      case _ => ""
    }.mkString("")
    new TextNode(collectedText)
  }


  override def visitText(ctx: CheckListParser.TextContext): TextNode = {
    val collectedText = ctx.children.toList.flatMap {
      case node: TerminalNode => node.toString
      case word: CheckListParser.WordContext => word.CHAR.toList.mkString("")
    }.mkString("")

    new TextNode(collectedText)
  }

  override def visitPlaceholder(ctx: CheckListParser.PlaceholderContext): TextNode = {
    val text = ctx.CHAR.toList.mkString("")
    new PlaceholderNode(text)
  }

  override def visitItem(ctx: CheckListParser.ItemContext): ASTNode = {
    val nodes = ctx.children.toList
      .filter(node => {
        node.isInstanceOf[CheckListParser.TextContext] ||
          node.isInstanceOf[CheckListParser.PlaceholderContext]
      })
      .map {
        case text: CheckListParser.TextContext => visitText(text)
        case placeholder: CheckListParser.PlaceholderContext => visitPlaceholder(placeholder)
      }
    new ItemNode(nodes)
  }
}