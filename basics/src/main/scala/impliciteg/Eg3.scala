package impliciteg

/**
 * Implicit conversions
 */
object Eg3 extends App {
  def alert(msg: String): Unit = println(msg)

  alert(7)
  // error: type mismatch;
  // found   : Int(7)
  // required: String

  implicit def intToString(i: Int): String = i.toString

  alert(7)
}
