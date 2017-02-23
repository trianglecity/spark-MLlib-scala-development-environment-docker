package org.apache.spark.sql.catalyst.optimizer;
/**
 * Pushes Project operator to both sides of a Union operator.
 * Operations that are safe to pushdown are listed as follows.
 * Union:
 * Right now, Union means UNION ALL, which does not de-duplicate rows. So, it is
 * safe to pushdown Filters and Projections through it. Filter pushdown is handled by another
 * rule PushDownPredicate. Once we add UNION DISTINCT, we will not be able to pushdown Projections.
 */
public  class PushProjectionThroughUnion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushProjectionThroughUnion$ MODULE$ = null;
  public   PushProjectionThroughUnion$ ()  { throw new RuntimeException(); }
  /**
   * Maps Attributes from the left side to the corresponding Attribute on the right side.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Attribute> buildRewrites (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  /**
   * Rewrites an expression so that it can be pushed to the right side of a
   * Union or Except operator. This method relies on the fact that the output attributes
   * of a union/intersect/except are always equal to the left child's output.
   * @param e (undocumented)
   * @param rewrites (undocumented)
   * @return (undocumented)
   */
  private <A extends org.apache.spark.sql.catalyst.expressions.Expression> A pushToRight (A e, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Attribute> rewrites)  { throw new RuntimeException(); }
  /**
   * Splits the condition expression into small conditions by <code>And</code>, and partition them by
   * deterministic, and finally recombine them by <code>And</code>. It returns an expression containing
   * all deterministic expressions (the first field of the returned Tuple2) and an expression
   * containing all non-deterministic expressions (the second field of the returned Tuple2).
   * @param condition (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> partitionByDeterministic (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
