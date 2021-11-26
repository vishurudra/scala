package collectioneg

object StudentSet {
  def main(args: Array[String]) ={
    val name = Set("Smith", "Brown", "Allen","Brown")
    val id: Set[Int] = Set()

    println( "Head of name : " + name.head )
    println( "Tail of name : " + name.tail )
    println( "Check if name is empty : " + name.isEmpty )
    println( "Check if id is empty : " + id.isEmpty )

    val furniture_1 = Set("Sofa", "Table", "chair")
    val furniture_2 = Set("Bed", "Door")

    var furniture = furniture_1 ++ furniture_2
    println( "furniture_1 ++ furniture_2 : " + furniture )

    var furn = furniture_1.++(furniture_2)
    println( "furniture_1.++(furniture_2) : " + furn )

    val n1 = Set(11,45,67,78,89,86,90)
    val n2 = Set(10,20,45,67,34,78,98,89)

    println( "n1.&(n2) : " + n1.&(n2) )
    println( "n1.intersect(n2) : " + n1.intersect(n2) )
    println( "Minimum  element in the Set is : " + n1.min )
    println( "Maximum  element in the Set is : " + n2.max )
  }
}
