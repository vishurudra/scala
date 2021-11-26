package akka.sample.stream

object Eg3 extends App{
  import java.io.File
  import akka.actor.ActorSystem
  import akka.stream.{ActorMaterializer, ClosedShape}
  import akka.stream.scaladsl.{Flow, GraphDSL, RunnableGraph, Sink, Source}
  implicit val actorSystem = ActorSystem("system")
  implicit val actorMaterializer = ActorMaterializer()
  val graph = RunnableGraph.fromGraph(GraphDSL.create() { implicit b =>
    import GraphDSL.Implicits._
    val source = Source(List("test1.txt", "test2.txt", "test3.txt"))
    val mapper = Flow[String].map(new File(_))
    val existsFilter = Flow[File].filter(_.exists())
    val lengthZeroFilter = Flow[File].filter(_.length() != 0)
    val sink = Sink.foreach[File](f => println(s"Absolute path: ${f.getAbsolutePath}"))
    source ~> mapper ~> existsFilter ~> lengthZeroFilter ~> sink
    ClosedShape
  })
  graph.run()
}
