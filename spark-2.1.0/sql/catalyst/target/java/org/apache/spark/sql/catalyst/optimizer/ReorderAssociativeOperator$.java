package org.apache.spark.sql.catalyst.optimizer;
/**
 * Reorder associative integral-type operators and fold all constants into one.
 */
public  class ReorderAssociativeOperator$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReorderAssociativeOperator$ MODULE$ = null;
  public   ReorderAssociativeOperator$ ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> flattenAdd (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.expressions.ExpressionSet groupSet)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> flattenMultiply (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.expressions.ExpressionSet groupSet)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.ExpressionSet collectGroupingExpressions (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
