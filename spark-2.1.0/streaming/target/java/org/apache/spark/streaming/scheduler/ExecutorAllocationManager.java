package org.apache.spark.streaming.scheduler;
/**
 * Class that manages executor allocated to a StreamingContext, and dynamically request or kill
 * executors based on the statistics of the streaming computation. This is different from the core
 * dynamic allocation policy; the core policy relies on executors being idle for a while, but the
 * micro-batch model of streaming prevents any particular executors from being idle for a long
 * time. Instead, the measure of "idle-ness" needs to be based on the time taken to process
 * each batch.
 * <p>
 * At a high level, the policy implemented by this class is as follows:
 * - Use StreamingListener interface get batch processing times of completed batches
 * - Periodically take the average batch completion times and compare with the batch interval
 * - If (avg. proc. time / batch interval) >= scaling up ratio, then request more executors.
 *   The number of executors requested is based on the ratio = (avg. proc. time / batch interval).
 * - If (avg. proc. time / batch interval) <= scaling down ratio, then try to kill an executor that
 *   is not running a receiver.
 * <p>
 * This features should ideally be used in conjunction with backpressure, as backpressure ensures
 * system stability, while executors are being readjusted.
 */
  class ExecutorAllocationManager implements org.apache.spark.streaming.scheduler.StreamingListener, org.apache.spark.internal.Logging {
  static public  java.lang.String ENABLED_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String SCALING_INTERVAL_KEY ()  { throw new RuntimeException(); }
  static public  int SCALING_INTERVAL_DEFAULT_SECS ()  { throw new RuntimeException(); }
  static public  java.lang.String SCALING_UP_RATIO_KEY ()  { throw new RuntimeException(); }
  static public  double SCALING_UP_RATIO_DEFAULT ()  { throw new RuntimeException(); }
  static public  java.lang.String SCALING_DOWN_RATIO_KEY ()  { throw new RuntimeException(); }
  static public  double SCALING_DOWN_RATIO_DEFAULT ()  { throw new RuntimeException(); }
  static public  java.lang.String MIN_EXECUTORS_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String MAX_EXECUTORS_KEY ()  { throw new RuntimeException(); }
  static public  boolean isDynamicAllocationEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.streaming.scheduler.ExecutorAllocationManager> createIfEnabled (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker, org.apache.spark.SparkConf conf, long batchDurationMs, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  static public  void onReceiverStarted (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStarted receiverStarted)  { throw new RuntimeException(); }
  static public  void onReceiverError (org.apache.spark.streaming.scheduler.StreamingListenerReceiverError receiverError)  { throw new RuntimeException(); }
  static public  void onReceiverStopped (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStopped receiverStopped)  { throw new RuntimeException(); }
  static public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted)  { throw new RuntimeException(); }
  static public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted)  { throw new RuntimeException(); }
  static public  void onOutputOperationStarted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationStarted outputOperationStarted)  { throw new RuntimeException(); }
  static public  void onOutputOperationCompleted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationCompleted outputOperationCompleted)  { throw new RuntimeException(); }
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
  public   ExecutorAllocationManager (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker, org.apache.spark.SparkConf conf, long batchDurationMs, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  private  long scalingIntervalSecs ()  { throw new RuntimeException(); }
  private  double scalingUpRatio ()  { throw new RuntimeException(); }
  private  double scalingDownRatio ()  { throw new RuntimeException(); }
  private  int minNumExecutors ()  { throw new RuntimeException(); }
  private  int maxNumExecutors ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.util.RecurringTimer timer ()  { throw new RuntimeException(); }
  private  long batchProcTimeSum ()  { throw new RuntimeException(); }
  private  int batchProcTimeCount ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Manage executor allocation by requesting or killing executors based on the collected
   * batch statistics.
   */
  private  void manageAllocation ()  { throw new RuntimeException(); }
  /** Request the specified number of executors over the currently active one */
  private  void requestExecutors (int numNewExecutors)  { throw new RuntimeException(); }
  /** Kill an executor that is not running any receiver, if possible */
  private  void killExecutor ()  { throw new RuntimeException(); }
  private  void addBatchProcTime (long timeMs)  { throw new RuntimeException(); }
  private  void validateSettings ()  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
}
