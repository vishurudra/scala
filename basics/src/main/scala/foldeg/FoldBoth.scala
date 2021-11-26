package foldeg

object FoldBoth extends App{
 val l = List(1, 2, 3)


println( l.foldLeft(List.empty[Int]) { (acc, ele) => ele :: acc })


println(l.foldRight(List.empty[Int]) { (ele, acc) => ele :: acc })

  val words = List("Hic", "Est", "Index")

  println(words.foldLeft("")(_ + _) )
  println(words.foldRight("")(_ + _) )

}
