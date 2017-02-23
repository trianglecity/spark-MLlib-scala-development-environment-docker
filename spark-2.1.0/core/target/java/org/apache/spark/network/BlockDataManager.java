package org.apache.spark.network;
  interface BlockDataManager {
  /**
   * Interface to get local block data. Throws an exception if the block cannot be found or
   * cannot be read successfully.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.BlockId blockId)  ;
  /**
   * Put the block locally, using the given storage level.
   * <p>
   * Returns true if the block was stored and false if the put operation failed or the block
   * already existed.
   * @param blockId (undocumented)
   * @param data (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @return (undocumented)
   */
  public  boolean putBlockData (org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer data, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  ;
  /**
   * Release locks acquired by {@link putBlockData()} and {@link getBlockData()}.
   * @param blockId (undocumented)
   */
  public  void releaseLock (org.apache.spark.storage.BlockId blockId)  ;
}
