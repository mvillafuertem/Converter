organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-7c67d7"
scalaVersion := "3.0.0-M2-bin-20201116-9c850e3-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-0523f9",
  "org.scalablytyped" %%% "node" % "0.0-unknown-962da6",
  "org.scalablytyped" %%% "std" % "0.0-unknown-9df922")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
