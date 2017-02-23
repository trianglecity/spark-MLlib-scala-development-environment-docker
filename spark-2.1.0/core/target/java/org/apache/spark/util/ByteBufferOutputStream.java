package org.apache.spark.util;
/**
 * Provide a zero-copy way to convert data in ByteArrayOutputStream to ByteBuffer
 */
  class ByteBufferOutputStream extends java.io.ByteArrayOutputStream {
  public   ByteBufferOutputStream (int capacity)  { throw new RuntimeException(); }
  public   ByteBufferOutputStream ()  { throw new RuntimeException(); }
  public  int getCount ()  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] b, int off, int len)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer toByteBuffer ()  { throw new RuntimeException(); }
}
