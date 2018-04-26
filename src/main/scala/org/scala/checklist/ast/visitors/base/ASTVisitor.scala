package org.scala.checklist.ast.visitors.base

import org.scala.checklist.ast.nodes.atomic.AtomicNode
import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.nodes.operations.{BooleanOpNode, ExpressionNode, LogicalOpNode}
import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.nodes.{ASTNode, BodyNode, VarDefinitionNode}

trait ASTVisitor[T, -G] {
  def visitTemplateNode(text: TextNode, stmts: List[ASTNode], context: G): T

  def visitItemNode(text: List[ItemElementNode], context: G): T

  def visitIfNode(condition: BooleanOpNode, bodyNode: BodyNode, context: G): T

  def visitTextNode(text: String, context: G): T

  def visitBodyNode(items: List[ASTNode], context: G): T

  def visitVarReferenceNode(name: String, context: G): T

  def visitDecimalConstNode(value: String, context: G): T

  def visitLogicalOpNode(left: LogicalOpNode, op: LogicalOperation, right: LogicalOpNode, context: G): T

  def visitCompareOpNode(left: ExpressionNode, op: CompareOperation, right: ExpressionNode, context: G): T

  def visitNotOpNode(expr: LogicalOpNode, context: G): T

  def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation, right: ExpressionNode, context: G): T

  def visitNegationOpNode(expr: ExpressionNode, context: G): T

  def visitFuncDefinitionNode(funcName: String, arguments: List[VarDefinitionNode], body: BodyNode, context: G): T

  def visitPlaceHolderNode(expr: ExpressionNode, context: G): T

  def visitFuncCallNode(funcReference: String, args: List[AtomicNode], context: G): T

  def visitVarAssignment(varDefinition: VarDefinitionNode, value: AtomicNode, context: G): T
}
