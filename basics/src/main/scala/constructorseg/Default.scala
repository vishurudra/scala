package constructorseg

class Student{
  println("Hello from default constructor");
}

object MainObjectDeafult{
  def main(args:Array[String])={
    var s = new Student();
  }
}
