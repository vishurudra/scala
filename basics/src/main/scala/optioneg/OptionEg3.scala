package optioneg

object OptionEg3 extends App{
  val o1: Option[Int] = Some(100)
  val v1 = o1 match {
    case Some(a) =>
      a
    case None =>
      0
  }
  println(v1)



  val o11: Option[Int] = Some(10)
  println(o11.map(_.toString))
  assert(o11.map(_.toString).contains("10"))

  assert(o11.map(_ * 2.0).contains(20))
  println(o11.map(_ * 2.0))

  val o2: Option[Int] = None
  assert(o2.map(_.toString).isEmpty)
}
