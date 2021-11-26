package classeg

class StudentParam(id:Int, name:String){     // Primary constructor
  def show()={
    println(id+" "+name)
  }
}
object MainObject{
  def main(args:Array[String])={
    var s = new StudentParam(100,"Martin")   // Passing values to constructor
    s.show()                // Calling a function by using an object
  }
}