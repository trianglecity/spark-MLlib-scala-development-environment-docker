package org.apache.spark.sql.catalyst.optimizer;
/**
 * Pushes down {@link Filter} operators where the <code>condition</code> can be
 * evaluated using only the attributes of the left or right side of a join.  Other
 * {@link Filter} conditions are moved into the <code>condition</code> of the {@link Join}.
 * <p>
 * And also pushes down the join filter, where the <code>condition</code> can be evaluated using only the
 * attributes of the left or right side of sub query when applicable.
 * <p>
 * Check https://cwiki.apache.org/confluence/display/Hive/OuterJoinBehavior for more details
 */
public  class PushPredicateThroughJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushPredicateThroughJoin$ MODULE$ = null;
  public   PushPredicateThroughJoin$ ()  { throw new RuntimeException(); }
  /**
   * Splits join condition expressions or filter predicates (on a given join's output) into three
   * categories based on the attributes required to evaluate them. Note that we explicitly exclude
   * on-deterministic (i.e., stateful) condition expressions in canEvaluateInLeft or
   * canEvaluateInRight to prevent pushing these predicates on either side of the join.
   * <p>
   * @return (canEvaluateInLeft, canEvaluateInRight, haveToEvaluateInBoth)
   * @param condition (undocumented)
   * @param left (undocumented)
   * @param right (undocumented)
   */
  private  scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> split (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> condition, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
