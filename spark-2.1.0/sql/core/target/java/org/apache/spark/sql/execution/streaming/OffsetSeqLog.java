package org.apache.spark.sql.execution.streaming;
/**
 * This class is used to log offsets to persistent files in HDFS.
 * Each file corresponds to a specific batch of offsets. The file
 * format contain a version string in the first line, followed
 * by a the JSON string representation of the offsets separated
 * by a newline character. If a source offset is missing, then
 * that line will contain a string value defined in the
 * SERIALIZED_VOID_OFFSET variable in {@link OffsetSeqLog} companion object.
 * For instance, when dealing with {@link LongOffset} types:
 *   v1        // version 1
 *   metadata
 *   {0}       // LongOffset 0
 *   {3}       // LongOffset 3
 *   -         // No offset for this source i.e., an invalid JSON string
 *   {2}       // LongOffset 2
 *   ...
 */
public  class OffsetSeqLog extends org.apache.spark.sql.execution.streaming.HDFSMetadataLog<org.apache.spark.sql.execution.streaming.OffsetSeq> {
  static private  java.lang.String VERSION ()  { throw new RuntimeException(); }
  static private  java.lang.String SERIALIZED_VOID_OFFSET ()  { throw new RuntimeException(); }
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
  static public  org.apache.hadoop.fs.Path metadataPath ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.streaming.HDFSMetadataLog.FileManager fileManager ()  { throw new RuntimeException(); }
  static protected  java.lang.Object batchFilesFilter ()  { throw new RuntimeException(); }
  static protected  org.apache.hadoop.fs.Path batchIdToPath (long batchId)  { throw new RuntimeException(); }
  static protected  long pathToBatchId (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static protected  boolean isBatchFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static public  boolean add (long batchId, T metadata)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.hadoop.fs.Path> writeTempBatch (T metadata, scala.Function2<T, java.io.OutputStream, scala.runtime.BoxedUnit> writer)  { throw new RuntimeException(); }
  static public  scala.Option<T> get (org.apache.hadoop.fs.Path batchFile)  { throw new RuntimeException(); }
  static public  scala.Option<T> get (long batchId)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.Object, T>[] get (scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<java.lang.Object, T>> getLatest ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] getOrderedBatchFiles ()  { throw new RuntimeException(); }
  static public  void purge (long thresholdBatchId)  { throw new RuntimeException(); }
  static public  scala.Function2<T, java.io.OutputStream, scala.runtime.BoxedUnit> writeTempBatch$default$2 ()  { throw new RuntimeException(); }
  public   OffsetSeqLog (org.apache.spark.sql.SparkSession sparkSession, java.lang.String path)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.OffsetSeq deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
  protected  void serialize (org.apache.spark.sql.execution.streaming.OffsetSeq offsetSeq, java.io.OutputStream out)  { throw new RuntimeException(); }
}
