package org.apache.spark.streaming.util;
/**
 * A reader for reading write ahead log files written using
 * {@link org.apache.spark.streaming.util.FileBasedWriteAheadLogWriter}. This reads
 * the records (bytebuffers) in the log file sequentially and return them as an
 * iterator of bytebuffers.
 */
  class FileBasedWriteAheadLogReader implements scala.collection.Iterator<java.nio.ByteBuffer>, java.io.Closeable, org.apache.spark.internal.Logging {
  public   FileBasedWriteAheadLogReader (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FSDataInputStream instream ()  { throw new RuntimeException(); }
  private  boolean closed ()  { throw new RuntimeException(); }
  private  scala.Option<java.nio.ByteBuffer> nextItem ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer next ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
