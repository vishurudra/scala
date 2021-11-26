package matcheg

object SampleMatch2 {
  def createErrorMessage(errorCode : Int) : String = {
    val result = errorCode match {
      case 1 => "Network Failure"
      case 2 => "I/O Failure"
      case 3 => "Unknown Error"
    }
    return result
  }

  def createErrorMessage2(errorCode: Int) : String = errorCode match {
    case 1 => "Network Failure"
    case 2 => "I/O Failure"
    case _ => "Unknown Error"
  }

  def main(array: Array[String])={
    println(createErrorMessage(1))
    println(createErrorMessage2(2))

  }

}
