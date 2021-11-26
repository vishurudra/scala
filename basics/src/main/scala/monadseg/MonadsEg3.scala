package monadseg

object MonadsEg3 extends App{
  val list = List.apply(1,2)
  // list: List[Int] = List(1)


  def makeListofDoubles(int: Int): List[Double] = {
    List(int.toDouble)
  }

  val list3 = list.flatMap(makeListofDoubles)

  println(list3)

 /** def combine(a: A, b: A, c: A): A

  // this for-comprehension
  for {
    a <- m1
    b <- m2
    c <- m3
  } yield combine(a,b,c)

  // is equivalent to this expression
  m1.flatMap(a => m2.flatMap(b => m3.map(c => combine(a,b,c))))**/
 
}
