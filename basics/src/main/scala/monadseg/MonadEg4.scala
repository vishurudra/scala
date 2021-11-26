package monadseg

object MonadEg4 extends App{
  val aMap = Map((1 -> "a"), (2 -> "b"))
  // aMap: scala.collection.immutable.Map[Int,String] = Map(1 -> a, 2 -> b)
  // Note: the "->" notation is syntactic sugar for defining tuples that makes it
  // obvious that you intend that they be used in a Map

  val rs1 = aMap.mapValues(_.toUpperCase).toMap
  println(rs1)
}
