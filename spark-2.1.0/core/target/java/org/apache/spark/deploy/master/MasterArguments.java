package org.apache.spark.deploy.master;
/**
 * Command-line parser for the master.
 */
  class MasterArguments implements org.apache.spark.internal.Logging {
  public   MasterArguments (java.lang.String[] args, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  int webUiPort ()  { throw new RuntimeException(); }
  public  java.lang.String propertiesFile ()  { throw new RuntimeException(); }
  private  void parse (scala.collection.immutable.List<java.lang.String> args)  { throw new RuntimeException(); }
  /**
   * Print usage and exit JVM with the given exit code.
   * @param exitCode (undocumented)
   */
  private  void printUsageAndExit (int exitCode)  { throw new RuntimeException(); }
}
