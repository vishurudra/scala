package matcheg
import java.util.Calendar
object ExceptionPattern {

  def main(array: Array[String])={


    val other = null
    val now = Calendar.getInstance()
    try {
      now.compareTo(other)
    } catch {

      case e: NullPointerException => println("One was null!"); System.exit(-1)
      case unknown => println("Unknown exception " + unknown); System.exit(-1)
    } finally {
      println("It all worked out.")
      System.exit(0)
    }

  }
}
