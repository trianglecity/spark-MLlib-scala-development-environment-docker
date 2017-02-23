package org.apache.spark.sql.catalyst.optimizer;
/**
 * Pushes down {@link LocalLimit} beneath UNION ALL and beneath the streamed inputs of outer joins.
 */
public  class LimitPushDown$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LimitPushDown$ MODULE$ = null;
  public   LimitPushDown$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan stripGlobalLimitIfPresent (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan maybePushLimit (org.apache.spark.sql.catalyst.expressions.Expression limitExp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
