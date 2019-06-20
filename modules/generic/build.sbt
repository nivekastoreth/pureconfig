import Dependencies._

name := "pureconfig-generic"

crossScalaVersions ~= { "2.13.0" +: _ }

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value % Provided,
  shapeless)

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.generic.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""", "*")
