package org.apache.spark.sql.execution.streaming;
/**
 * A special log for {@link FileStreamSink}. It will write one log file for each batch. The first line
 * of the log file is the version number, and there are multiple JSON lines following. Each JSON
 * line is a JSON format of {@link SinkFileStatus}.
 * <p>
 * As reading from many small files is usually pretty slow, {@link FileStreamSinkLog} will compact log
 * files every "spark.sql.sink.file.log.compactLen" batches into a big file. When doing a
 * compaction, it will read all old log files and merge them with the new batch. During the
 * compaction, it will also delete the files that are deleted (marked by {@link SinkFileStatus.action}).
 * When the reader uses <code>allFiles</code> to list all files, this method only returns the visible files
 * (drops the deleted files).
 */
public  class FileStreamSinkLog extends org.apache.spark.sql.execution.streaming.CompactibleFileStreamLog<org.apache.spark.sql.execution.streaming.SinkFileStatus> {
  static public  java.lang.String VERSION ()  { throw new RuntimeException(); }
  static public  java.lang.String DELETE_ACTION ()  { throw new RuntimeException(); }
  static public  java.lang.String ADD_ACTION ()  { throw new RuntimeException(); }
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
  static public  scala.Option<org.apache.hadoop.fs.Path> writeTempBatch (T metadata, scala.Function2<T, java.io.OutputStream, scala.runtime.BoxedUnit> writer)  { throw new RuntimeException(); }
  static public  scala.Option<T> get (org.apache.hadoop.fs.Path batchFile)  { throw new RuntimeException(); }
  static public  scala.Option<T> get (long batchId)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.Object, T>[] get (scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<java.lang.Object, T>> getLatest ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.FileStatus[] getOrderedBatchFiles ()  { throw new RuntimeException(); }
  static public  void purge (long thresholdBatchId)  { throw new RuntimeException(); }
  static public  scala.Function2<T, java.io.OutputStream, scala.runtime.BoxedUnit> writeTempBatch$default$2 ()  { throw new RuntimeException(); }
  static protected  int minBatchesToRetain ()  { throw new RuntimeException(); }
  static protected final  int compactInterval ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.fs.Path batchIdToPath (long batchId)  { throw new RuntimeException(); }
  static public  long pathToBatchId (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static public  boolean isBatchFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static public  void serialize (T[] logData, java.io.OutputStream out)  { throw new RuntimeException(); }
  static public  T[] deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
  static public  boolean add (long batchId, T[] logs)  { throw new RuntimeException(); }
  static public  T[] allFiles ()  { throw new RuntimeException(); }
  public   FileStreamSinkLog (java.lang.String metadataLogVersion, org.apache.spark.sql.SparkSession sparkSession, java.lang.String path)  { throw new RuntimeException(); }
  private  java.lang.Object formats ()  { throw new RuntimeException(); }
  protected  long fileCleanupDelayMs ()  { throw new RuntimeException(); }
  protected  boolean isDeletingExpiredLog ()  { throw new RuntimeException(); }
  protected  int defaultCompactInterval ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.SinkFileStatus> compactLogs (scala.collection.Seq<org.apache.spark.sql.execution.streaming.SinkFileStatus> logs)  { throw new RuntimeException(); }
}
