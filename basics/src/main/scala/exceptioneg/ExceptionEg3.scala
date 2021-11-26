package exceptioneg
import scala.util.{Try,Success,Failure}

object ExceptionEg3 extends App{
  def toInt(s: String): Try[Int] = Try {
    Integer.parseInt(s.trim)
  }
  val a = toInt("1")
  println(a)
  val b = toInt("boo")
  println(b)
  b match {
    case Success(i) => println(i)
    case Failure(s) => println(s"Failed. Reason: $s")
  }
}
