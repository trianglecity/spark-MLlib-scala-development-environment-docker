package org.apache.spark.launcher;
/**
 * Exposes methods from the launcher library that are used by the YARN backend.
 */
public  class YarnCommandBuilderUtils {
  static public  java.lang.String quoteForBatchScript (java.lang.String arg)  { throw new RuntimeException(); }
  static public  java.lang.String findJarsDir (java.lang.String sparkHome)  { throw new RuntimeException(); }
  /**
   * Adds the perm gen configuration to the list of java options if needed and not yet added.
   * <p>
   * Note that this method adds the option based on the local JVM version; if the node where
   * the container is running has a different Java version, there's a risk that the option will
   * not be added (e.g. if the AM is running Java 8 but the container's node is set up to use
   * Java 7).
   * @param args (undocumented)
   */
  static public  void addPermGenSizeOpt (scala.collection.mutable.ListBuffer<java.lang.String> args)  { throw new RuntimeException(); }
}
