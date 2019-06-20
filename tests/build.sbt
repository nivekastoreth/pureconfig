import Dependencies._

name := "pureconfig-tests"

crossScalaVersions ~= { "2.13.0" +: _ }

libraryDependencies ++= Seq(
  scalaTest,
  scalaCheck.value,
  scalaCheckShapeless.value)

skip in publish := true
