package org.apache.spark.streaming.api.java;
  class PythonStreamingListenerWrapper extends org.apache.spark.streaming.api.java.JavaStreamingListener {
  public   PythonStreamingListenerWrapper (org.apache.spark.streaming.api.java.PythonStreamingListener listener)  { throw new RuntimeException(); }
  /** Called when a receiver has been started */
  public  void onReceiverStarted (org.apache.spark.streaming.api.java.JavaStreamingListenerReceiverStarted receiverStarted)  { throw new RuntimeException(); }
  /** Called when a receiver has reported an error */
  public  void onReceiverError (org.apache.spark.streaming.api.java.JavaStreamingListenerReceiverError receiverError)  { throw new RuntimeException(); }
  /** Called when a receiver has been stopped */
  public  void onReceiverStopped (org.apache.spark.streaming.api.java.JavaStreamingListenerReceiverStopped receiverStopped)  { throw new RuntimeException(); }
  /** Called when a batch of jobs has been submitted for processing. */
  public  void onBatchSubmitted (org.apache.spark.streaming.api.java.JavaStreamingListenerBatchSubmitted batchSubmitted)  { throw new RuntimeException(); }
  /** Called when processing of a batch of jobs has started.  */
  public  void onBatchStarted (org.apache.spark.streaming.api.java.JavaStreamingListenerBatchStarted batchStarted)  { throw new RuntimeException(); }
  /** Called when processing of a batch of jobs has completed. */
  public  void onBatchCompleted (org.apache.spark.streaming.api.java.JavaStreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
  /** Called when processing of a job of a batch has started. */
  public  void onOutputOperationStarted (org.apache.spark.streaming.api.java.JavaStreamingListenerOutputOperationStarted outputOperationStarted)  { throw new RuntimeException(); }
  /** Called when processing of a job of a batch has completed. */
  public  void onOutputOperationCompleted (org.apache.spark.streaming.api.java.JavaStreamingListenerOutputOperationCompleted outputOperationCompleted)  { throw new RuntimeException(); }
}
