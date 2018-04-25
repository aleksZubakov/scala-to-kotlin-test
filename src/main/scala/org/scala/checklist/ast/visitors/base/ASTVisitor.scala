package org.scala.checklist.ast.visitors.base

import org.scala.checklist.ast.nodes.BinaryOperation.BinaryOperation
import org.scala.checklist.ast.nodes.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.nodes.{ASTNode, BodyNode, TextNode}

trait ASTVisitor[T] {
  def visitTemplateNode(text: TextNode, stmts: List[ASTNode]): T

  def visitItemNode(text: List[TextNode]): T

  def visitIfNode(condition: ExpressionNode, bodyNode: BodyNode): T

  def visitTextNode(text: String): T

  def visitBodyNode(items: List[ASTNode]): T

  def visitVarNode(name: String): T

  def visitDecimalConstNode(value: Double): T

  def visitBinaryOpNode(left: ExpressionNode, op: BinaryOperation, right: ExpressionNode): T

  def visitCompareOpNode(left: AtomicNode, op: CompareOperation, right: AtomicNode): T

  def visitNotOpNode(expr: ExpressionNode): T

}
