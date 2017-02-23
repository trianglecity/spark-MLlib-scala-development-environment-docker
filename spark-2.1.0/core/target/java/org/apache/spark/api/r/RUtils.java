package org.apache.spark.api.r;
public  class RUtils {
  static public  scala.Option<java.lang.String> rPackages ()  { throw new RuntimeException(); }
  /**
   * Get the SparkR package path in the local spark distribution.
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.String> localSparkRPackagePath ()  { throw new RuntimeException(); }
  /**
   * Check if SparkR is installed before running tests that use SparkR.
   * @return (undocumented)
   */
  static public  boolean isSparkRInstalled ()  { throw new RuntimeException(); }
  /**
   * Get the list of paths for R packages in various deployment modes, of which the first
   * path is for the SparkR package itself. The second path is for R packages built as
   * part of Spark Packages, if any exist. Spark Packages can be provided through the
   *  "--packages" or "--jars" command line options.
   * <p>
   * This assumes that Spark properties <code>spark.master</code> and <code>spark.submit.deployMode</code>
   * and environment variable <code>SPARK_HOME</code> are set.
   * @param isDriver (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<java.lang.String> sparkRPackagePath (boolean isDriver)  { throw new RuntimeException(); }
  /** Check if R is installed before running tests that use R commands. */
  static public  boolean isRInstalled ()  { throw new RuntimeException(); }
}
