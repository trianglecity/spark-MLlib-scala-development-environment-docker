package org.apache.spark.sql.execution.ui;
public  class SparkPlanGraph$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkPlanGraph$ MODULE$ = null;
  public   SparkPlanGraph$ ()  { throw new RuntimeException(); }
  /**
   * Build a SparkPlanGraph from the root of a SparkPlan tree.
   * @param planInfo (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.ui.SparkPlanGraph apply (org.apache.spark.sql.execution.SparkPlanInfo planInfo)  { throw new RuntimeException(); }
  private  void buildSparkPlanGraphNode (org.apache.spark.sql.execution.SparkPlanInfo planInfo, java.util.concurrent.atomic.AtomicLong nodeIdGenerator, scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.execution.ui.SparkPlanGraphNode> nodes, scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.execution.ui.SparkPlanGraphEdge> edges, org.apache.spark.sql.execution.ui.SparkPlanGraphNode parent, org.apache.spark.sql.execution.ui.SparkPlanGraphCluster subgraph, scala.collection.mutable.HashMap<org.apache.spark.sql.execution.SparkPlanInfo, org.apache.spark.sql.execution.ui.SparkPlanGraphNode> exchanges)  { throw new RuntimeException(); }
}
