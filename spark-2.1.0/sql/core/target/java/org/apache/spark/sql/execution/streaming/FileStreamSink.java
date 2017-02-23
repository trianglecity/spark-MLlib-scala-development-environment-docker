package org.apache.spark.sql.execution.streaming;
/**
 * A sink that writes out results to parquet files.  Each batch is written out to a unique
 * directory. After all of the files in a batch have been successfully written, the list of
 * file paths is appended to the log atomically. In the case of partial failures, some duplicate
 * data may be present in the target directory, but only one copy of each file will be present
 * in the log.
 */
public  class FileStreamSink implements org.apache.spark.sql.execution.streaming.Sink, org.apache.spark.internal.Logging {
  static public  java.lang.String metadataDir ()  { throw new RuntimeException(); }
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
  public   FileStreamSink (org.apache.spark.sql.SparkSession sparkSession, java.lang.String path, org.apache.spark.sql.execution.datasources.FileFormat fileFormat, scala.collection.Seq<java.lang.String> partitionColumnNames, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path basePath ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path logPath ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.FileStreamSinkLog fileLog ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  public  void addBatch (long batchId, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
