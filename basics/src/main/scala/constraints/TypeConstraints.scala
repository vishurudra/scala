package constraints



object TypeConstraints {

  trait A

  trait B extends A

  trait C extends B

  trait bounds {

    type LOWER >: B
    //In the type scenario, Upper <: B] means that the A type must be type
    // or subtype of B.

   // T >: U as “type T is a supertype of type U” or “type T has type U as lower bound”
    //T <: U as “type T is a subtype of type U” or “type T has type U as upper bound”
    type UPPER <: B
  }

  trait boundsA extends bounds {
    override type LOWER = A
    // override type UPPER = A // compile error
  }

  trait boundsB extends bounds {
    override type LOWER = B
    override type UPPER = B
  }

  trait boundsC extends bounds {
    // override type LOWER = C // compile error
    override type UPPER = C
  }

}