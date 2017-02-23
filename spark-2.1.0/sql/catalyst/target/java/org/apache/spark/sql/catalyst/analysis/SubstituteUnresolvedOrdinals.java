package org.apache.spark.sql.catalyst.analysis;
/**
 * Replaces ordinal in 'order by' or 'group by' with UnresolvedOrdinal expression.
 */
public  class SubstituteUnresolvedOrdinals extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  public   SubstituteUnresolvedOrdinals (org.apache.spark.sql.catalyst.CatalystConf conf)  { throw new RuntimeException(); }
  private  boolean isIntLiteral (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
