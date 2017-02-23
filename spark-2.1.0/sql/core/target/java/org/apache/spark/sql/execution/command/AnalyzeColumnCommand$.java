package org.apache.spark.sql.execution.command;
public  class AnalyzeColumnCommand$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AnalyzeColumnCommand$ MODULE$ = null;
  public   AnalyzeColumnCommand$ ()  { throw new RuntimeException(); }
  /**
   * Compute stats for the given columns.
   * @return (row count, map from column name to ColumnStats)
   * <p>
   * This is visible for testing.
   * @param sparkSession (undocumented)
   * @param tableName (undocumented)
   * @param relation (undocumented)
   * @param columnNames (undocumented)
   */
  public  scala.Tuple2<java.lang.Object, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.ColumnStat>> computeColumnStats (org.apache.spark.sql.SparkSession sparkSession, java.lang.String tableName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan relation, scala.collection.Seq<java.lang.String> columnNames)  { throw new RuntimeException(); }
}
