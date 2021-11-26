package foldeg

object FoldLeft extends App{
  def addString(a: String, b: Int): String = a + b
  // (a: String, b: Int)String
  val numbers = List(1, 3, 5)
  val res=numbers.foldLeft("")(addString)
  println(res)
}
