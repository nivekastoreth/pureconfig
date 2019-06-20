name := "pureconfig-sttp"

crossScalaVersions ~= { _ :+ "2.13.0" }

libraryDependencies ++= Seq(
  "com.softwaremill.sttp" %% "core" % "1.6.0")

developers := List(
  Developer("bszwej", "Bartlomiej Szwej", "bszwej@gmail.com", url("https://github.com/bszwej")))

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.module.sttp.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""", "*")
