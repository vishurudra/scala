package constructorseg
class StudentParam(id:Int, name:String){
  def showDetails()={
    println(id+" "+name);
  }
}

object MainObjectParam{
  def main(args:Array[String])={
    var s = new StudentParam(101,"Rama");
    s.showDetails()
  }
}
