package mapeg

object MapOperations {
  def main(args: Array[String]) ={
    val student = Map(12 -> "Reena", 13 -> "Micheal", 14 -> "Peter")

    val marks: Map[String, Int] = Map()

    println("Keys : " + student.keys)
    println("Values : " + student.values)
    println("Check if student is empty : " + student.isEmpty)
    println("Check if marks is empty : " + marks.isEmpty)
    val stud1 = Map(12 -> "Reena", 13 -> "Micheal" , 14 -> "Peter")
    val stud2 = Map(15 -> "Russel", 16 -> "Mark" , 17 -> "Steve")

    var res = stud1 ++ stud2
    println( "stud1 ++ stud2 : " + res )

    val stu = stud1.++(stud2)
    println( "stud1.++(stud2)) : " + stu )


    stud2.keys.foreach{ i =>
      print( "Key = " + i )
      println(" Value = " + stud2(i) )}

    if( stud2.contains( 15 )){
      println("Student Id 15 exists with value :"  + stud2(15))
    }else{
      println("Student Id with 15 does not exist")
    }
  }
}