package org.apache.spark.scheduler;
public  class MapStatus$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapStatus$ MODULE$ = null;
  public   MapStatus$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MapStatus apply (org.apache.spark.storage.BlockManagerId loc, long[] uncompressedSizes)  { throw new RuntimeException(); }
  /**
   * Compress a size in bytes to 8 bits for efficient reporting of map output sizes.
   * We do this by encoding the log base 1.1 of the size as an integer, which can support
   * sizes up to 35 GB with at most 10% error.
   * @param size (undocumented)
   * @return (undocumented)
   */
  public  byte compressSize (long size)  { throw new RuntimeException(); }
  /**
   * Decompress an 8-bit encoded block size, using the reverse operation of compressSize.
   * @param compressedSize (undocumented)
   * @return (undocumented)
   */
  public  long decompressSize (byte compressedSize)  { throw new RuntimeException(); }
}
