package org.apache.spark.sql.execution.streaming;
public  class ConsoleSink implements org.apache.spark.sql.execution.streaming.Sink, org.apache.spark.internal.Logging {
  public   ConsoleSink (scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  private  int numRowsToShow ()  { throw new RuntimeException(); }
  private  boolean isTruncated ()  { throw new RuntimeException(); }
  private  long lastBatchId ()  { throw new RuntimeException(); }
  public  void addBatch (long batchId, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}
