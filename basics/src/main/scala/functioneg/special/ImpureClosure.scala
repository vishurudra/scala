package functioneg.special

object ImpureClosure {
  // Main method
  def main(args: Array[String])=
  {

    var employee = 50

    // define closure function
    val gfg = (name: String) => println(s"Company name is $name"+
      s" and total no. of employees are $employee")

    gfg("ss")
  }
}
