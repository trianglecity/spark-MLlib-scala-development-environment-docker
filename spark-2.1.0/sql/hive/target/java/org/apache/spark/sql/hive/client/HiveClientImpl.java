package org.apache.spark.sql.hive.client;
/**
 * A class that wraps the HiveClient and converts its responses to externally visible classes.
 * Note that this class is typically loaded with an internal classloader for each instantiation,
 * allowing it to interact directly with a specific isolated version of Hive.  Loading this class
 * with the isolated classloader however will result in it only being visible as a {@link HiveClient},
 * not a {@link HiveClientImpl}.
 * <p>
 * This class needs to interact with multiple versions of Hive, but will always be compiled with
 * the 'native', execution version of Hive.  Therefore, any places where hive breaks compatibility
 * must use reflection after matching on <code>version</code>.
 * <p>
 * Every HiveClientImpl creates an internal HiveConf object. This object is using the given
 * <code>hadoopConf</code> as the base. All options set in the <code>sparkConf</code> will be applied to the HiveConf
 * object and overrides any exiting options. Then, options in extraConfig will be applied
 * to the HiveConf object and overrides any existing options.
 * <p>
 * param:  version the version of hive used when pick function calls that are not compatible.
 * param:  sparkConf all configuration options set in SparkConf.
 * param:  hadoopConf the base Configuration object used by the HiveConf created inside
 *                   this HiveClientImpl.
 * param:  extraConfig a collection of configuration options that will be added to the
 *                hive conf before opening the hive client.
 * param:  initClassLoader the classloader used when creating the <code>state</code> field of
 *                        this {@link HiveClientImpl}.
 */
  class HiveClientImpl implements org.apache.spark.sql.hive.client.HiveClient, org.apache.spark.internal.Logging {
  public  org.apache.spark.sql.hive.client.HiveVersion version ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.client.IsolatedClientLoader clientLoader ()  { throw new RuntimeException(); }
  // not preceding
  public   HiveClientImpl (org.apache.spark.sql.hive.client.HiveVersion version, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.immutable.Map<java.lang.String, java.lang.String> extraConfig, java.lang.ClassLoader initClassLoader, org.apache.spark.sql.hive.client.IsolatedClientLoader clientLoader)  { throw new RuntimeException(); }
  private  org.apache.spark.util.CircularBuffer outputBuffer ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.hive.client.Shim_v0_12 shim ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.session.SessionState state ()  { throw new RuntimeException(); }
  /** Returns the configuration for the current session. */
  public  org.apache.hadoop.hive.conf.HiveConf conf ()  { throw new RuntimeException(); }
  public  java.lang.String getConf (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  private  int retryLimit ()  { throw new RuntimeException(); }
  private  long retryDelayMillis ()  { throw new RuntimeException(); }
  /**
   * Runs <code>f</code> with multiple retries in case the hive metastore is temporarily unreachable.
   * @param f (undocumented)
   * @return (undocumented)
   */
  private <A extends java.lang.Object> A retryLocked (scala.Function0<A> f)  { throw new RuntimeException(); }
  private  boolean causedByThrift (java.lang.Throwable e)  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.metadata.Hive client ()  { throw new RuntimeException(); }
  /**
   * Runs <code>f</code> with ThreadLocal session state and classloaders configured for this version of hive.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <A extends java.lang.Object> A withHiveState (scala.Function0<A> f)  { throw new RuntimeException(); }
  public  void setOut (java.io.PrintStream stream)  { throw new RuntimeException(); }
  public  void setInfo (java.io.PrintStream stream)  { throw new RuntimeException(); }
  public  void setError (java.io.PrintStream stream)  { throw new RuntimeException(); }
  public  void setCurrentDatabase (java.lang.String databaseName)  { throw new RuntimeException(); }
  public  void createDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase database, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropDatabase (java.lang.String name, boolean ignoreIfNotExists, boolean cascade)  { throw new RuntimeException(); }
  public  void alterDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase database)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogDatabase> getDatabaseOption (java.lang.String name)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listDatabases (java.lang.String pattern)  { throw new RuntimeException(); }
  public  boolean tableExists (java.lang.String dbName, java.lang.String tableName)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> getTableOption (java.lang.String dbName, java.lang.String tableName)  { throw new RuntimeException(); }
  public  void createTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropTable (java.lang.String dbName, java.lang.String tableName, boolean ignoreIfNotExists, boolean purge)  { throw new RuntimeException(); }
  public  void alterTable (java.lang.String tableName, org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  public  void createPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, boolean ignoreIfNotExists, boolean purge, boolean retainData)  { throw new RuntimeException(); }
  public  void renamePartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> newSpecs)  { throw new RuntimeException(); }
  public  void alterPartitions (java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> newParts)  { throw new RuntimeException(); }
  /**
   * Returns the partition names for the given table that match the supplied partition spec.
   * If no partition spec is specified, all partitions are returned.
   * <p>
   * The returned sequence is sorted as strings.
   * @param table (undocumented)
   * @param partialSpec (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> getPartitionNames (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partialSpec)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> getPartitionOption (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  { throw new RuntimeException(); }
  /**
   * Returns the partitions for the given table that match the supplied partition spec.
   * If no partition spec is specified, all partitions are returned.
   * @param table (undocumented)
   * @param spec (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> getPartitions (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> spec)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> getPartitionsByFilter (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listTables (java.lang.String dbName)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listTables (java.lang.String dbName, java.lang.String pattern)  { throw new RuntimeException(); }
  /**
   * Runs the specified SQL query using Hive.
   * @param sql (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> runSqlHive (java.lang.String sql)  { throw new RuntimeException(); }
  /**
   * Execute the command using Hive and return the results as a sequence. Each element
   * in the sequence is one row.
   * @param cmd (undocumented)
   * @param maxRows (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<java.lang.String> runHive (java.lang.String cmd, int maxRows)  { throw new RuntimeException(); }
  public  void loadPartition (java.lang.String loadPath, java.lang.String dbName, java.lang.String tableName, java.util.LinkedHashMap<java.lang.String, java.lang.String> partSpec, boolean replace, boolean holdDDLTime, boolean inheritTableSpecs)  { throw new RuntimeException(); }
  public  void loadTable (java.lang.String loadPath, java.lang.String tableName, boolean replace, boolean holdDDLTime)  { throw new RuntimeException(); }
  public  void loadDynamicPartitions (java.lang.String loadPath, java.lang.String dbName, java.lang.String tableName, java.util.LinkedHashMap<java.lang.String, java.lang.String> partSpec, boolean replace, int numDP, boolean holdDDLTime)  { throw new RuntimeException(); }
  public  void createFunction (java.lang.String db, org.apache.spark.sql.catalyst.catalog.CatalogFunction func)  { throw new RuntimeException(); }
  public  void dropFunction (java.lang.String db, java.lang.String name)  { throw new RuntimeException(); }
  public  void renameFunction (java.lang.String db, java.lang.String oldName, java.lang.String newName)  { throw new RuntimeException(); }
  public  void alterFunction (java.lang.String db, org.apache.spark.sql.catalyst.catalog.CatalogFunction func)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogFunction> getFunctionOption (java.lang.String db, java.lang.String name)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listFunctions (java.lang.String db, java.lang.String pattern)  { throw new RuntimeException(); }
  public  void addJar (java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.client.HiveClientImpl newSession ()  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  private  java.lang.Class<? extends org.apache.hadoop.mapred.InputFormat<?, ?>> toInputFormat (java.lang.String name)  { throw new RuntimeException(); }
  private  java.lang.Class<? extends org.apache.hadoop.hive.ql.io.HiveOutputFormat<?, ?>> toOutputFormat (java.lang.String name)  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.metastore.api.FieldSchema toHiveColumn (org.apache.spark.sql.types.StructField c)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.types.StructField fromHiveColumn (org.apache.hadoop.hive.metastore.api.FieldSchema hc)  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.metadata.Table toHiveTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.ql.metadata.Partition toHivePartition (org.apache.spark.sql.catalyst.catalog.CatalogTablePartition p, org.apache.hadoop.hive.ql.metadata.Table ht)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition fromHivePartition (org.apache.hadoop.hive.ql.metadata.Partition hp)  { throw new RuntimeException(); }
}
