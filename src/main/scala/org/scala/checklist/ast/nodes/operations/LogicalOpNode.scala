package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.visitors.base.ASTVisitor

class LogicalOpNode(val left: ExpressionNode, val op: LogicalOperation,
                    val right: ExpressionNode) extends ExpressionNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitLogicalOpNode(left, op, right, context)
}
