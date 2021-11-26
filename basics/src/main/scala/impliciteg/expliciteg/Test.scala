package impliciteg.expliciteg

object Test {
  def testSamePackage()= {
    println(x)
  }
  def testInlineDefinition()= {
    val x = "Inline definition x"
    import impliciteg.expliciteg.Explicit.x
    import impliciteg.wildcardeg.Wildcard._
    println(x)
  }
  def testWildcardImport()= {
    import impliciteg.wildcardeg.Wildcard._
    println(x)
  }

  def testExplicitImport() ={
    import impliciteg.expliciteg.Explicit.x
    import impliciteg.wildcardeg.Wildcard._
    println(x)
  }
  def main(args : Array[String]) : Unit = {
    testSamePackage()
    testWildcardImport()
    testExplicitImport()
    testInlineDefinition()
  }

}

