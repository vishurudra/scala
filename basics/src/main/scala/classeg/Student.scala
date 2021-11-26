package classeg
class Student{
  var id:Int = 0;                         // All fields must be initialized
  var name:String = null;
}
object SampleObject{
  def main(args:Array[String])={
    var s = new Student()             // Creating an object
    println(s.id+" "+s.name)
    var s1= new Student
    println(s1.id+" "+s1.name)

  }
}