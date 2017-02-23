package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Simple SparkListener that logs a few summary statistics when each stage completes.
 */
public  class StatsReportListener extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.internal.Logging {
  static public  int[] percentiles ()  { throw new RuntimeException(); }
  static public  double[] probabilities ()  { throw new RuntimeException(); }
  static public  java.lang.String percentilesHeader ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.util.Distribution> extractDoubleDistribution (scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.util.Distribution> extractLongDistribution (scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric)  { throw new RuntimeException(); }
  static public  void showDistribution (java.lang.String heading, org.apache.spark.util.Distribution d, scala.Function1<java.lang.Object, java.lang.String> formatNumber)  { throw new RuntimeException(); }
  static public  void showDistribution (java.lang.String heading, scala.Option<org.apache.spark.util.Distribution> dOpt, scala.Function1<java.lang.Object, java.lang.String> formatNumber)  { throw new RuntimeException(); }
  static public  void showDistribution (java.lang.String heading, scala.Option<org.apache.spark.util.Distribution> dOpt, java.lang.String format)  { throw new RuntimeException(); }
  static public  void showDistribution (java.lang.String heading, java.lang.String format, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric, scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics)  { throw new RuntimeException(); }
  static public  void showBytesDistribution (java.lang.String heading, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric, scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics)  { throw new RuntimeException(); }
  static public  void showBytesDistribution (java.lang.String heading, scala.Option<org.apache.spark.util.Distribution> dOpt)  { throw new RuntimeException(); }
  static public  void showBytesDistribution (java.lang.String heading, org.apache.spark.util.Distribution dist)  { throw new RuntimeException(); }
  static public  void showMillisDistribution (java.lang.String heading, scala.Option<org.apache.spark.util.Distribution> dOpt)  { throw new RuntimeException(); }
  static public  void showMillisDistribution (java.lang.String heading, scala.Function2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics, java.lang.Object> getMetric, scala.collection.Seq<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics)  { throw new RuntimeException(); }
  static public  long seconds ()  { throw new RuntimeException(); }
  static public  long minutes ()  { throw new RuntimeException(); }
  static public  long hours ()  { throw new RuntimeException(); }
  /**
   * Reformat a time interval in milliseconds to a prettier format for output
   * @param ms (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String millisToString (long ms)  { throw new RuntimeException(); }
  static public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
  static public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
  static public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult taskGettingResult)  { throw new RuntimeException(); }
  static public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart)  { throw new RuntimeException(); }
  static public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  static public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate environmentUpdate)  { throw new RuntimeException(); }
  static public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded)  { throw new RuntimeException(); }
  static public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved)  { throw new RuntimeException(); }
  static public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD unpersistRDD)  { throw new RuntimeException(); }
  static public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart applicationStart)  { throw new RuntimeException(); }
  static public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd)  { throw new RuntimeException(); }
  static public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate executorMetricsUpdate)  { throw new RuntimeException(); }
  static public  void onExecutorAdded (org.apache.spark.scheduler.SparkListenerExecutorAdded executorAdded)  { throw new RuntimeException(); }
  static public  void onExecutorRemoved (org.apache.spark.scheduler.SparkListenerExecutorRemoved executorRemoved)  { throw new RuntimeException(); }
  static public  void onBlockUpdated (org.apache.spark.scheduler.SparkListenerBlockUpdated blockUpdated)  { throw new RuntimeException(); }
  static public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
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
  public   StatsReportListener ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Buffer<scala.Tuple2<org.apache.spark.scheduler.TaskInfo, org.apache.spark.executor.TaskMetrics>> taskInfoMetrics ()  { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
  private  java.lang.String getStatusDetail (org.apache.spark.scheduler.StageInfo info)  { throw new RuntimeException(); }
}
