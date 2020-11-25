organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-f60171"
scalaVersion := "3.0.0-M2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "std" % "0.0-unknown-4f26be",
  "org.scalablytyped" %%% "vue" % "2.5.13-52a6f9",
  "org.scalablytyped" %%% "webpack-env" % "1.13-fd859a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
