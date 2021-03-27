import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"
}

object Projects {
  lazy val commonProject = RootProject(uri("https://github.com/ysden123/common.git"))
}
