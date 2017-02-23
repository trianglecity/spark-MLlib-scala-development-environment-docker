package org.apache.spark.sql.execution.streaming;
/**
 * Contains metadata associated with a {@link OffsetSeq}. This information is
 * persisted to the offset log in the checkpoint location via the {@link OffsetSeq} metadata field.
 * <p>
 * param:  batchWatermarkMs: The current eventTime watermark, used to
 * bound the lateness of data that will processed. Time unit: milliseconds
 * param:  batchTimestampMs: The current batch processing timestamp.
 * Time unit: milliseconds
 */
public  class OffsetSeqMetadata implements scala.Product, scala.Serializable {
  static private  java.lang.Object format ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.OffsetSeqMetadata apply (java.lang.String json)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long batchWatermarkMs ()  { throw new RuntimeException(); }
  public  long batchTimestampMs ()  { throw new RuntimeException(); }
  // not preceding
  public   OffsetSeqMetadata (long batchWatermarkMs, long batchTimestampMs)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
