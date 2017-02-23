package org.apache.spark.sql.execution.datasources.csv;
public  class CSVRelation {
  static public  org.apache.spark.rdd.RDD<java.lang.String[]> univocityTokenizer (org.apache.spark.rdd.RDD<java.lang.String> file, java.lang.String firstLine, org.apache.spark.sql.execution.datasources.csv.CSVOptions params)  { throw new RuntimeException(); }
  /**
   * Returns a function that parses a single CSV record (in the form of an array of strings in which
   * each element represents a column) and turns it into either one resulting row or no row (if the
   * the record is malformed).
   * <p>
   * The 2nd argument in the returned function represents the total number of malformed rows
   * observed so far.
   * @param schema (undocumented)
   * @param requiredColumns (undocumented)
   * @param params (undocumented)
   * @return (undocumented)
   */
  static public  scala.Function2<java.lang.String[], java.lang.Object, scala.Option<org.apache.spark.sql.catalyst.InternalRow>> csvParser (org.apache.spark.sql.types.StructType schema, java.lang.String[] requiredColumns, org.apache.spark.sql.execution.datasources.csv.CSVOptions params)  { throw new RuntimeException(); }
  static public  void dropHeaderLine (org.apache.spark.sql.execution.datasources.PartitionedFile file, scala.collection.Iterator<java.lang.String> lines, org.apache.spark.sql.execution.datasources.csv.CSVOptions csvOptions)  { throw new RuntimeException(); }
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
