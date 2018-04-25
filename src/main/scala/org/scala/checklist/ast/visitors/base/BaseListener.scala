package org.scala.checklist.ast.visitors.base

import org.scala.checklist.ast.nodes.BinaryOperation.BinaryOperation
import org.scala.checklist.ast.nodes.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.nodes.{ASTNode, BodyNode, TextNode}

class BaseListener extends ASTVisitor[Unit]{
  override def visitTemplateNode(text: TextNode, stmts: List[ASTNode]): Unit = {
    text.accept(this)
    stmts.foreach(_.accept(this))
  }

  override def visitItemNode(text: List[TextNode]): Unit = {
    text.foreach(_.accept(this))
  }

  override def visitIfNode(condition: ExpressionNode, bodyNode: BodyNode): Unit = {
    condition.accept(this)
    bodyNode.accept(this)
  }

  override def visitTextNode(text: String): Unit = {

  }

  override def visitBodyNode(items: List[ASTNode]): Unit = {
    items.foreach(_.accept(this))
  }

  override def visitVarNode(name: String): Unit = {}

  override def visitDecimalConstNode(value: Double): Unit = {

  }

  override def visitBinaryOpNode(left: ExpressionNode, op: BinaryOperation, right: ExpressionNode): Unit = {
    left.accept(this)
    right.accept(this)
  }

  override def visitCompareOpNode(left: AtomicNode, op: CompareOperation, right: AtomicNode): Unit = {
    left.accept(this)
    right.accept(this)
  }

  override def visitNotOpNode(expr: ExpressionNode): Unit = {
    expr.accept(this)
  }
}
