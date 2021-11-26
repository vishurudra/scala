package typeeg

class Outer {
  class Inner
}

object OuterObj extends  App{
  val f1 = new Outer
  val b1: f1.Inner = new f1.Inner
  val f2 = new Outer
  val b2: f2.Inner = new f2.Inner
  assert(b1 != b2)
}