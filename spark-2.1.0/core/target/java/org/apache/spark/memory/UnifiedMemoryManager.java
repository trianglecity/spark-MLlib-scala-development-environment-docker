package org.apache.spark.memory;
/**
 * A {@link MemoryManager} that enforces a soft boundary between execution and storage such that
 * either side can borrow memory from the other.
 * <p>
 * The region shared between execution and storage is a fraction of (the total heap space - 300MB)
 * configurable through <code>spark.memory.fraction</code> (default 0.6). The position of the boundary
 * within this space is further determined by <code>spark.memory.storageFraction</code> (default 0.5).
 * This means the size of the storage region is 0.6 * 0.5 = 0.3 of the heap space by default.
 * <p>
 * Storage can borrow as much execution memory as is free until execution reclaims its space.
 * When this happens, cached blocks will be evicted from memory until sufficient borrowed
 * memory is released to satisfy the execution memory request.
 * <p>
 * Similarly, execution can borrow as much storage memory as is free. However, execution
 * memory is *never* evicted by storage due to the complexities involved in implementing this.
 * The implication is that attempts to cache blocks may fail if execution has already eaten
 * up most of the storage space, in which case the new blocks will be evicted immediately
 * according to their respective storage levels.
 * <p>
 * param:  onHeapStorageRegionSize Size of the storage region, in bytes.
 *                          This region is not statically reserved; execution can borrow from
 *                          it if necessary. Cached blocks can be evicted only if actual
 *                          storage memory usage exceeds this region.
 */
  class UnifiedMemoryManager extends org.apache.spark.memory.MemoryManager {
  static private  int RESERVED_SYSTEM_MEMORY_BYTES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.memory.UnifiedMemoryManager apply (org.apache.spark.SparkConf conf, int numCores)  { throw new RuntimeException(); }
  /**
   * Return the total amount of memory shared between execution and storage, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  long getMaxMemory (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  org.apache.spark.memory.StorageMemoryPool onHeapStorageMemoryPool ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.memory.StorageMemoryPool offHeapStorageMemoryPool ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.memory.ExecutionMemoryPool onHeapExecutionMemoryPool ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.memory.ExecutionMemoryPool offHeapExecutionMemoryPool ()  { throw new RuntimeException(); }
  static protected  long maxOffHeapMemory ()  { throw new RuntimeException(); }
  static protected  long offHeapStorageMemory ()  { throw new RuntimeException(); }
  static public final  void setMemoryStore (org.apache.spark.storage.memory.MemoryStore store)  { throw new RuntimeException(); }
  static   void releaseExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  static   long releaseAllExecutionMemoryForTask (long taskAttemptId)  { throw new RuntimeException(); }
  static public  void releaseStorageMemory (long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  static public final  void releaseAllStorageMemory ()  { throw new RuntimeException(); }
  static public final  void releaseUnrollMemory (long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  static public final  long executionMemoryUsed ()  { throw new RuntimeException(); }
  static public final  long storageMemoryUsed ()  { throw new RuntimeException(); }
  static   long getExecutionMemoryUsageForTask (long taskAttemptId)  { throw new RuntimeException(); }
  static public final  org.apache.spark.memory.MemoryMode tungstenMemoryMode ()  { throw new RuntimeException(); }
  static public  long pageSizeBytes ()  { throw new RuntimeException(); }
  static  final  org.apache.spark.unsafe.memory.MemoryAllocator tungstenMemoryAllocator ()  { throw new RuntimeException(); }
  public  long maxHeapMemory ()  { throw new RuntimeException(); }
  // not preceding
     UnifiedMemoryManager (org.apache.spark.SparkConf conf, long maxHeapMemory, long onHeapStorageRegionSize, int numCores)  { throw new RuntimeException(); }
  private  void assertInvariants ()  { throw new RuntimeException(); }
  public  long maxOnHeapStorageMemory ()  { throw new RuntimeException(); }
  public  long maxOffHeapStorageMemory ()  { throw new RuntimeException(); }
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
    long acquireExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean acquireStorageMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean acquireUnrollMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
}
