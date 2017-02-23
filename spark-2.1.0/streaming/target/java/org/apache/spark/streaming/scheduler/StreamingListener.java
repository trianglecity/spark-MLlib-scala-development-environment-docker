package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * A listener interface for receiving information about an ongoing streaming
 * computation.
 */
public  interface StreamingListener {
  /** Called when a receiver has been started */
  public  void onReceiverStarted (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStarted receiverStarted)  ;
  /** Called when a receiver has reported an error */
  public  void onReceiverError (org.apache.spark.streaming.scheduler.StreamingListenerReceiverError receiverError)  ;
  /** Called when a receiver has been stopped */
  public  void onReceiverStopped (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStopped receiverStopped)  ;
  /** Called when a batch of jobs has been submitted for processing. */
  public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted)  ;
  /** Called when processing of a batch of jobs has started.  */
  public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted)  ;
  /** Called when processing of a batch of jobs has completed. */
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  ;
  /** Called when processing of a job of a batch has started. */
  public  void onOutputOperationStarted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationStarted outputOperationStarted)  ;
  /** Called when processing of a job of a batch has completed. */
  public  void onOutputOperationCompleted (org.apache.spark.streaming.scheduler.StreamingListenerOutputOperationCompleted outputOperationCompleted)  ;
}
