package org.apache.spark.sql.execution.datasources;
/**
 * Replaces {@link SimpleCatalogRelation} with data source table if its table property contains data
 * source information.
 */
public  class FindDataSourceTable extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  public   FindDataSourceTable (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan readDataSourceTable (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.catalog.SimpleCatalogRelation simpleCatalogRelation)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
