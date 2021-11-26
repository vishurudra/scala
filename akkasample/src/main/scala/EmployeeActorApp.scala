import akka.actor.Actor;          // Importing actor trait
import akka.actor.ActorSystem;
import akka.actor.Props;
object EmployeeActorApp extends App{
  //Initialize the ActorSystem
  val actorSystem=ActorSystem("HrMessageingSystem")

  //construct the HR Actor Ref
  val hrActorRef=actorSystem.actorOf(Props[HRActor])

  //send a message to the HR Actor
  hrActorRef!"SICK"

  //Let's wait for a couple of seconds before we shut down the    system
  Thread.sleep (2000)



}


/** The HRActor reads the message sent to it and performs action based on the message Type **/
class HRActor extends Actor {
  def receive  = {
    case s: String if(s.equalsIgnoreCase("SICK")) => println("Sick Leave applied")
    case s: String if(s.equalsIgnoreCase("PTO")) => println("PTO applied ")
  }
}