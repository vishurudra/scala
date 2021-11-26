package impliciteg.usage

object ImportBinding {
def main(array: Array[String])={
  import impliciteg.model.{Foo=>FooNew}
  var fooNew =  new FooNew
  println(fooNew.x)
}
}
