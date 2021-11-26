package akka.sample.stream

object Eg1 extends App{
  import akka.actor.ActorSystem
  import akka.stream.ActorMaterializer
  import akka.stream.scaladsl.{Sink, Source}
  import java.io.File
  val f =  new File("test1.txt")
  println(f.getAbsolutePath)

  val stream = Source(Seq("test1.txt", "test2.txt", "test3.txt"))
    .map(new File(_))
    .filter(_.exists())
    .filter(_.length() != 0)
    .to(Sink.foreach(f => println(s"Absolute path: ${f.getAbsolutePath}")))

}
