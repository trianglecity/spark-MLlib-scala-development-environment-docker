package org.apache.spark;
/**
 * MapOutputTracker for the driver.
 */
  class MapOutputTrackerMaster extends org.apache.spark.MapOutputTracker {
  public   MapOutputTrackerMaster (org.apache.spark.SparkConf conf, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal)  { throw new RuntimeException(); }
  /** Cache a serialized version of the output statuses for each shuffle to send them out faster */
  private  long cacheEpoch ()  { throw new RuntimeException(); }
  private  int minSizeForBroadcast ()  { throw new RuntimeException(); }
  /** Whether to compute locality preferences for reduce tasks */
  private  boolean shuffleLocalityEnabled ()  { throw new RuntimeException(); }
  private  int SHUFFLE_PREF_MAP_THRESHOLD ()  { throw new RuntimeException(); }
  private  int SHUFFLE_PREF_REDUCE_THRESHOLD ()  { throw new RuntimeException(); }
  private  double REDUCER_PREF_LOCS_FRACTION ()  { throw new RuntimeException(); }
  protected  scala.collection.concurrent.Map<java.lang.Object, org.apache.spark.scheduler.MapStatus[]> mapStatuses ()  { throw new RuntimeException(); }
  private  scala.collection.concurrent.Map<java.lang.Object, byte[]> cachedSerializedStatuses ()  { throw new RuntimeException(); }
  private  int maxRpcMessageSize ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.broadcast.Broadcast<byte[]>> cachedSerializedBroadcast ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Object> shuffleIdLocks ()  { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<org.apache.spark.GetMapOutputMessage> mapOutputRequests ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor threadpool ()  { throw new RuntimeException(); }
  public  void post (org.apache.spark.GetMapOutputMessage message)  { throw new RuntimeException(); }
  /** Message loop used for dispatching messages. */
  private  class MessageLoop implements java.lang.Runnable {
    public   MessageLoop ()  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
  }
  /** A poison endpoint that indicates MessageLoop should exit its message loop. */
  private  org.apache.spark.GetMapOutputMessage PoisonPill ()  { throw new RuntimeException(); }
    int getNumCachedSerializedBroadcast ()  { throw new RuntimeException(); }
  public  void registerShuffle (int shuffleId, int numMaps)  { throw new RuntimeException(); }
  public  void registerMapOutput (int shuffleId, int mapId, org.apache.spark.scheduler.MapStatus status)  { throw new RuntimeException(); }
  /** Register multiple map output information for the given shuffle */
  public  void registerMapOutputs (int shuffleId, org.apache.spark.scheduler.MapStatus[] statuses, boolean changeEpoch)  { throw new RuntimeException(); }
  /** Unregister map output information of the given shuffle, mapper and block manager */
  public  void unregisterMapOutput (int shuffleId, int mapId, org.apache.spark.storage.BlockManagerId bmAddress)  { throw new RuntimeException(); }
  /** Unregister shuffle data */
  public  void unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
  /** Check if the given shuffle is being tracked */
  public  boolean containsShuffle (int shuffleId)  { throw new RuntimeException(); }
  /**
   * Return the preferred hosts on which to run the given map output partition in a given shuffle,
   * i.e. the nodes that the most outputs for that partition are on.
   * <p>
   * @param dep shuffle dependency object
   * @param partitionId map output partition that we want to read
   * @return a sequence of host names
   */
  public  scala.collection.Seq<java.lang.String> getPreferredLocationsForShuffle (org.apache.spark.ShuffleDependency<?, ?, ?> dep, int partitionId)  { throw new RuntimeException(); }
  /**
   * Return a list of locations that each have fraction of map output greater than the specified
   * threshold.
   * <p>
   * @param shuffleId id of the shuffle
   * @param reducerId id of the reduce task
   * @param numReducers total number of reducers in the shuffle
   * @param fractionThreshold fraction of total map output size that a location must have
   *                          for it to be considered large.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockManagerId[]> getLocationsWithLargestOutputs (int shuffleId, int reducerId, int numReducers, double fractionThreshold)  { throw new RuntimeException(); }
  public  void incrementEpoch ()  { throw new RuntimeException(); }
  private  void removeBroadcast (org.apache.spark.broadcast.Broadcast<?> bcast)  { throw new RuntimeException(); }
  private  void clearCachedBroadcast ()  { throw new RuntimeException(); }
  public  byte[] getSerializedMapOutputStatuses (int shuffleId)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
