package traitseg

object Linearization extends App{
  trait A {
    override def toString: String =  "A"
  }

  trait B {
    override def toString: String =  super.toString+"B"
  }

  trait C {
    override def toString: String = super.toString+"C"
  }

  class E extends A with B with C {
    override def toString: String = super.toString + "D"
  }

  var e1 = new E
  println(e1.toString)
println( new E().toString)
}

