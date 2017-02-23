package org.apache.spark.sql.execution.ui;
/**
 * Represent a tree of SparkPlan for WholeStageCodegen.
 */
  class SparkPlanGraphCluster extends org.apache.spark.sql.execution.ui.SparkPlanGraphNode {
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.execution.ui.SparkPlanGraphNode> nodes ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkPlanGraphCluster (long id, java.lang.String name, java.lang.String desc, scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.execution.ui.SparkPlanGraphNode> nodes, scala.collection.Seq<org.apache.spark.sql.execution.ui.SQLPlanMetric> metrics)  { throw new RuntimeException(); }
  public  java.lang.String makeDotNode (scala.collection.immutable.Map<java.lang.Object, java.lang.String> metricsValue)  { throw new RuntimeException(); }
}
