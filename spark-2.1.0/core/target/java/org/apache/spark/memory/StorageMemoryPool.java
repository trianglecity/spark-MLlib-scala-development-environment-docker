package org.apache.spark.memory;
/**
 * Performs bookkeeping for managing an adjustable-size pool of memory that is used for storage
 * (caching).
 * <p>
 * param:  lock a {@link MemoryManager} instance to synchronize on
 * param:  memoryMode the type of memory tracked by this pool (on- or off-heap)
 */
  class StorageMemoryPool extends org.apache.spark.memory.MemoryPool implements org.apache.spark.internal.Logging {
  public   StorageMemoryPool (java.lang.Object lock, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.memory.MemoryStore _memoryStore ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.memory.MemoryStore memoryStore ()  { throw new RuntimeException(); }
  /**
   * Set the {@link MemoryStore} used by this manager to evict cached blocks.
   * This must be set after construction due to initialization ordering constraints.
   * @param store (undocumented)
   */
  public final  void setMemoryStore (org.apache.spark.storage.memory.MemoryStore store)  { throw new RuntimeException(); }
  /**
   * Acquire N bytes of memory to cache the given block, evicting existing ones if necessary.
   * <p>
   * @return whether all N bytes were successfully granted.
   * @param blockId (undocumented)
   * @param numBytes (undocumented)
   */
  public  boolean acquireMemory (org.apache.spark.storage.BlockId blockId, long numBytes)  { throw new RuntimeException(); }
  /**
   * Acquire N bytes of storage memory for the given block, evicting existing ones if necessary.
   * <p>
   * @param blockId the ID of the block we are acquiring storage memory for
   * @param numBytesToAcquire the size of this block
   * @param numBytesToFree the amount of space to be freed through evicting blocks
   * @return whether all N bytes were successfully granted.
   */
  public  boolean acquireMemory (org.apache.spark.storage.BlockId blockId, long numBytesToAcquire, long numBytesToFree)  { throw new RuntimeException(); }
  public  void releaseMemory (long size)  { throw new RuntimeException(); }
  public  void releaseAllMemory ()  { throw new RuntimeException(); }
  /**
   * Free space to shrink the size of this storage memory pool by <code>spaceToFree</code> bytes.
   * Note: this method doesn't actually reduce the pool size but relies on the caller to do so.
   * <p>
   * @return number of bytes to be removed from the pool's capacity.
   * @param spaceToFree (undocumented)
   */
  public  long freeSpaceToShrinkPool (long spaceToFree)  { throw new RuntimeException(); }
}
