package org.apache.spark.sql.api.r;
public  class SQLUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SQLUtils$ MODULE$ = null;
  public   SQLUtils$ ()  { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext withHiveExternalCatalog (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession getOrCreateSparkSession (org.apache.spark.api.java.JavaSparkContext jsc, java.util.Map<java.lang.Object, java.lang.Object> sparkConfigMap, boolean enableHiveSupport)  { throw new RuntimeException(); }
  public  void setSparkContextSessionConf (org.apache.spark.sql.SparkSession spark, java.util.Map<java.lang.Object, java.lang.Object> sparkConfigMap)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> getSessionConf (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaSparkContext getJavaSparkContext (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType createStructType (scala.collection.Seq<org.apache.spark.sql.types.StructField> fields)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType getSQLDataType (java.lang.String dataType)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructField createStructField (java.lang.String name, java.lang.String dataType, boolean nullable)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDF (org.apache.spark.rdd.RDD<byte[]> rdd, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaRDD<byte[]> dfToRowRDD (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  private  java.lang.Object doConversion (java.lang.Object data, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
    org.apache.spark.sql.Row bytesToRow (byte[] bytes, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    byte[] rowToRBytes (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType SERIALIZED_R_DATA_SCHEMA ()  { throw new RuntimeException(); }
  /**
   * The helper function for dapply() on R side.
   * @param df (undocumented)
   * @param func (undocumented)
   * @param packageNames (undocumented)
   * @param broadcastVars (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dapply (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, byte[] func, byte[] packageNames, java.lang.Object[] broadcastVars, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * The helper function for gapply() on R side.
   * @param gd (undocumented)
   * @param func (undocumented)
   * @param packageNames (undocumented)
   * @param broadcastVars (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> gapply (org.apache.spark.sql.RelationalGroupedDataset gd, byte[] func, byte[] packageNames, java.lang.Object[] broadcastVars, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  java.lang.Object[][] dfToCols (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SaveMode saveMode (java.lang.String mode)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> loadDF (org.apache.spark.sql.SparkSession sparkSession, java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> loadDF (org.apache.spark.sql.SparkSession sparkSession, java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  java.lang.Object readSqlObject (java.io.DataInputStream dis, char dataType)  { throw new RuntimeException(); }
  public  boolean writeSqlObject (java.io.DataOutputStream dos, java.lang.Object obj)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getTables (org.apache.spark.sql.SparkSession sparkSession, java.lang.String databaseName)  { throw new RuntimeException(); }
  public  java.lang.String[] getTableNames (org.apache.spark.sql.SparkSession sparkSession, java.lang.String databaseName)  { throw new RuntimeException(); }
}
