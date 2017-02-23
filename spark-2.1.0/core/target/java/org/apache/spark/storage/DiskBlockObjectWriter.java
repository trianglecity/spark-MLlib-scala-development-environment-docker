package org.apache.spark.storage;
/**
 * A class for writing JVM objects directly to a file on disk. This class allows data to be appended
 * to an existing block. For efficiency, it retains the underlying file channel across
 * multiple commits. This channel is kept open until close() is called. In case of faults,
 * callers should instead close with revertPartialWritesAndClose() to atomically revert the
 * uncommitted partial writes.
 * <p>
 * This class does not support concurrent writes. Also, once the writer has been opened it cannot be
 * reopened again.
 */
  class DiskBlockObjectWriter extends java.io.OutputStream implements org.apache.spark.internal.Logging {
  /**
   * Guards against close calls, e.g. from a wrapping stream.
   * Call manualClose to close the stream that was extended by this trait.
   * Commit uses this trait to close object streams without paying the
   * cost of closing and opening the underlying file.
   */
  private  interface ManualCloseOutputStream {
    public  void close ()  ;
    public  void manualClose ()  ;
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
  public  java.io.File file ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
  // not preceding
  public   DiskBlockObjectWriter (java.io.File file, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.serializer.SerializerInstance serializerInstance, int bufferSize, boolean syncWrites, org.apache.spark.executor.ShuffleWriteMetrics writeMetrics, org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /** The file channel, used for repositioning / truncating the file. */
  private  java.nio.channels.FileChannel channel ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.DiskBlockObjectWriter.ManualCloseOutputStream mcs ()  { throw new RuntimeException(); }
  private  java.io.OutputStream bs ()  { throw new RuntimeException(); }
  private  java.io.FileOutputStream fos ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.TimeTrackingOutputStream ts ()  { throw new RuntimeException(); }
  private  org.apache.spark.serializer.SerializationStream objOut ()  { throw new RuntimeException(); }
  private  boolean initialized ()  { throw new RuntimeException(); }
  private  boolean streamOpen ()  { throw new RuntimeException(); }
  private  boolean hasBeenClosed ()  { throw new RuntimeException(); }
  /**
   * Cursors used to represent positions in the file.
   * <p>
   * xxxxxxxxxx|----------|-----|
   *           ^          ^     ^
   *           |          |    channel.position()
   *           |        reportedPosition
   *         committedPosition
   * <p>
   * reportedPosition: Position at the time of the last update to the write metrics.
   * committedPosition: Offset after last committed write.
   * -----: Current writes to the underlying file.
   * xxxxx: Committed contents of the file.
   * @return (undocumented)
   */
  private  long committedPosition ()  { throw new RuntimeException(); }
  private  long reportedPosition ()  { throw new RuntimeException(); }
  /**
   * Keep track of number of records written and also use this to periodically
   * output bytes written since the latter is expensive to do for each record.
   * @return (undocumented)
   */
  private  int numRecordsWritten ()  { throw new RuntimeException(); }
  private  void initialize ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.DiskBlockObjectWriter open ()  { throw new RuntimeException(); }
  /**
   * Close and cleanup all resources.
   * Should call after committing or reverting partial writes.
   */
  private  void closeResources ()  { throw new RuntimeException(); }
  /**
   * Commits any remaining partial writes and closes resources.
   */
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Flush the partial writes and commit them as a single atomic block.
   * A commit may write additional bytes to frame the atomic block.
   * <p>
   * @return file segment with previous offset and length committed on this call.
   */
  public  org.apache.spark.storage.FileSegment commitAndGet ()  { throw new RuntimeException(); }
  /**
   * Reverts writes that haven't been committed yet. Callers should invoke this function
   * when there are runtime exceptions. This method will not throw, though it may be
   * unsuccessful in truncating written data.
   * <p>
   * @return the file that this DiskBlockObjectWriter wrote to.
   */
  public  java.io.File revertPartialWritesAndClose ()  { throw new RuntimeException(); }
  /**
   * Writes a key-value pair.
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void write (Object key, Object value)  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] kvBytes, int offs, int len)  { throw new RuntimeException(); }
  /**
   * Notify the writer that a record worth of bytes has been written with OutputStream#write.
   */
  public  void recordWritten ()  { throw new RuntimeException(); }
  /**
   * Report the number of bytes written in this writer's shuffle write metrics.
   * Note that this is only valid before the underlying streams are closed.
   */
  private  void updateBytesWritten ()  { throw new RuntimeException(); }
    void flush ()  { throw new RuntimeException(); }
}
