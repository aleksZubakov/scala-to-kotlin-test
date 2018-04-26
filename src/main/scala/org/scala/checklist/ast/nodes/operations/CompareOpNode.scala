package org.scala.checklist.ast.nodes.operations

import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
import org.scala.checklist.ast.visitors.ASTVisitor

class CompareOpNode(val left: ExpressionNode, val cmp: CompareOperation, val right: ExpressionNode) extends BooleanOpNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitCompareOpNode(left, cmp, right, context)
}
