package org.apache.spark.storage;
/**
 * Tracks metadata for an individual block.
 * <p>
 * Instances of this class are _not_ thread-safe and are protected by locks in the
 * {@link BlockInfoManager}.
 * <p>
 * param:  level the block's storage level. This is the requested persistence level, not the
 *              effective storage level of the block (i.e. if this is MEMORY_AND_DISK, then this
 *              does not imply that the block is actually resident in memory).
 * param:  classTag the block's {@link ClassTag}, used to select the serializer
 * param:  tellMaster whether state changes for this block should be reported to the master. This
 *                   is true for most blocks, but is false for broadcast blocks.
 */
  class BlockInfo {
  /**
   * Special task attempt id constant used to mark a block's write lock as being unlocked.
   * @return (undocumented)
   */
  static public  long NO_WRITER ()  { throw new RuntimeException(); }
  /**
   * Special task attempt id constant used to mark a block's write lock as being held by
   * a non-task thread (e.g. by a driver thread or by unit test code).
   * @return (undocumented)
   */
  static public  long NON_TASK_WRITER ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel level ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<?> classTag ()  { throw new RuntimeException(); }
  public  boolean tellMaster ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockInfo (org.apache.spark.storage.StorageLevel level, scala.reflect.ClassTag<?> classTag, boolean tellMaster)  { throw new RuntimeException(); }
  /**
   * The size of the block (in bytes)
   * @return (undocumented)
   */
  public  long size ()  { throw new RuntimeException(); }
  /**
   * The number of times that this block has been locked for reading.
   * @return (undocumented)
   */
  public  int readerCount ()  { throw new RuntimeException(); }
  /**
   * The task attempt id of the task which currently holds the write lock for this block, or
   * {@link BlockInfo.NON_TASK_WRITER} if the write lock is held by non-task code, or
   * {@link BlockInfo.NO_WRITER} if this block is not locked for writing.
   * @return (undocumented)
   */
  public  long writerTask ()  { throw new RuntimeException(); }
  private  void checkInvariants ()  { throw new RuntimeException(); }
}
