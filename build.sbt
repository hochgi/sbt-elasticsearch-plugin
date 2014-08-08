sbtPlugin := true

organization := "com.chaordicsystems.platform"

name := "sbt-elasticsearch-plugin"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.7",
  "org.slf4j" % "jcl-over-slf4j" % "1.7.7",
  "org.yaml" % "snakeyaml" % "1.13",
  "com.sksamuel.elastic4s" %% "elastic4s" % "1.2.1.2"
)

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-language:postfixOps")

externalDependencyClasspath in Compile ~= (_.filterNot(_.data.toString.contains("commons-logging")))
