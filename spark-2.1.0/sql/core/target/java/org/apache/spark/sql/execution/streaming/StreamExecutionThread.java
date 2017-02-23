package org.apache.spark.sql.execution.streaming;
/**
 * A special thread to run the stream query. Some codes require to run in the StreamExecutionThread
 * and will use <code>classOf[StreamExecutionThread]</code> to check.
 */
public abstract class StreamExecutionThread extends org.apache.spark.util.UninterruptibleThread {
  public   StreamExecutionThread (java.lang.String name)  { throw new RuntimeException(); }
}
