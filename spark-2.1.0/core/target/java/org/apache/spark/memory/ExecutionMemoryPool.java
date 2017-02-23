package org.apache.spark.memory;
/**
 * Implements policies and bookkeeping for sharing an adjustable-sized pool of memory between tasks.
 * <p>
 * Tries to ensure that each task gets a reasonable share of memory, instead of some task ramping up
 * to a large amount first and then causing others to spill to disk repeatedly.
 * <p>
 * If there are N tasks, it ensures that each task can acquire at least 1 / 2N of the memory
 * before it has to spill, and at most 1 / N. Because N varies dynamically, we keep track of the
 * set of active tasks and redo the calculations of 1 / 2N and 1 / N in waiting tasks whenever this
 * set changes. This is all done by synchronizing access to mutable state and using wait() and
 * notifyAll() to signal changes to callers. Prior to Spark 1.6, this arbitration of memory across
 * tasks was performed by the ShuffleMemoryManager.
 * <p>
 * param:  lock a {@link MemoryManager} instance to synchronize on
 * param:  memoryMode the type of memory tracked by this pool (on- or off-heap)
 */
  class ExecutionMemoryPool extends org.apache.spark.memory.MemoryPool implements org.apache.spark.internal.Logging {
  public   ExecutionMemoryPool (java.lang.Object lock, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * Map from taskAttemptId -> memory consumption in bytes
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> memoryForTask ()  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  /**
   * Returns the memory consumption, in bytes, for the given task.
   * @param taskAttemptId (undocumented)
   * @return (undocumented)
   */
  public  long getMemoryUsageForTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Try to acquire up to <code>numBytes</code> of memory for the given task and return the number of bytes
   * obtained, or 0 if none can be allocated.
   * <p>
   * This call may block until there is enough free memory in some situations, to make sure each
   * task has a chance to ramp up to at least 1 / 2N of the total memory pool (where N is the # of
   * active tasks) before it is forced to spill. This can happen if the number of tasks increase
   * but an older task had a lot of memory already.
   * <p>
   * @param numBytes number of bytes to acquire
   * @param taskAttemptId the task attempt acquiring memory
   * @param maybeGrowPool a callback that potentially grows the size of this pool. It takes in
   *                      one parameter (Long) that represents the desired amount of memory by
   *                      which this pool should be expanded.
   * @param computeMaxPoolSize a callback that returns the maximum allowable size of this pool
   *                           at this given moment. This is not a field because the max pool
   *                           size is variable in certain cases. For instance, in unified
   *                           memory management, the execution pool can be expanded by evicting
   *                           cached blocks, thereby shrinking the storage pool.
   * <p>
   * @return the number of bytes granted to the task.
   */
    long acquireMemory (long numBytes, long taskAttemptId, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> maybeGrowPool, scala.Function0<java.lang.Object> computeMaxPoolSize)  { throw new RuntimeException(); }
  /**
   * Release <code>numBytes</code> of memory acquired by the given task.
   * @param numBytes (undocumented)
   * @param taskAttemptId (undocumented)
   */
  public  void releaseMemory (long numBytes, long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Release all memory for the given task and mark it as inactive (e.g. when a task ends).
   * @return the number of bytes freed.
   * @param taskAttemptId (undocumented)
   */
  public  long releaseAllMemoryForTask (long taskAttemptId)  { throw new RuntimeException(); }
}
