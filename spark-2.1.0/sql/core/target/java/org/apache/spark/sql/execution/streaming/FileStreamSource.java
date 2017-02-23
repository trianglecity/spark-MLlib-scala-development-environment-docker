package org.apache.spark.sql.execution.streaming;
/**
 * A very simple source that reads files from the given directory as they appear.
 */
public  class FileStreamSource implements org.apache.spark.sql.execution.streaming.Source, org.apache.spark.internal.Logging {
  static public  class FileEntry implements scala.Serializable, scala.Product {
    public  java.lang.String path ()  { throw new RuntimeException(); }
    public  long timestamp ()  { throw new RuntimeException(); }
    public  long batchId ()  { throw new RuntimeException(); }
    // not preceding
    public   FileEntry (java.lang.String path, long timestamp, long batchId)  { throw new RuntimeException(); }
  }
  static public  class FileEntry$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FileEntry$ MODULE$ = null;
    public   FileEntry$ ()  { throw new RuntimeException(); }
  }
  /**
   * A custom hash map used to track the list of files seen. This map is not thread-safe.
   * <p>
   * To prevent the hash map from growing indefinitely, a purge function is available to
   * remove files "maxAgeMs" older than the latest file.
   */
  static public  class SeenFilesMap {
    public   SeenFilesMap (long maxAgeMs)  { throw new RuntimeException(); }
    /** Mapping from file to its timestamp. */
    private  java.util.HashMap<java.lang.String, java.lang.Object> map ()  { throw new RuntimeException(); }
    /** Timestamp of the latest file. */
    private  long latestTimestamp ()  { throw new RuntimeException(); }
    /** Timestamp for the last purge operation. */
    private  long lastPurgeTimestamp ()  { throw new RuntimeException(); }
    /** Add a new file to the map. */
    public  void add (java.lang.String path, long timestamp)  { throw new RuntimeException(); }
    /**
     * Returns true if we should consider this file a new file. The file is only considered "new"
     * if it is new enough that we are still tracking, and we have not seen it before.
     * @param path (undocumented)
     * @param timestamp (undocumented)
     * @return (undocumented)
     */
    public  boolean isNewFile (java.lang.String path, long timestamp)  { throw new RuntimeException(); }
    /** Removes aged entries and returns the number of files removed. */
    public  int purge ()  { throw new RuntimeException(); }
    public  int size ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> allEntries ()  { throw new RuntimeException(); }
  }
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
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  // not preceding
  public   FileStreamSource (org.apache.spark.sql.SparkSession sparkSession, java.lang.String path, java.lang.String fileFormatClassName, org.apache.spark.sql.types.StructType schema, scala.collection.Seq<java.lang.String> partitionColumns, java.lang.String metadataPath, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.FileStreamOptions sourceOptions ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path qualifiedBasePath ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> optionsWithPartitionBasePath ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.streaming.FileStreamSourceLog metadataLog ()  { throw new RuntimeException(); }
  private  long metadataLogCurrentOffset ()  { throw new RuntimeException(); }
  /** Maximum number of new files to be considered in each batch */
  private  scala.Option<java.lang.Object> maxFilesPerBatch ()  { throw new RuntimeException(); }
  private  scala.math.Ordering<java.lang.Object> fileSortOrder ()  { throw new RuntimeException(); }
  /** A mapping from a file that we have processed to some timestamp it was last modified. */
  public  org.apache.spark.sql.execution.streaming.FileStreamSource.SeenFilesMap seenFiles ()  { throw new RuntimeException(); }
  /**
   * Returns the maximum offset that can be retrieved from the source.
   * <p>
   * <code>synchronized</code> on this method is for solving race conditions in tests. In the normal usage,
   * there is no race here, so the cost of <code>synchronized</code> should be rare.
   * @return (undocumented)
   */
  private  org.apache.spark.sql.execution.streaming.FileStreamSourceOffset fetchMaxOffset ()  { throw new RuntimeException(); }
  /**
   * For test only. Run <code>func</code> with the internal lock to make sure when <code>func</code> is running,
   * the current offset won't be changed and no new batch will be emitted.
   * @param func (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withBatchingLocked (scala.Function0<T> func)  { throw new RuntimeException(); }
  /** Return the latest offset in the {@link FileStreamSourceLog} */
  public  long currentLogOffset ()  { throw new RuntimeException(); }
  /**
   * Returns the data that is between the offsets (<code>start</code>, <code>end</code>].
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  /**
   * Returns a list of files found, sorted by their timestamp.
   * @return (undocumented)
   */
  private  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> fetchAllFiles ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Informs the source that Spark has completed processing all data for offsets less than or
   * equal to <code>end</code> and will only request offsets greater than <code>end</code> in the future.
   * @param end (undocumented)
   */
  public  void commit (org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
