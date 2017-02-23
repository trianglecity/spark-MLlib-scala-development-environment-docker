package org.apache.spark.sql.catalyst.optimizer;
/**
 * Attempts to eliminate the reading of unneeded columns from the query plan.
 * <p>
 * Since adding Project before Filter conflicts with PushPredicatesThroughProject, this rule will
 * remove the Project p2 in the following pattern:
 * <p>
 *   p1 @ Project(_, Filter(_, p2 @ Project(_, child))) if p2.outputSet.subsetOf(p2.inputSet)
 * <p>
 * p2 is usually inserted by this rule and useless, p1 could prune the columns anyway.
 */
public  class ColumnPruning$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ColumnPruning$ MODULE$ = null;
  public   ColumnPruning$ ()  { throw new RuntimeException(); }
  private  boolean sameOutput (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output1, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /** Applies a projection only when the child is producing unnecessary attributes */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan prunedChild (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan c, org.apache.spark.sql.catalyst.expressions.AttributeSet allReferences)  { throw new RuntimeException(); }
  /**
   * The Project before Filter is not necessary but conflict with PushPredicatesThroughProject,
   * so remove it.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan removeProjectBeforeFilter (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
