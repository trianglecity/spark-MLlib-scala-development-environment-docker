package org.apache.spark.streaming.util;
  class RateLimitedOutputStream extends java.io.OutputStream implements org.apache.spark.internal.Logging {
  public   RateLimitedOutputStream (java.io.OutputStream out, int desiredBytesPerSec)  { throw new RuntimeException(); }
  private  long SYNC_INTERVAL ()  { throw new RuntimeException(); }
  private  int CHUNK_SIZE ()  { throw new RuntimeException(); }
  private  long lastSyncTime ()  { throw new RuntimeException(); }
  private  long bytesWrittenSinceSync ()  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] bytes)  { throw new RuntimeException(); }
  public final  void write (byte[] bytes, int offset, int length)  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  private  void waitToWrite (int numBytes)  { throw new RuntimeException(); }
}
