package org.apache.spark.sql.execution.ui;
/**
 * Store all accumulatorUpdates for a Spark task.
 */
  class SQLTaskMetrics {
  public  long attemptId ()  { throw new RuntimeException(); }
  public  boolean finished ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> accumulatorUpdates ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLTaskMetrics (long attemptId, boolean finished, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> accumulatorUpdates)  { throw new RuntimeException(); }
}
