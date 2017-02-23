package org.apache.spark.sql.catalog;
/**
 * Catalog interface for Spark. To access this, use <code>SparkSession.catalog</code>.
 * <p>
 * @since 2.0.0
 */
public abstract class Catalog {
  public   Catalog ()  { throw new RuntimeException(); }
  /**
   * Returns the current default database in this session.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public abstract  java.lang.String currentDatabase ()  ;
  /**
   * Sets the current default database in this session.
   * <p>
   * @since 2.0.0
   * @param dbName (undocumented)
   */
  public abstract  void setCurrentDatabase (java.lang.String dbName)  ;
  /**
   * Returns a list of databases available across all sessions.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Database> listDatabases ()  ;
  /**
   * Returns a list of tables in the current database.
   * This includes all temporary tables.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Table> listTables ()  ;
  /**
   * Returns a list of tables in the specified database.
   * This includes all temporary tables.
   * <p>
   * @since 2.0.0
   * @param dbName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Table> listTables (java.lang.String dbName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Returns a list of functions registered in the current database.
   * This includes all temporary functions
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Function> listFunctions ()  ;
  /**
   * Returns a list of functions registered in the specified database.
   * This includes all temporary functions
   * <p>
   * @since 2.0.0
   * @param dbName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Function> listFunctions (java.lang.String dbName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Returns a list of columns for the given table in the current database or
   * the given temporary table.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Column> listColumns (java.lang.String tableName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Returns a list of columns for the given table in the specified database.
   * <p>
   * @since 2.0.0
   * @param dbName (undocumented)
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.catalog.Column> listColumns (java.lang.String dbName, java.lang.String tableName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Get the database with the specified name. This throws an AnalysisException when the database
   * cannot be found.
   * <p>
   * @since 2.1.0
   * @param dbName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalog.Database getDatabase (java.lang.String dbName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Get the table or view with the specified name. This table can be a temporary view or a
   * table/view in the current database. This throws an AnalysisException when no Table
   * can be found.
   * <p>
   * @since 2.1.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalog.Table getTable (java.lang.String tableName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Get the table or view with the specified name in the specified database. This throws an
   * AnalysisException when no Table can be found.
   * <p>
   * @since 2.1.0
   * @param dbName (undocumented)
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalog.Table getTable (java.lang.String dbName, java.lang.String tableName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Get the function with the specified name. This function can be a temporary function or a
   * function in the current database. This throws an AnalysisException when the function cannot
   * be found.
   * <p>
   * @since 2.1.0
   * @param functionName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalog.Function getFunction (java.lang.String functionName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Get the function with the specified name. This throws an AnalysisException when the function
   * cannot be found.
   * <p>
   * @since 2.1.0
   * @param dbName (undocumented)
   * @param functionName (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalog.Function getFunction (java.lang.String dbName, java.lang.String functionName) throws org.apache.spark.sql.AnalysisException ;
  /**
   * Check if the database with the specified name exists.
   * <p>
   * @since 2.1.0
   * @param dbName (undocumented)
   * @return (undocumented)
   */
  public abstract  boolean databaseExists (java.lang.String dbName)  ;
  /**
   * Check if the table or view with the specified name exists. This can either be a temporary
   * view or a table/view in the current database.
   * <p>
   * @since 2.1.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  boolean tableExists (java.lang.String tableName)  ;
  /**
   * Check if the table or view with the specified name exists in the specified database.
   * <p>
   * @since 2.1.0
   * @param dbName (undocumented)
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  boolean tableExists (java.lang.String dbName, java.lang.String tableName)  ;
  /**
   * Check if the function with the specified name exists. This can either be a temporary function
   * or a function in the current database.
   * <p>
   * @since 2.1.0
   * @param functionName (undocumented)
   * @return (undocumented)
   */
  public abstract  boolean functionExists (java.lang.String functionName)  ;
  /**
   * Check if the function with the specified name exists in the specified database.
   * <p>
   * @since 2.1.0
   * @param dbName (undocumented)
   * @param functionName (undocumented)
   * @return (undocumented)
   */
  public abstract  boolean functionExists (java.lang.String dbName, java.lang.String functionName)  ;
  /**
   * :: Experimental ::
   * Creates an external table from the given path and returns the corresponding DataFrame.
   * It will use the default data source configured by spark.sql.sources.default.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String path)  ;
  /**
   * :: Experimental ::
   * Creates an external table from the given path based on a data source
   * and returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param path (undocumented)
   * @param source (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String path, java.lang.String source)  ;
  /**
   * :: Experimental ::
   * Creates an external table from the given path based on a data source and a set of options.
   * Then, returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options)  ;
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Creates an external table from the given path based on a data source and a set of options.
   * Then, returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  ;
  /**
   * :: Experimental ::
   * Create an external table from the given path based on a data source, a schema and
   * a set of options. Then, returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options)  ;
  /**
   * :: Experimental ::
   * (Scala-specific)
   * Create an external table from the given path based on a data source, a schema and
   * a set of options. Then, returns the corresponding DataFrame.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  ;
  /**
   * Drops the local temporary view with the given view name in the catalog.
   * If the view has been cached before, then it will also be uncached.
   * <p>
   * Local temporary view is session-scoped. Its lifetime is the lifetime of the session that
   * created it, i.e. it will be automatically dropped when the session terminates. It's not
   * tied to any databases, i.e. we can't use <code>db1.view1</code> to reference a local temporary view.
   * <p>
   * Note that, the return type of this method was Unit in Spark 2.0, but changed to Boolean
   * in Spark 2.1.
   * <p>
   * @param viewName the name of the view to be dropped.
   * @return true if the view is dropped successfully, false otherwise.
   * @since 2.0.0
   */
  public abstract  boolean dropTempView (java.lang.String viewName)  ;
  /**
   * Drops the global temporary view with the given view name in the catalog.
   * If the view has been cached before, then it will also be uncached.
   * <p>
   * Global temporary view is cross-session. Its lifetime is the lifetime of the Spark application,
   * i.e. it will be automatically dropped when the application terminates. It's tied to a system
   * preserved database <code>_global_temp</code>, and we must use the qualified name to refer a global temp
   * view, e.g. <code>SELECT * FROM _global_temp.view1</code>.
   * <p>
   * @param viewName the name of the view to be dropped.
   * @return true if the view is dropped successfully, false otherwise.
   * @since 2.1.0
   */
  public abstract  boolean dropGlobalTempView (java.lang.String viewName)  ;
  /**
   * Returns true if the table is currently cached in-memory.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public abstract  boolean isCached (java.lang.String tableName)  ;
  /**
   * Caches the specified table in-memory.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public abstract  void cacheTable (java.lang.String tableName)  ;
  /**
   * Removes the specified table from the in-memory cache.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public abstract  void uncacheTable (java.lang.String tableName)  ;
  /**
   * Removes all cached tables from the in-memory cache.
   * <p>
   * @since 2.0.0
   */
  public abstract  void clearCache ()  ;
  /**
   * Invalidate and refresh all the cached metadata of the given table. For performance reasons,
   * Spark SQL or the external data source library it uses might cache certain metadata about a
   * table, such as the location of blocks. When those change outside of Spark SQL, users should
   * call this function to invalidate the cache.
   * <p>
   * If this table is cached as an InMemoryRelation, drop the original cached version and make the
   * new version cached lazily.
   * <p>
   * @since 2.0.0
   * @param tableName (undocumented)
   */
  public abstract  void refreshTable (java.lang.String tableName)  ;
  /**
   * Invalidate and refresh all the cached data (and the associated metadata) for any dataframe that
   * contains the given data source path. Path matching is by prefix, i.e. "/" would invalidate
   * everything that is cached.
   * <p>
   * @since 2.0.0
   * @param path (undocumented)
   */
  public abstract  void refreshByPath (java.lang.String path)  ;
}
