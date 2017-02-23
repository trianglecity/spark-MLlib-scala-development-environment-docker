package org.apache.spark.sql.catalyst.catalog;
/**
 * An internal catalog that is used by a Spark Session. This internal catalog serves as a
 * proxy to the underlying metastore (e.g. Hive Metastore) and it also manages temporary
 * tables and functions of the Spark Session that it belongs to.
 * <p>
 * This class must be thread-safe.
 */
public  class SessionCatalog implements org.apache.spark.internal.Logging {
  static public  java.lang.String DEFAULT_DATABASE ()  { throw new RuntimeException(); }
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
  public   SessionCatalog (org.apache.spark.sql.catalyst.catalog.ExternalCatalog externalCatalog, org.apache.spark.sql.catalyst.catalog.GlobalTempViewManager globalTempViewManager, org.apache.spark.sql.catalyst.catalog.FunctionResourceLoader functionResourceLoader, org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry, org.apache.spark.sql.catalyst.CatalystConf conf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public   SessionCatalog (org.apache.spark.sql.catalyst.catalog.ExternalCatalog externalCatalog, org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry, org.apache.spark.sql.catalyst.CatalystConf conf)  { throw new RuntimeException(); }
  public   SessionCatalog (org.apache.spark.sql.catalyst.catalog.ExternalCatalog externalCatalog)  { throw new RuntimeException(); }
  /** List of temporary tables, mapping from table name to their logical plan. */
  protected  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> tempTables ()  { throw new RuntimeException(); }
  protected  java.lang.String currentDb ()  { throw new RuntimeException(); }
  /**
   * Checks if the given name conforms the Hive standard ("[a-zA-z_0-9]+"),
   * i.e. if this name only contains characters, numbers, and _.
   * <p>
   * This method is intended to have the same behavior of
   * org.apache.hadoop.hive.metastore.MetaStoreUtils.validateName.
   * @param name (undocumented)
   */
  private  void validateName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Format table name, taking into account case sensitivity.
   * @param name (undocumented)
   * @return (undocumented)
   */
  protected  java.lang.String formatTableName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Format database name, taking into account case sensitivity.
   * @param name (undocumented)
   * @return (undocumented)
   */
  protected  java.lang.String formatDatabaseName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * This method is used to make the given path qualified before we
   * store this path in the underlying external catalog. So, when a path
   * does not contain a scheme, this path will not be changed after the default
   * FileSystem is changed.
   * @param path (undocumented)
   * @return (undocumented)
   */
  private  org.apache.hadoop.fs.Path makeQualifiedPath (java.lang.String path)  { throw new RuntimeException(); }
  private  void requireDbExists (java.lang.String db)  { throw new RuntimeException(); }
  private  void requireTableExists (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  private  void requireTableNotExists (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  public  void createDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  public  void dropDatabase (java.lang.String db, boolean ignoreIfNotExists, boolean cascade)  { throw new RuntimeException(); }
  public  void alterDatabase (org.apache.spark.sql.catalyst.catalog.CatalogDatabase dbDefinition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogDatabase getDatabaseMetadata (java.lang.String db)  { throw new RuntimeException(); }
  public  boolean databaseExists (java.lang.String db)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listDatabases ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> listDatabases (java.lang.String pattern)  { throw new RuntimeException(); }
  public  java.lang.String getCurrentDatabase ()  { throw new RuntimeException(); }
  public  void setCurrentDatabase (java.lang.String db)  { throw new RuntimeException(); }
  /**
   * Get the path for creating a non-default database when database location is not provided
   * by users.
   * @param db (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getDefaultDBPath (java.lang.String db)  { throw new RuntimeException(); }
  /**
   * Create a metastore table in the database specified in <code>tableDefinition</code>.
   * If no such database is specified, create it in the current database.
   * @param tableDefinition (undocumented)
   * @param ignoreIfExists (undocumented)
   */
  public  void createTable (org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  /**
   * Alter the metadata of an existing metastore table identified by <code>tableDefinition</code>.
   * <p>
   * If no database is specified in <code>tableDefinition</code>, assume the table is in the
   * current database.
   * <p>
   * Note: If the underlying implementation does not support altering a certain field,
   * this becomes a no-op.
   * @param tableDefinition (undocumented)
   */
  public  void alterTable (org.apache.spark.sql.catalyst.catalog.CatalogTable tableDefinition)  { throw new RuntimeException(); }
  /**
   * Return whether a table/view with the specified name exists. If no database is specified, check
   * with current database.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean tableExists (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  /**
   * Retrieve the metadata of an existing permanent table/view. If no database is specified,
   * assume the table/view is in the current database. If the specified table/view is not found
   * in the database then a {@link NoSuchTableException} is thrown.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable getTableMetadata (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  /**
   * Retrieve the metadata of an existing metastore table.
   * If no database is specified, assume the table is in the current database.
   * If the specified table is not found in the database then return None if it doesn't exist.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> getTableMetadataOption (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  /**
   * Load files stored in given path into an existing metastore table.
   * If no database is specified, assume the table is in the current database.
   * If the specified table is not found in the database then a {@link NoSuchTableException} is thrown.
   * @param name (undocumented)
   * @param loadPath (undocumented)
   * @param isOverwrite (undocumented)
   * @param holdDDLTime (undocumented)
   */
  public  void loadTable (org.apache.spark.sql.catalyst.TableIdentifier name, java.lang.String loadPath, boolean isOverwrite, boolean holdDDLTime)  { throw new RuntimeException(); }
  /**
   * Load files stored in given path into the partition of an existing metastore table.
   * If no database is specified, assume the table is in the current database.
   * If the specified table is not found in the database then a {@link NoSuchTableException} is thrown.
   * @param name (undocumented)
   * @param loadPath (undocumented)
   * @param partition (undocumented)
   * @param isOverwrite (undocumented)
   * @param holdDDLTime (undocumented)
   * @param inheritTableSpecs (undocumented)
   */
  public  void loadPartition (org.apache.spark.sql.catalyst.TableIdentifier name, java.lang.String loadPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> partition, boolean isOverwrite, boolean holdDDLTime, boolean inheritTableSpecs)  { throw new RuntimeException(); }
  public  java.lang.String defaultTablePath (org.apache.spark.sql.catalyst.TableIdentifier tableIdent)  { throw new RuntimeException(); }
  /**
   * Create a local temporary view.
   * @param name (undocumented)
   * @param tableDefinition (undocumented)
   * @param overrideIfExists (undocumented)
   */
  public  void createTempView (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan tableDefinition, boolean overrideIfExists)  { throw new RuntimeException(); }
  /**
   * Create a global temporary view.
   * @param name (undocumented)
   * @param viewDefinition (undocumented)
   * @param overrideIfExists (undocumented)
   */
  public  void createGlobalTempView (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan viewDefinition, boolean overrideIfExists)  { throw new RuntimeException(); }
  /**
   * Alter the definition of a local/global temp view matching the given name, returns true if a
   * temp view is matched and altered, false otherwise.
   * @param name (undocumented)
   * @param viewDefinition (undocumented)
   * @return (undocumented)
   */
  public  boolean alterTempViewDefinition (org.apache.spark.sql.catalyst.TableIdentifier name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan viewDefinition)  { throw new RuntimeException(); }
  /**
   * Return a local temporary view exactly as it was stored.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> getTempView (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Return a global temporary view exactly as it was stored.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> getGlobalTempView (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Drop a local temporary view.
   * <p>
   * Returns true if this view is dropped successfully, false otherwise.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean dropTempView (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Drop a global temporary view.
   * <p>
   * Returns true if this view is dropped successfully, false otherwise.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean dropGlobalTempView (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Retrieve the metadata of an existing temporary view or permanent table/view.
   * <p>
   * If a database is specified in <code>name</code>, this will return the metadata of table/view in that
   * database.
   * If no database is specified, this will first attempt to get the metadata of a temporary view
   * with the same name, then, if that does not exist, return the metadata of table/view in the
   * current database.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable getTempViewOrPermanentTableMetadata (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  /**
   * Rename a table.
   * <p>
   * If a database is specified in <code>oldName</code>, this will rename the table in that database.
   * If no database is specified, this will first attempt to rename a temporary table with
   * the same name, then, if that does not exist, rename the table in the current database.
   * <p>
   * This assumes the database specified in <code>newName</code> matches the one in <code>oldName</code>.
   * @param oldName (undocumented)
   * @param newName (undocumented)
   */
  public  void renameTable (org.apache.spark.sql.catalyst.TableIdentifier oldName, org.apache.spark.sql.catalyst.TableIdentifier newName)  { throw new RuntimeException(); }
  /**
   * Drop a table.
   * <p>
   * If a database is specified in <code>name</code>, this will drop the table from that database.
   * If no database is specified, this will first attempt to drop a temporary table with
   * the same name, then, if that does not exist, drop the table from the current database.
   * @param name (undocumented)
   * @param ignoreIfNotExists (undocumented)
   * @param purge (undocumented)
   */
  public  void dropTable (org.apache.spark.sql.catalyst.TableIdentifier name, boolean ignoreIfNotExists, boolean purge)  { throw new RuntimeException(); }
  /**
   * Return a {@link LogicalPlan} that represents the given table or view.
   * <p>
   * If a database is specified in <code>name</code>, this will return the table/view from that database.
   * If no database is specified, this will first attempt to return a temporary table/view with
   * the same name, then, if that does not exist, return the table/view from the current database.
   * <p>
   * Note that, the global temp view database is also valid here, this will return the global temp
   * view matching the given name.
   * <p>
   * If the relation is a view, the relation will be wrapped in a {@link SubqueryAlias} which will
   * track the name of the view.
   * @param name (undocumented)
   * @param alias (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (org.apache.spark.sql.catalyst.TableIdentifier name, scala.Option<java.lang.String> alias)  { throw new RuntimeException(); }
  /**
   * Return whether a table with the specified name is a temporary table.
   * <p>
   * Note: The temporary table cache is checked only when database is not
   * explicitly specified.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean isTemporaryTable (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  /**
   * List all tables in the specified database, including local temporary tables.
   * <p>
   * Note that, if the specified database is global temporary view database, we will list global
   * temporary views.
   * @param db (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.TableIdentifier> listTables (java.lang.String db)  { throw new RuntimeException(); }
  /**
   * List all matching tables in the specified database, including local temporary tables.
   * <p>
   * Note that, if the specified database is global temporary view database, we will list global
   * temporary views.
   * @param db (undocumented)
   * @param pattern (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.TableIdentifier> listTables (java.lang.String db, java.lang.String pattern)  { throw new RuntimeException(); }
  /**
   * Refresh the cache entry for a metastore table, if any.
   * @param name (undocumented)
   */
  public  void refreshTable (org.apache.spark.sql.catalyst.TableIdentifier name)  { throw new RuntimeException(); }
  /**
   * Drop all existing temporary tables.
   * For testing only.
   */
  public  void clearTempTables ()  { throw new RuntimeException(); }
  /**
   * Create partitions in an existing table, assuming it exists.
   * If no database is specified, assume the table is in the current database.
   * @param tableName (undocumented)
   * @param parts (undocumented)
   * @param ignoreIfExists (undocumented)
   */
  public  void createPartitions (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts, boolean ignoreIfExists)  { throw new RuntimeException(); }
  /**
   * Drop partitions from a table, assuming they exist.
   * If no database is specified, assume the table is in the current database.
   * @param tableName (undocumented)
   * @param specs (undocumented)
   * @param ignoreIfNotExists (undocumented)
   * @param purge (undocumented)
   * @param retainData (undocumented)
   */
  public  void dropPartitions (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, boolean ignoreIfNotExists, boolean purge, boolean retainData)  { throw new RuntimeException(); }
  /**
   * Override the specs of one or many existing table partitions, assuming they exist.
   * <p>
   * This assumes index i of <code>specs</code> corresponds to index i of <code>newSpecs</code>.
   * If no database is specified, assume the table is in the current database.
   * @param tableName (undocumented)
   * @param specs (undocumented)
   * @param newSpecs (undocumented)
   */
  public  void renamePartitions (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> newSpecs)  { throw new RuntimeException(); }
  /**
   * Alter one or many table partitions whose specs that match those specified in <code>parts</code>,
   * assuming the partitions exist.
   * <p>
   * If no database is specified, assume the table is in the current database.
   * <p>
   * Note: If the underlying implementation does not support altering a certain field,
   * this becomes a no-op.
   * @param tableName (undocumented)
   * @param parts (undocumented)
   */
  public  void alterPartitions (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts)  { throw new RuntimeException(); }
  /**
   * Retrieve the metadata of a table partition, assuming it exists.
   * If no database is specified, assume the table is in the current database.
   * @param tableName (undocumented)
   * @param spec (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition getPartition (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> spec)  { throw new RuntimeException(); }
  /**
   * List the names of all partitions that belong to the specified table, assuming it exists.
   * <p>
   * A partial partition spec may optionally be provided to filter the partitions returned.
   * For instance, if there exist partitions (a='1', b='2'), (a='1', b='3') and (a='2', b='4'),
   * then a partial spec of (a='1') will return the first two only.
   * @param tableName (undocumented)
   * @param partialSpec (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> listPartitionNames (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partialSpec)  { throw new RuntimeException(); }
  /**
   * List the metadata of all partitions that belong to the specified table, assuming it exists.
   * <p>
   * A partial partition spec may optionally be provided to filter the partitions returned.
   * For instance, if there exist partitions (a='1', b='2'), (a='1', b='3') and (a='2', b='4'),
   * then a partial spec of (a='1') will return the first two only.
   * @param tableName (undocumented)
   * @param partialSpec (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> listPartitions (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partialSpec)  { throw new RuntimeException(); }
  /**
   * List the metadata of partitions that belong to the specified table, assuming it exists, that
   * satisfy the given partition-pruning predicate expressions.
   * @param tableName (undocumented)
   * @param predicates (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> listPartitionsByFilter (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates)  { throw new RuntimeException(); }
  /**
   * Verify if the input partition spec exactly matches the existing defined partition spec
   * The columns must be the same but the orders could be different.
   * @param specs (undocumented)
   * @param table (undocumented)
   */
  private  void requireExactMatchedPartitionSpec (scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  /**
   * Verify if the input partition spec partially matches the existing defined partition spec
   * That is, the columns of partition spec should be part of the defined partition spec.
   * @param specs (undocumented)
   * @param table (undocumented)
   */
  private  void requirePartialMatchedPartitionSpec (scala.collection.Seq<scala.collection.immutable.Map<java.lang.String, java.lang.String>> specs, org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  /**
   * Create a metastore function in the database specified in <code>funcDefinition</code>.
   * If no such database is specified, create it in the current database.
   * @param funcDefinition (undocumented)
   * @param ignoreIfExists (undocumented)
   */
  public  void createFunction (org.apache.spark.sql.catalyst.catalog.CatalogFunction funcDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  /**
   * Drop a metastore function.
   * If no database is specified, assume the function is in the current database.
   * @param name (undocumented)
   * @param ignoreIfNotExists (undocumented)
   */
  public  void dropFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, boolean ignoreIfNotExists)  { throw new RuntimeException(); }
  /**
   * Retrieve the metadata of a metastore function.
   * <p>
   * If a database is specified in <code>name</code>, this will return the function in that database.
   * If no database is specified, this will return the function in the current database.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogFunction getFunctionMetadata (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  /**
   * Check if the specified function exists.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean functionExists (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  /**
   * Construct a {@link FunctionBuilder} based on the provided class that represents a function.
   * <p>
   * This performs reflection to decide what type of {@link Expression} to return in the builder.
   * @param name (undocumented)
   * @param functionClassName (undocumented)
   * @return (undocumented)
   */
  public  scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> makeFunctionBuilder (java.lang.String name, java.lang.String functionClassName)  { throw new RuntimeException(); }
  /**
   * Loads resources such as JARs and Files for a function. Every resource is represented
   * by a tuple (resource type, resource uri).
   * @param resources (undocumented)
   */
  public  void loadFunctionResources (scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.FunctionResource> resources)  { throw new RuntimeException(); }
  /**
   * Create a temporary function.
   * This assumes no database is specified in <code>funcDefinition</code>.
   * @param name (undocumented)
   * @param info (undocumented)
   * @param funcDefinition (undocumented)
   * @param ignoreIfExists (undocumented)
   */
  public  void createTempFunction (java.lang.String name, org.apache.spark.sql.catalyst.expressions.ExpressionInfo info, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> funcDefinition, boolean ignoreIfExists)  { throw new RuntimeException(); }
  /**
   * Drop a temporary function.
   * @param name (undocumented)
   * @param ignoreIfNotExists (undocumented)
   */
  public  void dropTempFunction (java.lang.String name, boolean ignoreIfNotExists)  { throw new RuntimeException(); }
  /**
   * Returns whether it is a temporary function. If not existed, returns false.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  boolean isTemporaryFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  protected  scala.runtime.Nothing$ failFunctionLookup (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Look up the {@link ExpressionInfo} associated with the specified function, assuming it exists.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.ExpressionInfo lookupFunctionInfo (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
  /**
   * Return an {@link Expression} that represents the specified function, assuming it exists.
   * <p>
   * For a temporary function or a permanent function that has been loaded,
   * this method will simply lookup the function through the
   * FunctionRegistry and create an expression based on the builder.
   * <p>
   * For a permanent function that has not been loaded, we will first fetch its metadata
   * from the underlying external catalog. Then, we will load all resources associated
   * with this function (i.e. jars and files). Finally, we create a function builder
   * based on the function class and put the builder into the FunctionRegistry.
   * The name of this function in the FunctionRegistry will be <code>databaseName.functionName</code>.
   * @param name (undocumented)
   * @param children (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction (org.apache.spark.sql.catalyst.FunctionIdentifier name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  /**
   * List all functions in the specified database, including temporary functions. This
   * returns the function identifier and the scope in which it was defined (system or user
   * defined).
   * @param db (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.FunctionIdentifier, java.lang.String>> listFunctions (java.lang.String db)  { throw new RuntimeException(); }
  /**
   * List all matching functions in the specified database, including temporary functions. This
   * returns the function identifier and the scope in which it was defined (system or user
   * defined).
   * @param db (undocumented)
   * @param pattern (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.FunctionIdentifier, java.lang.String>> listFunctions (java.lang.String db, java.lang.String pattern)  { throw new RuntimeException(); }
  /**
   * Drop all existing databases (except "default"), tables, partitions and functions,
   * and set the current database to "default".
   * <p>
   * This is mainly used for tests.
   */
  public  void reset ()  { throw new RuntimeException(); }
}
