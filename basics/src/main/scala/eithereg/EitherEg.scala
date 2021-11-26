package eithereg

object EitherEg extends  App{
  {

    // Defining a method and applying
    // Either
    def Name(name: String): Either[String, String] =
    {

      if (name.isEmpty)
      // Left child for failure
        Left("There is no name.")

      else
      // Right child for success
        Right(name)
    }

    // Displays this if name is
    // not empty
    println(Name("vishwa"))

    // Displays the String present
    // in the Left child
    println(Name(""))
  }

}
