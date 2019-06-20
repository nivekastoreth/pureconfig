import Dependencies._

name := "pureconfig-core"

crossScalaVersions ~= { "2.13.0" +: _ }

libraryDependencies += typesafeConfig

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""", "*")
