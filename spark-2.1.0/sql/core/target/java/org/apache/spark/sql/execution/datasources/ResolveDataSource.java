package org.apache.spark.sql.execution.datasources;
/**
 * Try to replaces {@link UnresolvedRelation}s with {@link ResolveDataSource}.
 */
public  class ResolveDataSource extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  public   ResolveDataSource (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
