package org.apache.spark.executor;
  class CoarseGrainedExecutorBackend implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.executor.ExecutorBackend, org.apache.spark.internal.Logging {
  static private  void run (java.lang.String driverUrl, java.lang.String executorId, java.lang.String hostname, int cores, java.lang.String appId, scala.Option<java.lang.String> workerUrl, scala.collection.Seq<java.net.URL> userClassPath)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static private  void printUsageAndExit ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.rpc.RpcEndpointRef self ()  { throw new RuntimeException(); }
  static public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  static public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onStop ()  { throw new RuntimeException(); }
  static public final  void stop ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  // not preceding
  public   CoarseGrainedExecutorBackend (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String driverUrl, java.lang.String executorId, java.lang.String hostname, int cores, scala.collection.Seq<java.net.URL> userClassPath, org.apache.spark.SparkEnv env)  { throw new RuntimeException(); }
  public  org.apache.spark.executor.Executor executor ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rpc.RpcEndpointRef> driver ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extractLogUrls ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void statusUpdate (long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer data)  { throw new RuntimeException(); }
  /**
   * This function can be overloaded by other child classes to handle
   * executor exits differently. For e.g. when an executor goes down,
   * back-end may not want to take the parent process down.
   * @param code (undocumented)
   * @param reason (undocumented)
   * @param throwable (undocumented)
   * @param notifyDriver (undocumented)
   */
  protected  void exitExecutor (int code, java.lang.String reason, java.lang.Throwable throwable, boolean notifyDriver)  { throw new RuntimeException(); }
}
