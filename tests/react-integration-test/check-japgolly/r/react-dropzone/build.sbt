organization := "org.scalablytyped"
name := "react-dropzone"
version := "10.1.10-0dfbe4"
scalaVersion := "3.0.0-M2-bin-20201116-9c850e3-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.7.5" withDottyCompat "2.13.3",
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "react" % "16.9.2-e170c5",
  "org.scalablytyped" %%% "std" % "0.0-unknown-6054b9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
