package foldeg

object FoldEg1 extends App{
  val numbers = List(1, 3, 5)
  // numbers: List[Int] = List(1, 3, 5)

  val res =numbers.fold(0)(_ + _)
  println(res)

  val res1 =numbers.fold(10)(_ + _)
  println(res1)

  def add(a: Int, b: Int): Int = a + b
  // (a: Int, b: Int)Int

  val res3=numbers.fold(0)(add)
  println(res3)
}
