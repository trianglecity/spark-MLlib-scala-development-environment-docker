package org.apache.spark.sql.catalyst.optimizer;
/**
 * Finds all {@link RuntimeReplaceable} expressions and replace them with the expressions that can
 * be evaluated. This is mainly used to provide compatibility with other databases.
 * For example, we use this to support "nvl" by replacing it with "coalesce".
 */
public  class ReplaceExpressions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReplaceExpressions$ MODULE$ = null;
  public   ReplaceExpressions$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
