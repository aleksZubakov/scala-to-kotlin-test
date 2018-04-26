package org.scala.checklist.ast.nodes
import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.visitors.ASTVisitor

class VarAssignmentNode(val varDefinition: VarDefinitionNode, val value: ExpressionNode) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitVarAssignment(varDefinition, value, context)
}
