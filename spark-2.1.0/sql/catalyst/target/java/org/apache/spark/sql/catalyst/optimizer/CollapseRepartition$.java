package org.apache.spark.sql.catalyst.optimizer;
/**
 * Combines adjacent {@link Repartition} and {@link RepartitionByExpression} operator combinations
 * by keeping only the one.
 * 1. For adjacent {@link Repartition}s, collapse into the last {@link Repartition}.
 * 2. For adjacent {@link RepartitionByExpression}s, collapse into the last {@link RepartitionByExpression}.
 * 3. For a combination of {@link Repartition} and {@link RepartitionByExpression}, collapse as a single
 *    {@link RepartitionByExpression} with the expression and last number of partition.
 */
public  class CollapseRepartition$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CollapseRepartition$ MODULE$ = null;
  public   CollapseRepartition$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
