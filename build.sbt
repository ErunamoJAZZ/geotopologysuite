name := "GeoTopologySuite"

organization := "com.github.erunamojazz"

homepage := Some(url("https://github.com/erunamojazz/geotopologysuite"))

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.0"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0")

resolvers ++= Seq(
  "sonatype-snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "sonatype-releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= {
  Seq(
//    "org.scalatest"  %% "scalatest"   % "1.9.1"  % "test",
//    "org.scalacheck" %% "scalacheck"  % "1.10.1" % "test"
  )
}

/*scalacOptions := scalaVersion.map { v =>
  val opts = "-deprecation" :: "-unchecked" :: Nil
  if (v.startsWith("2.9.")) opts 
  else opts ++ ("-feature" :: "-language:postfixOps" :: "-language:implicitConversions" :: Nil)
}*/

// Publishing stuff for sonatype
/*publishTo := version { _.endsWith("SNAPSHOT") match {
    case true  => Some("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
    case false => Some("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")
  }
}*/

credentials += Credentials( file("sonatype.credentials") )

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
         <scm>
            <url>git@github.com:erunamojazz/geotopologysuite.git</url>
            <connection>scm:git:git@github.com:erunamojazz/geotopologysuite.git</connection>
         </scm>
         <developers>
            <developer>
              <id>erunamojazz</id>
              <name>C. Daniel Sanchez R.</name>
              <url>https://github.com/erunamojazz</url>
            </developer>
         </developers>
 )

licenses += ("lgpl-3.0", url("https://www.gnu.org/licenses/lgpl-3.0.txt"))

// OSGi Bundle stuff
/*osgiSettings

OsgiKeys.bundleSymbolicName := "com.github.erunamojazz.geotopologysuite"

OsgiKeys.exportPackage := Seq("com.github.erunamojazz.geotopologysuite")

OsgiKeys.privatePackage := Seq()

OsgiKeys.bundleActivator := None
*/
// Scala bundle versions require special handling becuase of binary compatibility issues.
// This is a bit tricky because the published jars are versioned with more than just the Scala version.
// For example, 2.10.1 is versioned as 2.10.1.v20130302-092018-VFINAL-33e32179fd
//OsgiKeys.requireBundle <<= (scalaVersion, crossScalaVersions) { (ver, crossVers) => 
//  val nextVer = crossVers.zip(crossVers.tail).find(_._1 == ver).map(_._2)
//  val langBundleVer = 
//    if(ver.startsWith("2.10")) "[2.10,2.11)"          // All 2.10.x versions are binary-compatible
//    else if(ver.startsWith("2.9.3")) "[2.9.3,2.9.4)"  // Special case for the last 2.9.x version at this time
//    else "["+ver+","+nextVer.get+")"                  // The current version, up to but excluding the next version
//  Seq("scala-library;bundle-version=\""+langBundleVer+"\"") 
//}

// Scaladoc publishing stuff
site.settings

ghpages.settings

git.remoteRepo := "git@github.com:erunamojazz/geotopologysuite.git"

site.includeScaladoc()

// Stuff for publicizing on http://ls.implicit.ly
/*seq(lsSettings :_*)

(LsKeys.tags in LsKeys.lsync) := Seq("awesome")

(description in LsKeys.lsync) := "GeoTopologySuite is the most awesome scala project available today"

(LsKeys.ghUser in LsKeys.lsync) := Some("erunamojazz")

(LsKeys.ghRepo in LsKeys.lsync) := Some("geotopologysuite")

(LsKeys.ghBranch in LsKeys.lsync) := Some("master")
*/
