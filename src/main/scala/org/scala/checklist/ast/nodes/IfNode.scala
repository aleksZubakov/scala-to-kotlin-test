package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.nodes.operations.ExpressionNode
import org.scala.checklist.ast.visitors.ASTVisitor

class IfNode(val condition: ExpressionNode, val bodyNode: BodyNode) extends ASTNode {
  override def accept[T](visitor: ASTVisitor[T]): T = {
    visitor.visitIfNode(condition, bodyNode)
  }
}
