package matcheg
import scala.util.Random
object VariableMatch {
  def main(array: Array[String])={
  val random = new Random().nextInt(10)
    random match {
    case 7 => println("lucky seven!")
    case otherNumber => println("boo, got boring ol' " + otherNumber)
  }
  }

}
