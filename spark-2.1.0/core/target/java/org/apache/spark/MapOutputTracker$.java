package org.apache.spark;
public  class MapOutputTracker$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapOutputTracker$ MODULE$ = null;
  public   MapOutputTracker$ ()  { throw new RuntimeException(); }
  public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  private  int DIRECT ()  { throw new RuntimeException(); }
  private  int BROADCAST ()  { throw new RuntimeException(); }
  public  scala.Tuple2<byte[], org.apache.spark.broadcast.Broadcast<byte[]>> serializeMapStatuses (org.apache.spark.scheduler.MapStatus[] statuses, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal, int minBroadcastSize)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MapStatus[] deserializeMapStatuses (byte[] bytes)  { throw new RuntimeException(); }
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
  private  scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple2<org.apache.spark.storage.BlockId, java.lang.Object>>>> convertMapStatuses (int shuffleId, int startPartition, int endPartition, org.apache.spark.scheduler.MapStatus[] statuses)  { throw new RuntimeException(); }
}
