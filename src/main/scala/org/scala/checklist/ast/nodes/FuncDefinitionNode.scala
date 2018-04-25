package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.base.ASTVisitor

class FuncDefinitionNode(val funcName: String, val arguments: List[VarDefinitionNode],
                         val body: BodyNode) extends ASTNode {
  override def accept[T](visitor: ASTVisitor[T]): T = ???
}
