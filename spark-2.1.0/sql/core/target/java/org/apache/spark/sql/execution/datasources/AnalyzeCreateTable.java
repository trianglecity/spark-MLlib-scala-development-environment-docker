package org.apache.spark.sql.execution.datasources;
/**
 * Analyze {@link CreateTable} and do some normalization and checking.
 * For CREATE TABLE AS SELECT, the SELECT query is also analyzed.
 */
public  class AnalyzeCreateTable extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
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
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
  public   AnalyzeCreateTable (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTable checkPartitionColumns (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.catalyst.catalog.CatalogTable tableDesc)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.catalog.CatalogTable checkBucketColumns (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.catalyst.catalog.CatalogTable tableDesc)  { throw new RuntimeException(); }
  private  void checkDuplication (scala.collection.Seq<java.lang.String> colNames, java.lang.String colType)  { throw new RuntimeException(); }
  private  java.lang.String normalizeColumnName (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, org.apache.spark.sql.types.StructType schema, java.lang.String colName, java.lang.String colType)  { throw new RuntimeException(); }
  private  scala.runtime.Nothing$ failAnalysis (java.lang.String msg)  { throw new RuntimeException(); }
}
