package org.scala.checklist.ast.visitors.base

import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.nodes.{ASTNode, BodyNode, VarDefinitionNode}

trait ASTVisitor[T, -G] {
  def visitTemplateNode(text: TextNode, stmts: List[ASTNode], context: G): T

  def visitItemNode(text: List[ItemElementNode], context: G): T

  def visitIfNode(condition: ExpressionNode, bodyNode: BodyNode, context: G): T

  def visitTextNode(text: String, context: G): T

  def visitBodyNode(items: List[ASTNode], context: G): T

  def visitVarReferenceNode(name: String, context: G): T

  def visitDecimalConstNode(value: Double, context: G): T

  def visitLogicalOpNode(left: ExpressionNode, op: LogicalOperation, right: ExpressionNode, context: G): T

  def visitCompareOpNode(left: ExpressionNode, op: CompareOperation, right: ExpressionNode, context: G): T

  def visitNotOpNode(expr: ExpressionNode, context: G): T

  def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation, right: ExpressionNode, context: G): T

  def visitNegationOpNode(expr: ExpressionNode, context: G): T

  def visitFuncDefinitionNode(funcName: String, arguments: List[VarDefinitionNode], body: BodyNode, context: G): T

  def visitPlaceHolderNode(expr: ExpressionNode, context: G): T

  def visitFuncCallNode(funcReference: String, args: List[AtomicNode], context: G): T
}
