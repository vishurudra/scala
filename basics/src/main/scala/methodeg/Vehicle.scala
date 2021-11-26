package methodeg

class Vehicle{
  def run()={
    println("vehicle is running")
  }
}

class Bike extends Vehicle{
  override def run()={
    println("Bike is running")
  }
}

object MainObject{
  def main(args:Array[String])={
    var b:Vehicle = new Bike()
    b.run()
  }
}