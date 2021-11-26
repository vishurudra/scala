package functioneg

object VariableParam {
  def add(args: Int*) = {
    var sum = 0;
    for(a <- args) sum+=a
    sum
  }

  def main(args: Array[String]) = {
    var sum = add(1,2,3,4,5,6,7,8,9);
    println(sum);
  }
}
