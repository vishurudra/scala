package exceptioneg

object ExceptionEg2 extends App{
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }


  val y = for {
    a <- toInt("20")
    b <- toInt("30")
    c <- toInt("40")
  } yield a + b + c

  println(y)
}
