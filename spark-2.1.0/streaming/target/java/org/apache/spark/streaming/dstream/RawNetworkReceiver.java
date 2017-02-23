package org.apache.spark.streaming.dstream;
  class RawNetworkReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> implements org.apache.spark.internal.Logging {
  public   RawNetworkReceiver (java.lang.String host, int port, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  public  java.lang.Thread blockPushingThread ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  /** Read a buffer fully from a given Channel */
  private  void readFully (java.nio.channels.ReadableByteChannel channel, java.nio.ByteBuffer dest)  { throw new RuntimeException(); }
}
