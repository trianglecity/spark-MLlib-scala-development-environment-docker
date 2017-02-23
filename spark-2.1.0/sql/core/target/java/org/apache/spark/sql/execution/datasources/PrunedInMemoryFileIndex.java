package org.apache.spark.sql.execution.datasources;
/**
 * An override of the standard HDFS listing based catalog, that overrides the partition spec with
 * the information from the metastore.
 * <p>
 * param:  tableBasePath The default base path of the Hive metastore table
 * param:  partitionSpec The partition specifications from Hive metastore
 */
public  class PrunedInMemoryFileIndex extends org.apache.spark.sql.execution.datasources.InMemoryFileIndex {
  public  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec ()  { throw new RuntimeException(); }
  // not preceding
  public   PrunedInMemoryFileIndex (org.apache.spark.sql.SparkSession sparkSession, org.apache.hadoop.fs.Path tableBasePath, org.apache.spark.sql.execution.datasources.FileStatusCache fileStatusCache, org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec)  { throw new RuntimeException(); }
}
