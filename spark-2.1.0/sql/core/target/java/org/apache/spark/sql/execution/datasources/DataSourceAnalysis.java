package org.apache.spark.sql.execution.datasources;
/**
 * Replaces generic operations with specific variants that are designed to work with Spark
 * SQL Data Sources.
 */
public  class DataSourceAnalysis extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
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
  public  org.apache.spark.sql.catalyst.CatalystConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   DataSourceAnalysis (org.apache.spark.sql.catalyst.CatalystConf conf)  { throw new RuntimeException(); }
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> convertStaticPartitions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> sourceAttributes, scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> providedPartitions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> targetAttributes, org.apache.spark.sql.types.StructType targetPartitionSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Given a set of input partitions, returns those that have locations that differ from the
   * Hive default (e.g. /k1=v1/k2=v2). These partitions were manually assigned locations by
   * the user.
   * <p>
   * @return a mapping from partition specs to their custom locations
   * @param spark (undocumented)
   * @param table (undocumented)
   * @param basePath (undocumented)
   * @param partitions (undocumented)
   */
  private  scala.collection.immutable.Map<scala.collection.immutable.Map<java.lang.String, java.lang.String>, java.lang.String> getCustomPartitionLocations (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.catalyst.catalog.CatalogTable table, org.apache.hadoop.fs.Path basePath, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> partitions)  { throw new RuntimeException(); }
}
