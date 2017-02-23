package org.apache.spark.util.io;
/**
 * Reads data from a ChunkedByteBuffer.
 * <p>
 * param:  dispose if true, <code>ChunkedByteBuffer.dispose()</code> will be called at the end of the stream
 *                in order to close any memory-mapped files which back the buffer.
 */
public  class ChunkedByteBufferInputStream extends java.io.InputStream {
  public  org.apache.spark.util.io.ChunkedByteBuffer chunkedByteBuffer ()  { throw new RuntimeException(); }
  // not preceding
  public   ChunkedByteBufferInputStream (org.apache.spark.util.io.ChunkedByteBuffer chunkedByteBuffer, boolean dispose)  { throw new RuntimeException(); }
  public  int read ()  { throw new RuntimeException(); }
  public  int read (byte[] dest, int offset, int length)  { throw new RuntimeException(); }
  public  long skip (long bytes)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
