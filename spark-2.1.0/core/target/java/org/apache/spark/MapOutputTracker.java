package org.apache.spark;
/**
 * Class that keeps track of the location of the map output of
 * a stage. This is abstract because different versions of MapOutputTracker
 * (driver and executor) use different HashMap to store its metadata.
 */
 abstract class MapOutputTracker implements org.apache.spark.internal.Logging {
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static private  int DIRECT ()  { throw new RuntimeException(); }
  static private  int BROADCAST ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<byte[], org.apache.spark.broadcast.Broadcast<byte[]>> serializeMapStatuses (org.apache.spark.scheduler.MapStatus[] statuses, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal, int minBroadcastSize)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.MapStatus[] deserializeMapStatuses (byte[] bytes)  { throw new RuntimeException(); }
  /**
   * Given an array of map statuses and a range of map output partitions, returns a sequence that,
   * for each block manager ID, lists the shuffle block IDs and corresponding shuffle block sizes
   * stored at that block manager.
   * <p>
   * If any of the statuses is null (indicating a missing location due to a failed mapper),
   * throws a FetchFailedException.
   * <p>
   * @param shuffleId Identifier for the shuffle
   * @param startPartition Start of map output partition ID range (included in range)
   * @param endPartition End of map output partition ID range (excluded from range)
   * @param statuses List of map statuses, indexed by map ID.
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block ID, shuffle block size) tuples
   *         describing the shuffle blocks that are stored at that block manager.
   */
  static private  scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> convertMapStatuses (int shuffleId, int startPartition, int endPartition, org.apache.spark.scheduler.MapStatus[] statuses)  { throw new RuntimeException(); }
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
  public   MapOutputTracker (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Set to the MapOutputTrackerMasterEndpoint living on the driver. */
  public  org.apache.spark.rpc.RpcEndpointRef trackerEndpoint ()  { throw new RuntimeException(); }
  /**
   * This HashMap has different behavior for the driver and the executors.
   * <p>
   * On the driver, it serves as the source of map outputs recorded from ShuffleMapTasks.
   * On the executors, it simply serves as a cache, in which a miss triggers a fetch from the
   * driver's corresponding HashMap.
   * <p>
   * Note: because mapStatuses is accessed concurrently, subclasses should make sure it's a
   * thread-safe map.
   * @return (undocumented)
   */
  protected abstract  scala.collection.mutable.Map<java.lang.Object, org.apache.spark.scheduler.MapStatus[]> mapStatuses ()  ;
  /**
   * Incremented every time a fetch fails so that client nodes know to clear
   * their cache of map output locations if this happens.
   * @return (undocumented)
   */
  protected  long epoch ()  { throw new RuntimeException(); }
  protected  java.lang.Object epochLock ()  { throw new RuntimeException(); }
  /** Remembers which map output locations are currently being fetched on an executor. */
  private  scala.collection.mutable.HashSet<java.lang.Object> fetching ()  { throw new RuntimeException(); }
  /**
   * Send a message to the trackerEndpoint and get its result within a default timeout, or
   * throw a SparkException if this fails.
   * @param message (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  protected <T extends java.lang.Object> T askTracker (Object message, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /** Send a one-way message to the trackerEndpoint, to which we expect it to reply with true. */
  protected  void sendTracker (Object message)  { throw new RuntimeException(); }
  /**
   * Called from executors to get the server URIs and output sizes for each shuffle block that
   * needs to be read from a given reduce task.
   * <p>
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block id, shuffle block size) tuples
   *         describing the shuffle blocks that are stored at that block manager.
   * @param shuffleId (undocumented)
   * @param reduceId (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int reduceId)  { throw new RuntimeException(); }
  /**
   * Called from executors to get the server URIs and output sizes for each shuffle block that
   * needs to be read from a given range of map output partitions (startPartition is included but
   * endPartition is excluded from the range).
   * <p>
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block id, shuffle block size) tuples
   *         describing the shuffle blocks that are stored at that block manager.
   * @param shuffleId (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startPartition, int endPartition)  { throw new RuntimeException(); }
  /**
   * Return statistics about all of the outputs for a given shuffle.
   * @param dep (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.MapOutputStatistics getStatistics (org.apache.spark.ShuffleDependency<?, ?, ?> dep)  { throw new RuntimeException(); }
  /**
   * Get or fetch the array of MapStatuses for a given shuffle ID. NOTE: clients MUST synchronize
   * on this array when reading it, because on the driver, we may be changing it in place.
   * <p>
   * (It would be nice to remove this restriction in the future.)
   * @param shuffleId (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.scheduler.MapStatus[] getStatuses (int shuffleId)  { throw new RuntimeException(); }
  /** Called to get current epoch number. */
  public  long getEpoch ()  { throw new RuntimeException(); }
  /**
   * Called from executors to update the epoch number, potentially clearing old outputs
   * because of a fetch failure. Each executor task calls this with the latest epoch
   * number on the driver at the time it was created.
   * @param newEpoch (undocumented)
   */
  public  void updateEpoch (long newEpoch)  { throw new RuntimeException(); }
  /** Unregister shuffle data. */
  public  void unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
  /** Stop the tracker. */
  public  void stop ()  { throw new RuntimeException(); }
}
