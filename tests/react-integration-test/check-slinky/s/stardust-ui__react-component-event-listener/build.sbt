organization := "org.scalablytyped"
name := "stardust-ui__react-component-event-listener"
version := "0.38.0-ef085b"
scalaVersion := "3.0.0-M2-bin-20201116-9c850e3-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6" withDottyCompat "2.13.3",
  "org.scalablytyped" %%% "react" % "16.9.2-c08747",
  "org.scalablytyped" %%% "std" % "0.0-unknown-e50e92")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
