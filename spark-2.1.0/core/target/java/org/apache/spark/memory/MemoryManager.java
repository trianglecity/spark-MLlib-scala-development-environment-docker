package org.apache.spark.memory;
/**
 * An abstract memory manager that enforces how memory is shared between execution and storage.
 * <p>
 * In this context, execution memory refers to that used for computation in shuffles, joins,
 * sorts and aggregations, while storage memory refers to that used for caching and propagating
 * internal data across the cluster. There exists one MemoryManager per JVM.
 */
 abstract class MemoryManager implements org.apache.spark.internal.Logging {
  public   MemoryManager (org.apache.spark.SparkConf conf, int numCores, long onHeapStorageMemory, long onHeapExecutionMemory)  { throw new RuntimeException(); }
  protected  org.apache.spark.memory.StorageMemoryPool onHeapStorageMemoryPool ()  { throw new RuntimeException(); }
  protected  org.apache.spark.memory.StorageMemoryPool offHeapStorageMemoryPool ()  { throw new RuntimeException(); }
  protected  org.apache.spark.memory.ExecutionMemoryPool onHeapExecutionMemoryPool ()  { throw new RuntimeException(); }
  protected  org.apache.spark.memory.ExecutionMemoryPool offHeapExecutionMemoryPool ()  { throw new RuntimeException(); }
  protected  long maxOffHeapMemory ()  { throw new RuntimeException(); }
  protected  long offHeapStorageMemory ()  { throw new RuntimeException(); }
  /**
   * Total available on heap memory for storage, in bytes. This amount can vary over time,
   * depending on the MemoryManager implementation.
   * In this model, this is equivalent to the amount of memory not occupied by execution.
   * @return (undocumented)
   */
  public abstract  long maxOnHeapStorageMemory ()  ;
  /**
   * Total available off heap memory for storage, in bytes. This amount can vary over time,
   * depending on the MemoryManager implementation.
   * @return (undocumented)
   */
  public abstract  long maxOffHeapStorageMemory ()  ;
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
   * @param memoryMode (undocumented)
   */
  public abstract  boolean acquireStorageMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  ;
  /**
   * Acquire N bytes of memory to unroll the given block, evicting existing ones if necessary.
   * <p>
   * This extra method allows subclasses to differentiate behavior between acquiring storage
   * memory and acquiring unroll memory. For instance, the memory management model in Spark
   * 1.5 and before places a limit on the amount of space that can be freed from unrolling.
   * <p>
   * @return whether all N bytes were successfully granted.
   * @param blockId (undocumented)
   * @param numBytes (undocumented)
   * @param memoryMode (undocumented)
   */
  public abstract  boolean acquireUnrollMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  ;
  /**
   * Try to acquire up to <code>numBytes</code> of execution memory for the current task and return the
   * number of bytes obtained, or 0 if none can be allocated.
   * <p>
   * This call may block until there is enough free memory in some situations, to make sure each
   * task has a chance to ramp up to at least 1 / 2N of the total memory pool (where N is the # of
   * active tasks) before it is forced to spill. This can happen if the number of tasks increase
   * but an older task had a lot of memory already.
   * @param numBytes (undocumented)
   * @param taskAttemptId (undocumented)
   * @param memoryMode (undocumented)
   * @return (undocumented)
   */
   abstract  long acquireExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  ;
  /**
   * Release numBytes of execution memory belonging to the given task.
   * @param numBytes (undocumented)
   * @param taskAttemptId (undocumented)
   * @param memoryMode (undocumented)
   */
    void releaseExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * Release all memory for the given task and mark it as inactive (e.g. when a task ends).
   * <p>
   * @return the number of bytes freed.
   * @param taskAttemptId (undocumented)
   */
    long releaseAllExecutionMemoryForTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Release N bytes of storage memory.
   * @param numBytes (undocumented)
   * @param memoryMode (undocumented)
   */
  public  void releaseStorageMemory (long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * Release all storage memory acquired.
   */
  public final  void releaseAllStorageMemory ()  { throw new RuntimeException(); }
  /**
   * Release N bytes of unroll memory.
   * @param numBytes (undocumented)
   * @param memoryMode (undocumented)
   */
  public final  void releaseUnrollMemory (long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * Execution memory currently in use, in bytes.
   * @return (undocumented)
   */
  public final  long executionMemoryUsed ()  { throw new RuntimeException(); }
  /**
   * Storage memory currently in use, in bytes.
   * @return (undocumented)
   */
  public final  long storageMemoryUsed ()  { throw new RuntimeException(); }
  /**
   * Returns the execution memory consumption, in bytes, for the given task.
   * @param taskAttemptId (undocumented)
   * @return (undocumented)
   */
    long getExecutionMemoryUsageForTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Tracks whether Tungsten memory will be allocated on the JVM heap or off-heap using
   * sun.misc.Unsafe.
   * @return (undocumented)
   */
  public final  org.apache.spark.memory.MemoryMode tungstenMemoryMode ()  { throw new RuntimeException(); }
  /**
   * The default page size, in bytes.
   * <p>
   * If user didn't explicitly set "spark.buffer.pageSize", we figure out the default value
   * by looking at the number of cores available to the process, and the total amount of memory,
   * and then divide it by a factor of safety.
   * @return (undocumented)
   */
  public  long pageSizeBytes ()  { throw new RuntimeException(); }
  /**
   * Allocates memory for use by Unsafe/Tungsten code.
   * @return (undocumented)
   */
   final  org.apache.spark.unsafe.memory.MemoryAllocator tungstenMemoryAllocator ()  { throw new RuntimeException(); }
}
