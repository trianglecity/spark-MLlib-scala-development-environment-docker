package org.apache.spark;
/**
 * Lives in the driver to receive heartbeats from executors..
 */
  class HeartbeatReceiver extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  static public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  static public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
  static public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  { throw new RuntimeException(); }
  static public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  static public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  static public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  static public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  { throw new RuntimeException(); }
  static public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  { throw new RuntimeException(); }
  static public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  { throw new RuntimeException(); }
  static public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  { throw new RuntimeException(); }
  static public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  { throw new RuntimeException(); }
  static public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  { throw new RuntimeException(); }
  static public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdate)  { throw new RuntimeException(); }
  static public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  { throw new RuntimeException(); }
  static public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  static public final  org.apache.spark.rpc.RpcEndpointRef self ()  { throw new RuntimeException(); }
  static public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  static public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  static public  void onConnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  static public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
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
  public   HeartbeatReceiver (org.apache.spark.SparkContext sc, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public   HeartbeatReceiver (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    org.apache.spark.scheduler.TaskScheduler scheduler ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> executorLastSeen ()  { throw new RuntimeException(); }
  private  long slaveTimeoutMs ()  { throw new RuntimeException(); }
  private  long executorTimeoutMs ()  { throw new RuntimeException(); }
  private  long timeoutIntervalMs ()  { throw new RuntimeException(); }
  private  long checkTimeoutIntervalMs ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledFuture<?> timeoutCheckingTask ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ScheduledExecutorService eventLoopThread ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ExecutorService killExecutorThread ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  /**
   * Send ExecutorRegistered to the event loop to add a new executor. Only for test.
   * <p>
   * @return if HeartbeatReceiver is stopped, return None. Otherwise, return a Some(Future) that
   *         indicate if this operation is successful.
   * @param executorId (undocumented)
   */
  public  scala.Option<scala.concurrent.Future<java.lang.Object>> addExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * If the heartbeat receiver is not stopped, notify it of executor registrations.
   * @param executorAdded (undocumented)
   */
  public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  /**
   * Send ExecutorRemoved to the event loop to remove an executor. Only for test.
   * <p>
   * @return if HeartbeatReceiver is stopped, return None. Otherwise, return a Some(Future) that
   *         indicate if this operation is successful.
   * @param executorId (undocumented)
   */
  public  scala.Option<scala.concurrent.Future<java.lang.Object>> removeExecutor (java.lang.String executorId)  { throw new RuntimeException(); }
  /**
   * If the heartbeat receiver is not stopped, notify it of executor removals so it doesn't
   * log superfluous errors.
   * <p>
   * Note that we must do this after the executor is actually removed to guard against the
   * following race condition: if we remove an executor's metadata from our data structure
   * prematurely, we may get an in-flight heartbeat from the executor before the executor is
   * actually removed, in which case we will still mark the executor as a dead host later
   * and expire it with loud error messages.
   * @param executorRemoved (undocumented)
   */
  public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  private  void expireDeadHosts ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
