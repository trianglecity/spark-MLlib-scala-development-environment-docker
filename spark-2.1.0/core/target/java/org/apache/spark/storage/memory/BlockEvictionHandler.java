package org.apache.spark.storage.memory;
  interface BlockEvictionHandler {
  /**
   * Drop a block from memory, possibly putting it on disk if applicable. Called when the memory
   * store reaches its limit and needs to free up space.
   * <p>
   * If <code>data</code> is not put on disk, it won't be created.
   * <p>
   * The caller of this method must hold a write lock on the block before calling this method.
   * This method does not release the write lock.
   * <p>
   * @return the block's new effective StorageLevel.
   * @param blockId (undocumented)
   * @param data (undocumented)
   * @param evidence$1 (undocumented)
   */
   <T extends java.lang.Object> org.apache.spark.storage.StorageLevel dropFromMemory (org.apache.spark.storage.BlockId blockId, scala.Function0<scala.util.Either<java.lang.Object, org.apache.spark.util.io.ChunkedByteBuffer>> data, scala.reflect.ClassTag<T> evidence$1)  ;
}
