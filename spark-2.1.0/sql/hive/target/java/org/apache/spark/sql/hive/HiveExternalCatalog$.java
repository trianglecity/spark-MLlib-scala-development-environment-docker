package org.apache.spark.sql.hive;
public  class HiveExternalCatalog$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveExternalCatalog$ MODULE$ = null;
  public   HiveExternalCatalog$ ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_SQL_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_PROVIDER ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMPARTS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMPARTCOLS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMSORTCOLS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMBUCKETS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_NUMBUCKETCOLS ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_PART_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_PARTCOL_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_BUCKETCOL_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String DATASOURCE_SCHEMA_SORTCOL_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String STATISTICS_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String STATISTICS_TOTAL_SIZE ()  { throw new RuntimeException(); }
  public  java.lang.String STATISTICS_NUM_ROWS ()  { throw new RuntimeException(); }
  public  java.lang.String STATISTICS_COL_STATS_PREFIX ()  { throw new RuntimeException(); }
  public  java.lang.String TABLE_PARTITION_PROVIDER ()  { throw new RuntimeException(); }
  public  java.lang.String TABLE_PARTITION_PROVIDER_CATALOG ()  { throw new RuntimeException(); }
  public  java.lang.String TABLE_PARTITION_PROVIDER_FILESYSTEM ()  { throw new RuntimeException(); }
  /**
   * Returns the fully qualified name used in table properties for a particular column stat.
   * For example, for column "mycol", and "min" stat, this should return
   * "spark.sql.statistics.colStats.mycol.min".
   * @param columnName (undocumented)
   * @param statKey (undocumented)
   * @return (undocumented)
   */
  private  java.lang.String columnStatKeyPropName (java.lang.String columnName, java.lang.String statKey)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructType getSchemaFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> getColumnNamesByType (scala.collection.immutable.Map<java.lang.String, java.lang.String> props, java.lang.String colType, java.lang.String typeName)  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> getPartitionColumnsFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> getBucketSpecFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
}
