package org.apache.spark.executor;
/**
 * A temporary shuffle read metrics holder that is used to collect shuffle read metrics for each
 * shuffle dependency, and all temporary metrics will be merged into the {@link ShuffleReadMetrics} at
 * last.
 */
  class TempShuffleReadMetrics {
  public   TempShuffleReadMetrics ()  { throw new RuntimeException(); }
  public  void incRemoteBlocksFetched (long v)  { throw new RuntimeException(); }
  public  void incLocalBlocksFetched (long v)  { throw new RuntimeException(); }
  public  void incRemoteBytesRead (long v)  { throw new RuntimeException(); }
  public  void incLocalBytesRead (long v)  { throw new RuntimeException(); }
  public  void incFetchWaitTime (long v)  { throw new RuntimeException(); }
  public  void incRecordsRead (long v)  { throw new RuntimeException(); }
  public  long remoteBlocksFetched ()  { throw new RuntimeException(); }
  public  long localBlocksFetched ()  { throw new RuntimeException(); }
  public  long remoteBytesRead ()  { throw new RuntimeException(); }
  public  long localBytesRead ()  { throw new RuntimeException(); }
  public  long fetchWaitTime ()  { throw new RuntimeException(); }
  public  long recordsRead ()  { throw new RuntimeException(); }
}
