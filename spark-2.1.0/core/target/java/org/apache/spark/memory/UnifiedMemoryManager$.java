package org.apache.spark.memory;
public  class UnifiedMemoryManager$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnifiedMemoryManager$ MODULE$ = null;
  public   UnifiedMemoryManager$ ()  { throw new RuntimeException(); }
  private  int RESERVED_SYSTEM_MEMORY_BYTES ()  { throw new RuntimeException(); }
  public  org.apache.spark.memory.UnifiedMemoryManager apply (org.apache.spark.SparkConf conf, int numCores)  { throw new RuntimeException(); }
  /**
   * Return the total amount of memory shared between execution and storage, in bytes.
   * @param conf (undocumented)
   * @return (undocumented)
   */
  private  long getMaxMemory (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
