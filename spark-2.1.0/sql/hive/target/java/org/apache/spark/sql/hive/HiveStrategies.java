package org.apache.spark.sql.hive;
  interface HiveStrategies {
  public  org.apache.spark.sql.SparkSession sparkSession ()  ;
  public  class Scripts extends org.apache.spark.sql.execution.SparkStrategy {
    public   Scripts ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveStrategies.Scripts$ Scripts ()  ;
  public  class DataSinks extends org.apache.spark.sql.execution.SparkStrategy {
    public   DataSinks ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveStrategies.DataSinks$ DataSinks ()  ;
  /**
   * Retrieves data using a HiveTableScan.  Partition pruning predicates are also detected and
   * applied.
   */
  public  class HiveTableScans extends org.apache.spark.sql.execution.SparkStrategy {
    public   HiveTableScans ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveStrategies.HiveTableScans$ HiveTableScans ()  ;
}
