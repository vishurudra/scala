package functioneg.special

object TypeHierachy extends App {

    val list: List[Any] = List(
      false, 66677, 732, 'a', "abs"
    )

    list.foreach(element => println(element))

  val list1: List[AnyVal] = List(
    333, true, false
  )

  list1.foreach(element => println(element))


  val list2: List[AnyRef] = List(
    "GFG", "VI"
  )

  list2.foreach(element => println(element))

}
