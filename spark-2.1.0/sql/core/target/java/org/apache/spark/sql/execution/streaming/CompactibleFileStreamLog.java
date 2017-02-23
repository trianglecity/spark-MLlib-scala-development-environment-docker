package org.apache.spark.sql.execution.streaming;
/**
 * An abstract class for compactible metadata logs. It will write one log file for each batch.
 * The first line of the log file is the version number, and there are multiple serialized
 * metadata lines following.
 * <p>
 * As reading from many small files is usually pretty slow, also too many
 * small files in one folder will mess the FS, {@link CompactibleFileStreamLog} will
 * compact log files every 10 batches by default into a big file. When
 * doing a compaction, it will read all old log files and merge them with the new batch.
 */
public abstract class CompactibleFileStreamLog<T extends java.lang.Object> extends org.apache.spark.sql.execution.streaming.HDFSMetadataLog<T[]> {
  static public  java.lang.String COMPACT_FILE_SUFFIX ()  { throw new RuntimeException(); }
  static public  long getBatchIdFromFileName (java.lang.String fileName)  { throw new RuntimeException(); }
  /**
   * Returns if this is a compaction batch. FileStreamSinkLog will compact old logs every
   * <code>compactInterval</code> commits.
   * <p>
   * E.g., if <code>compactInterval</code> is 3, then 2, 5, 8, ... are all compaction batches.
   * @param batchId (undocumented)
   * @param compactInterval (undocumented)
   * @return (undocumented)
   */
  static public  boolean isCompactionBatch (long batchId, int compactInterval)  { throw new RuntimeException(); }
  /**
   * Returns all valid batches before the specified <code>compactionBatchId</code>. They contain all logs we
   * need to do a new compaction.
   * <p>
   * E.g., if <code>compactInterval</code> is 3 and <code>compactionBatchId</code> is 5, this method should returns
   * <code>Seq(2, 3, 4)</code> (Note: it includes the previous compaction batch 2).
   * @param compactionBatchId (undocumented)
   * @param compactInterval (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<java.lang.Object> getValidBatchesBeforeCompactionBatch (long compactionBatchId, int compactInterval)  { throw new RuntimeException(); }
  /**
   * Returns all necessary logs before <code>batchId</code> (inclusive). If <code>batchId</code> is a compaction, just
   * return itself. Otherwise, it will find the previous compaction batch and return all batches
   * between it and <code>batchId</code>.
   * @param batchId (undocumented)
   * @param compactInterval (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<java.lang.Object> getAllValidBatches (long batchId, long compactInterval)  { throw new RuntimeException(); }
  /**
   * Returns the next compaction batch id after <code>batchId</code>.
   * @param batchId (undocumented)
   * @param compactInterval (undocumented)
   * @return (undocumented)
   */
  static public  long nextCompactionBatchId (long batchId, long compactInterval)  { throw new RuntimeException(); }
  /**
   * Derives a compact interval from the latest compact batch id and
   * a default compact interval.
   * @param defaultInterval (undocumented)
   * @param latestCompactBatchId (undocumented)
   * @return (undocumented)
   */
  static public  int deriveCompactInterval (int defaultInterval, int latestCompactBatchId)  { throw new RuntimeException(); }
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
  // not preceding
  public   CompactibleFileStreamLog (java.lang.String metadataLogVersion, org.apache.spark.sql.SparkSession sparkSession, java.lang.String path, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private  java.lang.Object formats ()  { throw new RuntimeException(); }
  /** Needed to serialize type T into JSON when using Jackson */
  private  scala.reflect.Manifest<T> manifest ()  { throw new RuntimeException(); }
  protected  int minBatchesToRetain ()  { throw new RuntimeException(); }
  /**
   * If we delete the old files after compaction at once, there is a race condition in S3: other
   * processes may see the old files are deleted but still cannot see the compaction file using
   * "list". The <code>allFiles</code> handles this by looking for the next compaction file directly, however,
   * a live lock may happen if the compaction happens too frequently: one processing keeps deleting
   * old files while another one keeps retrying. Setting a reasonable cleanup delay could avoid it.
   * @return (undocumented)
   */
  protected abstract  long fileCleanupDelayMs ()  ;
  protected abstract  boolean isDeletingExpiredLog ()  ;
  protected abstract  int defaultCompactInterval ()  ;
  protected final  int compactInterval ()  { throw new RuntimeException(); }
  /**
   * Filter out the obsolete logs.
   * @param logs (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.collection.Seq<T> compactLogs (scala.collection.Seq<T> logs)  ;
  public  org.apache.hadoop.fs.Path batchIdToPath (long batchId)  { throw new RuntimeException(); }
  public  long pathToBatchId (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  boolean isBatchFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  void serialize (T[] logData, java.io.OutputStream out)  { throw new RuntimeException(); }
  public  T[] deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
  public  boolean add (long batchId, T[] logs)  { throw new RuntimeException(); }
  /**
   * Compacts all logs before <code>batchId</code> plus the provided <code>logs</code>, and writes them into the
   * corresponding <code>batchId</code> file. It will delete expired files as well if enabled.
   * @param batchId (undocumented)
   * @param logs (undocumented)
   * @return (undocumented)
   */
  private  boolean compact (long batchId, T[] logs)  { throw new RuntimeException(); }
  /**
   * Returns all files except the deleted ones.
   * @return (undocumented)
   */
  public  T[] allFiles ()  { throw new RuntimeException(); }
  /**
   * Delete expired log entries that proceed the currentBatchId and retain
   * sufficient minimum number of batches (given by minBatchsToRetain). This
   * equates to retaining the earliest compaction log that proceeds
   * batch id position currentBatchId + 1 - minBatchesToRetain. All log entries
   * prior to the earliest compaction log proceeding that position will be removed.
   * However, due to the eventual consistency of S3, the compaction file may not
   * be seen by other processes at once. So we only delete files created
   * <code>fileCleanupDelayMs</code> milliseconds ago.
   * @param currentBatchId (undocumented)
   */
  private  void deleteExpiredLog (long currentBatchId)  { throw new RuntimeException(); }
}
