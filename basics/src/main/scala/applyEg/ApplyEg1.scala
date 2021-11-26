package applyEg

object ApplyEg1 extends App{
  val f = (x:Int) => x + 1
  val f2 = f.compose((x:Int) => x - 1)
  println(f2.apply(2))
  println(Foo (1)  )

  val adder = new MyAdder(2)
  val result = adder(4)
  println(result)
}

// we will be able to use this object as a function, as well as an object
object Foo {
  var y = 5
  def apply (x: Int) = x + y
}

class MyAdder(x: Int) {
  def apply(y: Int) = x + y
}


