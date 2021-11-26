package exceptioneg

import java.io.{FileNotFoundException, FileReader, IOException}

object ExceptionEg1 extends App{
  try {
    val f = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException =>{
      println("Missing file exception")
    }

    case ex: IOException => {
      println("IO Exception")
    }
  }finally {
    println("Exiting finally...")
  }
}
