package org.apache.spark.storage.memory;
/**
 * Stores blocks in memory, either as Arrays of deserialized Java objects or as
 * serialized ByteBuffers.
 */
  class MemoryStore implements org.apache.spark.internal.Logging {
  public   MemoryStore (org.apache.spark.SparkConf conf, org.apache.spark.storage.BlockInfoManager blockInfoManager, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.memory.MemoryManager memoryManager, org.apache.spark.storage.memory.BlockEvictionHandler blockEvictionHandler)  { throw new RuntimeException(); }
  private  java.util.LinkedHashMap<org.apache.spark.storage.BlockId, org.apache.spark.storage.memory.MemoryEntry<?>> entries ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> onHeapUnrollMemoryMap ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> offHeapUnrollMemoryMap ()  { throw new RuntimeException(); }
  private  long unrollMemoryThreshold ()  { throw new RuntimeException(); }
  /** Total amount of memory available for storage, in bytes. */
  private  long maxMemory ()  { throw new RuntimeException(); }
  /** Total storage memory used including unroll memory, in bytes. */
  private  long memoryUsed ()  { throw new RuntimeException(); }
  /**
   * Amount of storage memory, in bytes, used for caching blocks.
   * This does not include memory used for unrolling.
   * @return (undocumented)
   */
  private  long blocksMemoryUsed ()  { throw new RuntimeException(); }
  public  long getSize (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Use <code>size</code> to test if there is enough space in MemoryStore. If so, create the ByteBuffer and
   * put it into MemoryStore. Otherwise, the ByteBuffer won't be created.
   * <p>
   * The caller should guarantee that <code>size</code> is correct.
   * <p>
   * @return true if the put() succeeded, false otherwise.
   * @param blockId (undocumented)
   * @param size (undocumented)
   * @param memoryMode (undocumented)
   * @param _bytes (undocumented)
   * @param evidence$2 (undocumented)
   */
  public <T extends java.lang.Object> boolean putBytes (org.apache.spark.storage.BlockId blockId, long size, org.apache.spark.memory.MemoryMode memoryMode, scala.Function0<org.apache.spark.util.io.ChunkedByteBuffer> _bytes, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Attempt to put the given block in memory store as values.
   * <p>
   * It's possible that the iterator is too large to materialize and store in memory. To avoid
   * OOM exceptions, this method will gradually unroll the iterator while periodically checking
   * whether there is enough free memory. If the block is successfully materialized, then the
   * temporary unroll memory used during the materialization is "transferred" to storage memory,
   * so we won't acquire more memory than is actually needed to store the block.
   * <p>
   * @return in case of success, the estimated size of the stored data. In case of failure, return
   *         an iterator containing the values of the block. The returned iterator will be backed
   *         by the combination of the partially-unrolled block and the remaining elements of the
   *         original input iterator. The caller must either fully consume this iterator or call
   *         <code>close()</code> on it in order to free the storage memory consumed by the partially-unrolled
   *         block.
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param classTag (undocumented)
   */
   <T extends java.lang.Object> scala.util.Either<org.apache.spark.storage.memory.PartiallyUnrolledIterator<T>, java.lang.Object> putIteratorAsValues (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<T> values, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  /**
   * Attempt to put the given block in memory store as bytes.
   * <p>
   * It's possible that the iterator is too large to materialize and store in memory. To avoid
   * OOM exceptions, this method will gradually unroll the iterator while periodically checking
   * whether there is enough free memory. If the block is successfully materialized, then the
   * temporary unroll memory used during the materialization is "transferred" to storage memory,
   * so we won't acquire more memory than is actually needed to store the block.
   * <p>
   * @return in case of success, the estimated size of the stored data. In case of failure,
   *         return a handle which allows the caller to either finish the serialization by
   *         spilling to disk or to deserialize the partially-serialized block and reconstruct
   *         the original input iterator. The caller must either fully consume this result
   *         iterator or call <code>discard()</code> on it in order to free the storage memory consumed by the
   *         partially-unrolled block.
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param classTag (undocumented)
   * @param memoryMode (undocumented)
   */
   <T extends java.lang.Object> scala.util.Either<org.apache.spark.storage.memory.PartiallySerializedBlock<T>, java.lang.Object> putIteratorAsBytes (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<T> values, scala.reflect.ClassTag<T> classTag, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.io.ChunkedByteBuffer> getBytes (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Iterator<?>> getValues (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  boolean remove (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  /**
   * Return the RDD ID that a given block ID is from, or None if it is not an RDD block.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  private  scala.Option<java.lang.Object> getRddId (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Try to evict blocks to free up a given amount of space to store a particular block.
   * Can fail if either the block is bigger than our memory or it would require replacing
   * another block from the same RDD (which leads to a wasteful cyclic replacement pattern for
   * RDDs that don't fit into memory that we want to avoid).
   * <p>
   * @param blockId the ID of the block we are freeing space for, if any
   * @param space the size of this block
   * @param memoryMode the type of memory to free (on- or off-heap)
   * @return the amount of memory (in bytes) freed by eviction
   */
    long evictBlocksToFreeSpace (scala.Option<org.apache.spark.storage.BlockId> blockId, long space, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean contains (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  private  long currentTaskAttemptId ()  { throw new RuntimeException(); }
  /**
   * Reserve memory for unrolling the given block for this task.
   * <p>
   * @return whether the request is granted.
   * @param blockId (undocumented)
   * @param memory (undocumented)
   * @param memoryMode (undocumented)
   */
  public  boolean reserveUnrollMemoryForThisTask (org.apache.spark.storage.BlockId blockId, long memory, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * Release memory used by this task for unrolling blocks.
   * If the amount is not specified, remove the current task's allocation altogether.
   * @param memoryMode (undocumented)
   * @param memory (undocumented)
   */
  public  void releaseUnrollMemoryForThisTask (org.apache.spark.memory.MemoryMode memoryMode, long memory)  { throw new RuntimeException(); }
  /**
   * Return the amount of memory currently occupied for unrolling blocks across all tasks.
   * @return (undocumented)
   */
  public  long currentUnrollMemory ()  { throw new RuntimeException(); }
  /**
   * Return the amount of memory currently occupied for unrolling blocks by this task.
   * @return (undocumented)
   */
  public  long currentUnrollMemoryForThisTask ()  { throw new RuntimeException(); }
  /**
   * Return the number of tasks currently unrolling blocks.
   * @return (undocumented)
   */
  private  int numTasksUnrolling ()  { throw new RuntimeException(); }
  /**
   * Log information about current memory usage.
   */
  private  void logMemoryUsage ()  { throw new RuntimeException(); }
  /**
   * Log a warning for failing to unroll a block.
   * <p>
   * @param blockId ID of the block we are trying to unroll.
   * @param finalVectorSize Final size of the vector before unrolling failed.
   */
  private  void logUnrollFailureMessage (org.apache.spark.storage.BlockId blockId, long finalVectorSize)  { throw new RuntimeException(); }
}
