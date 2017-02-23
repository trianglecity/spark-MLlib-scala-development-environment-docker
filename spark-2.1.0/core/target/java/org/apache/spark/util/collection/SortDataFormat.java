package org.apache.spark.util.collection;
/**
 * Abstraction for sorting an arbitrary input buffer of data. This interface requires determining
 * the sort key for a given element index, as well as swapping elements and moving data from one
 * buffer to another.
 * <p>
 * Example format: an array of numbers, where each element is also the key.
 * See {@link KVArraySortDataFormat} for a more exciting format.
 * <p>
 * Note: Declaring and instantiating multiple subclasses of this class would prevent JIT inlining
 * overridden methods and hence decrease the shuffle performance.
 * <p>
 * @tparam K Type of the sort key of each element
 * @tparam Buffer Internal data structure used by a particular format (e.g., Array[Int]).
 */
 abstract class SortDataFormat<K extends java.lang.Object, Buffer extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SortDataFormat ()  { throw new RuntimeException(); }
  /**
   * Creates a new mutable key for reuse. This should be implemented if you want to override
   * {@link getKey(Buffer, Int, K)}.
   * @return (undocumented)
   */
  public  K newKey ()  { throw new RuntimeException(); }
  /** Return the sort key for the element at the given index. */
  protected abstract  K getKey (Buffer data, int pos)  ;
  /**
   * Returns the sort key for the element at the given index and reuse the input key if possible.
   * The default implementation ignores the reuse parameter and invokes {@link getKey(Buffer, Int}.
   * If you want to override this method, you must implement {@link newKey()}.
   * @param data (undocumented)
   * @param pos (undocumented)
   * @param reuse (undocumented)
   * @return (undocumented)
   */
  public  K getKey (Buffer data, int pos, K reuse)  { throw new RuntimeException(); }
  /** Swap two elements. */
  public abstract  void swap (Buffer data, int pos0, int pos1)  ;
  /** Copy a single element from src(srcPos) to dst(dstPos). */
  public abstract  void copyElement (Buffer src, int srcPos, Buffer dst, int dstPos)  ;
  /**
   * Copy a range of elements starting at src(srcPos) to dst, starting at dstPos.
   * Overlapping ranges are allowed.
   * @param src (undocumented)
   * @param srcPos (undocumented)
   * @param dst (undocumented)
   * @param dstPos (undocumented)
   * @param length (undocumented)
   */
  public abstract  void copyRange (Buffer src, int srcPos, Buffer dst, int dstPos, int length)  ;
  /**
   * Allocates a Buffer that can hold up to 'length' elements.
   * All elements of the buffer should be considered invalid until data is explicitly copied in.
   * @param length (undocumented)
   * @return (undocumented)
   */
  public abstract  Buffer allocate (int length)  ;
}
