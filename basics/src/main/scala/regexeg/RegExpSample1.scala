package regexeg

object RegExpSample1 extends App{

  var sampleText = "Maximun 200 kmph speed is 190 kmph"
  var replaceTextAll = sampleText.replaceAll("[0-9]+","?")
  println(replaceTextAll)
  var replaceFirst=sampleText.replaceFirst("[0-9]+","?")
  println(replaceFirst)
  var newSample = sampleText.toLowerCase()
  val pattern="[a-z]".r
  println(pattern.replaceAllIn(newSample,""))

}
