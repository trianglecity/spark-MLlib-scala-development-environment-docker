package org.apache.spark.streaming.util;
/**
 * A random access reader for reading write ahead log files written using
 * {@link org.apache.spark.streaming.util.FileBasedWriteAheadLogWriter}. Given the file segment info,
 * this reads the record (ByteBuffer) from the log file.
 */
  class FileBasedWriteAheadLogRandomReader implements java.io.Closeable {
  public   FileBasedWriteAheadLogRandomReader (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FSDataInputStream instream ()  { throw new RuntimeException(); }
  private  boolean closed ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer read (org.apache.spark.streaming.util.FileBasedWriteAheadLogSegment segment)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  void assertOpen ()  { throw new RuntimeException(); }
}
