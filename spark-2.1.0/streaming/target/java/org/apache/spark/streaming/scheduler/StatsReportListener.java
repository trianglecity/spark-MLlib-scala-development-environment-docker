package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * A simple StreamingListener that logs summary statistics across Spark Streaming batches
 * param:  numBatchInfos Number of last batches to consider for generating statistics (default: 10)
 */
public  class StatsReportListener implements org.apache.spark.streaming.scheduler.StreamingListener {
  static public  void onReceiverStarted (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStarted receiverStarted)  { throw new RuntimeException(); }
  static public  void onReceiverError (org.apache.spark.streaming.scheduler.StreamingListenerReceiverError receiverError)  { throw new RuntimeException(); }
  static public  void onReceiverStopped (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStopped receiverStopped)  { throw new RuntimeException(); }
  static public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted)  { throw new RuntimeException(); }
  static public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted)  { throw new RuntimeException(); }
  static public  void onOutputOperationStarted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationStarted outputOperationStarted)  { throw new RuntimeException(); }
  static public  void onOutputOperationCompleted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationCompleted outputOperationCompleted)  { throw new RuntimeException(); }
  public   StatsReportListener (int numBatchInfos)  { throw new RuntimeException(); }
  public  scala.collection.mutable.Queue<org.apache.spark.streaming.scheduler.BatchInfo> batchInfos ()  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchStarted)  { throw new RuntimeException(); }
  public  void printStats ()  { throw new RuntimeException(); }
  public  void showMillisDistribution (java.lang.String heading, scala.Function1<org.apache.spark.streaming.scheduler.BatchInfo, scala.Option<java.lang.Object>> getMetric)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.Distribution> extractDistribution (scala.Function1<org.apache.spark.streaming.scheduler.BatchInfo, scala.Option<java.lang.Object>> getMetric)  { throw new RuntimeException(); }
}
