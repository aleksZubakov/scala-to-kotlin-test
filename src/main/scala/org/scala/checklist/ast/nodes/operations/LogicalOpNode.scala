package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
import org.scala.checklist.ast.visitors.ASTVisitor

class LogicalOpNode(val left: LogicalOpNode, val op: LogicalOperation,
                    val right: LogicalOpNode) extends BooleanOpNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitLogicalOpNode(left, op, right, context)
}
