package org.scala.checklist.ast.nodes.operations

package object ArithmeticOperation extends Enumeration {
  type ArithmeticOperation = Value
  val MULT, DIV, PLUS, MINUS = Value
}

package object CompareOperation extends Enumeration {
  type CompareOperation = Value
  val GT, GE, LT, LE, EQ = Value
}

package object LogicalOperation extends Enumeration {
  type LogicalOperation = Value
  val AND, OR = Value
}

