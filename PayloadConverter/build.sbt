val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "temporal-scala-payloadconverter",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "io.temporal" % "temporal-sdk" % "1.22.3",
      "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.15.3",
    )
  )
