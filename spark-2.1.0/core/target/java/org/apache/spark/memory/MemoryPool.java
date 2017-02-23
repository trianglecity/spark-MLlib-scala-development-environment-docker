package org.apache.spark.memory;
/**
 * Manages bookkeeping for an adjustable-sized region of memory. This class is internal to
 * the {@link MemoryManager}. See subclasses for more details.
 * <p>
 * param:  lock a {@link MemoryManager} instance, used for synchronization. We purposely erase the type
 *             to <code>Object</code> to avoid programming errors, since this object should only be used for
 *             synchronization purposes.
 */
 abstract class MemoryPool {
  public   MemoryPool (java.lang.Object lock)  { throw new RuntimeException(); }
  /**
   * Returns the current size of the pool, in bytes.
   * @return (undocumented)
   */
  public final  long poolSize ()  { throw new RuntimeException(); }
  /**
   * Returns the amount of free memory in the pool, in bytes.
   * @return (undocumented)
   */
  public final  long memoryFree ()  { throw new RuntimeException(); }
  /**
   * Expands the pool by <code>delta</code> bytes.
   * @param delta (undocumented)
   */
  public final  void incrementPoolSize (long delta)  { throw new RuntimeException(); }
  /**
   * Shrinks the pool by <code>delta</code> bytes.
   * @param delta (undocumented)
   */
  public final  void decrementPoolSize (long delta)  { throw new RuntimeException(); }
  /**
   * Returns the amount of used memory in this pool (in bytes).
   * @return (undocumented)
   */
  public abstract  long memoryUsed ()  ;
}
