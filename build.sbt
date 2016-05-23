name := "spacy-thrift-scala"

organization := "com.turbolent"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.twitter" %% "scrooge-core" % "4.7.0",
  "com.twitter" %% "finagle-thrift" % "6.35.0",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

scroogeThriftOutputFolder in Compile <<= baseDirectory(_ / "src_gen")

publishMavenStyle := true

publishTo := {
  val repositoryPath = System.getProperty("repositoryPath")
  if (repositoryPath == null) None
  else Some("internal.repo" at file(repositoryPath).toURI.toURL.toString)
}