package org.apache.spark.storage;
/**
 * Component of the {@link BlockManager} which tracks metadata for blocks and manages block locking.
 * <p>
 * The locking interface exposed by this class is readers-writer lock. Every lock acquisition is
 * automatically associated with a running task and locks are automatically released upon task
 * completion or failure.
 * <p>
 * This class is thread-safe.
 */
  class BlockInfoManager implements org.apache.spark.internal.Logging {
  public   BlockInfoManager ()  { throw new RuntimeException(); }
  /**
   * Called at the start of a task in order to register that task with this {@link BlockInfoManager}.
   * This must be called prior to calling any other BlockInfoManager methods from that task.
   * @param taskAttemptId (undocumented)
   */
  public  void registerTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Returns the current task's task attempt id (which uniquely identifies the task), or
   * {@link BlockInfo.NON_TASK_WRITER} if called by a non-task thread.
   * @return (undocumented)
   */
  private  long currentTaskAttemptId ()  { throw new RuntimeException(); }
  /**
   * Lock a block for reading and return its metadata.
   * <p>
   * If another task has already locked this block for reading, then the read lock will be
   * immediately granted to the calling task and its lock count will be incremented.
   * <p>
   * If another task has locked this block for writing, then this call will block until the write
   * lock is released or will return immediately if <code>blocking = false</code>.
   * <p>
   * A single task can lock a block multiple times for reading, in which case each lock will need
   * to be released separately.
   * <p>
   * @param blockId the block to lock.
   * @param blocking if true (default), this call will block until the lock is acquired. If false,
   *                 this call will return immediately if the lock acquisition fails.
   * @return None if the block did not exist or was removed (in which case no lock is held), or
   *         Some(BlockInfo) (in which case the block is locked for reading).
   */
  public  scala.Option<org.apache.spark.storage.BlockInfo> lockForReading (org.apache.spark.storage.BlockId blockId, boolean blocking)  { throw new RuntimeException(); }
  /**
   * Lock a block for writing and return its metadata.
   * <p>
   * If another task has already locked this block for either reading or writing, then this call
   * will block until the other locks are released or will return immediately if <code>blocking = false</code>.
   * <p>
   * @param blockId the block to lock.
   * @param blocking if true (default), this call will block until the lock is acquired. If false,
   *                 this call will return immediately if the lock acquisition fails.
   * @return None if the block did not exist or was removed (in which case no lock is held), or
   *         Some(BlockInfo) (in which case the block is locked for writing).
   */
  public  scala.Option<org.apache.spark.storage.BlockInfo> lockForWriting (org.apache.spark.storage.BlockId blockId, boolean blocking)  { throw new RuntimeException(); }
  /**
   * Throws an exception if the current task does not hold a write lock on the given block.
   * Otherwise, returns the block's BlockInfo.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.storage.BlockInfo assertBlockIsLockedForWriting (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Get a block's metadata without acquiring any locks. This method is only exposed for use by
   * {@link BlockManager.getStatus()} and should not be called by other code outside of this class.
   * @param blockId (undocumented)
   * @return (undocumented)
   */
    scala.Option<org.apache.spark.storage.BlockInfo> get (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Downgrades an exclusive write lock to a shared read lock.
   * @param blockId (undocumented)
   */
  public  void downgradeLock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Release a lock on the given block.
   * @param blockId (undocumented)
   */
  public  void unlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Attempt to acquire the appropriate lock for writing a new block.
   * <p>
   * This enforces the first-writer-wins semantics. If we are the first to write the block,
   * then just go ahead and acquire the write lock. Otherwise, if another thread is already
   * writing the block, then we wait for the write to finish before acquiring the read lock.
   * <p>
   * @return true if the block did not already exist, false otherwise. If this returns false, then
   *         a read lock on the existing block will be held. If this returns true, a write lock on
   *         the new block will be held.
   * @param blockId (undocumented)
   * @param newBlockInfo (undocumented)
   */
  public  boolean lockNewBlockForWriting (org.apache.spark.storage.BlockId blockId, org.apache.spark.storage.BlockInfo newBlockInfo)  { throw new RuntimeException(); }
  /**
   * Release all lock held by the given task, clearing that task's pin bookkeeping
   * structures and updating the global pin counts. This method should be called at the
   * end of a task (either by a task completion handler or in <code>TaskRunner.run()</code>).
   * <p>
   * @return the ids of blocks whose pins were released
   * @param taskAttemptId (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.storage.BlockId> releaseAllLocksForTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Returns the number of blocks tracked.
   * @return (undocumented)
   */
  public  int size ()  { throw new RuntimeException(); }
  /**
   * Return the number of map entries in this pin counter's internal data structures.
   * This is used in unit tests in order to detect memory leaks.
   * @return (undocumented)
   */
    long getNumberOfMapEntries ()  { throw new RuntimeException(); }
  /**
   * Returns an iterator over a snapshot of all blocks' metadata. Note that the individual entries
   * in this iterator are mutable and thus may reflect blocks that are deleted while the iterator
   * is being traversed.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockInfo>> entries ()  { throw new RuntimeException(); }
  /**
   * Removes the given block and releases the write lock on it.
   * <p>
   * This can only be called while holding a write lock on the given block.
   * @param blockId (undocumented)
   */
  public  void removeBlock (org.apache.spark.storage.BlockId blockId)  { throw new RuntimeException(); }
  /**
   * Delete all state. Called during shutdown.
   */
  public  void clear ()  { throw new RuntimeException(); }
}
