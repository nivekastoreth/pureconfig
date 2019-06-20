name := "pureconfig-enumeratum"

crossScalaVersions ~= { _ :+ "2.13.0" }

libraryDependencies ++= Seq(
  "com.beachape" %% "enumeratum" % "1.5.13")

developers := List(
  Developer("aeons", "Bjørn Madsen", "bm@aeons.dk", url("https://github.com/aeons")))

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.module.enumeratum.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""", "*")
