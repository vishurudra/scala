package functioneg.special

object ClosureFurther {
  def main(args: Array[String]) ={
    def forloop(rule: => Boolean)(body: => Unit): Unit =
      if (rule) {
        body
        forloop(rule)(body)
      }
    var i = 7
    forloop(i > 2) {
      println("i: " + i)
      i -= 1
    }
  }
}
