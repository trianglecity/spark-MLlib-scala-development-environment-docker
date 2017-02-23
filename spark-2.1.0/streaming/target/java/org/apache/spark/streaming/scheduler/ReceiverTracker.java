package org.apache.spark.streaming.scheduler;
/**
 * This class manages the execution of the receivers of ReceiverInputDStreams. Instance of
 * this class must be created after all input streams have been added and StreamingContext.start()
 * has been called because it needs the final set of input streams at the time of instantiation.
 * <p>
 * param:  skipReceiverLaunch Do not launch the receiver. This is useful for testing.
 */
  class ReceiverTracker implements org.apache.spark.internal.Logging {
  /** Enumeration to identify current state of the ReceiverTracker */
  public  class TrackerState$ extends scala.Enumeration {
    public   TrackerState$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Initialized ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Started ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Stopping ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Stopped ()  { throw new RuntimeException(); }
  }
  /** RpcEndpoint to receive messages from the receivers. */
  private  class ReceiverTrackerEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint {
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    // not preceding
    public   ReceiverTrackerEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
    private  scala.concurrent.ExecutionContextExecutorService walBatchingThreadPool ()  { throw new RuntimeException(); }
    private  boolean active ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    /**
     * Return the stored scheduled executors that are still alive.
     * @param receiverId (undocumented)
     * @return (undocumented)
     */
    private  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> getStoredScheduledExecutors (int receiverId)  { throw new RuntimeException(); }
    /**
     * Start a receiver along with its scheduled executors
     * @param receiver (undocumented)
     * @param scheduledLocations (undocumented)
     */
    private  void startReceiver (org.apache.spark.streaming.receiver.Receiver<?> receiver, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> scheduledLocations)  { throw new RuntimeException(); }
    public  void onStop ()  { throw new RuntimeException(); }
    /**
     * Call when a receiver is terminated. It means we won't restart its Spark job.
     * @param receiverId (undocumented)
     */
    private  void onReceiverJobFinish (int receiverId)  { throw new RuntimeException(); }
    /** Send stop signal to the receivers. */
    private  void stopReceivers ()  { throw new RuntimeException(); }
  }
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
  public   ReceiverTracker (org.apache.spark.streaming.StreamingContext ssc, boolean skipReceiverLaunch)  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.dstream.ReceiverInputDStream<?>[] receiverInputStreams ()  { throw new RuntimeException(); }
  private  int[] receiverInputStreamIds ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.scheduler.ReceivedBlockTracker receivedBlockTracker ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.scheduler.StreamingListenerBus listenerBus ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.scheduler.ReceiverTracker.TrackerState$ TrackerState ()  { throw new RuntimeException(); }
  /** State of the tracker. Protected by "trackerStateLock" */
  private  scala.Enumeration.Value trackerState ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef endpoint ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.scheduler.ReceiverSchedulingPolicy schedulingPolicy ()  { throw new RuntimeException(); }
  private  java.util.concurrent.CountDownLatch receiverJobExitLatch ()  { throw new RuntimeException(); }
  /**
   * Track all receivers' information. The key is the receiver id, the value is the receiver info.
   * It's only accessed in ReceiverTrackerEndpoint.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.streaming.scheduler.ReceiverTrackingInfo> receiverTrackingInfos ()  { throw new RuntimeException(); }
  /**
   * Store all preferred locations for all receivers. We need this information to schedule
   * receivers. It's only accessed in ReceiverTrackerEndpoint.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.Object, scala.Option<java.lang.String>> receiverPreferredLocations ()  { throw new RuntimeException(); }
  /** Start the endpoint and receiver execution thread. */
  public  void start ()  { throw new RuntimeException(); }
  /** Stop the receiver execution thread. */
  public  void stop (boolean graceful)  { throw new RuntimeException(); }
  /** Allocate all unallocated blocks to the given batch. */
  public  void allocateBlocksToBatch (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
  /** Get the blocks for the given batch and all input streams. */
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> getBlocksOfBatch (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
  /** Get the blocks allocated to the given batch and stream. */
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> getBlocksOfBatchAndStream (org.apache.spark.streaming.Time batchTime, int streamId)  { throw new RuntimeException(); }
  /**
   * Clean up the data and metadata of blocks and batches that are strictly
   * older than the threshold time. Note that this does not
   * @param cleanupThreshTime (undocumented)
   */
  public  void cleanupOldBlocksAndBatches (org.apache.spark.streaming.Time cleanupThreshTime)  { throw new RuntimeException(); }
  /**
   * Get the executors allocated to each receiver.
   * @return a map containing receiver ids to optional executor ids.
   */
  public  scala.collection.immutable.Map<java.lang.Object, scala.Option<java.lang.String>> allocatedExecutors ()  { throw new RuntimeException(); }
  public  int numReceivers ()  { throw new RuntimeException(); }
  /** Register a receiver */
  private  boolean registerReceiver (int streamId, java.lang.String typ, java.lang.String host, java.lang.String executorId, org.apache.spark.rpc.RpcEndpointRef receiverEndpoint, org.apache.spark.rpc.RpcAddress senderAddress)  { throw new RuntimeException(); }
  /** Deregister a receiver */
  private  void deregisterReceiver (int streamId, java.lang.String message, java.lang.String error)  { throw new RuntimeException(); }
  /** Update a receiver's maximum ingestion rate */
  public  void sendRateUpdate (int streamUID, long newRate)  { throw new RuntimeException(); }
  /** Add new blocks for the given stream */
  private  boolean addBlock (org.apache.spark.streaming.scheduler.ReceivedBlockInfo receivedBlockInfo)  { throw new RuntimeException(); }
  /** Report error sent by a receiver */
  private  void reportError (int streamId, java.lang.String message, java.lang.String error)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> scheduleReceiver (int receiverId)  { throw new RuntimeException(); }
  private  void updateReceiverScheduledExecutors (int receiverId, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> scheduledLocations)  { throw new RuntimeException(); }
  /** Check if any blocks are left to be processed */
  public  boolean hasUnallocatedBlocks ()  { throw new RuntimeException(); }
  /**
   * Get the list of executors excluding driver
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.scheduler.ExecutorCacheTaskLocation> getExecutors ()  { throw new RuntimeException(); }
  /**
   * Run the dummy Spark job to ensure that all slaves have registered. This avoids all the
   * receivers to be scheduled on the same node.
   * <p>
   * TODO Should poll the executor number and wait for executors according to
   * "spark.scheduler.minRegisteredResourcesRatio" and
   * "spark.scheduler.maxRegisteredResourcesWaitingTime" rather than running a dummy job.
   */
  private  void runDummySparkJob ()  { throw new RuntimeException(); }
  /**
   * Get the receivers from the ReceiverInputDStreams, distributes them to the
   * worker nodes as a parallel collection, and runs them.
   */
  private  void launchReceivers ()  { throw new RuntimeException(); }
  /** Check if tracker has been marked for initiated */
  private  boolean isTrackerInitialized ()  { throw new RuntimeException(); }
  /** Check if tracker has been marked for starting */
  private  boolean isTrackerStarted ()  { throw new RuntimeException(); }
  /** Check if tracker has been marked for stopping */
  private  boolean isTrackerStopping ()  { throw new RuntimeException(); }
  /** Check if tracker has been marked for stopped */
  private  boolean isTrackerStopped ()  { throw new RuntimeException(); }
}
