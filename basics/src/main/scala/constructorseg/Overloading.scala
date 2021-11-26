package constructorseg

class StudentOverload(id:Int){
  def this(id:Int, name:String)={
    this(id)
    println(id+" "+name)
  }
  println(id)
}

object MainObjectOverload1{
  def main(args:Array[String])={
    new StudentOverload(101)
    new StudentOverload(100,"India")
  }
}