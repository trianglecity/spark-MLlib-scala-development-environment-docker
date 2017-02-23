package org.apache.spark.sql.execution.streaming;
/**
 * A variant of {@link QueryExecution} that allows the execution of the given {@link LogicalPlan}
 * plan incrementally. Possibly preserving state in between each execution.
 */
public  class IncrementalExecution extends org.apache.spark.sql.execution.QueryExecution implements org.apache.spark.internal.Logging {
  public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointLocation ()  { throw new RuntimeException(); }
  public  long currentBatchId ()  { throw new RuntimeException(); }
  public  long currentEventTimeWatermark ()  { throw new RuntimeException(); }
  // not preceding
  public   IncrementalExecution (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan, org.apache.spark.sql.streaming.OutputMode outputMode, java.lang.String checkpointLocation, long currentBatchId, long currentEventTimeWatermark)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkStrategy> stateStrategy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlanner planner ()  { throw new RuntimeException(); }
  /**
   * See [SPARK-18339]
   * Walk the optimized logical plan and replace CurrentBatchTimestamp
   * with the desired literal
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimizedPlan ()  { throw new RuntimeException(); }
  /**
   * Records the current id for a given stateful operator in the query plan as the <code>state</code>
   * preparation walks the query plan.
   * @return (undocumented)
   */
  private  int operatorId ()  { throw new RuntimeException(); }
  /** Locates save/restore pairs surrounding aggregation. */
  public  org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> state ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> preparations ()  { throw new RuntimeException(); }
  /** No need assert supported, as this check has already been done */
  public  void assertSupported ()  { throw new RuntimeException(); }
}
