package org.apache.spark.sql.hive;
/**
 * Legacy catalog for interacting with the Hive metastore.
 * <p>
 * This is still used for things like creating data source tables, but in the future will be
 * cleaned up to integrate more nicely with {@link HiveExternalCatalog}.
 */
  class HiveMetastoreCatalog implements org.apache.spark.internal.Logging {
  public   HiveMetastoreCatalog (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.HiveSessionState sessionState ()  { throw new RuntimeException(); }
  /** A fully qualified identifier for a table (i.e., database.tableName) */
  public  class QualifiedTableName implements scala.Product, scala.Serializable {
    public  java.lang.String database ()  { throw new RuntimeException(); }
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   QualifiedTableName (java.lang.String database, java.lang.String name)  { throw new RuntimeException(); }
  }
  public  class QualifiedTableName extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.hive.HiveMetastoreCatalog.QualifiedTableName> implements scala.Serializable {
    public   QualifiedTableName ()  { throw new RuntimeException(); }
  }
  private  java.lang.String getCurrentDatabase ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog.QualifiedTableName getQualifiedTableName (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  /** A cache of Spark SQL data source tables that have been accessed. */
  protected  com.google.common.cache.LoadingCache<org.apache.spark.sql.hive.HiveMetastoreCatalog.QualifiedTableName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> cachedDataSourceTables ()  { throw new RuntimeException(); }
  public  void refreshTable (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  public  java.lang.String hiveDefaultTableFilePath (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<java.lang.String> alias)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.execution.datasources.LogicalRelation> getCached (org.apache.spark.sql.hive.HiveMetastoreCatalog.QualifiedTableName tableIdentifier, scala.collection.Seq<org.apache.hadoop.fs.Path> pathsInMetastore, org.apache.spark.sql.hive.MetastoreRelation metastoreRelation, org.apache.spark.sql.types.StructType schemaInMetastore, java.lang.Class<? extends org.apache.spark.sql.execution.datasources.FileFormat> expectedFileFormat, scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> expectedBucketSpec, scala.Option<org.apache.spark.sql.types.StructType> partitionSchema)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.LogicalRelation convertToLogicalRelation (org.apache.spark.sql.hive.MetastoreRelation metastoreRelation, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.execution.datasources.FileFormat defaultSource, java.lang.Class<? extends org.apache.spark.sql.execution.datasources.FileFormat> fileFormatClass, java.lang.String fileType)  { throw new RuntimeException(); }
  /**
   * When scanning or writing to non-partitioned Metastore Parquet tables, convert them to Parquet
   * data source relations for better performance.
   */
  public  class ParquetConversions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ParquetConversions ()  { throw new RuntimeException(); }
    private  boolean shouldConvertMetastoreParquet (org.apache.spark.sql.hive.MetastoreRelation relation)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.datasources.LogicalRelation convertToParquetRelation (org.apache.spark.sql.hive.MetastoreRelation relation)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog.ParquetConversions$ ParquetConversions ()  { throw new RuntimeException(); }
  /**
   * When scanning Metastore ORC tables, convert them to ORC data source relations
   * for better performance.
   */
  public  class OrcConversions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   OrcConversions ()  { throw new RuntimeException(); }
    private  boolean shouldConvertMetastoreOrc (org.apache.spark.sql.hive.MetastoreRelation relation)  { throw new RuntimeException(); }
    private  org.apache.spark.sql.execution.datasources.LogicalRelation convertToOrcRelation (org.apache.spark.sql.hive.MetastoreRelation relation)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog.OrcConversions$ OrcConversions ()  { throw new RuntimeException(); }
}
