package org.apache.spark.deploy.worker;
/**
 * Endpoint which connects to a worker process and terminates the JVM if the
 * connection is severed.
 * Provides fate sharing between a worker and its associated child processes.
 */
  class WorkerWatcher implements org.apache.spark.rpc.RpcEndpoint, org.apache.spark.internal.Logging {
  static public final  org.apache.spark.rpc.RpcEndpointRef self ()  { throw new RuntimeException(); }
  static public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  static public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  void onStart ()  { throw new RuntimeException(); }
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
  public   WorkerWatcher (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String workerUrl, boolean isTesting)  { throw new RuntimeException(); }
    boolean isShutDown ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcAddress expectedAddress ()  { throw new RuntimeException(); }
  private  boolean isWorker (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
  private  void exitNonZero ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
}
