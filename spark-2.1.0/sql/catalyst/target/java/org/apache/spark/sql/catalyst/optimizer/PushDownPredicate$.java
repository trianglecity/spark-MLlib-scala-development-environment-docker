package org.apache.spark.sql.catalyst.optimizer;
/**
 * Pushes {@link Filter} operators through many operators iff:
 * 1) the operator is deterministic
 * 2) the predicate is deterministic and the operator will not change any of rows.
 * <p>
 * This heuristic is valid assuming the expression evaluation cost is minimal.
 */
public  class PushDownPredicate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushDownPredicate$ MODULE$ = null;
  public   PushDownPredicate$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  boolean canPushThrough (org.apache.spark.sql.catalyst.plans.logical.UnaryNode p)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan pushDownPredicate (org.apache.spark.sql.catalyst.plans.logical.Filter filter, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan grandchild, scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> insertFilter)  { throw new RuntimeException(); }
  /**
   * Check if we can safely push a filter through a projection, by making sure that predicate
   * subqueries in the condition do not contain the same attributes as the plan they are moved
   * into. This can happen when the plan and predicate subquery have the same source.
   * @param plan (undocumented)
   * @param condition (undocumented)
   * @return (undocumented)
   */
  private  boolean canPushThroughCondition (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
}
