package org.apache.spark.streaming.util;
/**
 * A writer for writing byte-buffers to a write ahead log file.
 */
  class FileBasedWriteAheadLogWriter implements java.io.Closeable {
  public   FileBasedWriteAheadLogWriter (java.lang.String path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FSDataOutputStream stream ()  { throw new RuntimeException(); }
  private  long nextOffset ()  { throw new RuntimeException(); }
  private  boolean closed ()  { throw new RuntimeException(); }
  /** Write the bytebuffer to the log file */
  public  org.apache.spark.streaming.util.FileBasedWriteAheadLogSegment write (java.nio.ByteBuffer data)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  void flush ()  { throw new RuntimeException(); }
  private  void assertOpen ()  { throw new RuntimeException(); }
}
