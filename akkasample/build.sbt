name := "akkasample"

version := "0.1"

scalaVersion := "2.13.7"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.9",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.9" % Test
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" %  "2.6.9",
  "com.typesafe.akka" %% "akka-http" %  "10.1.10",
  "com.typesafe.akka" %% "akka-stream-testkit" %  "2.6.9" % Test
)
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime
