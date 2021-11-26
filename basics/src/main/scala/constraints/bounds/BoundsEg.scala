package constraints.bounds

object BoundsEg {
  trait Thing
  trait Vehicle extends Thing
  class Car extends Vehicle
  class Jeep extends Car
  class Coupe extends Car
  class Motorcycle extends Vehicle
  class Bicycle extends Vehicle
  class Tricycle extends Bicycle
  class Vegetable
  class Parking[A](val place: A)
  class ParkingNew[A](val place1: A, val place2: A)
  //In the type scenario, Parking[A <: Vehicle] means that the A type must be type
  // or subtype of Vehicle.
  class ParkingUpper[A <: Vehicle]
  class ParkingLower[A >: Jeep](val place: A)
  class ParkingBoth[A >: Bicycle <: Vehicle](val plaza: A)
  class ParkingMisc[A](val place: A){
    def dosomething(p1: Parking[_ <: Vehicle]) =
    {println(p1.place)}
  }

  def main(array: Array[String])={
    println(    new Parking[Motorcycle](new Motorcycle))
    println( new Parking[Car](new Jeep))
    println(  new ParkingNew(new Car, new Motorcycle))
    println(new ParkingUpper[Jeep])
    //println(new ParkingUpper[Thing])
    println(new ParkingLower[Car](new Car))
    println(new ParkingLower[Car](new Car))
    println(new ParkingBoth(new Bicycle))
    println(new ParkingBoth(new Coupe))

  }
}
