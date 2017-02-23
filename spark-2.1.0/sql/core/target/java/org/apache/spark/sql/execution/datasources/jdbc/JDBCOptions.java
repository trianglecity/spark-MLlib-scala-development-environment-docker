package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Options for the JDBC data source.
 */
public  class JDBCOptions implements scala.Serializable {
  static private  scala.collection.mutable.Set<java.lang.String> jdbcOptionNames ()  { throw new RuntimeException(); }
  static private  java.lang.String newOption (java.lang.String name)  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_URL ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_TABLE_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_DRIVER_CLASS ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_PARTITION_COLUMN ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_LOWER_BOUND ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_UPPER_BOUND ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_NUM_PARTITIONS ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_BATCH_FETCH_SIZE ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_TRUNCATE ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_CREATE_TABLE_OPTIONS ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_BATCH_INSERT_SIZE ()  { throw new RuntimeException(); }
  static public  java.lang.String JDBC_TXN_ISOLATION_LEVEL ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters ()  { throw new RuntimeException(); }
  // not preceding
  public   JDBCOptions (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap parameters)  { throw new RuntimeException(); }
  public   JDBCOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public   JDBCOptions (java.lang.String url, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  /**
   * Returns a property with all options.
   * @return (undocumented)
   */
  public  java.util.Properties asProperties ()  { throw new RuntimeException(); }
  /**
   * Returns a property with all options except Spark internal data source options like <code>url</code>,
   * <code>dbtable</code>, and <code>numPartition</code>. This should be used when invoking JDBC API like <code>Driver.connect</code>
   * because each DBMS vendor has its own property list for JDBC driver. See SPARK-17776.
   * @return (undocumented)
   */
  public  java.util.Properties asConnectionProperties ()  { throw new RuntimeException(); }
  public  java.lang.String url ()  { throw new RuntimeException(); }
  public  java.lang.String table ()  { throw new RuntimeException(); }
  public  java.lang.String driverClass ()  { throw new RuntimeException(); }
  public  java.lang.String partitionColumn ()  { throw new RuntimeException(); }
  public  java.lang.String lowerBound ()  { throw new RuntimeException(); }
  public  java.lang.String upperBound ()  { throw new RuntimeException(); }
  public  java.lang.String numPartitions ()  { throw new RuntimeException(); }
  public  int fetchSize ()  { throw new RuntimeException(); }
  public  boolean isTruncate ()  { throw new RuntimeException(); }
  public  java.lang.String createTableOptions ()  { throw new RuntimeException(); }
  public  int batchSize ()  { throw new RuntimeException(); }
  public  int isolationLevel ()  { throw new RuntimeException(); }
}
