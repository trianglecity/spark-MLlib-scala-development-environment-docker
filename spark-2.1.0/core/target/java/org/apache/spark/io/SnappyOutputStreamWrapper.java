package org.apache.spark.io;
/**
 * Wrapper over <code>SnappyOutputStream</code> which guards against write-after-close and double-close
 * issues. See SPARK-7660 for more details. This wrapping can be removed if we upgrade to a version
 * of snappy-java that contains the fix for https://github.com/xerial/snappy-java/issues/107.
 */
public final class SnappyOutputStreamWrapper extends java.io.OutputStream {
  public   SnappyOutputStreamWrapper (org.xerial.snappy.SnappyOutputStream os)  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] b)  { throw new RuntimeException(); }
  public  void write (byte[] b, int off, int len)  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
