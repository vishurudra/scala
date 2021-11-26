package impliciteg

/**
 * Implicit conversion
 */
object Eg4 extends App {
  class LoquaciousInt(x: Int) {
    def chat: Unit = for(i <- 1 to x) println("Hi!")

  }

  implicit def intToLoquaciousInt(x: Int):LoquaciousInt = new LoquaciousInt(x)
  3.chat
  10.chat
  //type enrichment 

}
