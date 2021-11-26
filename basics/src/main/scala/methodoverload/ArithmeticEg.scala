package methodoverload

class ArithmeticEg{
  def add(a:Int, b:Int)={
    var sum = a+b
    println(sum)
  }
  def add(a:Double, b:Double)={
    var sum = a+b
    println(sum)
  }
}
object MainObjectEg{
  def main(args:Array[String])={
    var b = new ArithmeticEg()
    b.add(10,10)
    b.add(10.0,20.0)

  }
}