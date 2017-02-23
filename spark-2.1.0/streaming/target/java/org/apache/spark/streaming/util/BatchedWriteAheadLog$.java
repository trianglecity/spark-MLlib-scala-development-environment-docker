package org.apache.spark.streaming.util;
/** Static methods for aggregating and de-aggregating records. */
public  class BatchedWriteAheadLog$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BatchedWriteAheadLog$ MODULE$ = null;
  public   BatchedWriteAheadLog$ ()  { throw new RuntimeException(); }
  /** Aggregate multiple serialized ReceivedBlockTrackerLogEvents in a single ByteBuffer. */
  public  java.nio.ByteBuffer aggregate (scala.collection.Seq<org.apache.spark.streaming.util.BatchedWriteAheadLog.Record> records)  { throw new RuntimeException(); }
  /**
   * De-aggregate serialized ReceivedBlockTrackerLogEvents in a single ByteBuffer.
   * A stream may not have used batching initially, but started using it after a restart. This
   * method therefore needs to be backwards compatible.
   * @param buffer (undocumented)
   * @return (undocumented)
   */
  public  java.nio.ByteBuffer[] deaggregate (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
}
