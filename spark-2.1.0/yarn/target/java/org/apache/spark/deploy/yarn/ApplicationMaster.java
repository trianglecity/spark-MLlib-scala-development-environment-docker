package org.apache.spark.deploy.yarn;
/**
 * Common application master functionality for Spark on Yarn.
 */
  class ApplicationMaster implements org.apache.spark.internal.Logging {
  /**
   * An {@link RpcEndpoint} that communicates with the driver's scheduler backend.
   */
  private  class AMEndpoint implements org.apache.spark.rpc.RpcEndpoint, org.apache.spark.internal.Logging {
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    // not preceding
    public   AMEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.rpc.RpcEndpointRef driver, boolean isClusterMode)  { throw new RuntimeException(); }
    public  void onStart ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  }
  static private  int EXIT_SUCCESS ()  { throw new RuntimeException(); }
  static private  int EXIT_UNCAUGHT_EXCEPTION ()  { throw new RuntimeException(); }
  static private  int EXIT_MAX_EXECUTOR_FAILURES ()  { throw new RuntimeException(); }
  static private  int EXIT_REPORTER_FAILURE ()  { throw new RuntimeException(); }
  static private  int EXIT_SC_NOT_INITED ()  { throw new RuntimeException(); }
  static private  int EXIT_SECURITY ()  { throw new RuntimeException(); }
  static private  int EXIT_EXCEPTION_USER_CLASS ()  { throw new RuntimeException(); }
  static private  int EXIT_EARLY ()  { throw new RuntimeException(); }
  static private  org.apache.spark.deploy.yarn.ApplicationMaster master ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public   ApplicationMaster (org.apache.spark.deploy.yarn.ApplicationMasterArguments args, org.apache.spark.deploy.yarn.YarnRMClient client)  { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.conf.YarnConfiguration yarnConf ()  { throw new RuntimeException(); }
  private  boolean isClusterMode ()  { throw new RuntimeException(); }
  private  int maxNumExecutorFailures ()  { throw new RuntimeException(); }
  private  int exitCode ()  { throw new RuntimeException(); }
  private  boolean unregistered ()  { throw new RuntimeException(); }
  private  boolean finished ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.yarn.api.records.FinalApplicationStatus finalStatus ()  { throw new RuntimeException(); }
  private  java.lang.String finalMsg ()  { throw new RuntimeException(); }
  private  java.lang.Thread userClassThread ()  { throw new RuntimeException(); }
  private  java.lang.Thread reporterThread ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.YarnAllocator allocator ()  { throw new RuntimeException(); }
  private  java.lang.Object allocatorLock ()  { throw new RuntimeException(); }
  private  long heartbeatInterval ()  { throw new RuntimeException(); }
  private  long initialAllocationInterval ()  { throw new RuntimeException(); }
  private  long nextAllocationInterval ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef amEndpoint ()  { throw new RuntimeException(); }
  private  scala.concurrent.Promise<org.apache.spark.SparkContext> sparkContextPromise ()  { throw new RuntimeException(); }
  private  org.apache.spark.deploy.yarn.security.AMCredentialRenewer credentialRenewer ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, org.apache.hadoop.yarn.api.records.LocalResource> localResources ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.ApplicationAttemptId getAttemptId ()  { throw new RuntimeException(); }
  public final  int run ()  { throw new RuntimeException(); }
  /**
   * Set the default final application status for client mode to UNDEFINED to handle
   * if YARN HA restarts the application so that it properly retries. Set the final
   * status to SUCCEEDED in cluster mode to handle if the user calls System.exit
   * from the application code.
   * @return (undocumented)
   */
  public final  org.apache.hadoop.yarn.api.records.FinalApplicationStatus getDefaultFinalStatus ()  { throw new RuntimeException(); }
  /**
   * unregister is used to completely unregister the application from the ResourceManager.
   * This means the ResourceManager will not retry the application attempt on your behalf if
   * a failure occurred.
   * @param status (undocumented)
   * @param diagnostics (undocumented)
   */
  public final  void unregister (org.apache.hadoop.yarn.api.records.FinalApplicationStatus status, java.lang.String diagnostics)  { throw new RuntimeException(); }
  public final  void finish (org.apache.hadoop.yarn.api.records.FinalApplicationStatus status, int code, java.lang.String msg)  { throw new RuntimeException(); }
  private  scala.concurrent.Promise<org.apache.spark.SparkContext> sparkContextInitialized (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  private  void registerAM (org.apache.spark.SparkConf _sparkConf, org.apache.spark.rpc.RpcEnv _rpcEnv, org.apache.spark.rpc.RpcEndpointRef driverRef, java.lang.String uiAddress, org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  /**
   * Create an {@link RpcEndpoint} that communicates with the driver.
   * <p>
   * In cluster mode, the AM and the driver belong to same process
   * so the AMEndpoint need not monitor lifecycle of the driver.
   * <p>
   * @return A reference to the driver's RPC endpoint.
   * @param host (undocumented)
   * @param port (undocumented)
   * @param isClusterMode (undocumented)
   */
  private  org.apache.spark.rpc.RpcEndpointRef runAMEndpoint (java.lang.String host, java.lang.String port, boolean isClusterMode)  { throw new RuntimeException(); }
  private  void runDriver (org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  private  void runExecutorLauncher (org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  private  java.lang.Thread launchReporterThread ()  { throw new RuntimeException(); }
  /**
   * Clean up the staging directory.
   * @param fs (undocumented)
   */
  private  void cleanupStagingDir (org.apache.hadoop.fs.FileSystem fs)  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef waitForSparkDriver ()  { throw new RuntimeException(); }
  /** Add the Yarn IP filter that is required for properly securing the UI. */
  private  void addAmIpFilter ()  { throw new RuntimeException(); }
  /**
   * Start the user class, which contains the spark driver, in a separate Thread.
   * If the main routine exits cleanly or exits with System.exit(N) for any N
   * we assume it was successful, for all other cases we assume failure.
   * <p>
   * Returns the user thread that was started.
   * @return (undocumented)
   */
  private  java.lang.Thread startUserApplication ()  { throw new RuntimeException(); }
  private  void resetAllocatorInterval ()  { throw new RuntimeException(); }
}
