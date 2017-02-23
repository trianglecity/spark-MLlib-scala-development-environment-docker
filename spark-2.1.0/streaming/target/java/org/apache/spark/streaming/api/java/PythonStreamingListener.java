package org.apache.spark.streaming.api.java;
  interface PythonStreamingListener {
  /** Called when a receiver has been started */
  public  void onReceiverStarted (org.apache.spark.streaming.api.java.JavaStreamingListenerReceiverStarted receiverStarted)  ;
  /** Called when a receiver has reported an error */
  public  void onReceiverError (org.apache.spark.streaming.api.java.JavaStreamingListenerReceiverError receiverError)  ;
  /** Called when a receiver has been stopped */
  public  void onReceiverStopped (org.apache.spark.streaming.api.java.JavaStreamingListenerReceiverStopped receiverStopped)  ;
  /** Called when a batch of jobs has been submitted for processing. */
  public  void onBatchSubmitted (org.apache.spark.streaming.api.java.JavaStreamingListenerBatchSubmitted batchSubmitted)  ;
  /** Called when processing of a batch of jobs has started.  */
  public  void onBatchStarted (org.apache.spark.streaming.api.java.JavaStreamingListenerBatchStarted batchStarted)  ;
  /** Called when processing of a batch of jobs has completed. */
  public  void onBatchCompleted (org.apache.spark.streaming.api.java.JavaStreamingListenerBatchCompleted batchCompleted)  ;
  /** Called when processing of a job of a batch has started. */
  public  void onOutputOperationStarted (org.apache.spark.streaming.api.java.JavaStreamingListenerOutputOperationStarted outputOperationStarted)  ;
  /** Called when processing of a job of a batch has completed. */
  public  void onOutputOperationCompleted (org.apache.spark.streaming.api.java.JavaStreamingListenerOutputOperationCompleted outputOperationCompleted)  ;
}
