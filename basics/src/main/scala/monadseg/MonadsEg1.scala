package monadseg

object MonadsEg1 extends App{
  var x = Seq("Vishwa", "teaches", "Spark")
  var y = x.map(_.toUpperCase)
  println(y)
  var z = x.flatMap(_.toUpperCase)
  println(z)
}
