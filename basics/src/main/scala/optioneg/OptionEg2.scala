package optioneg

object OptionEg2 extends App{
  val some:Option[Int] = Some(15)

  // Using None class
  val none:Option[Int] = None

  // Applying getOrElse method
  val x = some.getOrElse(0)
  val y = none.getOrElse(17)

  // Displays the key in the
  // class Some
  println(x)

  // Displays default value
  println(y)

  val isSomeEmpty = some.isEmpty
  val isNoneEmpty = none.isEmpty

  // Displays true if there
  // is a value else false
  println(isSomeEmpty)
  println(isNoneEmpty)

  val some1:Option[Int] = Some(200)

  // Applying productArity
  // method
  val x1 = some1.productArity

  // Displays the size of
  // the Option's value
  println(x1)
  println(some1.productElement(0))
  println(some1.exists(y => {y % 3 == 0}))
  println(some1.filter(y => {y % 3 == 0}))
}
