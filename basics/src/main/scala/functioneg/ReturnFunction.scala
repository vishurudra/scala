package functioneg

object ReturnFunction {
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  def printMe( ) : Unit = {
    println("Hello, Scala!")
  }

  def main(args: Array[String]) = {
    var sum = addInt(1,2);
    println(sum);
  }
}
