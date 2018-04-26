package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.nodes.operations.{BooleanOpNode, ExpressionNode, LogicalOpNode}
import org.scala.checklist.ast.visitors.ASTVisitor

class IfNode(val condition: BooleanOpNode, val bodyNode: BodyNode) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitIfNode(condition, bodyNode, context)

}
