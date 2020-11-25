organization := "org.scalablytyped"
name := "stardust-ui__react-component-ref"
version := "0.38.0-998020"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6" withDottyCompat scalaVersion.value,
  "org.scalablytyped" %%% "react" % "16.9.2-10dd0c",
  "org.scalablytyped" %%% "std" % "0.0-unknown-ead975")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
