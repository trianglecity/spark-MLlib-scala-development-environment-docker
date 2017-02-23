package org.apache.spark.deploy.worker;
/**
 * Command-line parser for the worker.
 */
  class WorkerArguments {
  public   WorkerArguments (java.lang.String[] args, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  int webUiPort ()  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  int memory ()  { throw new RuntimeException(); }
  public  java.lang.String[] masters ()  { throw new RuntimeException(); }
  public  java.lang.String workDir ()  { throw new RuntimeException(); }
  public  java.lang.String propertiesFile ()  { throw new RuntimeException(); }
  private  void parse (scala.collection.immutable.List<java.lang.String> args)  { throw new RuntimeException(); }
  /**
   * Print usage and exit JVM with the given exit code.
   * @param exitCode (undocumented)
   */
  public  void printUsageAndExit (int exitCode)  { throw new RuntimeException(); }
  public  int inferDefaultCores ()  { throw new RuntimeException(); }
  public  int inferDefaultMemory ()  { throw new RuntimeException(); }
  public  void checkWorkerMemory ()  { throw new RuntimeException(); }
}
