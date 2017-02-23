package org.apache.spark.storage;
public  class BlockInfo$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BlockInfo$ MODULE$ = null;
  public   BlockInfo$ ()  { throw new RuntimeException(); }
  /**
   * Special task attempt id constant used to mark a block's write lock as being unlocked.
   * @return (undocumented)
   */
  public  long NO_WRITER ()  { throw new RuntimeException(); }
  /**
   * Special task attempt id constant used to mark a block's write lock as being held by
   * a non-task thread (e.g. by a driver thread or by unit test code).
   * @return (undocumented)
   */
  public  long NON_TASK_WRITER ()  { throw new RuntimeException(); }
}
