package org.apache.spark.util;
/**
 * Reads data from a ByteBuffer, and optionally cleans it up using StorageUtils.dispose()
 * at the end of the stream (e.g. to close a memory-mapped file).
 */
  class ByteBufferInputStream extends java.io.InputStream {
  static public  int available () throws java.io.IOException { throw new RuntimeException(); }
  static public  void close () throws java.io.IOException { throw new RuntimeException(); }
  static public  void mark (int x$1)  { throw new RuntimeException(); }
  static public  void reset () throws java.io.IOException { throw new RuntimeException(); }
  static public  boolean markSupported ()  { throw new RuntimeException(); }
  private  java.nio.ByteBuffer buffer ()  { throw new RuntimeException(); }
  // not preceding
  public   ByteBufferInputStream (java.nio.ByteBuffer buffer, boolean dispose)  { throw new RuntimeException(); }
  public  int read ()  { throw new RuntimeException(); }
  public  int read (byte[] dest)  { throw new RuntimeException(); }
  public  int read (byte[] dest, int offset, int length)  { throw new RuntimeException(); }
  public  long skip (long bytes)  { throw new RuntimeException(); }
  /**
   * Clean up the buffer, and potentially dispose of it using StorageUtils.dispose().
   */
  private  void cleanUp ()  { throw new RuntimeException(); }
}
