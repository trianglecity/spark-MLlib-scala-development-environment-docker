package org.apache.spark.util.collection;
/**
 * Spills contents of an in-memory collection to disk when the memory threshold
 * has been exceeded.
 */
 abstract class Spillable<C extends java.lang.Object> extends org.apache.spark.memory.MemoryConsumer implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   Spillable (org.apache.spark.memory.TaskMemoryManager taskMemoryManager)  { throw new RuntimeException(); }
  /**
   * Spills the current in-memory collection to disk, and releases the memory.
   * <p>
   * @param collection collection to spill to disk
   */
  protected abstract  void spill (C collection)  ;
  /**
   * Force to spilling the current in-memory collection to disk to release memory,
   * It will be called by TaskMemoryManager when there is not enough memory for the task.
   * @return (undocumented)
   */
  protected abstract  boolean forceSpill ()  ;
  protected  long elementsRead ()  { throw new RuntimeException(); }
  protected  void addElementsRead ()  { throw new RuntimeException(); }
  /**
   * Spills the current in-memory collection to disk if needed. Attempts to acquire more
   * memory before spilling.
   * <p>
   * @param collection collection to spill to disk
   * @param currentMemory estimated size of the collection in bytes
   * @return true if <code>collection</code> was spilled to disk; false otherwise
   */
  protected  boolean maybeSpill (C collection, long currentMemory)  { throw new RuntimeException(); }
  /**
   * Spill some data to disk to release memory, which will be called by TaskMemoryManager
   * when there is not enough memory for the task.
   * @param size (undocumented)
   * @param trigger (undocumented)
   * @return (undocumented)
   */
  public  long spill (long size, org.apache.spark.memory.MemoryConsumer trigger)  { throw new RuntimeException(); }
  /**
   * @return number of bytes spilled in total
   */
  public  long memoryBytesSpilled ()  { throw new RuntimeException(); }
  /**
   * Release our memory back to the execution pool so that other tasks can grab it.
   */
  public  void releaseMemory ()  { throw new RuntimeException(); }
  /**
   * Prints a standard log message detailing spillage.
   * <p>
   * @param size number of bytes spilled
   */
  private  void logSpillage (long size)  { throw new RuntimeException(); }
}
