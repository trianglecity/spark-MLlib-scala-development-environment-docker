package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A convenient converter class for Parquet group types with a {@link HasParentContainerUpdater}.
 */
 abstract class ParquetGroupConverter extends org.apache.parquet.io.api.GroupConverter implements org.apache.spark.sql.execution.datasources.parquet.HasParentContainerUpdater {
  public  org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater ()  { throw new RuntimeException(); }
  // not preceding
  public   ParquetGroupConverter (org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
}
