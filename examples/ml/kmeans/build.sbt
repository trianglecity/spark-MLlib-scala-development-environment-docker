name := "kmeans"
version := "1.0"
scalaVersion := "2.11.8"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0-SNAPSHOT",
  "org.apache.spark" %% "spark-sql" % "2.1.0-SNAPSHOT",
  "org.apache.spark" %% "spark-mllib" % "2.1.0-SNAPSHOT" ,
  "org.apache.spark" %% "spark-streaming" % "2.1.0-SNAPSHOT" 
)


