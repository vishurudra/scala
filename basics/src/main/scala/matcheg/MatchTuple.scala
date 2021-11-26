package matcheg

object MatchTuple {

  def main(array: Array[String]) = {
    val tupA = ("Good", "Morning!")
    val tupB = ("Guten", "Tag!")
    val tupC=("Good","Evening")

    for (tup <- List(tupA, tupB,tupC)) {
      tup match {
        case (thingOne, thingTwo) if thingOne == "Good" =>
          println("A two-tuple starting with 'Good'."+thingTwo)
        case (thingOne, thingTwo) =>
          println("This has two things: " + thingOne + " and " + thingTwo)
      }
    }
  }
}
