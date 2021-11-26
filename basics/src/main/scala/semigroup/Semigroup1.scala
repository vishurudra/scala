package semigroup
import cats.Semigroup

/**
 * It is defined for some (possibly infinite) set of elements
It has a binary operation defined for any pairs of elements in this set
It also has the following two properties:
The operation is closed, which means that the result of the operation belongs to
the same set as its operands
The operation is associative, meaning that multiple operations should produce
the same result, regardless of the order in which they are applied
 */
object Semigroup1 extends App{


  implicit val intAdditionSemigroup: Semigroup[Int] = new Semigroup[Int] {
    def combine(x: Int, y: Int): Int = x + y
  }

  val x = 1
  val y = 2
  val z = 3
  println(Semigroup[Int].combine(x, y))
  // res1: Int = 3

  println(Semigroup[Int].combine(x, Semigroup[Int].combine(y, z)))
  // res2: Int = 6

  println(Semigroup[Int].combine(Semigroup[Int].combine(x, y), z))
  val map1 = Map("hello" -> 1, "world" -> 1)
  val map2 = Map("hello" -> 2, "cats"  -> 3)

  println(Semigroup[Map[String, Int]].combine(map1, map2))
}
