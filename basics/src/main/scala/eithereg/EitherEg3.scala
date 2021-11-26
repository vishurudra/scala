package eithereg

object EitherEg3 extends App{
  val left = Left("HoHoHo").withRight[BigDecimal]
  left.swap.foreach(println)
}
