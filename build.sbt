name := "MockRefined"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "eu.timepit"    %% "refined"                     % "0.8.0",
  "org.scalatest" %% "scalatest"                   % "3.0.1" % Test,
  "org.mockito"   % "mockito-core"                 % "2.7.0" % Test
)
        