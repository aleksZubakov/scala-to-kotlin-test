package org.scala.checklist.app

import org.antlr.generated._
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.scala.checklist.ast.visitors.{InterpretContext, InterpretVisitor}
import org.scala.checklist.checkers.{FunctionSignatureChecker, SignatureCheckerContext, SimpleTypeChecker}
import org.scala.checklist.config.{Config, ConfigEntry}
import org.scala.checklist.visitors.antlr.AstTransformer

object Interpreter {
  def run(templateFileName: String, configFileName: String): Unit = {
    val lexer = new CheckListLexer(CharStreams.fromFileName("test.checklist"))
    val tokenStream = new CommonTokenStream(lexer)
    val parser = new CheckListParser(tokenStream)

    val templateAst = parser.template().accept(new AstTransformer)

    val config = Config.buildFromFile("test.config")

    val context = config.variables.map {
      case (key: String, entry: ConfigEntry) => key -> entry.varType
    }

    templateAst.accept(new SimpleTypeChecker, context)
    templateAst.accept(new FunctionSignatureChecker, SignatureCheckerContext(Map.empty, context))

    val fullContext = config.variables.map {
      case (key: String, entry: ConfigEntry) => key -> (entry.varType, entry.value)
    }
    templateAst.accept(new InterpretVisitor, InterpretContext(0, Map.empty, fullContext))
  }
}

object Main extends App {

  override def main(args: Array[String]): Unit = {
//    if (args.length == 2) {
//      println("Нужно ровно два файла: <config_file> и <template_file>")
//      return
//    }
//    val configFileName = args(0)
//    val templateFileName = args(1)
//
//    Interpreter.run(templateFileName, configFileName)
    Interpreter.run("test.checklist", "test.config")

  }
}