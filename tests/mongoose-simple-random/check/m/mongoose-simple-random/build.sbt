organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-046b70"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-cd1a6a",
  "org.scalablytyped" %%% "node" % "0.0-unknown-664fb2",
  "org.scalablytyped" %%% "std" % "0.0-unknown-aa733d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
