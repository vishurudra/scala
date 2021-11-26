package methodoverload
class Arithmetic{
  def add(a:Int, b:Int)={
    var sum = a+b
    println(sum)
  }
  def add(a:Int, b:Int, c:Int)={
    var sum = a+b+c
    println(sum)
  }
}

object MainObject{
  def main(args:Array[String])={
    var a  = new Arithmetic();
    a.add(10,10);
    a.add(10,10,10);
  }
}