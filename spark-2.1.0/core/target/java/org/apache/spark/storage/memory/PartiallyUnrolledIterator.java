package org.apache.spark.storage.memory;
/**
 * The result of a failed {@link MemoryStore.putIteratorAsValues()} call.
 * <p>
 * param:  memoryStore  the memoryStore, used for freeing memory.
 * param:  memoryMode   the memory mode (on- or off-heap).
 * param:  unrollMemory the amount of unroll memory used by the values in <code>unrolled</code>.
 * param:  unrolled     an iterator for the partially-unrolled values.
 * param:  rest         the rest of the original iterator passed to
 *                     {@link MemoryStore.putIteratorAsValues()}.
 */
  class PartiallyUnrolledIterator<T extends java.lang.Object> implements scala.collection.Iterator<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PartiallyUnrolledIterator (org.apache.spark.storage.memory.MemoryStore memoryStore, org.apache.spark.memory.MemoryMode memoryMode, long unrollMemory, scala.collection.Iterator<T> unrolled, scala.collection.Iterator<T> rest)  { throw new RuntimeException(); }
  private  void releaseUnrollMemory ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  T next ()  { throw new RuntimeException(); }
  /**
   * Called to dispose of this iterator and free its memory.
   */
  public  void close ()  { throw new RuntimeException(); }
}
