package org.apache.spark.memory;
/**
 * A {@link MemoryManager} that statically partitions the heap space into disjoint regions.
 * <p>
 * The sizes of the execution and storage regions are determined through
 * <code>spark.shuffle.memoryFraction</code> and <code>spark.storage.memoryFraction</code> respectively. The two
 * regions are cleanly separated such that neither usage can borrow memory from the other.
 */
  class StaticMemoryManager extends org.apache.spark.memory.MemoryManager {
  static private  int MIN_MEMORY_BYTES ()  { throw new RuntimeException(); }
  /**
   * Return the total amount of memory available for the storage region, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  long getMaxStorageMemory (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Return the total amount of memory available for the execution region, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static private  long getMaxExecutionMemory (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
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
  public  long maxOnHeapStorageMemory ()  { throw new RuntimeException(); }
  // not preceding
  public   StaticMemoryManager (org.apache.spark.SparkConf conf, long maxOnHeapExecutionMemory, long maxOnHeapStorageMemory, int numCores)  { throw new RuntimeException(); }
  public   StaticMemoryManager (org.apache.spark.SparkConf conf, int numCores)  { throw new RuntimeException(); }
  private  long maxUnrollMemory ()  { throw new RuntimeException(); }
  public  long maxOffHeapStorageMemory ()  { throw new RuntimeException(); }
  public  boolean acquireStorageMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean acquireUnrollMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
    long acquireExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
}
