package org.apache.spark.storage;
/**
 * Stores BlockManager blocks on disk.
 */
  class DiskStore implements org.apache.spark.internal.Logging {
  public   DiskStore (org.apache.spark.SparkConf conf, org.apache.spark.storage.DiskBlockManager diskManager)  { throw new RuntimeException(); }
  private  long minMemoryMapBytes ()  { throw new RuntimeException(); }
  public  long getSize (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Invokes the provided callback function to write the specific block.
   * <p>
   * @throws IllegalStateException if the block already exists in the disk store.
   * @param blockId (undocumented)
   * @param writeFunc (undocumented)
   */
  public  void put (org.apache.spark.storage.BlockId blockId, scala.Function1<java.io.FileOutputStream, scala.runtime.BoxedUnit> writeFunc)  { throw new RuntimeException(); }
  public  void putBytes (org.apache.spark.storage.BlockId blockId, org.apache.spark.util.io.ChunkedByteBuffer bytes)  { throw new RuntimeException(); }
  public  org.apache.spark.util.io.ChunkedByteBuffer getBytes (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  boolean remove (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
}
