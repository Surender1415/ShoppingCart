
name := "ShoppingCart"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % "test",
  "org.json4s" %% "json4s-native" % "3.4.1",
  "org.json4s" %% "json4s-jackson" % "3.4.1",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test",
  "info.cukes" % "cucumber-core" % "1.2.5" % "test",
  "info.cukes" %% "cucumber-scala" % "1.2.5" % "test",
  "info.cukes" % "cucumber-junit" % "1.2.5" % "test",
  "info.cukes" % "cucumber-jvm" % "1.2.5" % "test",
  "info.cukes" % "cucumber-picocontainer" % "1.2.5" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)