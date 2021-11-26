package basicseg

import scala.io.StdIn.readLine

object IfElse {
  def main(array: Array[String]): Unit = {
    println("Enter a number")
    var number: Int = readLine().toInt
    if (number % 2 == 0) {
      println("Even number")
    } else {
      println("Odd number")
    }
  }

}
