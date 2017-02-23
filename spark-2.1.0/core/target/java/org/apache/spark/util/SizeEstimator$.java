package org.apache.spark.util;
/**
 * :: DeveloperApi ::
 * Estimates the sizes of Java objects (number of bytes of memory they occupy), for use in
 * memory-aware caches.
 * <p>
 * Based on the following JavaWorld article:
 * http://www.javaworld.com/javaworld/javaqa/2003-12/02-qa-1226-sizeof.html
 */
public  class SizeEstimator$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SizeEstimator$ MODULE$ = null;
  public   SizeEstimator$ ()  { throw new RuntimeException(); }
  /**
   * Estimate the number of bytes that the given object takes up on the JVM heap. The estimate
   * includes space taken up by objects referenced by the given object, their references, and so on
   * and so forth.
   * <p>
   * This is useful for determining the amount of heap space a broadcast variable will occupy on
   * each executor or the amount of space each object will take when caching objects in
   * deserialized form. This is not the same as the serialized size of the object, which will
   * typically be much smaller.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  public  long estimate (java.lang.Object obj)  { throw new RuntimeException(); }
  private  int BYTE_SIZE ()  { throw new RuntimeException(); }
  private  int BOOLEAN_SIZE ()  { throw new RuntimeException(); }
  private  int CHAR_SIZE ()  { throw new RuntimeException(); }
  private  int SHORT_SIZE ()  { throw new RuntimeException(); }
  private  int INT_SIZE ()  { throw new RuntimeException(); }
  private  int LONG_SIZE ()  { throw new RuntimeException(); }
  private  int FLOAT_SIZE ()  { throw new RuntimeException(); }
  private  int DOUBLE_SIZE ()  { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.Object> fieldSizes ()  { throw new RuntimeException(); }
  private  int ALIGN_SIZE ()  { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentMap<java.lang.Class<?>, org.apache.spark.util.SizeEstimator.ClassInfo> classInfos ()  { throw new RuntimeException(); }
  private  boolean is64bit ()  { throw new RuntimeException(); }
  private  boolean isCompressedOops ()  { throw new RuntimeException(); }
  private  int pointerSize ()  { throw new RuntimeException(); }
  private  int objectSize ()  { throw new RuntimeException(); }
  private  void initialize ()  { throw new RuntimeException(); }
  private  boolean getIsCompressedOops ()  { throw new RuntimeException(); }
  private  long estimate (java.lang.Object obj, java.util.IdentityHashMap<java.lang.Object, java.lang.Object> visited)  { throw new RuntimeException(); }
  private  void visitSingleObject (java.lang.Object obj, org.apache.spark.util.SizeEstimator.SearchState state)  { throw new RuntimeException(); }
  private  int ARRAY_SIZE_FOR_SAMPLING ()  { throw new RuntimeException(); }
  private  int ARRAY_SAMPLE_SIZE ()  { throw new RuntimeException(); }
  private  void visitArray (java.lang.Object array, java.lang.Class<?> arrayClass, org.apache.spark.util.SizeEstimator.SearchState state)  { throw new RuntimeException(); }
  private  long sampleArray (java.lang.Object array, org.apache.spark.util.SizeEstimator.SearchState state, java.util.Random rand, org.apache.spark.util.collection.OpenHashSet<java.lang.Object> drawn, int length)  { throw new RuntimeException(); }
  private  int primitiveSize (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  /**
   * Get or compute the ClassInfo for a given class.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.util.SizeEstimator.ClassInfo getClassInfo (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  private  long alignSize (long size)  { throw new RuntimeException(); }
  /**
   * Compute aligned size. The alignSize must be 2^n, otherwise the result will be wrong.
   * When alignSize = 2^n, alignSize - 1 = 2^n - 1. The binary representation of (alignSize - 1)
   * will only have n trailing 1s(0b00...001..1). ~(alignSize - 1) will be 0b11..110..0. Hence,
   * (size + alignSize - 1) &amp; ~(alignSize - 1) will set the last n bits to zeros, which leads to
   * multiple of alignSize.
   * @param size (undocumented)
   * @param alignSize (undocumented)
   * @return (undocumented)
   */
  private  long alignSizeUp (long size, int alignSize)  { throw new RuntimeException(); }
}
