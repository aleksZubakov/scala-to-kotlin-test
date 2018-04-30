package org.scala.checklist.app

import org.antlr.SyntaxErrorListener
import org.antlr.generated._
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.scala.checklist.ast.visitors.{InterpretContext, InterpretVisitor}
import org.scala.checklist.checkers._
import org.scala.checklist.config.{Config, ConfigEntry}
import org.scala.checklist.exceptions.{ConfigParseException, InvalidFunctionCall, NotFoundDeclarationException, TypeCheckException}
import org.scala.checklist.visitors.antlr.AstTransformer

object Interpreter {
  def run(templateFileName: String, configFileName: String): Unit = {
    try {
      val lexer = new CheckListLexer(CharStreams.fromFileName("test.checklist"))
      lexer.removeErrorListeners()
      lexer.addErrorListener(SyntaxErrorListener.INSTANCE)

      val tokenStream = new CommonTokenStream(lexer)
      val parser = new CheckList(tokenStream)
      parser.removeErrorListeners()
      parser.addErrorListener(SyntaxErrorListener.INSTANCE)

      val templateAst = parser.template().accept(new AstTransformer)
      val config = Config.buildFromFile("test.config")

      val globalVariablesContext = config.variables.map {
        case (key: String, entry: ConfigEntry) => key -> entry.varType
      }

      templateAst.accept(new AllVariablesDeclaredChecker, globalVariablesContext.keySet)
      templateAst.accept(new SimpleTypeChecker, globalVariablesContext)
      templateAst.accept(new FunctionSignatureChecker, SignatureCheckerContext(Map.empty, globalVariablesContext))

      val globalTypedVariablesContext = config.variables.map {
        case (key: String, entry: ConfigEntry) => key -> (entry.varType, entry.value)
      }
      templateAst.accept(new InterpretVisitor, InterpretContext(0, Map.empty, globalTypedVariablesContext))
    } catch {
      case e: ParseCancellationException => println(s"Что-то не так с синаксисом \n ${e.getMessage}")
      case e: ConfigParseException => println("Что-то пошло не так, конфиге" +
        "должны быть только строчки вида 'название : тип [: значение]'")
      case e: InvalidFunctionCall => println("Упс, что-то не задалось при вызове функции")
      case e: TypeCheckException => println("Такс, кто-то пытается сложить или сравнивать число и строку?")
      case e: NotFoundDeclarationException => println(s"Кто-то забыл объявить переменную ${e.varName}")
    }
  }
}

object Main extends App {

  override def main(args: Array[String]): Unit = {
        if (args.length != 2) {
          println("Нужно ровно два файла: <config_file> и <template_file>")
          return
        }
        val configFileName = args(0)
        val templateFileName = args(1)

        Interpreter.run(templateFileName, configFileName)
  }
}