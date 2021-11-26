package semigroup

/**
 * Monoid extends the power of Semigroup by providing an additional empty value.
 */
object MonoidEg extends App{
  import cats.Monoid

  implicit val intAdditionMonoid: Monoid[Int] = new Monoid[Int] {
    def empty: Int = 0
    def combine(x: Int, y: Int): Int = x + y
  }

  val x = 1

  println(Monoid[Int].combine(x, Monoid[Int].empty))
  // res1: Int = 1

  println(Monoid[Int].combine(Monoid[Int].empty, x))


  def combineAll[A: Monoid](as: List[A]): A =
    as.foldLeft(Monoid[A].empty)(Monoid[A].combine)




 println( combineAll(List("hello", " ", "world")))
  // res4: String = "hello world"

  println(combineAll(List(Map('a' -> 1), Map('a' -> 2, 'b' -> 3), Map('b' -> 4, 'c' -> 5))))
  // res5: Map[Char, Int] = Map('b' -> 7, 'c' -> 5, 'a' -> 3)

  println(combineAll(List(Set(1, 2), Set(2, 3, 4, 5))))
}
