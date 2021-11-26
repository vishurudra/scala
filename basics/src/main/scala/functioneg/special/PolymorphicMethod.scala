package functioneg.special

object PolymorphicMethod {
  def getList[T](x:T, y:Int): List[T] = {
    if (y == 0)
      Nil
    else
      x :: getList(x, y - 1)
  }

  def main(args: Array[String])= {
    println(getList[Int](3,2))
    println(getList[String]("Hi", 3))
  }
}
