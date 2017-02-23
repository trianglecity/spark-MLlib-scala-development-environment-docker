package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * A collection of accumulators that represent metrics about writing shuffle data.
 * Operations are not thread-safe.
 */
public  class ShuffleWriteMetrics implements scala.Serializable {
     ShuffleWriteMetrics ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _bytesWritten ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _recordsWritten ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _writeTime ()  { throw new RuntimeException(); }
  /**
   * Number of bytes written for the shuffle by this task.
   * @return (undocumented)
   */
  public  long bytesWritten ()  { throw new RuntimeException(); }
  /**
   * Total number of records written to the shuffle by this task.
   * @return (undocumented)
   */
  public  long recordsWritten ()  { throw new RuntimeException(); }
  /**
   * Time the task spent blocking on writes to disk or buffer cache, in nanoseconds.
   * @return (undocumented)
   */
  public  long writeTime ()  { throw new RuntimeException(); }
    void incBytesWritten (long v)  { throw new RuntimeException(); }
    void incRecordsWritten (long v)  { throw new RuntimeException(); }
    void incWriteTime (long v)  { throw new RuntimeException(); }
    void decBytesWritten (long v)  { throw new RuntimeException(); }
    void decRecordsWritten (long v)  { throw new RuntimeException(); }
  /**
   * @deprecated use bytesWritten instead. Since 2.0.0. 
  */
  public  long shuffleBytesWritten ()  { throw new RuntimeException(); }
  /**
   * @deprecated use writeTime instead. Since 2.0.0. 
  */
  public  long shuffleWriteTime ()  { throw new RuntimeException(); }
  /**
   * @deprecated use recordsWritten instead. Since 2.0.0. 
  */
  public  long shuffleRecordsWritten ()  { throw new RuntimeException(); }
}
