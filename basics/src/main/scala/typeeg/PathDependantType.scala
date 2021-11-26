package typeeg
trait Input {
  type Output
  val value: Output
}

def valueOf[T](v: T) = new Input {
  type Output = T
  val value: T = v
}
def dependentFunc(i: Input): i.Output = i.value
object MainValue{
  val intValue = valueOf(1)
  val stringValue = valueOf("One")

  assert(dependentFunc(intValue) == 1)
  assert(dependentFunc(stringValue) == "One")

}