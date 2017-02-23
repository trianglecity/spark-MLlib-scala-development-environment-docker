package org.apache.spark.sql.execution;
public abstract class SparkStrategies extends org.apache.spark.sql.catalyst.planning.QueryPlanner<org.apache.spark.sql.execution.SparkPlan> {
  public   SparkStrategies ()  { throw new RuntimeException(); }
  /**
   * Plans special cases of limit operators.
   */
  public  class SpecialLimits extends org.apache.spark.sql.execution.SparkStrategy {
    public   SpecialLimits ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.SpecialLimits$ SpecialLimits ()  { throw new RuntimeException(); }
  /**
   * Select the proper physical plan for join based on joining keys and size of logical plan.
   * <p>
   * At first, uses the {@link ExtractEquiJoinKeys} pattern to find joins where at least some of the
   * predicates can be evaluated by matching join keys. If found,  Join implementations are chosen
   * with the following precedence:
   * <p>
   * - Broadcast: if one side of the join has an estimated physical size that is smaller than the
   *     user-configurable {@link SQLConf.AUTO_BROADCASTJOIN_THRESHOLD} threshold
   *     or if that side has an explicit broadcast hint (e.g. the user applied the
   *     {@link org.apache.spark.sql.functions.broadcast()} function to a DataFrame), then that side
   *     of the join will be broadcasted and the other side will be streamed, with no shuffling
   *     performed. If both sides of the join are eligible to be broadcasted then the
   * - Shuffle hash join: if the average size of a single partition is small enough to build a hash
   *     table.
   * - Sort merge: if the matching join keys are sortable.
   * <p>
   * If there is no joining keys, Join implementations are chosen with the following precedence:
   * - BroadcastNestedLoopJoin: if one side of the join could be broadcasted
   * - CartesianProduct: for Inner join
   * - BroadcastNestedLoopJoin
   */
  public  class JoinSelection extends org.apache.spark.sql.execution.SparkStrategy implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    public   JoinSelection ()  { throw new RuntimeException(); }
    /**
     * Matches a plan whose output should be small enough to be used in broadcast join.
     * @param plan (undocumented)
     * @return (undocumented)
     */
    private  boolean canBroadcast (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Matches a plan whose single partition should be small enough to build a hash table.
     * <p>
     * Note: this assume that the number of partition is fixed, requires additional work if it's
     * dynamic.
     * @param plan (undocumented)
     * @return (undocumented)
     */
    private  boolean canBuildLocalHashMap (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Returns whether plan a is much smaller (3X) than plan b.
     * <p>
     * The cost to build hash map is higher than sorting, we should only build hash map on a table
     * that is much smaller than other one. Since we does not have the statistic for number of rows,
     * use the size of bytes here as estimation.
     * @param a (undocumented)
     * @param b (undocumented)
     * @return (undocumented)
     */
    private  boolean muchSmaller (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan a, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan b)  { throw new RuntimeException(); }
    private  boolean canBuildRight (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
    private  boolean canBuildLeft (org.apache.spark.sql.catalyst.plans.JoinType joinType)  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.JoinSelection$ JoinSelection ()  { throw new RuntimeException(); }
  /**
   * Used to plan aggregation queries that are computed incrementally as part of a
   * {@link StreamingQuery}. Currently this rule is injected into the planner
   * on-demand, only when planning in a {@link org.apache.spark.sql.execution.streaming.StreamExecution}
   */
  public  class StatefulAggregationStrategy extends org.apache.spark.sql.execution.SparkStrategy {
    public   StatefulAggregationStrategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.StatefulAggregationStrategy$ StatefulAggregationStrategy ()  { throw new RuntimeException(); }
  /**
   * Used to plan the aggregate operator for expressions based on the AggregateFunction2 interface.
   */
  public  class Aggregation extends org.apache.spark.sql.execution.SparkStrategy {
    public   Aggregation ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.Aggregation$ Aggregation ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> singleRowRdd ()  { throw new RuntimeException(); }
  public  class InMemoryScans extends org.apache.spark.sql.execution.SparkStrategy {
    public   InMemoryScans ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.InMemoryScans$ InMemoryScans ()  { throw new RuntimeException(); }
  /**
   * This strategy is just for explaining <code>Dataset/DataFrame</code> created by <code>spark.readStream</code>.
   * It won't affect the execution, because <code>StreamingRelation</code> will be replaced with
   * <code>StreamingExecutionRelation</code> in <code>StreamingQueryManager</code> and <code>StreamingExecutionRelation</code> will
   * be replaced with the real relation using the <code>Source</code> in <code>StreamExecution</code>.
   */
  public  class StreamingRelationStrategy extends org.apache.spark.sql.execution.SparkStrategy {
    public   StreamingRelationStrategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.StreamingRelationStrategy$ StreamingRelationStrategy ()  { throw new RuntimeException(); }
  public  class BasicOperators extends org.apache.spark.sql.execution.SparkStrategy {
    public   BasicOperators ()  { throw new RuntimeException(); }
    public  int numPartitions ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.BasicOperators$ BasicOperators ()  { throw new RuntimeException(); }
  public  class DDLStrategy extends org.apache.spark.sql.execution.SparkStrategy {
    public   DDLStrategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.DDLStrategy$ DDLStrategy ()  { throw new RuntimeException(); }
}
