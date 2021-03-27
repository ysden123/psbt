import Dependencies._
import Projects.commonProject

ThisBuild / scalaVersion     := "2.13.5"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.stulsoft"

lazy val root = (project in file("."))
  .settings(
    name := "projref",
    libraryDependencies += scalaTest % Test
  )
  .dependsOn(commonProject)
