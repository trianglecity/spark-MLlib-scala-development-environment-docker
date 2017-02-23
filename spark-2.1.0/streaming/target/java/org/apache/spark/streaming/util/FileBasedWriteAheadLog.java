package org.apache.spark.streaming.util;
/**
 * This class manages write ahead log files.
 * <p>
 *  - Writes records (bytebuffers) to periodically rotating log files.
 *  - Recovers the log files and the reads the recovered records upon failures.
 *  - Cleans up old log files.
 * <p>
 * Uses {@link org.apache.spark.streaming.util.FileBasedWriteAheadLogWriter} to write
 * and {@link org.apache.spark.streaming.util.FileBasedWriteAheadLogReader} to read.
 * <p>
 * param:  logDirectory Directory when rotating log files will be created.
 * param:  hadoopConf Hadoop configuration for reading/writing log files.
 */
  class FileBasedWriteAheadLog extends org.apache.spark.streaming.util.WriteAheadLog implements org.apache.spark.internal.Logging {
  static public  class LogInfo implements scala.Product, scala.Serializable {
    public  long startTime ()  { throw new RuntimeException(); }
    public  long endTime ()  { throw new RuntimeException(); }
    public  java.lang.String path ()  { throw new RuntimeException(); }
    // not preceding
    public   LogInfo (long startTime, long endTime, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  class LogInfo$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.String, org.apache.spark.streaming.util.FileBasedWriteAheadLog.LogInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LogInfo$ MODULE$ = null;
    public   LogInfo$ ()  { throw new RuntimeException(); }
  }
  static public  scala.util.matching.Regex logFileRegex ()  { throw new RuntimeException(); }
  static public  java.lang.String timeToLogFile (long startTime, long stopTime)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> getCallerName ()  { throw new RuntimeException(); }
  /** Convert a sequence of files to a sequence of sorted LogInfo objects */
  static public  scala.collection.Seq<org.apache.spark.streaming.util.FileBasedWriteAheadLog.LogInfo> logFilesTologInfo (scala.collection.Seq<org.apache.hadoop.fs.Path> files)  { throw new RuntimeException(); }
  /**
   * This creates an iterator from a parallel collection, by keeping at most <code>n</code> objects in memory
   * at any given time, where <code>n</code> is at most the max of the size of the thread pool or 8. This is
   * crucial for use cases where we create <code>FileBasedWriteAheadLogReader</code>s during parallel recovery.
   * We don't want to open up <code>k</code> streams altogether where <code>k</code> is the size of the Seq that we want
   * to parallelize.
   * @param executionContext (undocumented)
   * @param source (undocumented)
   * @param handler (undocumented)
   * @return (undocumented)
   */
  static public <I extends java.lang.Object, O extends java.lang.Object> scala.collection.Iterator<O> seqToParIterator (scala.concurrent.ExecutionContext executionContext, scala.collection.Seq<I> source, scala.Function1<I, scala.collection.Iterator<O>> handler)  { throw new RuntimeException(); }
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
  public   FileBasedWriteAheadLog (org.apache.spark.SparkConf conf, java.lang.String logDirectory, org.apache.hadoop.conf.Configuration hadoopConf, int rollingIntervalSecs, int maxFailures, boolean closeFileAfterWrite)  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.util.FileBasedWriteAheadLog.LogInfo> pastLogs ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> callerName ()  { throw new RuntimeException(); }
  private  java.lang.String threadpoolName ()  { throw new RuntimeException(); }
  private  scala.concurrent.forkjoin.ForkJoinPool forkJoinPool ()  { throw new RuntimeException(); }
  private  scala.concurrent.ExecutionContextExecutorService executionContext ()  { throw new RuntimeException(); }
  protected  java.lang.String logName ()  { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> currentLogPath ()  { throw new RuntimeException(); }
  private  org.apache.spark.streaming.util.FileBasedWriteAheadLogWriter currentLogWriter ()  { throw new RuntimeException(); }
  private  long currentLogWriterStartTime ()  { throw new RuntimeException(); }
  private  long currentLogWriterStopTime ()  { throw new RuntimeException(); }
  /**
   * Write a byte buffer to the log file. This method synchronously writes the data in the
   * ByteBuffer to HDFS. When this method returns, the data is guaranteed to have been flushed
   * to HDFS, and will be available for readers to read.
   * @param byteBuffer (undocumented)
   * @param time (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.util.FileBasedWriteAheadLogSegment write (java.nio.ByteBuffer byteBuffer, long time)  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer read (org.apache.spark.streaming.util.WriteAheadLogRecordHandle segment)  { throw new RuntimeException(); }
  /**
   * Read all the existing logs from the log directory.
   * <p>
   * Note that this is typically called when the caller is initializing and wants
   * to recover past state from the write ahead logs (that is, before making any writes).
   * If this is called after writes have been made using this manager, then it may not return
   * the latest the records. This does not deal with currently active log files, and
   * hence the implementation is kept simple.
   * @return (undocumented)
   */
  public  java.util.Iterator<java.nio.ByteBuffer> readAll ()  { throw new RuntimeException(); }
  /**
   * Delete the log files that are older than the threshold time.
   * <p>
   * Its important to note that the threshold time is based on the time stamps used in the log
   * files, which is usually based on the local system time. So if there is coordination necessary
   * between the node calculating the threshTime (say, driver node), and the local system time
   * (say, worker node), the caller has to take account of possible time skew.
   * <p>
   * If waitForCompletion is set to true, this method will return only after old logs have been
   * deleted. This should be set to true only for testing. Else the files will be deleted
   * asynchronously.
   * @param threshTime (undocumented)
   * @param waitForCompletion (undocumented)
   */
  public  void clean (long threshTime, boolean waitForCompletion)  { throw new RuntimeException(); }
  /** Stop the manager, close any open log writer */
  public  void close ()  { throw new RuntimeException(); }
  /** Get the current log writer while taking care of rotation */
  private  org.apache.spark.streaming.util.FileBasedWriteAheadLogWriter getLogWriter (long currentTime)  { throw new RuntimeException(); }
  /** Initialize the log directory or recover existing logs inside the directory */
  private  void initializeOrRecover ()  { throw new RuntimeException(); }
  private  void resetWriter ()  { throw new RuntimeException(); }
}
