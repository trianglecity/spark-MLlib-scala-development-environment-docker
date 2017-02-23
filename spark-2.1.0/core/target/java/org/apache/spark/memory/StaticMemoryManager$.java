package org.apache.spark.memory;
public  class StaticMemoryManager$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StaticMemoryManager$ MODULE$ = null;
  public   StaticMemoryManager$ ()  { throw new RuntimeException(); }
  private  int MIN_MEMORY_BYTES ()  { throw new RuntimeException(); }
  /**
   * Return the total amount of memory available for the storage region, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  private  long getMaxStorageMemory (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Return the total amount of memory available for the execution region, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  private  long getMaxExecutionMemory (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
