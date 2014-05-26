name		:= "kaptcha"

version		:= "2.3.3"

organization 	:= "io.nuvo.kaptcha"

homepage :=  Some(new java.net.URL("http://nuvo.io"))

libraryDependencies += "com.jhlabs" % "filters" % "2.0.235"

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name //+ "-" + module.revision + "." + artifact.extension
}


publishTo := Some(Resolver.file("file",  new File( "/Users/nuvo/Labs/mvn-repo/releases" )) )


scalaVersion 	:= "2.11.1"

autoCompilerPlugins := true

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

scalacOptions += "-optimise"

scalacOptions += "-feature"

scalacOptions += "-language:postfixOps"

scalacOptions += "-Xlint"
