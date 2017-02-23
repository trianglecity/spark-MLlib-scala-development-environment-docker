package org.apache.spark.deploy.worker;
/**
 * Manages the execution of one driver, including automatically restarting the driver on failure.
 * This is currently only used in standalone cluster deploy mode.
 */
  class DriverRunner implements org.apache.spark.internal.Logging {
  public  java.lang.String driverId ()  { throw new RuntimeException(); }
  public  java.io.File workDir ()  { throw new RuntimeException(); }
  public  java.io.File sparkHome ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.DriverDescription driverDesc ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef worker ()  { throw new RuntimeException(); }
  public  java.lang.String workerUrl ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  // not preceding
  public   DriverRunner (org.apache.spark.SparkConf conf, java.lang.String driverId, java.io.File workDir, java.io.File sparkHome, org.apache.spark.deploy.DriverDescription driverDesc, org.apache.spark.rpc.RpcEndpointRef worker, java.lang.String workerUrl, org.apache.spark.SecurityManager securityManager)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.Process> process ()  { throw new RuntimeException(); }
  private  boolean killed ()  { throw new RuntimeException(); }
    scala.Option<scala.Enumeration.Value> finalState ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Exception> finalException ()  { throw new RuntimeException(); }
  private  int DRIVER_TERMINATE_TIMEOUT_MS ()  { throw new RuntimeException(); }
  public  void setClock (org.apache.spark.util.Clock _clock)  { throw new RuntimeException(); }
  public  void setSleeper (org.apache.spark.deploy.worker.Sleeper _sleeper)  { throw new RuntimeException(); }
  private  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  private  java.lang.Object sleeper ()  { throw new RuntimeException(); }
  /** Starts a thread to run and manage the driver. */
    void start ()  { throw new RuntimeException(); }
  /** Terminate this driver (or prevent it from ever starting if not yet started) */
    void kill ()  { throw new RuntimeException(); }
  /**
   * Creates the working directory for this driver.
   * Will throw an exception if there are errors preparing the directory.
   * @return (undocumented)
   */
  private  java.io.File createWorkingDirectory ()  { throw new RuntimeException(); }
  /**
   * Download the user jar into the supplied directory and return its local path.
   * Will throw an exception if there are errors downloading the jar.
   * @param driverDir (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String downloadUserJar (java.io.File driverDir)  { throw new RuntimeException(); }
    int prepareAndRunDriver ()  { throw new RuntimeException(); }
  private  int runDriver (java.lang.ProcessBuilder builder, java.io.File baseDir, boolean supervise)  { throw new RuntimeException(); }
    int runCommandWithRetry (org.apache.spark.deploy.worker.ProcessBuilderLike command, scala.Function1<java.lang.Process, scala.runtime.BoxedUnit> initialize, boolean supervise)  { throw new RuntimeException(); }
}
