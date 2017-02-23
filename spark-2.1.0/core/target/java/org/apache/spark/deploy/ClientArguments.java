package org.apache.spark.deploy;
/**
 * Command-line parser for the driver client.
 */
  class ClientArguments {
  static public  int DEFAULT_CORES ()  { throw new RuntimeException(); }
  static public  int DEFAULT_MEMORY ()  { throw new RuntimeException(); }
  static public  boolean DEFAULT_SUPERVISE ()  { throw new RuntimeException(); }
  static public  boolean isValidJarUrl (java.lang.String s)  { throw new RuntimeException(); }
  public   ClientArguments (java.lang.String[] args)  { throw new RuntimeException(); }
  public  java.lang.String cmd ()  { throw new RuntimeException(); }
  public  org.apache.log4j.Level logLevel ()  { throw new RuntimeException(); }
  public  java.lang.String[] masters ()  { throw new RuntimeException(); }
  public  java.lang.String jarUrl ()  { throw new RuntimeException(); }
  public  java.lang.String mainClass ()  { throw new RuntimeException(); }
  public  boolean supervise ()  { throw new RuntimeException(); }
  public  int memory ()  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ListBuffer<java.lang.String> _driverOptions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> driverOptions ()  { throw new RuntimeException(); }
  public  java.lang.String driverId ()  { throw new RuntimeException(); }
  private  void parse (scala.collection.immutable.List<java.lang.String> args)  { throw new RuntimeException(); }
  /**
   * Print usage and exit JVM with the given exit code.
   * @param exitCode (undocumented)
   */
  private  void printUsageAndExit (int exitCode)  { throw new RuntimeException(); }
}
