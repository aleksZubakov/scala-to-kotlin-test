package org.scala.checklist.ast.nodes

package object CompareOperation extends Enumeration {
  type CompareOperation = Value
  val GT, GE, LT, LE, EQ = Value
}
