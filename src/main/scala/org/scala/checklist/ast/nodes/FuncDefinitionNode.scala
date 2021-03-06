package org.scala.checklist.ast.nodes

import org.scala.checklist.ast.visitors.ASTVisitor

class FuncDefinitionNode(val funcName: String, val arguments: List[VarDefinitionNode],
                         val body: BodyNode) extends ASTNode {
  override def accept[T, G](visitor: ASTVisitor[T, G], context: G): T =
    visitor.visitFuncDefinitionNode(funcName, arguments, body, context)
}
