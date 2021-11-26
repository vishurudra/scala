package collectioneg

object Country {
  def main(args:Array[String])= {
    val country_1 =  List("India","SriLanka","Algeria")
    val country_2 = List("Austria","Belgium","Canada")

    val country = country_1 ::: country_2
    println( "country_1 ::: country_2 : " + country )

    val cont = country_1.:::(country_2)
    println( "country_1.:::(country_2) : " + cont )
    val con = List.concat(country_1, country_2)
    println( "List.concat(country_1, country_2) : " + con  )
    val country1 = List("Denmark","Sweden","France")
    println("Country List before reversal :" + country1)
    println("Country List after reversal :" + country1.reverse)
    val name = List.fill(6)("Rehan")
    println( "Name : " + name  )

    val id = List.fill(6)(12)
    println( "Id : " + id  )
  }
}
