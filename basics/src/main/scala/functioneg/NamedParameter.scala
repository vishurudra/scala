package functioneg

object NamedParameter {
  def main(args: Array[String]) = {
    sum(a=22,b=33)           // Calling function
    sum(b=100,a=50)
  }
  def sum(a:Int,b:Int)  ={        // Defining a function
    println(a+b)
  }
}
