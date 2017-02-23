package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Util functions for JDBC tables.
 */
public  class JdbcUtils {
  /**
   * Returns a factory for creating connections to the given JDBC URL.
   * <p>
   * @param options - JDBC options that contains url, table and other information.
   * @return (undocumented)
   */
  static public  scala.Function0<java.sql.Connection> createConnectionFactory (org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Returns true if the table already exists in the JDBC database.
   * @param conn (undocumented)
   * @param url (undocumented)
   * @param table (undocumented)
   * @return (undocumented)
   */
  static public  boolean tableExists (java.sql.Connection conn, java.lang.String url, java.lang.String table)  { throw new RuntimeException(); }
  /**
   * Drops a table from the JDBC database.
   * @param conn (undocumented)
   * @param table (undocumented)
   */
  static public  void dropTable (java.sql.Connection conn, java.lang.String table)  { throw new RuntimeException(); }
  /**
   * Truncates a table from the JDBC database.
   * @param conn (undocumented)
   * @param table (undocumented)
   */
  static public  void truncateTable (java.sql.Connection conn, java.lang.String table)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> isCascadingTruncateTable (java.lang.String url)  { throw new RuntimeException(); }
  /**
   * Returns a PreparedStatement that inserts a row into table via conn.
   * @param conn (undocumented)
   * @param table (undocumented)
   * @param rddSchema (undocumented)
   * @param dialect (undocumented)
   * @return (undocumented)
   */
  static public  java.sql.PreparedStatement insertStatement (java.sql.Connection conn, java.lang.String table, org.apache.spark.sql.types.StructType rddSchema, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Retrieve standard jdbc types.
   * <p>
   * @param dt The datatype (e.g. {@link org.apache.spark.sql.types.StringType})
   * @return The default JdbcType for this DataType
   */
  static public  scala.Option<org.apache.spark.sql.jdbc.JdbcType> getCommonJDBCType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.jdbc.JdbcType getJdbcType (org.apache.spark.sql.types.DataType dt, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Maps a JDBC type to a Catalyst type.  This function is called only when
   * the JdbcDialect class corresponding to your database driver returns null.
   * <p>
   * @param sqlType - A field of java.sql.Types
   * @return The Catalyst type corresponding to sqlType.
   * @param precision (undocumented)
   * @param scale (undocumented)
   * @param signed (undocumented)
   */
  static private  org.apache.spark.sql.types.DataType getCatalystType (int sqlType, int precision, int scale, boolean signed)  { throw new RuntimeException(); }
  /**
   * Takes a {@link ResultSet} and returns its Catalyst schema.
   * <p>
   * @return A {@link StructType} giving the Catalyst schema.
   * @throws SQLException if the schema contains an unsupported type.
   * @param resultSet (undocumented)
   * @param dialect (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType getSchema (java.sql.ResultSet resultSet, org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Convert a {@link ResultSet} into an iterator of Catalyst Rows.
   * @param resultSet (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Iterator<org.apache.spark.sql.Row> resultSetToRows (java.sql.ResultSet resultSet, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static   scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> resultSetToSparkInternalRows (java.sql.ResultSet resultSet, org.apache.spark.sql.types.StructType schema, org.apache.spark.executor.InputMetrics inputMetrics)  { throw new RuntimeException(); }
  /**
   * Creates <code>JDBCValueGetter</code>s according to {@link StructType}, which can set
   * each value from <code>ResultSet</code> to each field of {@link InternalRow} correctly.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static private  scala.Function3<java.sql.ResultSet, org.apache.spark.sql.catalyst.InternalRow, java.lang.Object, scala.runtime.BoxedUnit>[] makeGetters (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static private  scala.Function3<java.sql.ResultSet, org.apache.spark.sql.catalyst.InternalRow, java.lang.Object, scala.runtime.BoxedUnit> makeGetter (org.apache.spark.sql.types.DataType dt, org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  static private <T extends java.lang.Object> Object nullSafeConvert (T input, scala.Function1<T, java.lang.Object> f)  { throw new RuntimeException(); }
  static private  scala.Function3<java.sql.PreparedStatement, org.apache.spark.sql.Row, java.lang.Object, scala.runtime.BoxedUnit> makeSetter (java.sql.Connection conn, org.apache.spark.sql.jdbc.JdbcDialect dialect, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Saves a partition of a DataFrame to the JDBC database.  This is done in
   * a single database transaction (unless isolation level is "NONE")
   * in order to avoid repeatedly inserting data as much as possible.
   * <p>
   * It is still theoretically possible for rows in a DataFrame to be
   * inserted into the database more than once if a stage somehow fails after
   * the commit occurs but before the stage can return successfully.
   * <p>
   * This is not a closure inside saveTable() because apparently cosmetic
   * implementation changes elsewhere might easily render such a closure
   * non-Serializable.  Instead, we explicitly close over all variables that
   * are used.
   * @param getConnection (undocumented)
   * @param table (undocumented)
   * @param iterator (undocumented)
   * @param rddSchema (undocumented)
   * @param nullTypes (undocumented)
   * @param batchSize (undocumented)
   * @param dialect (undocumented)
   * @param isolationLevel (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Iterator<java.lang.Object> savePartition (scala.Function0<java.sql.Connection> getConnection, java.lang.String table, scala.collection.Iterator<org.apache.spark.sql.Row> iterator, org.apache.spark.sql.types.StructType rddSchema, int[] nullTypes, int batchSize, org.apache.spark.sql.jdbc.JdbcDialect dialect, int isolationLevel)  { throw new RuntimeException(); }
  /**
   * Compute the schema string for this RDD.
   * @param schema (undocumented)
   * @param url (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String schemaString (org.apache.spark.sql.types.StructType schema, java.lang.String url)  { throw new RuntimeException(); }
  /**
   * Saves the RDD to the database in a single transaction.
   * @param df (undocumented)
   * @param url (undocumented)
   * @param table (undocumented)
   * @param options (undocumented)
   */
  static public  void saveTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String url, java.lang.String table, org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions options)  { throw new RuntimeException(); }
  /**
   * Creates a table with a given schema.
   * @param schema (undocumented)
   * @param url (undocumented)
   * @param table (undocumented)
   * @param createTableOptions (undocumented)
   * @param conn (undocumented)
   */
  static public  void createTable (org.apache.spark.sql.types.StructType schema, java.lang.String url, java.lang.String table, java.lang.String createTableOptions, java.sql.Connection conn)  { throw new RuntimeException(); }
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
}
