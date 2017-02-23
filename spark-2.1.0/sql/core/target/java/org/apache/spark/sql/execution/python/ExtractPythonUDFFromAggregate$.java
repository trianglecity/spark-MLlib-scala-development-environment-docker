package org.apache.spark.sql.execution.python;
/**
 * Extracts all the Python UDFs in logical aggregate, which depends on aggregate expression or
 * grouping key, evaluate them after aggregate.
 */
public  class ExtractPythonUDFFromAggregate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExtractPythonUDFFromAggregate$ MODULE$ = null;
  public   ExtractPythonUDFFromAggregate$ ()  { throw new RuntimeException(); }
  /**
   * Returns whether the expression could only be evaluated within aggregate.
   * @param e (undocumented)
   * @param agg (undocumented)
   * @return (undocumented)
   */
  private  boolean belongAggregate (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
  private  boolean hasPythonUdfOverAggregate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan extract (org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
