package groupbyeg

object GroupbyEg1 extends App {
  val fruit = List("apple", "apricot", "blueberry", "orange")
  // fruit: List[String] = List(apple, apricot, blueberry, orange)

  val fruitMap = fruit.groupBy(_.take(1))
  // fruitMap: Map(b -> List(blueberry), a -> List(apple, apricot), o -> List(orange))

  fruitMap("a")
  // List[String] = List(apple, apricot)
}
