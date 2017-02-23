package org.apache.spark.status.api.v1;
public  class ShuffleReadMetrics {
  public  long remoteBlocksFetched ()  { throw new RuntimeException(); }
  public  long localBlocksFetched ()  { throw new RuntimeException(); }
  public  long fetchWaitTime ()  { throw new RuntimeException(); }
  public  long remoteBytesRead ()  { throw new RuntimeException(); }
  public  long localBytesRead ()  { throw new RuntimeException(); }
  public  long recordsRead ()  { throw new RuntimeException(); }
  // not preceding
     ShuffleReadMetrics (long remoteBlocksFetched, long localBlocksFetched, long fetchWaitTime, long remoteBytesRead, long localBytesRead, long recordsRead)  { throw new RuntimeException(); }
}
