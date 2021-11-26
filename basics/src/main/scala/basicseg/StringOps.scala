package basicseg

object StringOps extends App {
  val firstName:String = "John"
  val mi = 'C'
  val lastName = "Doe"
  var name = firstName + " " + mi + " " + lastName
  println(name)
  name = s"$firstName $mi $lastName"
  println(name)
  var speech =
    """Four score and
               seven years ago
               our fathers ..."""
  println(speech)

  speech =
    """Four score and
      |seven years ago
      |our fathers ...""".stripMargin
  println(speech)
}
