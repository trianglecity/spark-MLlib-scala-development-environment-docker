package org.apache.spark.sql.hive;
/**
 * A persistent implementation of the system catalog using Hive.
 * All public methods must be synchronized for thread-safety.
 */
  class HiveExternalCatalog extends org.apache.spark.sql.catalyst.catalog.ExternalCatalog implements org.apache.spark.internal.Logging {
  static public  java.lang.String SPARK_SQL_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_PROVIDER ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_NUMPARTS ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_NUMPARTCOLS ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_NUMSORTCOLS ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_NUMBUCKETS ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_NUMBUCKETCOLS ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_PART_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_PARTCOL_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_BUCKETCOL_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String DATASOURCE_SCHEMA_SORTCOL_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String STATISTICS_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String STATISTICS_TOTAL_SIZE ()  { throw new RuntimeException(); }
  static public  java.lang.String STATISTICS_NUM_ROWS ()  { throw new RuntimeException(); }
  static public  java.lang.String STATISTICS_COL_STATS_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String TABLE_PARTITION_PROVIDER ()  { throw new RuntimeException(); }
  static public  java.lang.String TABLE_PARTITION_PROVIDER_CATALOG ()  { throw new RuntimeException(); }
  static public  java.lang.String TABLE_PARTITION_PROVIDER_FILESYSTEM ()  { throw new RuntimeException(); }
  /**
   * Returns the fully qualified name used in table properties for a particular column stat.
   * For example, for column "mycol", and "min" stat, this should return
   * "spark.sql.statistics.colStats.mycol.min".
   * @param columnName (undocumented)
   * @param statKey (undocumented)
   * @return (undocumented)
   */
  static private  java.lang.String columnStatKeyPropName (java.lang.String columnName, java.lang.String statKey)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.types.StructType getSchemaFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> getColumnNamesByType (scala.collection.immutable.Map<java.lang.String, java.lang.String> props, java.lang.String colType, java.lang.String typeName)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> getPartitionColumnsFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
  static private  scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> getBucketSpecFromTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable metadata)  { throw new RuntimeException(); }
  static protected  void requireDbExists (java.lang.String db)  { throw new RuntimeException(); }
  static protected  void requireTableExists (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  static protected  void requireFunctionExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  static protected  void requireFunctionNotExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> listPartitionNames$default$3 ()  { throw new RuntimeException(); }
  static public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> listPartitions$default$3 ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public   HiveExternalCatalog (org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * A Hive client used to interact with the metastore.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.client.HiveClient client ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Set<java.lang.String> clientExceptions ()  { throw new RuntimeException(); }
  /**
   * Whether this is an exception thrown by the hive client that should be wrapped.
   * <p>
   * Due to classloader isolation issues, pattern matching won't work here so we need
   * to compare the canonical names of the exceptions, which we assume to be stable.
   * @param e (undocumented)
   * @return (undocumented)
   */
  private  boolean isClientException (java.lang.Throwable e)  { throw new RuntimeException(); }
  /**
   * Run some code involving <code>client</code> in a {@link synchronized} block and wrap certain
   * exceptions thrown in the process in {@link AnalysisException}.
   * @param body (undocumented)
   * @return (undocumented)
   */
  private <T extends java.lang.Object> T withClient (scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Get the raw table metadata from hive metastore directly. The raw table metadata may contains
   * special data source properties and should not be exposed outside of <code>HiveExternalCatalog</code>. We
   * should interpret these special data source properties and restore the original table metadata
   * before returning it.
   * @param db (undocumented)
   * @param table (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.catalog.CatalogTable getRawTable (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  /**
   * If the given table properties contains datasource properties, throw an exception. We will do
   * this check when create or alter a table, i.e. when we try to write table metadata to Hive
   * metastore.
   * @param table (undocumented)
   */
  private  void verifyTableProperties (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  public  void createDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropDatabase (java.lang.String db, boolean ignoreIfNotExists, boolean cascade)  { throw new RuntimeException(); }
  /**
   * Alter a database whose name matches the one specified in <code>dbDefinition</code>,
   * assuming the database exists.
   * <p>
   * Note: As of now, this only supports altering database properties!
   * @param dbDefinition (undocumented)
   */
  public  void alterDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogDatabase getDatabase (java.lang.String db)  { throw new RuntimeException(); }
  public  boolean databaseExists (java.lang.String db)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listDatabases ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listDatabases (java.lang.String pattern)  { throw new RuntimeException(); }
  public  void setCurrentDatabase (java.lang.String db)  { throw new RuntimeException(); }
  public  void createTable (org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  private  void createDataSourceTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table, boolean ignoreIfExists)  { throw new RuntimeException(); }
  /**
   * Data source tables may be non Hive compatible and we need to store table metadata in table
   * properties to workaround some Hive metastore limitations.
   * This method puts table schema, partition column names, bucket specification into a map, which
   * can be used as table properties later.
   * @param table (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.mutable.Map<java.lang.String, java.lang.String> tableMetaToTableProps (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  private  java.lang.String defaultTablePath (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  private  void saveTableIntoHive (org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropTable (java.lang.String db, java.lang.String table, boolean ignoreIfNotExists, boolean purge)  { throw new RuntimeException(); }
  public  void renameTable (java.lang.String db, java.lang.String oldName, java.lang.String newName)  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> getLocationFromStorageProps (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat updateLocationInStorageProps (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.Option<java.lang.String> newPath)  { throw new RuntimeException(); }
  /**
   * Alter a table whose name that matches the one specified in <code>tableDefinition</code>,
   * assuming the table exists.
   * <p>
   * Note: As of now, this doesn't support altering table schema, partition column names and bucket
   * specification. We will ignore them even if users do specify different values for these fields.
   * @param tableDefinition (undocumented)
   */
  public  void alterTable (org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable getTable (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> getTableOption (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  /**
   * Restores table metadata from the table properties if it's a datasouce table. This method is
   * kind of a opposite version of {@link createTable}.
   * <p>
   * It reads table schema, provider, partition column names and bucket specification from table
   * properties, and filter out these special entries from table properties.
   * @param inputTable (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.catalog.CatalogTable restoreTableMetadata (org.apache.spark.sql.catalyst.catalog.CatalogTable inputTable)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTable restoreHiveSerdeTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTable restoreDataSourceTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table, java.lang.String provider)  { throw new RuntimeException(); }
  public  boolean tableExists (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listTables (java.lang.String db)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listTables (java.lang.String db, java.lang.String pattern)  { throw new RuntimeException(); }
  public  void loadTable (java.lang.String db, java.lang.String table, java.lang.String loadPath, boolean isOverwrite, boolean holdDDLTime)  { throw new RuntimeException(); }
  public  void loadPartition (java.lang.String db, java.lang.String table, java.lang.String loadPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> partition, boolean isOverwrite, boolean holdDDLTime, boolean inheritTableSpecs)  { throw new RuntimeException(); }
  public  void loadDynamicPartitions (java.lang.String db, java.lang.String table, java.lang.String loadPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> partition, boolean replace, int numDP, boolean holdDDLTime)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> lowerCasePartitionSpec (scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> buildLowerCasePartColNameMap (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> restorePartitionSpec (scala.collection.immutable.Map<java.lang.String, java.lang.String> spec, scala.collection.immutable.Map<java.lang.String, java.lang.String> partColMap)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> restorePartitionSpec (scala.collection.immutable.Map<java.lang.String, java.lang.String> spec, scala.collection.Seq<java.lang.String> partCols)  { throw new RuntimeException(); }
  public  void createPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> parts, boolean ignoreIfNotExists, boolean purge, boolean retainData)  { throw new RuntimeException(); }
  public  void renamePartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> newSpecs)  { throw new RuntimeException(); }
  public  void alterPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> newParts)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition getPartition (java.lang.String db, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  { throw new RuntimeException(); }
  /**
   * Returns the specified partition or None if it does not exist.
   * @param db (undocumented)
   * @param table (undocumented)
   * @param spec (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> getPartitionOption (java.lang.String db, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  { throw new RuntimeException(); }
  /**
   * Returns the partition names from hive metastore for a given table in a database.
   * @param db (undocumented)
   * @param table (undocumented)
   * @param partialSpec (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> listPartitionNames (java.lang.String db, java.lang.String table, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partialSpec)  { throw new RuntimeException(); }
  /**
   * Returns the partitions from hive metastore for a given table in a database.
   * @param db (undocumented)
   * @param table (undocumented)
   * @param partialSpec (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> listPartitions (java.lang.String db, java.lang.String table, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partialSpec)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> listPartitionsByFilter (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates)  { throw new RuntimeException(); }
  public  void createFunction (java.lang.String db, org.apache.spark.sql.catalyst.catalog.CatalogFunction funcDefinition)  { throw new RuntimeException(); }
  public  void dropFunction (java.lang.String db, java.lang.String name)  { throw new RuntimeException(); }
  public  void renameFunction (java.lang.String db, java.lang.String oldName, java.lang.String newName)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogFunction getFunction (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  public  boolean functionExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listFunctions (java.lang.String db, java.lang.String pattern)  { throw new RuntimeException(); }
}
