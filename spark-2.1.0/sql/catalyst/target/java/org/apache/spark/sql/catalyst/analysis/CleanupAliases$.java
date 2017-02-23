package org.apache.spark.sql.catalyst.analysis;
/**
 * Cleans up unnecessary Aliases inside the plan. Basically we only need Alias as a top level
 * expression in Project(project list) or Aggregate(aggregate expressions) or
 * Window(window expressions).
 */
public  class CleanupAliases$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CleanupAliases$ MODULE$ = null;
  public   CleanupAliases$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Expression trimAliases (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression trimNonTopLevelAliases (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
