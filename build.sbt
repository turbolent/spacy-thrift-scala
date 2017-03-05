name := "spacy-thrift-scala"

organization := "com.turbolent"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "com.twitter" %% "scrooge-core" % "4.14.0",
  "com.twitter" %% "finagle-thrift" % "6.42.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

scroogeThriftOutputFolder in Compile <<= baseDirectory(_ / "src_gen")

publishMavenStyle := true

publishTo := {
  val repositoryPath = System.getProperty("repositoryPath")
  if (repositoryPath == null) None
  else Some("internal.repo" at file(repositoryPath).toURI.toURL.toString)
}