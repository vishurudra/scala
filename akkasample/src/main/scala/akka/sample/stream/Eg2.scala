package akka.sample.stream
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import akka.event.Logging
import akka.stream.scaladsl.Flow

import java.time.Clock.system

object Eg2 extends App{
  import akka.actor.ActorSystem
  import akka.stream.ActorMaterializer
  import akka.stream.scaladsl.{Sink, Source}
  import java.io.File
  val f =  new File("test1.txt")
  println(f.getAbsolutePath)
  implicit val actorSystem = ActorSystem("system")
  implicit val actorMaterializer = ActorMaterializer()
  val source = Source(List("test1.txt", "test2.txt", "test3.txt"))
  val mapper = Flow[String].map(new File(_))
  val existsFilter = Flow[File].filter(_.exists())
  val lengthZeroFilter = Flow[File].filter(_.length() != 0)
  val logger = LoggerFactory.getLogger(classOf[ActorSystem])


  val sink = Sink.foreach[File](f => logger.info(s"Absolute path: ${f.getAbsolutePath}"))
  val stream = source
    .via(mapper)
    .via(existsFilter)
    .via(lengthZeroFilter)
    .to(sink)
  stream.run()
}
