package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * A collection of accumulators that represents metrics about reading data from external systems.
 */
public  class InputMetrics implements scala.Serializable {
     InputMetrics ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _bytesRead ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _recordsRead ()  { throw new RuntimeException(); }
  /**
   * Total number of bytes read.
   * @return (undocumented)
   */
  public  long bytesRead ()  { throw new RuntimeException(); }
  /**
   * Total number of records read.
   * @return (undocumented)
   */
  public  long recordsRead ()  { throw new RuntimeException(); }
    void incBytesRead (long v)  { throw new RuntimeException(); }
    void incRecordsRead (long v)  { throw new RuntimeException(); }
    void setBytesRead (long v)  { throw new RuntimeException(); }
}
