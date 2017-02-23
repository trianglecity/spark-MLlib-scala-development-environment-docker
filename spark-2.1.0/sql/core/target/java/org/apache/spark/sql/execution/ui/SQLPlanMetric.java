package org.apache.spark.sql.execution.ui;
/**
 * Represent a metric in a SQLPlan.
 * <p>
 * Because we cannot revert our changes for an "Accumulator", we need to maintain accumulator
 * updates for each task. So that if a task is retried, we can simply override the old updates with
 * the new updates of the new attempt task. Since we cannot add them to accumulator, we need to use
 * "AccumulatorParam" to get the aggregation value.
 */
  class SQLPlanMetric implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  long accumulatorId ()  { throw new RuntimeException(); }
  public  java.lang.String metricType ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLPlanMetric (java.lang.String name, long accumulatorId, java.lang.String metricType)  { throw new RuntimeException(); }
}
