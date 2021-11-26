package optioneg

object OptionEg1 extends App {
  val name = Map("Nidhi" -> "author",
    "Geeta" -> "coder")

  // Accessing keys of the map
  val x = name.get("Nidhi")
  val y = name.get("Rahul")

  // Displays Some if the key is
  // found else None
  println(x.isDefined)
  println(x.isEmpty)
  println(y.isDefined)
  println(y.isEmpty)

  println(x)
  println(y)

}
