package classeg

case class CaseClass(a:Int, b:Int)

case class CaseSecondClass(name:String,age:Int)

object MainObjectClass{
  def main(args:Array[String])={
    var c =  CaseClass(10,10)       // Creating object of case class
    println("a = "+c.a)               // Accessing elements of case class
    println("b = "+c.b)

    var d =  CaseSecondClass("Viswa",45)
    println(d)
  }
}