import akka.actor._
import akka.actor.TypedActor.PreStart

class LifeCyleMethodsExample extends Actor{
  def receive = {
    case msg:String => println(msg+" "+self.path.name);  // Getting name of Actor
     // var i= 1/0
  }
  override def preStart(){    // overriding preStart method  
    println("preStart method is called");
  }

  override def postStop(){    // Overriding postStop method
    println("postStop method is called");
  }
  override def preRestart(reason:Throwable, message: Option[Any]){    // Overriding preRestart method
    println("preRestart method is called");
    println("Reason: "+reason)
  }

  override def postRestart(reason:Throwable){    // Overriding preRestart method
    println("postRestart method is called");
    println("Reason: "+reason)
  }
}

object ActorMain{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[LifeCyleMethodsExample],"RootActor");
    actor ! "Hello"
    actor ! "Fello"
    val actor1 = actorSystem.actorOf(Props[LifeCyleMethodsExample],"RootActor1");
   // actorSystem.stop(actor);      // Stopping Actor by passing actor reference.
  }
}  