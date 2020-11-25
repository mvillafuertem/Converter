organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-c35aff"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-b6c8ce",
  "org.scalablytyped" %%% "mime" % "2.0-67a6f2",
  "org.scalablytyped" %%% "std" % "0.0-unknown-0876a7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
