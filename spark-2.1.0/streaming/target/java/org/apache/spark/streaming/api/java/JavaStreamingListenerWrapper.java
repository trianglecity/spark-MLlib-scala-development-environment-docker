package org.apache.spark.streaming.api.java;
/**
 * A wrapper to convert a {@link JavaStreamingListener} to a {@link StreamingListener}.
 */
  class JavaStreamingListenerWrapper implements org.apache.spark.streaming.scheduler.StreamingListener {
  public   JavaStreamingListenerWrapper (org.apache.spark.streaming.api.java.JavaStreamingListener javaStreamingListener)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.api.java.JavaReceiverInfo toJavaReceiverInfo (org.apache.spark.streaming.scheduler.ReceiverInfo receiverInfo)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.api.java.JavaStreamInputInfo toJavaStreamInputInfo (org.apache.spark.streaming.scheduler.StreamInputInfo streamInputInfo)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.api.java.JavaOutputOperationInfo toJavaOutputOperationInfo (org.apache.spark.streaming.scheduler.OutputOperationInfo outputOperationInfo)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.api.java.JavaBatchInfo toJavaBatchInfo (org.apache.spark.streaming.scheduler.BatchInfo batchInfo)  { throw new RuntimeException(); }
  public  void onReceiverStarted (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStarted receiverStarted)  { throw new RuntimeException(); }
  public  void onReceiverError (org.apache.spark.streaming.scheduler.StreamingListenerReceiverError receiverError)  { throw new RuntimeException(); }
  public  void onReceiverStopped (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStopped receiverStopped)  { throw new RuntimeException(); }
  public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted)  { throw new RuntimeException(); }
  public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted)  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
  public  void onOutputOperationStarted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationStarted outputOperationStarted)  { throw new RuntimeException(); }
  public  void onOutputOperationCompleted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationCompleted outputOperationCompleted)  { throw new RuntimeException(); }
}
