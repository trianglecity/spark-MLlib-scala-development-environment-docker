package org.apache.spark.storage.memory;
/**
 * A wrapper which allows an open {@link OutputStream} to be redirected to a different sink.
 */
  class RedirectableOutputStream extends java.io.OutputStream {
  public   RedirectableOutputStream ()  { throw new RuntimeException(); }
  public  void setOutputStream (java.io.OutputStream s)  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] b)  { throw new RuntimeException(); }
  public  void write (byte[] b, int off, int len)  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
