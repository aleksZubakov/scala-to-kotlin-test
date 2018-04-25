package org.scala.checklist.ast.visitors.base

import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.nodes.{ASTNode, BodyNode}

trait ASTVisitor[T] {
  def visitTemplateNode(text: TextNode, stmts: List[ASTNode]): T

  def visitItemNode(text: List[ItemElementNode]): T

  def visitIfNode(condition: ExpressionNode, bodyNode: BodyNode): T

  def visitTextNode(text: String): T

  def visitBodyNode(items: List[ASTNode]): T

  def visitVarNode(name: String): T

  def visitDecimalConstNode(value: Double): T

  def visitBinaryOpNode(left: ExpressionNode, op: LogicalOperation, right: ExpressionNode): T

  def visitCompareOpNode(left: ExpressionNode, op: CompareOperation, right: ExpressionNode): T

  def visitNotOpNode(expr: ExpressionNode): T

  def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation, right: ExpressionNode): T

  def visitNegationOpNode(expr: ExpressionNode): T
}
