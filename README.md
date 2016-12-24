# GeoTopologySuite

## Problem Statement

This little project aims to replace _JTS Topology Suite_ in Scala projects, because:

1. JST is not idiomatic Scala.
2. Serialize JST classes is not nice.
3. A scala implementation could eventually run in JavaScript with ScalaJS.

## Configuration

Add the Sonatype.org Releases repo as a resolver in your `build.sbt` or `Build.scala` as appropriate.

```scala
resolvers += "Sonatype.org Releases" at "https://oss.sonatype.org/content/repositories/releases/"
```

Add **GeoTopologySuite** as a dependency in your `build.sbt` or `Build.scala` as appropriate.

```scala
libraryDependencies ++= Seq(
  // Other dependencies ...
  "com.github.erunamojazz" %% "GeoTopologySuite" % "0.0.1" % "compile"
)
```

## Scala Versions

This project is compiled, tested, and published for the following Scala versions:

1. 2.10.6
2. 2.11.8
3. 2.12.0


## Usage

To use **GeoTopologySuite**, you should import it and call it...

## Scaladoc API

The Scaladoc API for this project can be found [here](http://erunamojazz.github.io/geotopologysuite/latest/api).

## Examples

```scala
package org.example

import com.github.erunamojazz.geotopologysuite._

case object MyObject {
  // ...
}
```

## Wishlist

Below is a list of features we would like to one day include in this project

1. Support more awesome.
2. Decimate the not-awesome.

## License

*GeoTopologySuite* is licensed under [LGPL 3.0](https://www.gnu.org/licenses/lgpl-3.0.txt).
