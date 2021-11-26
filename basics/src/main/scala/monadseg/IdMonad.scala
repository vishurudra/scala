package monadseg

object IdMonad extends App{
  import cats.Monad
  import cats._

  val one: Int = 1
  // one: Int = 1
  println(Monad[Id].map(one)(_ + 1))
  // res1: Id[Int] = 2
 println( Monad[Id].flatMap(one)(_ + 1))
}
