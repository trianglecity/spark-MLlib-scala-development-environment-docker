package org.apache.spark.storage;
/**
 * Helper class that ensures a ManagedBuffer is released upon InputStream.close()
 */
public  class BufferReleasingInputStream extends java.io.InputStream {
  private  java.io.InputStream delegate ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.ShuffleBlockFetcherIterator iterator ()  { throw new RuntimeException(); }
  // not preceding
  public   BufferReleasingInputStream (java.io.InputStream delegate, org.apache.spark.storage.ShuffleBlockFetcherIterator iterator)  { throw new RuntimeException(); }
  public  int read ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  int available ()  { throw new RuntimeException(); }
  public  void mark (int readlimit)  { throw new RuntimeException(); }
  public  long skip (long n)  { throw new RuntimeException(); }
  public  boolean markSupported ()  { throw new RuntimeException(); }
  public  int read (byte[] b)  { throw new RuntimeException(); }
  public  int read (byte[] b, int off, int len)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
}
