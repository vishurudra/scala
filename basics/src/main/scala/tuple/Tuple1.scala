package tuple

object Tuple1 {
  def tupleator(x1: Any, x2: Any, x3: Any) = (x1, x2, x3)
  def main(args:Array[String])={
    val t = tupleator("Hello", 1, 2.3)
    println( "Print the whole tuple: " + t )
    println( "Print the first item: " + t._1 )
    println( "Print the second item: " + t._2 )
    println( "Print the third item: " + t._3 )
    val (t1, t2, t3) = tupleator("World", '!', 0x22)
    println( t1 )
    println(" " + t2 + " " + t3 )

  }
 }
