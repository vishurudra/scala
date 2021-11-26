package constructorseg

class StudentClass(id:Int, name:String){
  var age:Int = 0
  def showDetails()={
    println(id+" "+name+" "+age)
  }
  def this(id:Int, name:String,age:Int)={
    this(id,name)       // Calling primary constructor, and it is first line
    this.age = age
  }
}

object MainObjectClass{
  def main(args:Array[String])={
    var s = new StudentClass(101,"Rama",20);
    s.showDetails()
  }
}