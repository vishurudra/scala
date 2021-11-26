package exceptioneg

import scala.util.Try

object CalculatorExceptions {
  class IntOverflowException extends RuntimeException
  class NegativeNumberException extends RuntimeException
}

object Calculator {
  import CalculatorExceptions._

  def sum(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) throw new NegativeNumberException
    val result = a + b
    if (result < 0) throw new IntOverflowException
    result
  }

  def tryCatch(a: Int, b: Int): Int = {
    try {
      return Calculator.sum(a,b)
    } catch {
      case e: IntOverflowException => -1
      case e: NegativeNumberException => -2
    } finally {
      // This block will always be invoked
      println("Calculation done!")
    }
  }


}


object SampleTest extends App{
  var res = Calculator.tryCatch(-1,0)
  println(res)
}