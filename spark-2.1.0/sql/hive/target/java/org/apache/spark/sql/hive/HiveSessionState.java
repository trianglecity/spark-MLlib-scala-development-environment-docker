package org.apache.spark.sql.hive;
/**
 * A class that holds all session-specific state in a given {@link SparkSession} backed by Hive.
 */
  class HiveSessionState extends org.apache.spark.sql.internal.SessionState {
  public   HiveSessionState (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * A Hive client used for interacting with the metastore.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.client.HiveClient metadataHive ()  { throw new RuntimeException(); }
  /**
   * Internal catalog for managing table and database states.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.hive.HiveSessionCatalog catalog ()  { throw new RuntimeException(); }
  /**
   * An analyzer that uses the Hive metastore.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer analyzer ()  { throw new RuntimeException(); }
  /**
   * Planner that takes into account Hive-specific strategies.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.SparkPlanner planner ()  { throw new RuntimeException(); }
  public  void addJar (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * When true, enables an experimental feature where metastore tables that use the parquet SerDe
   * are automatically converted to use the Spark SQL parquet table scan, instead of the Hive
   * SerDe.
   * @return (undocumented)
   */
  public  boolean convertMetastoreParquet ()  { throw new RuntimeException(); }
  /**
   * When true, also tries to merge possibly different but compatible Parquet schemas in different
   * Parquet data files.
   * <p>
   * This configuration is only effective when "spark.sql.hive.convertMetastoreParquet" is true.
   * @return (undocumented)
   */
  public  boolean convertMetastoreParquetWithSchemaMerging ()  { throw new RuntimeException(); }
  /**
   * When true, enables an experimental feature where metastore tables that use the Orc SerDe
   * are automatically converted to use the Spark SQL ORC table scan, instead of the Hive
   * SerDe.
   * @return (undocumented)
   */
  public  boolean convertMetastoreOrc ()  { throw new RuntimeException(); }
  /**
   * When true, Hive Thrift server will execute SQL queries asynchronously using a thread pool."
   * @return (undocumented)
   */
  public  boolean hiveThriftServerAsync ()  { throw new RuntimeException(); }
  public  boolean hiveThriftServerSingleSession ()  { throw new RuntimeException(); }
}
