package org.apache.spark.storage;
/**
 * Manager running on every node (driver and executors) which provides interfaces for putting and
 * retrieving blocks both locally and remotely into various stores (memory, disk, and off-heap).
 * <p>
 * Note that {@link initialize()} must be called before the BlockManager is usable.
 */
  class BlockManager implements org.apache.spark.network.BlockDataManager, org.apache.spark.storage.memory.BlockEvictionHandler, org.apache.spark.internal.Logging {
  static private  org.apache.spark.util.IdGenerator ID_GENERATOR ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<org.apache.spark.storage.BlockId, scala.collection.Seq<java.lang.String>> blockIdsToHosts (org.apache.spark.storage.BlockId[] blockIds, org.apache.spark.SparkEnv env, org.apache.spark.storage.BlockManagerMaster blockManagerMaster)  { throw new RuntimeException(); }
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
  public  org.apache.spark.storage.BlockManagerMaster master ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerManager serializerManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.BlockTransferService blockTransferService ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockManager (java.lang.String executorId, org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.storage.BlockManagerMaster master, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.SparkConf conf, org.apache.spark.memory.MemoryManager memoryManager, org.apache.spark.MapOutputTracker mapOutputTracker, org.apache.spark.shuffle.ShuffleManager shuffleManager, org.apache.spark.network.BlockTransferService blockTransferService, org.apache.spark.SecurityManager securityManager, int numUsableCores)  { throw new RuntimeException(); }
    boolean externalShuffleServiceEnabled ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.DiskBlockManager diskBlockManager ()  { throw new RuntimeException(); }
    org.apache.spark.storage.BlockInfoManager blockInfoManager ()  { throw new RuntimeException(); }
  private  scala.concurrent.ExecutionContextExecutorService futureExecutionContext ()  { throw new RuntimeException(); }
    org.apache.spark.storage.memory.MemoryStore memoryStore ()  { throw new RuntimeException(); }
    org.apache.spark.storage.DiskStore diskStore ()  { throw new RuntimeException(); }
  private  long maxMemory ()  { throw new RuntimeException(); }
  private  int externalShuffleServicePort ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId ()  { throw new RuntimeException(); }
    org.apache.spark.storage.BlockManagerId shuffleServerId ()  { throw new RuntimeException(); }
    org.apache.spark.network.shuffle.ShuffleClient shuffleClient ()  { throw new RuntimeException(); }
  private  int maxFailuresBeforeLocationRefresh ()  { throw new RuntimeException(); }
  private  org.apache.spark.rpc.RpcEndpointRef slaveEndpoint ()  { throw new RuntimeException(); }
  private  scala.concurrent.Future<scala.runtime.BoxedUnit> asyncReregisterTask ()  { throw new RuntimeException(); }
  private  java.lang.Object asyncReregisterLock ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> cachedPeers ()  { throw new RuntimeException(); }
  private  java.lang.Object peerFetchLock ()  { throw new RuntimeException(); }
  private  long lastPeerFetchTime ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockReplicationPolicy blockReplicationPolicy ()  { throw new RuntimeException(); }
  /**
   * Initializes the BlockManager with the given appId. This is not performed in the constructor as
   * the appId may not be known at BlockManager instantiation time (in particular for the driver,
   * where it is only learned after registration with the TaskScheduler).
   * <p>
   * This method initializes the BlockTransferService and ShuffleClient, registers with the
   * BlockManagerMaster, starts the BlockManagerWorker endpoint, and registers with a local shuffle
   * service if configured.
   * @param appId (undocumented)
   */
  public  void initialize (java.lang.String appId)  { throw new RuntimeException(); }
  private  void registerWithExternalShuffleServer ()  { throw new RuntimeException(); }
  /**
   * Report all blocks to the BlockManager again. This may be necessary if we are dropped
   * by the BlockManager and come back or if we become capable of recovering blocks on disk after
   * an executor crash.
   * <p>
   * This function deliberately fails silently if the master returns false (indicating that
   * the slave needs to re-register). The error condition will be detected again by the next
   * heart beat attempt or new block registration and another try to re-register all blocks
   * will be made then.
   */
  private  void reportAllBlocks ()  { throw new RuntimeException(); }
  /**
   * Re-register with the master and report all blocks to it. This will be called by the heart beat
   * thread if our heartbeat to the block manager indicates that we were not registered.
   * <p>
   * Note that this method must be called without any BlockInfo locks held.
   */
  public  void reregister ()  { throw new RuntimeException(); }
  /**
   * Re-register with the master sometime soon.
   */
  private  void asyncReregister ()  { throw new RuntimeException(); }
  /**
   * For testing. Wait for any pending asynchronous re-registration; otherwise, do nothing.
   */
  public  void waitForAsyncReregister ()  { throw new RuntimeException(); }
  /**
   * Interface to get local block data. Throws an exception if the block cannot be found or
   * cannot be read successfully.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Put the block locally, using the given storage level.
   * @param blockId (undocumented)
   * @param data (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @return (undocumented)
   */
  public  boolean putBlockData (org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer data, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  { throw new RuntimeException(); }
  /**
   * Get the BlockStatus for the block identified by the given ID, if it exists.
   * NOTE: This is mainly for testing.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockStatus> getStatus (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get the ids of existing blocks that match the given filter. Note that this will
   * query the blocks stored in the disk block manager (that the block manager
   * may not know of).
   * @param filter (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> getMatchingBlockIds (scala.Function1<org.apache.spark.storage.BlockId, java.lang.Object> filter)  { throw new RuntimeException(); }
  /**
   * Tell the master about the current storage status of a block. This will send a block update
   * message reflecting the current status, *not* the desired storage level in its block info.
   * For example, a block with MEMORY_AND_DISK set might have fallen out to be only on disk.
   * <p>
   * droppedMemorySize exists to account for when the block is dropped from memory to disk (so
   * it is still valid). This ensures that update in master will compensate for the increase in
   * memory on slave.
   * @param blockId (undocumented)
   * @param status (undocumented)
   * @param droppedMemorySize (undocumented)
   */
  private  void reportBlockStatus (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus status, long droppedMemorySize)  { throw new RuntimeException(); }
  /**
   * Actually send a UpdateBlockInfo message. Returns the master's response,
   * which will be true if the block was successfully recorded and false if
   * the slave needs to re-register.
   * @param blockId (undocumented)
   * @param status (undocumented)
   * @param droppedMemorySize (undocumented)
   * @return (undocumented)
   */
  private  boolean tryToReportBlockStatus (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus status, long droppedMemorySize)  { throw new RuntimeException(); }
  /**
   * Return the updated storage status of the block with the given ID. More specifically, if
   * the block is dropped from memory and possibly added to disk, return the new storage level
   * and the updated in-memory and on-disk sizes.
   * @param blockId (undocumented)
   * @param info (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.storage.BlockStatus getCurrentBlockStatus (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockInfo info)  { throw new RuntimeException(); }
  /**
   * Get locations of an array of blocks.
   * @param blockIds (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.storage.BlockManagerId>[] getLocationBlockIds (org.apache.spark.storage.BlockId[] blockIds)  { throw new RuntimeException(); }
  /**
   * Cleanup code run in response to a failed local read.
   * Must be called while holding a read lock on the block.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  private  scala.runtime.Nothing$ handleLocalReadFailure (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get block from local block manager as an iterator of Java objects.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.storage.BlockResult> getLocalValues (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get block from the local block manager as serialized bytes.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.util.io.ChunkedByteBuffer> getLocalBytes (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get block from the local block manager as serialized bytes.
   * <p>
   * Must be called while holding a read lock on the block.
   * Releases the read lock upon exception; keeps the read lock upon successful return.
   * @param blockId (undocumented)
   * @param info (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.util.io.ChunkedByteBuffer doGetLocalBytes (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockInfo info)  { throw new RuntimeException(); }
  /**
   * Get block from remote block managers.
   * <p>
   * This does not acquire a lock on this block in this JVM.
   * @param blockId (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  private <T extends java.lang.Object> scala.Option<org.apache.spark.storage.BlockResult> getRemoteValues (org.apache.spark.storage.BlockId blockId, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Return a list of locations for the given block, prioritizing the local machine since
   * multiple block managers can share the same host.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getLocations (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get block from remote block managers as serialized bytes.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.util.io.ChunkedByteBuffer> getRemoteBytes (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get a block from the block manager (either local or remote).
   * <p>
   * This acquires a read lock on the block if the block was stored locally and does not acquire
   * any locks if the block was fetched from a remote block manager. The read lock will
   * automatically be freed once the result's <code>data</code> iterator is fully consumed.
   * @param blockId (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<org.apache.spark.storage.BlockResult> get (org.apache.spark.storage.BlockId blockId, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Downgrades an exclusive write lock to a shared read lock.
   * @param blockId (undocumented)
   */
  public  void downgradeLock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Release a lock on the given block.
   * @param blockId (undocumented)
   */
  public  void releaseLock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Registers a task with the BlockManager in order to initialize per-task bookkeeping structures.
   * @param taskAttemptId (undocumented)
   */
  public  void registerTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Release all locks for the given task.
   * <p>
   * @return the blocks whose locks were released.
   * @param taskAttemptId (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> releaseAllLocksForTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Retrieve the given block if it exists, otherwise call the provided <code>makeIterator</code> method
   * to compute the block, persist it, and return its values.
   * <p>
   * @return either a BlockResult if the block was successfully cached, or an iterator if the block
   *         could not be cached.
   * @param blockId (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @param makeIterator (undocumented)
   */
  public <T extends java.lang.Object> scala.util.Either<org.apache.spark.storage.BlockResult, scala.collection.Iterator<T>> getOrElseUpdate (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<T> classTag, scala.Function0<scala.collection.Iterator<T>> makeIterator)  { throw new RuntimeException(); }
  /**
   * @return true if the block was stored or false if an error occurred.
   * @param blockId (undocumented)
   * @param values (undocumented)
   * @param level (undocumented)
   * @param tellMaster (undocumented)
   * @param evidence$3 (undocumented)
   */
  public <T extends java.lang.Object> boolean putIterator (org.apache.spark.storage.BlockId blockId, scala.collection.Iterator<T> values, org.apache.spark.storage.StorageLevel level, boolean tellMaster, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * A short circuited method to get a block writer that can write data directly to disk.
   * The Block will be appended to the File specified by filename. Callers should handle error
   * cases.
   * @param blockId (undocumented)
   * @param file (undocumented)
   * @param serializerInstance (undocumented)
   * @param bufferSize (undocumented)
   * @param writeMetrics (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.storage.DiskBlockObjectWriter getDiskWriter (org.apache.spark.storage.BlockId blockId, java.io.File file, org.apache.spark.serializer.SerializerInstance serializerInstance, int bufferSize, org.apache.spark.executor.ShuffleWriteMetrics writeMetrics)  { throw new RuntimeException(); }
  /**
   * Put a new block of serialized bytes to the block manager.
   * <p>
   * @return true if the block was stored or false if an error occurred.
   * @param blockId (undocumented)
   * @param bytes (undocumented)
   * @param level (undocumented)
   * @param tellMaster (undocumented)
   * @param evidence$4 (undocumented)
   */
  public <T extends java.lang.Object> boolean putBytes (org.apache.spark.storage.BlockId blockId, org.apache.spark.util.io.ChunkedByteBuffer bytes, org.apache.spark.storage.StorageLevel level, boolean tellMaster, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
  /**
   * Put the given bytes according to the given level in one of the block stores, replicating
   * the values if necessary.
   * <p>
   * If the block already exists, this method will not overwrite it.
   * <p>
   * @param keepReadLock if true, this method will hold the read lock when it returns (even if the
   *                     block already exists). If false, this method will hold no locks when it
   *                     returns.
   * @return true if the block was already present or if the put succeeded, false otherwise.
   * @param blockId (undocumented)
   * @param bytes (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @param tellMaster (undocumented)
   */
  private <T extends java.lang.Object> boolean doPutBytes (org.apache.spark.storage.BlockId blockId, org.apache.spark.util.io.ChunkedByteBuffer bytes, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<T> classTag, boolean tellMaster, boolean keepReadLock)  { throw new RuntimeException(); }
  /**
   * Helper method used to abstract common code from {@link doPutBytes()} and {@link doPutIterator()}.
   * <p>
   * @param putBody a function which attempts the actual put() and returns None on success
   *                or Some on failure.
   * @param blockId (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @param tellMaster (undocumented)
   * @param keepReadLock (undocumented)
   * @return (undocumented)
   */
  private <T extends java.lang.Object> scala.Option<T> doPut (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag, boolean tellMaster, boolean keepReadLock, scala.Function1<org.apache.spark.storage.BlockInfo, scala.Option<T>> putBody)  { throw new RuntimeException(); }
  /**
   * Put the given block according to the given level in one of the block stores, replicating
   * the values if necessary.
   * <p>
   * If the block already exists, this method will not overwrite it.
   * <p>
   * @param keepReadLock if true, this method will hold the read lock when it returns (even if the
   *                     block already exists). If false, this method will hold no locks when it
   *                     returns.
   * @return None if the block was already present or if the put succeeded, or Some(iterator)
   *         if the put failed.
   * @param blockId (undocumented)
   * @param iterator (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   * @param tellMaster (undocumented)
   */
  private <T extends java.lang.Object> scala.Option<org.apache.spark.storage.memory.PartiallyUnrolledIterator<T>> doPutIterator (org.apache.spark.storage.BlockId blockId, scala.Function0<scala.collection.Iterator<T>> iterator, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<T> classTag, boolean tellMaster, boolean keepReadLock)  { throw new RuntimeException(); }
  /**
   * Attempts to cache spilled bytes read from disk into the MemoryStore in order to speed up
   * subsequent reads. This method requires the caller to hold a read lock on the block.
   * <p>
   * @return a copy of the bytes from the memory store if the put succeeded, otherwise None.
   *         If this returns bytes from the memory store then the original disk store bytes will
   *         automatically be disposed and the caller should not continue to use them. Otherwise,
   *         if this returns None then the original disk store bytes will be unaffected.
   * @param blockInfo (undocumented)
   * @param blockId (undocumented)
   * @param level (undocumented)
   * @param diskBytes (undocumented)
   */
  private  scala.Option<org.apache.spark.util.io.ChunkedByteBuffer> maybeCacheDiskBytesInMemory (org.apache.spark.storage.BlockInfo blockInfo, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, org.apache.spark.util.io.ChunkedByteBuffer diskBytes)  { throw new RuntimeException(); }
  /**
   * Attempts to cache spilled values read from disk into the MemoryStore in order to speed up
   * subsequent reads. This method requires the caller to hold a read lock on the block.
   * <p>
   * @return a copy of the iterator. The original iterator passed this method should no longer
   *         be used after this method returns.
   * @param blockInfo (undocumented)
   * @param blockId (undocumented)
   * @param level (undocumented)
   * @param diskIterator (undocumented)
   */
  private <T extends java.lang.Object> scala.collection.Iterator<T> maybeCacheDiskValuesInMemory (org.apache.spark.storage.BlockInfo blockInfo, org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.StorageLevel level, scala.collection.Iterator<T> diskIterator)  { throw new RuntimeException(); }
  /**
   * Get peer block managers in the system.
   * @param forceFetch (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> getPeers (boolean forceFetch)  { throw new RuntimeException(); }
  /**
   * Replicate block to another node. Note that this is a blocking call that returns after
   * the block has been replicated.
   * @param blockId (undocumented)
   * @param data (undocumented)
   * @param level (undocumented)
   * @param classTag (undocumented)
   */
  private  void replicate (org.apache.spark.storage.BlockId blockId, org.apache.spark.util.io.ChunkedByteBuffer data, org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag)  { throw new RuntimeException(); }
  /**
   * Read a block consisting of a single object.
   * @param blockId (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> getSingle (org.apache.spark.storage.BlockId blockId, scala.reflect.ClassTag<T> evidence$5)  { throw new RuntimeException(); }
  /**
   * Write a block consisting of a single object.
   * <p>
   * @return true if the block was stored or false if the block was already stored or an
   *         error occurred.
   * @param blockId (undocumented)
   * @param value (undocumented)
   * @param level (undocumented)
   * @param tellMaster (undocumented)
   * @param evidence$6 (undocumented)
   */
  public <T extends java.lang.Object> boolean putSingle (org.apache.spark.storage.BlockId blockId, T value, org.apache.spark.storage.StorageLevel level, boolean tellMaster, scala.reflect.ClassTag<T> evidence$6)  { throw new RuntimeException(); }
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
   * @param evidence$7 (undocumented)
   */
   <T extends java.lang.Object> org.apache.spark.storage.StorageLevel dropFromMemory (org.apache.spark.storage.BlockId blockId, scala.Function0<scala.util.Either<java.lang.Object, org.apache.spark.util.io.ChunkedByteBuffer>> data, scala.reflect.ClassTag<T> evidence$7)  { throw new RuntimeException(); }
  /**
   * Remove all blocks belonging to the given RDD.
   * <p>
   * @return The number of blocks removed.
   * @param rddId (undocumented)
   */
  public  int removeRdd (int rddId)  { throw new RuntimeException(); }
  /**
   * Remove all blocks belonging to the given broadcast.
   * @param broadcastId (undocumented)
   * @param tellMaster (undocumented)
   * @return (undocumented)
   */
  public  int removeBroadcast (long broadcastId, boolean tellMaster)  { throw new RuntimeException(); }
  /**
   * Remove a block from both memory and disk.
   * @param blockId (undocumented)
   * @param tellMaster (undocumented)
   */
  public  void removeBlock (org.apache.spark.storage.BlockId blockId, boolean tellMaster)  { throw new RuntimeException(); }
  /**
   * Internal version of {@link removeBlock()} which assumes that the caller already holds a write
   * lock on the block.
   * @param blockId (undocumented)
   * @param tellMaster (undocumented)
   */
  private  void removeBlockInternal (org.apache.spark.storage.BlockId blockId, boolean tellMaster)  { throw new RuntimeException(); }
  private  void addUpdatedBlockStatusToTaskMetrics (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockStatus status)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
