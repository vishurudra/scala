package functioneg

object DefaultParameter {
  def main(args: Array[String]) = {
    sum(22)           // Calling function
    sum(55,66)
  }
  def sum(a:Int,b:Int=32)  ={        // Defining a function
    println(a+b)
  }
}
