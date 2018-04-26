package org.scala.checklist.ast.nodes.atomic

import org.scala.checklist.ast.visitors.ASTVisitor

class DecimalConstNode(val value: String) extends AtomicNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T = visitor.visitDecimalConstNode(value, context)
}
