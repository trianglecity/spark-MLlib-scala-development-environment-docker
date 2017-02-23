package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * A collection of accumulators that represents metrics about writing data to external systems.
 */
public  class OutputMetrics implements scala.Serializable {
     OutputMetrics ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _bytesWritten ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _recordsWritten ()  { throw new RuntimeException(); }
  /**
   * Total number of bytes written.
   * @return (undocumented)
   */
  public  long bytesWritten ()  { throw new RuntimeException(); }
  /**
   * Total number of records written.
   * @return (undocumented)
   */
  public  long recordsWritten ()  { throw new RuntimeException(); }
    void setBytesWritten (long v)  { throw new RuntimeException(); }
    void setRecordsWritten (long v)  { throw new RuntimeException(); }
}
