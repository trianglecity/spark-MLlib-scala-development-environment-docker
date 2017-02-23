package org.apache.spark.sql.hive.test;
/**
 * A {@link SparkSession} used in {@link TestHiveContext}.
 * <p>
 * param:  sc SparkContext
 * param:  existingSharedState optional {@link SharedState}
 * param:  loadTestTables if true, load the test tables. They can only be loaded when running
 *                       in the JVM, i.e when calling from Python this flag has to be false.
 */
  class TestHiveSparkSession extends org.apache.spark.sql.SparkSession implements org.apache.spark.internal.Logging {
  private  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.sql.internal.SharedState> existingSharedState ()  { throw new RuntimeException(); }
  private  boolean loadTestTables ()  { throw new RuntimeException(); }
  // not preceding
  public   TestHiveSparkSession (org.apache.spark.SparkContext sc, scala.Option<org.apache.spark.sql.internal.SharedState> existingSharedState, boolean loadTestTables)  { throw new RuntimeException(); }
  public   TestHiveSparkSession (org.apache.spark.SparkContext sc, boolean loadTestTables)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SharedState sharedState ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.test.TestHiveSessionState sessionState ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.test.TestHiveSparkSession newSession ()  { throw new RuntimeException(); }
  private  boolean cacheTables ()  { throw new RuntimeException(); }
  public  void setCacheTables (boolean c)  { throw new RuntimeException(); }
  /** The location of the compiled hive distribution */
  public  scala.Option<java.io.File> hiveHome ()  { throw new RuntimeException(); }
  /** The location of the hive source code. */
  public  scala.Option<java.io.File> hiveDevHome ()  { throw new RuntimeException(); }
  /**
   * Returns the value of specified environmental variable as a {@link java.io.File} after checking
   * to ensure it exists
   * @param envVar (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<java.io.File> envVarToFile (java.lang.String envVar)  { throw new RuntimeException(); }
  public  java.io.File hiveFilesTemp ()  { throw new RuntimeException(); }
  public  java.io.File getHiveFile (java.lang.String path)  { throw new RuntimeException(); }
  private  java.lang.String quoteHiveFile (java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String getWarehousePath ()  { throw new RuntimeException(); }
  public  scala.util.matching.Regex describedTable ()  { throw new RuntimeException(); }
  public  class TestTable implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>> commands ()  { throw new RuntimeException(); }
    // not preceding
    public   TestTable (java.lang.String name, scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>> commands)  { throw new RuntimeException(); }
  }
  public  class TestTable extends scala.runtime.AbstractFunction2<java.lang.String, scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>>, org.apache.spark.sql.hive.test.TestHiveSparkSession.TestTable> implements scala.Serializable {
    public   TestTable ()  { throw new RuntimeException(); }
  }
  protected  class SqlCmd {
    public   SqlCmd (java.lang.String sql)  { throw new RuntimeException(); }
    public  scala.Function0<scala.runtime.BoxedUnit> cmd ()  { throw new RuntimeException(); }
  }
  /**
   * A list of test tables and the DDL required to initialize them.  A test table is loaded on
   * demand when a query are run against it.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.sql.hive.test.TestHiveSparkSession.TestTable> testTables ()  { throw new RuntimeException(); }
  public  void registerTestTable (org.apache.spark.sql.hive.test.TestHiveSparkSession.TestTable testTable)  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> loadedTables ()  { throw new RuntimeException(); }
  public  void loadTestTable (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Records the UDFs present when the server starts, so we can delete ones that are created by
   * tests.
   * @return (undocumented)
   */
  protected  java.util.Set<java.lang.String> originalUDFs ()  { throw new RuntimeException(); }
  /**
   * Resets the test instance by deleting any tables that have been created.
   * TODO: also clear out UDFs, views, etc.
   */
  public  void reset ()  { throw new RuntimeException(); }
}
