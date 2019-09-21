import sbt.addCompilerPlugin

enablePlugins(JavaAppPackaging)

val LogbackVersion         = "1.2.3"
val log4catsVersion        = "1.0.0"
val scalacheckVersion      = "1.14.0"

organizationName := "Well-Factored Software Ltd."
startYear := Some(2019)

lazy val root = (project in file("."))
  .settings(
    organization := "com.wellfactored",
    name := "s3-mock",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.10",
    scalacOptions ++= Seq("-Ypartial-unification"),
    libraryDependencies ++= Seq(
      "com.amazonaws"     % "aws-java-sdk-s3" % "1.11.631",
      "org.scalacheck"    %% "scalacheck"     % scalacheckVersion % Test,
      "io.chrisdavenport" %% "log4cats-slf4j" % log4catsVersion,
      "ch.qos.logback"    % "logback-classic" % LogbackVersion,
      "com.wellfactored"  %% "property-info"  % "1.1.3"
    ),
    addCompilerPlugin("org.spire-math"  %% "kind-projector"     % "0.9.9"),
    addCompilerPlugin("com.olegpy"      %% "better-monadic-for" % "0.2.4"),
    addCompilerPlugin("org.scalamacros" % "paradise"            % "2.1.1" cross CrossVersion.full)
  )

wartremoverErrors ++= Warts.unsafe
wartremoverErrors -= Wart.Any

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-language:higherKinds",
  "-language:postfixOps",
  "-feature",
  "-Ypartial-unification",
  "-Xfatal-warnings",
  "-Xlint"
)
