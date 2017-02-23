package org.apache.spark.sql.execution.metric;
public  class SQLMetrics {
  static private  java.lang.String SUM_METRIC ()  { throw new RuntimeException(); }
  static private  java.lang.String SIZE_METRIC ()  { throw new RuntimeException(); }
  static private  java.lang.String TIMING_METRIC ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.metric.SQLMetric createMetric (org.apache.spark.SparkContext sc, java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Create a metric to report the size information (including total, min, med, max) like data size,
   * spill size, etc.
   * @param sc (undocumented)
   * @param name (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.metric.SQLMetric createSizeMetric (org.apache.spark.SparkContext sc, java.lang.String name)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.metric.SQLMetric createTimingMetric (org.apache.spark.SparkContext sc, java.lang.String name)  { throw new RuntimeException(); }
  /**
   * A function that defines how we aggregate the final accumulator results among all tasks,
   * and represent it in string for a SQL physical operator.
   * @param metricsType (undocumented)
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String stringValue (java.lang.String metricsType, scala.collection.Seq<java.lang.Object> values)  { throw new RuntimeException(); }
}
