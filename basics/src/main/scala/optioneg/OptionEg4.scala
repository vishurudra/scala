package optioneg

object OptionEg4 extends App{
  val o1: Option[List[Int]] = Some(List(100,200))
  println(o1.isEmpty)
  val l1 : List[Int] = o1.get
  print(l1)

}
