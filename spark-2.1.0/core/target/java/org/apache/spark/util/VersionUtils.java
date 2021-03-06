package org.apache.spark.util;
/**
 * Utilities for working with Spark version strings
 */
public  class VersionUtils {
  static private  scala.util.matching.Regex majorMinorRegex ()  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the major version number.
   * E.g., for 2.0.1-SNAPSHOT, return 2.
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  int majorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the minor version number.
   * E.g., for 2.0.1-SNAPSHOT, return 0.
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  int minorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the (major version number, minor version number).
   * E.g., for 2.0.1-SNAPSHOT, return (2, 0).
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> majorMinorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
}
