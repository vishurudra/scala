package monadseg

object MonadsEg2 extends App{
  val list1 = List(1, 2, 3, 4)
  val list2 = List(5, 6, 7, 8)

  // Applying 'flatMap' and 'map'
  //for each value of list 1 add all values of list2
  val z = list1 flatMap { q =>
    list2 map {
      r => q + r
    }
  }
    println(z)
    val mul = list1 flatMap { s => list2 map {
      t => s * t

    }
  }

  // Displays output
  println(mul)

}
