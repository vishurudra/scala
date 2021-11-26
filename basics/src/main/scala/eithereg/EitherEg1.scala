package eithereg

object EitherEg1 extends App{

  def Division(q: Int, r: Int): Either[String, Int] =
  {
    if (r == 0)
    // Left child for failure
      Left("Division not possible.")
    else
    // Right child for success
      Right(q / r)
  }

  // Assigning values
  val x = Division(4, 2)

  // Applying pattern matching
  x match
  {
    case Left(l) =>

      // Displays this if the division
      // is not possible
      println("Left: " + l)

    case Right(r) =>

      // Displays this if division
      // is possible
      println("Right: " + r)
  }


  val z = Division(4, 0)

  // Applying pattern matching
  z match
  {
    case Left(l) =>

      // Displays this if the division
      // is not possible
      println("Left: " + l)

    case Right(r) =>

      // Displays this if division
      // is possible
      println("Right: " + r)
  }
}
