package org.scala.checklist.app

import org.antlr.generated._
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.scala.checklist.ast.nodes.TemplateNode
import org.scala.checklist.ast.visitors.TypeAndConfigCheckListener
import org.scala.checklist.visitors.antlr.AstTransformer
import org.scala.checklist.config.Config

object MyMain extends App {
  val lexer = new CheckListLexer(CharStreams.fromFileName("test.checklist"))
  val tokenStream = new CommonTokenStream(lexer)
  val parser = new CheckListParser(tokenStream)

  val templateAst = parser.template().accept(new AstTransformer)

  val config = Config.buildFromFile("test.config")
  templateAst.accept(new TypeAndConfigCheckListener(config))

}