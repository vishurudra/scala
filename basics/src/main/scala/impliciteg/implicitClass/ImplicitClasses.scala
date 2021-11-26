package impliciteg.implicitClass

implicit class LoquaciousInt(x: Int) {
  def chat: Unit = for(i <- 1 to x) println("Hi!")
}


// Hi!
// Hi!
// Hi!

object ImplicitClasses extends App{
  3.chat
}
