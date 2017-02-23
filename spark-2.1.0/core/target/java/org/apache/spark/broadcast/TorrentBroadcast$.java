package org.apache.spark.broadcast;
public  class TorrentBroadcast$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TorrentBroadcast$ MODULE$ = null;
  public   TorrentBroadcast$ ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.nio.ByteBuffer[] blockifyObject (T obj, int blockSize, org.apache.spark.serializer.Serializer serializer, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T unBlockifyObject (java.nio.ByteBuffer[] blocks, org.apache.spark.serializer.Serializer serializer, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Remove all persisted blocks associated with this torrent broadcast on the executors.
   * If removeFromDriver is true, also remove these persisted blocks on the driver.
   * @param id (undocumented)
   * @param removeFromDriver (undocumented)
   * @param blocking (undocumented)
   */
  public  void unpersist (long id, boolean removeFromDriver, boolean blocking)  { throw new RuntimeException(); }
}
