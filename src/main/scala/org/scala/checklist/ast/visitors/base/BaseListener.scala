//package org.scala.checklist.ast.visitors.base
//
//import org.scala.checklist.ast.nodes.item.{ItemElementNode, TextNode}
//import org.scala.checklist.ast.nodes.operations.ArithmeticOperation.ArithmeticOperation
//import org.scala.checklist.ast.nodes.operations.CompareOperation.CompareOperation
//import org.scala.checklist.ast.nodes.operations.ExpressionNode
//import org.scala.checklist.ast.nodes.operations.LogicalOperation.LogicalOperation
//import org.scala.checklist.ast.nodes.{ASTNode, BodyNode}
//
//class BaseListener extends ASTVisitor[Unit, Unit] {
//  override def visitTemplateNode(text: TextNode, stmts: List[ASTNode], context: Unit): Unit = {
//    text.accept(this)
//    stmts.foreach(_.accept(this))
//  }
//
//  override def visitItemNode(text: List[ItemElementNode]): Unit = {
//    text.foreach(_.accept(this))
//  }
//
//  override def visitIfNode(condition: ExpressionNode, bodyNode: BodyNode): Unit = {
//    condition.accept(this)
//    bodyNode.accept(this)
//  }
//
//  override def visitTextNode(text: String): Unit = {
//
//  }
//
//  override def visitBodyNode(items: List[ASTNode]): Unit = {
//    items.foreach(_.accept(this))
//  }
//
//  override def visitVarNode(name: String): Unit = {}
//
//  override def visitDecimalConstNode(value: Double): Unit = {}
//
//  override def visitBinaryOpNode(left: ExpressionNode, op: LogicalOperation, right: ExpressionNode): Unit = {
//    left.accept(this)
//    right.accept(this)
//  }
//
//  override def visitCompareOpNode(left: ExpressionNode, op: CompareOperation, right: ExpressionNode): Unit = {
//    left.accept(this)
//    right.accept(this)
//  }
//
//  override def visitNotOpNode(expr: ExpressionNode): Unit = {
//    expr.accept(this)
//  }
//
//  override def visitArithmeticOpNode(left: ExpressionNode, op: ArithmeticOperation, right: ExpressionNode): Unit = {
//    left.accept(this)
//    right.accept(this)
//  }
//
//  override def visitNegationOpNode(expr: ExpressionNode): Unit = {
//    expr.accept(this)
//  }
//}
