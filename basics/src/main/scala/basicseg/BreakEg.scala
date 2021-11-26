package basicseg

import scala.util.control.Breaks.{break, breakable}

object BreakEg {
  def main(args: Array[String]) = {
    breakable { // Breakable method to avoid exception
      for (i <- 1 to 10 by 2) {
        if (i == 7)
          break // Break used here
        else
          println(i)
      }
    }
  }
}
