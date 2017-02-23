package org.apache.spark.sql.execution;
/**
 * Builder that converts an ANTLR ParseTree into a LogicalPlan/Expression/TableIdentifier.
 */
public  class SparkSqlAstBuilder extends org.apache.spark.sql.catalyst.parser.AstBuilder {
  public   SparkSqlAstBuilder (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * Create a {@link SetCommand} logical plan.
   * <p>
   * Note that we assume that everything after the SET keyword is assumed to be a part of the
   * key-value pair. The split between key and value is made by searching for the first <code>=</code>
   * character in the raw string.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetConfiguration (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetConfigurationContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ResetCommand} logical plan.
   * Example SQL :
   * <pre><code>
   *   RESET;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitResetConfiguration (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ResetConfigurationContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AnalyzeTableCommand} command or an {@link AnalyzeColumnCommand} command.
   * Example SQL for analyzing table :
   * <pre><code>
   *   ANALYZE TABLE table COMPUTE STATISTICS [NOSCAN];
   * </code></pre>
   * Example SQL for analyzing columns :
   * <pre><code>
   *   ANALYZE TABLE table COMPUTE STATISTICS FOR COLUMNS column1, column2;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitAnalyze (org.apache.spark.sql.catalyst.parser.SqlBaseParser.AnalyzeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link SetDatabaseCommand} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitUse (org.apache.spark.sql.catalyst.parser.SqlBaseParser.UseContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ShowTablesCommand} logical plan.
   * Example SQL :
   * <pre><code>
   *   SHOW TABLES [(IN|FROM) database_name] {&#64;link LIKE] 'identifier_with_wildcards'];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowTables (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowTablesContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ShowDatabasesCommand} logical plan.
   * Example SQL:
   * <pre><code>
   *   SHOW (DATABASES|SCHEMAS) [LIKE 'identifier_with_wildcards'];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowDatabases (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowDatabasesContext ctx)  { throw new RuntimeException(); }
  /**
   * A command for users to list the properties for a table. If propertyKey is specified, the value
   * for the propertyKey is returned. If propertyKey is not specified, all the keys and their
   * corresponding values are returned.
   * The syntax of using this command in SQL is:
   * <pre><code>
   *   SHOW TBLPROPERTIES table_name[('propertyKey')];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowTblProperties (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowTblPropertiesContext ctx)  { throw new RuntimeException(); }
  /**
   * A command for users to list the column names for a table.
   * This function creates a {@link ShowColumnsCommand} logical plan.
   * <p>
   * The syntax of using this command in SQL is:
   * <pre><code>
   *   SHOW COLUMNS (FROM | IN) table_identifier [(FROM | IN) database];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowColumns (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowColumnsContext ctx)  { throw new RuntimeException(); }
  /**
   * A command for users to list the partition names of a table. If partition spec is specified,
   * partitions that match the spec are returned. Otherwise an empty result set is returned.
   * <p>
   * This function creates a {@link ShowPartitionsCommand} logical plan
   * <p>
   * The syntax of using this command in SQL is:
   * <pre><code>
   *   SHOW PARTITIONS table_identifier [partition_spec];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowPartitions (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowPartitionsContext ctx)  { throw new RuntimeException(); }
  /**
   * Creates a {@link ShowCreateTableCommand}
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowCreateTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowCreateTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link RefreshTable} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRefreshTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RefreshTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link RefreshTable} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRefreshResource (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RefreshResourceContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CacheTableCommand} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCacheTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CacheTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link UncacheTableCommand} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitUncacheTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.UncacheTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ClearCacheCommand} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitClearCache (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ClearCacheContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link ExplainCommand} logical plan.
   * The syntax of using this command in SQL is:
   * <pre><code>
   *   EXPLAIN (EXTENDED | CODEGEN) SELECT * FROM ...
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitExplain (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ExplainContext ctx)  { throw new RuntimeException(); }
  /**
   * Determine if a plan should be explained at all.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  protected  boolean isExplainableStatement (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Create a {@link DescribeTableCommand} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDescribeTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DescribeTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Validate a create table statement and return the {@link TableIdentifier}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple4<org.apache.spark.sql.catalyst.TableIdentifier, java.lang.Object, java.lang.Object, java.lang.Object> visitCreateTableHeader (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTableHeaderContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a data source table, returning a {@link CreateTable} logical plan.
   * <p>
   * Expected format:
   * <pre><code>
   *   CREATE [EXTERNAL] TABLE [IF NOT EXISTS] [db_name.]table_name
   *   USING table_provider
   *   [OPTIONS table_property_list]
   *   [PARTITIONED BY (col_name, col_name, ...)]
   *   [CLUSTERED BY (col_name, col_name, ...)
   *    [SORTED BY (col_name [ASC|DESC], ...)]
   *    INTO num_buckets BUCKETS
   *   ]
   *   [AS select_statement];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateTableUsing (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTableUsingContext ctx)  { throw new RuntimeException(); }
  /**
   * Creates a {@link CreateTempViewUsing} logical plan.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateTempViewUsing (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTempViewUsingContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link LoadDataCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   LOAD DATA [LOCAL] INPATH 'filepath' [OVERWRITE] INTO TABLE tablename
   *   [PARTITION (partcol1=val1, partcol2=val2 ...)]
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitLoadData (org.apache.spark.sql.catalyst.parser.SqlBaseParser.LoadDataContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link TruncateTableCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   TRUNCATE TABLE tablename [PARTITION (partcol1=val1, partcol2=val2 ...)]
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitTruncateTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TruncateTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link AlterTableRecoverPartitionsCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   MSCK REPAIR TABLE tablename
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRepairTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RepairTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Convert a table property list into a key-value map.
   * This should be called through {@link visitPropertyKeyValues} or {@link visitPropertyKeys}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> visitTablePropertyList (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TablePropertyListContext ctx)  { throw new RuntimeException(); }
  /**
   * Parse a key-value map from a {@link TablePropertyListContext}, assuming all values are specified.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> visitPropertyKeyValues (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TablePropertyListContext ctx)  { throw new RuntimeException(); }
  /**
   * Parse a list of keys from a {@link TablePropertyListContext}, assuming no values are specified.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.String> visitPropertyKeys (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TablePropertyListContext ctx)  { throw new RuntimeException(); }
  /**
   * A table property key can either be String or a collection of dot separated elements. This
   * function extracts the property key based on whether its a string literal or a table property
   * identifier.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String visitTablePropertyKey (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TablePropertyKeyContext key)  { throw new RuntimeException(); }
  /**
   * A table property value can be String, Integer, Boolean or Decimal. This function extracts
   * the property value based on whether its a string, integer, boolean or decimal literal.
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String visitTablePropertyValue (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TablePropertyValueContext value)  { throw new RuntimeException(); }
  /**
   * Create a {@link CreateDatabaseCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   CREATE DATABASE [IF NOT EXISTS] database_name [COMMENT database_comment]
   *    [LOCATION path] [WITH DBPROPERTIES (key1=val1, key2=val2, ...)]
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateDatabase (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateDatabaseContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterDatabasePropertiesCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER (DATABASE|SCHEMA) database SET DBPROPERTIES (property_name=property_value, ...);
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetDatabaseProperties (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetDatabasePropertiesContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link DropDatabaseCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   DROP (DATABASE|SCHEMA) [IF EXISTS] database [RESTRICT|CASCADE];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDropDatabase (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DropDatabaseContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link DescribeDatabaseCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   DESCRIBE DATABASE [EXTENDED] database;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDescribeDatabase (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DescribeDatabaseContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a plan for a DESCRIBE FUNCTION command.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDescribeFunction (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DescribeFunctionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a plan for a SHOW FUNCTIONS command.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitShowFunctions (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ShowFunctionsContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CreateFunctionCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   CREATE [TEMPORARY] FUNCTION [db_name.]function_name AS class_name
   *    [USING JAR|FILE|ARCHIVE 'file_uri' [, JAR|FILE|ARCHIVE 'file_uri'};
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateFunction (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFunctionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link DropFunctionCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   DROP [TEMPORARY] FUNCTION [IF EXISTS] function;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDropFunction (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DropFunctionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link DropTableCommand} command.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDropTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DropTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link AlterTableRenameCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table1 RENAME TO table2;
   *   ALTER VIEW view1 RENAME TO view2;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRenameTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RenameTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableSetPropertiesCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table SET TBLPROPERTIES ('comment' = new_comment);
   *   ALTER VIEW view SET TBLPROPERTIES ('comment' = new_comment);
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetTableProperties (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetTablePropertiesContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableUnsetPropertiesCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table UNSET TBLPROPERTIES [IF EXISTS] ('comment', 'key');
   *   ALTER VIEW view UNSET TBLPROPERTIES [IF EXISTS] ('comment', 'key');
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitUnsetTableProperties (org.apache.spark.sql.catalyst.parser.SqlBaseParser.UnsetTablePropertiesContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableSerDePropertiesCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table [PARTITION spec] SET SERDE serde_name [WITH SERDEPROPERTIES props];
   *   ALTER TABLE table [PARTITION spec] SET SERDEPROPERTIES serde_properties;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetTableSerDe (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetTableSerDeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableAddPartitionCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table ADD [IF NOT EXISTS] PARTITION spec [LOCATION 'loc1']
   *   ALTER VIEW view ADD [IF NOT EXISTS] PARTITION spec
   * </code></pre>
   * <p>
   * ALTER VIEW ... ADD PARTITION ... is not supported because the concept of partitioning
   * is associated with physical tables
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitAddTablePartition (org.apache.spark.sql.catalyst.parser.SqlBaseParser.AddTablePartitionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableRenamePartitionCommand} command
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table PARTITION spec1 RENAME TO PARTITION spec2;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRenameTablePartition (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RenameTablePartitionContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableDropPartitionCommand} command
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table DROP [IF EXISTS] PARTITION spec1[, PARTITION spec2, ...] [PURGE];
   *   ALTER VIEW view DROP [IF EXISTS] PARTITION spec1[, PARTITION spec2, ...];
   * </code></pre>
   * <p>
   * ALTER VIEW ... DROP PARTITION ... is not supported because the concept of partitioning
   * is associated with physical tables
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitDropTablePartitions (org.apache.spark.sql.catalyst.parser.SqlBaseParser.DropTablePartitionsContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableRecoverPartitionsCommand} command
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table RECOVER PARTITIONS;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitRecoverPartitions (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RecoverPartitionsContext ctx)  { throw new RuntimeException(); }
  /**
   * Create an {@link AlterTableSetLocationCommand} command
   * <p>
   * For example:
   * <pre><code>
   *   ALTER TABLE table [PARTITION spec] SET LOCATION "loc";
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitSetTableLocation (org.apache.spark.sql.catalyst.parser.SqlBaseParser.SetTableLocationContext ctx)  { throw new RuntimeException(); }
  /**
   * Create location string.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String visitLocationSpec (org.apache.spark.sql.catalyst.parser.SqlBaseParser.LocationSpecContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link BucketSpec}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.BucketSpec visitBucketSpec (org.apache.spark.sql.catalyst.parser.SqlBaseParser.BucketSpecContext ctx)  { throw new RuntimeException(); }
  /**
   * Convert a nested constants list into a sequence of string sequences.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.collection.Seq<java.lang.String>> visitNestedConstantList (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NestedConstantListContext ctx)  { throw new RuntimeException(); }
  /**
   * Convert a constants list into a String sequence.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> visitConstantList (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ConstantListContext ctx)  { throw new RuntimeException(); }
  /**
   * Fail an unsupported Hive native command.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitFailNativeCommand (org.apache.spark.sql.catalyst.parser.SqlBaseParser.FailNativeCommandContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link AddFileCommand}, {@link AddJarCommand}, {@link ListFilesCommand} or {@link ListJarsCommand}
   * command depending on the requested operation on resources.
   * Expected format:
   * <pre><code>
   *   ADD (FILE[S] &lt;filepath ...&gt; | JAR[S] &lt;jarpath ...&gt;)
   *   LIST (FILE[S] [filepath ...] | JAR[S] [jarpath ...])
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitManageResource (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ManageResourceContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a table, returning a {@link CreateTable} logical plan.
   * <p>
   * This is not used to create datasource tables, which is handled through
   * "CREATE TABLE ... USING ...".
   * <p>
   * Note: several features are currently not supported - temporary tables, bucketing,
   * skewed columns and storage handlers (STORED BY).
   * <p>
   * Expected format:
   * <pre><code>
   *   CREATE [EXTERNAL] TABLE [IF NOT EXISTS] [db_name.]table_name
   *   [(col1[:] data_type [COMMENT col_comment], ...)]
   *   [COMMENT table_comment]
   *   [PARTITIONED BY (col2[:] data_type [COMMENT col_comment], ...)]
   *   [ROW FORMAT row_format]
   *   [STORED AS file_format]
   *   [LOCATION path]
   *   [TBLPROPERTIES (property_name=property_value, ...)]
   *   [AS select_statement];
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateTable (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTableContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CreateTableLikeCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   CREATE TABLE [IF NOT EXISTS] [db_name.]table_name
   *   LIKE [other_db_name.]existing_table_name
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateTableLike (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateTableLikeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CatalogStorageFormat} for creating tables.
   * <p>
   * Format: STORED AS ...
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitCreateFileFormat (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFileFormatContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CatalogStorageFormat}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitTableFileFormat (org.apache.spark.sql.catalyst.parser.SqlBaseParser.TableFileFormatContext ctx)  { throw new RuntimeException(); }
  /**
   * Resolve a {@link HiveSerDe} based on the name given and return it as a {@link CatalogStorageFormat}.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitGenericFileFormat (org.apache.spark.sql.catalyst.parser.SqlBaseParser.GenericFileFormatContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link CatalogStorageFormat} used for creating tables.
   * <p>
   * Example format:
   * <pre><code>
   *   SERDE serde_name [WITH SERDEPROPERTIES (k1=v1, k2=v2, ...)]
   * </code></pre>
   * <p>
   * OR
   * <p>
   * <pre><code>
   *   DELIMITED [FIELDS TERMINATED BY char [ESCAPED BY char}
   *   [COLLECTION ITEMS TERMINATED BY char]
   *   [MAP KEYS TERMINATED BY char]
   *   [LINES TERMINATED BY char]
   *   [NULL DEFINED AS char]
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitRowFormat (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatContext ctx)  { throw new RuntimeException(); }
  /**
   * Create SERDE row format name and properties pair.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitRowFormatSerde (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatSerdeContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a delimited row format properties object.
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat visitRowFormatDelimited (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatDelimitedContext ctx)  { throw new RuntimeException(); }
  /**
   * Throw a {@link ParseException} if the user specified incompatible SerDes through ROW FORMAT
   * and STORED AS.
   * <p>
   * The following are allowed. Anything else is not:
   *   ROW FORMAT SERDE ... STORED AS [SEQUENCEFILE | RCFILE | TEXTFILE]
   *   ROW FORMAT DELIMITED ... STORED AS TEXTFILE
   *   ROW FORMAT ... STORED AS INPUTFORMAT ... OUTPUTFORMAT ...
   * @param rowFormatCtx (undocumented)
   * @param createFileFormatCtx (undocumented)
   * @param parentCtx (undocumented)
   */
  private  void validateRowFormatFileFormat (org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatContext rowFormatCtx, org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateFileFormatContext createFileFormatCtx, org.antlr.v4.runtime.ParserRuleContext parentCtx)  { throw new RuntimeException(); }
  /**
   * Create or replace a view. This creates a {@link CreateViewCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   CREATE [OR REPLACE] {&#64;link GLOBAL] TEMPORARY] VIEW [IF NOT EXISTS] [db_name.]view_name
   *   [(column_name [COMMENT column_comment], ...) ]
   *   [COMMENT view_comment]
   *   [TBLPROPERTIES (property_name = property_value, ...)]
   *   AS SELECT ...;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitCreateView (org.apache.spark.sql.catalyst.parser.SqlBaseParser.CreateViewContext ctx)  { throw new RuntimeException(); }
  /**
   * Alter the query of a view. This creates a {@link AlterViewAsCommand} command.
   * <p>
   * For example:
   * <pre><code>
   *   ALTER VIEW [db_name.]view_name AS SELECT ...;
   * </code></pre>
   * @param ctx (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan visitAlterViewQuery (org.apache.spark.sql.catalyst.parser.SqlBaseParser.AlterViewQueryContext ctx)  { throw new RuntimeException(); }
  /**
   * Create a {@link ScriptInputOutputSchema}.
   * @param ctx (undocumented)
   * @param inRowFormat (undocumented)
   * @param recordWriter (undocumented)
   * @param outRowFormat (undocumented)
   * @param recordReader (undocumented)
   * @param schemaLess (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.plans.logical.ScriptInputOutputSchema withScriptIOSchema (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QuerySpecificationContext ctx, org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatContext inRowFormat, org.antlr.v4.runtime.Token recordWriter, org.apache.spark.sql.catalyst.parser.SqlBaseParser.RowFormatContext outRowFormat, org.antlr.v4.runtime.Token recordReader, boolean schemaLess)  { throw new RuntimeException(); }
}
