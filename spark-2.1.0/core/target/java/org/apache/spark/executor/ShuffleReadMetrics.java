package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * A collection of accumulators that represent metrics about reading shuffle data.
 * Operations are not thread-safe.
 */
public  class ShuffleReadMetrics implements scala.Serializable {
     ShuffleReadMetrics ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _remoteBlocksFetched ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _localBlocksFetched ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _remoteBytesRead ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _localBytesRead ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _fetchWaitTime ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _recordsRead ()  { throw new RuntimeException(); }
  /**
   * Number of remote blocks fetched in this shuffle by this task.
   * @return (undocumented)
   */
  public  long remoteBlocksFetched ()  { throw new RuntimeException(); }
  /**
   * Number of local blocks fetched in this shuffle by this task.
   * @return (undocumented)
   */
  public  long localBlocksFetched ()  { throw new RuntimeException(); }
  /**
   * Total number of remote bytes read from the shuffle by this task.
   * @return (undocumented)
   */
  public  long remoteBytesRead ()  { throw new RuntimeException(); }
  /**
   * Shuffle data that was read from the local disk (as opposed to from a remote executor).
   * @return (undocumented)
   */
  public  long localBytesRead ()  { throw new RuntimeException(); }
  /**
   * Time the task spent waiting for remote shuffle blocks. This only includes the time
   * blocking on shuffle input data. For instance if block B is being fetched while the task is
   * still not finished processing block A, it is not considered to be blocking on block B.
   * @return (undocumented)
   */
  public  long fetchWaitTime ()  { throw new RuntimeException(); }
  /**
   * Total number of records read from the shuffle by this task.
   * @return (undocumented)
   */
  public  long recordsRead ()  { throw new RuntimeException(); }
  /**
   * Total bytes fetched in the shuffle by this task (both remote and local).
   * @return (undocumented)
   */
  public  long totalBytesRead ()  { throw new RuntimeException(); }
  /**
   * Number of blocks fetched in this shuffle by this task (remote or local).
   * @return (undocumented)
   */
  public  long totalBlocksFetched ()  { throw new RuntimeException(); }
    void incRemoteBlocksFetched (long v)  { throw new RuntimeException(); }
    void incLocalBlocksFetched (long v)  { throw new RuntimeException(); }
    void incRemoteBytesRead (long v)  { throw new RuntimeException(); }
    void incLocalBytesRead (long v)  { throw new RuntimeException(); }
    void incFetchWaitTime (long v)  { throw new RuntimeException(); }
    void incRecordsRead (long v)  { throw new RuntimeException(); }
    void setRemoteBlocksFetched (int v)  { throw new RuntimeException(); }
    void setLocalBlocksFetched (int v)  { throw new RuntimeException(); }
    void setRemoteBytesRead (long v)  { throw new RuntimeException(); }
    void setLocalBytesRead (long v)  { throw new RuntimeException(); }
    void setFetchWaitTime (long v)  { throw new RuntimeException(); }
    void setRecordsRead (long v)  { throw new RuntimeException(); }
  /**
   * Resets the value of the current metrics (<code>this</code>) and and merges all the independent
   * {@link TempShuffleReadMetrics} into <code>this</code>.
   * @param metrics (undocumented)
   */
    void setMergeValues (scala.collection.Seq<org.apache.spark.executor.TempShuffleReadMetrics> metrics)  { throw new RuntimeException(); }
}
