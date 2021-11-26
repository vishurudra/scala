package classeg

class StudentRecord(id:Int, name:String){
  def getRecord()={
    println(id+" "+name);
  }
}

object TestStudent{
  def testStudent()={
    var student1 = new StudentRecord(101,"Raju");
    var student2 = new StudentRecord(102,"Martin");
    student1.getRecord();
    student2.getRecord();
    println("student"+student1)
  }
}

object MainObjectRecord{
  def main(args: Array[String])={
    TestStudent.testStudent()
  }
}