package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.visitors.base.ASTVisitor

class IfNode(val condition: ExpressionNode, val bodyNode: BodyNode) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitIfNode(condition, bodyNode, context)

}
