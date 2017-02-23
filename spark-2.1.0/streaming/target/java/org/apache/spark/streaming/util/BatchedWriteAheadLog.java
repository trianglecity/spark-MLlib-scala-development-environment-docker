package org.apache.spark.streaming.util;
/**
 * A wrapper for a WriteAheadLog that batches records before writing data. Handles aggregation
 * during writes, and de-aggregation in the <code>readAll</code> method. The end consumer has to handle
 * de-aggregation after the <code>read</code> method. In addition, the <code>WriteAheadLogRecordHandle</code> returned
 * after the write will contain the batch of records rather than individual records.
 * <p>
 * When writing a batch of records, the <code>time</code> passed to the <code>wrappedLog</code> will be the timestamp
 * of the latest record in the batch. This is very important in achieving correctness. Consider the
 * following example:
 * We receive records with timestamps 1, 3, 5, 7. We use "log-1" as the filename. Once we receive
 * a clean up request for timestamp 3, we would clean up the file "log-1", and lose data regarding
 * 5 and 7.
 * <p>
 * This means the caller can assume the same write semantics as any other WriteAheadLog
 * implementation despite the batching in the background - when the write() returns, the data is
 * written to the WAL and is durable. To take advantage of the batching, the caller can write from
 * multiple threads, each of which will stay blocked until the corresponding data has been written.
 * <p>
 * All other methods of the WriteAheadLog interface will be passed on to the wrapped WriteAheadLog.
 */
  class BatchedWriteAheadLog extends org.apache.spark.streaming.util.WriteAheadLog implements org.apache.spark.internal.Logging {
  /**
   * Wrapper class for representing the records that we will write to the WriteAheadLog. Coupled
   * with the timestamp for the write request of the record, and the promise that will block the
   * write request, while a separate thread is actually performing the write.
   */
  static public  class Record implements scala.Product, scala.Serializable {
    public  java.nio.ByteBuffer data ()  { throw new RuntimeException(); }
    public  long time ()  { throw new RuntimeException(); }
    public  scala.concurrent.Promise<org.apache.spark.streaming.util.WriteAheadLogRecordHandle> promise ()  { throw new RuntimeException(); }
    // not preceding
    public   Record (java.nio.ByteBuffer data, long time, scala.concurrent.Promise<org.apache.spark.streaming.util.WriteAheadLogRecordHandle> promise)  { throw new RuntimeException(); }
  }
  static public  class Record$ extends scala.runtime.AbstractFunction3<java.nio.ByteBuffer, java.lang.Object, scala.concurrent.Promise<org.apache.spark.streaming.util.WriteAheadLogRecordHandle>, org.apache.spark.streaming.util.BatchedWriteAheadLog.Record> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Record$ MODULE$ = null;
    public   Record$ ()  { throw new RuntimeException(); }
  }
  /** Aggregate multiple serialized ReceivedBlockTrackerLogEvents in a single ByteBuffer. */
  static public  java.nio.ByteBuffer aggregate (scala.collection.Seq<org.apache.spark.streaming.util.BatchedWriteAheadLog.Record> records)  { throw new RuntimeException(); }
  /**
   * De-aggregate serialized ReceivedBlockTrackerLogEvents in a single ByteBuffer.
   * A stream may not have used batching initially, but started using it after a restart. This
   * method therefore needs to be backwards compatible.
   * @param buffer (undocumented)
   * @return (undocumented)
   */
  static public  java.nio.ByteBuffer[] deaggregate (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
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
  public  org.apache.spark.streaming.util.WriteAheadLog wrappedLog ()  { throw new RuntimeException(); }
  // not preceding
  public   BatchedWriteAheadLog (org.apache.spark.streaming.util.WriteAheadLog wrappedLog, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<org.apache.spark.streaming.util.BatchedWriteAheadLog.Record> walWriteQueue ()  { throw new RuntimeException(); }
  private  boolean active ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.util.BatchedWriteAheadLog.Record> buffer ()  { throw new RuntimeException(); }
  private  java.lang.Thread batchedWriterThread ()  { throw new RuntimeException(); }
  /**
   * Write a byte buffer to the log file. This method adds the byteBuffer to a queue and blocks
   * until the record is properly written by the parent.
   * @param byteBuffer (undocumented)
   * @param time (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.util.WriteAheadLogRecordHandle write (java.nio.ByteBuffer byteBuffer, long time)  { throw new RuntimeException(); }
  /**
   * This method is not supported as the resulting ByteBuffer would actually require de-aggregation.
   * This method is primarily used in testing, and to ensure that it is not used in production,
   * we throw an UnsupportedOperationException.
   * @param segment (undocumented)
   * @return (undocumented)
   */
  public  java.nio.ByteBuffer read (org.apache.spark.streaming.util.WriteAheadLogRecordHandle segment)  { throw new RuntimeException(); }
  /**
   * Read all the existing logs from the log directory. The output of the wrapped WriteAheadLog
   * will be de-aggregated.
   * @return (undocumented)
   */
  public  java.util.Iterator<java.nio.ByteBuffer> readAll ()  { throw new RuntimeException(); }
  /**
   * Delete the log files that are older than the threshold time.
   * <p>
   * This method is handled by the parent WriteAheadLog.
   * @param threshTime (undocumented)
   * @param waitForCompletion (undocumented)
   */
  public  void clean (long threshTime, boolean waitForCompletion)  { throw new RuntimeException(); }
  /**
   * Stop the batched writer thread, fulfill promises with failures and close the wrapped WAL.
   */
  public  void close ()  { throw new RuntimeException(); }
  /** Start the actual log writer on a separate thread. */
  private  java.lang.Thread startBatchedWriterThread ()  { throw new RuntimeException(); }
  /** Write all the records in the buffer to the write ahead log. */
  private  void flushRecords ()  { throw new RuntimeException(); }
  /** Method for querying the queue length. Should only be used in tests. */
  private  int getQueueLength ()  { throw new RuntimeException(); }
}
