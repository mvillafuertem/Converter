organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-93c3c8"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-8bcdeb",
  "org.scalablytyped" %%% "node" % "0.0-unknown-a59a21",
  "org.scalablytyped" %%% "std" % "0.0-unknown-a1c844")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
