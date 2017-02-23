package org.apache.spark.sql.catalyst.optimizer;
/**
 * Abstract class all optimizers should inherit of, contains the standard batches (extending
 * Optimizers can override this.
 */
public abstract class Optimizer extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  public   Optimizer (org.apache.spark.sql.catalyst.catalog.SessionCatalog sessionCatalog, org.apache.spark.sql.catalyst.CatalystConf conf)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.FixedPoint fixedPoint ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
  /**
   * Optimize all the subqueries inside expression.
   */
  public  class OptimizeSubqueries extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   OptimizeSubqueries ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.optimizer.Optimizer.OptimizeSubqueries$ OptimizeSubqueries ()  { throw new RuntimeException(); }
}
