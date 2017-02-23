package org.apache.spark.sql.execution.streaming;
/**
 * A {@link Sink} that forwards all data into {@link ForeachWriter} according to the contract defined by
 * {@link ForeachWriter}.
 * <p>
 * param:  writer The {@link ForeachWriter} to process all data.
 * @tparam T The expected type of the sink.
 */
public  class ForeachSink<T extends java.lang.Object> implements org.apache.spark.sql.execution.streaming.Sink, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ForeachSink (org.apache.spark.sql.ForeachWriter<T> writer, org.apache.spark.sql.Encoder<T> evidence$1)  { throw new RuntimeException(); }
  public  void addBatch (long batchId, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}
