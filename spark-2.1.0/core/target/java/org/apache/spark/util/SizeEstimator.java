package org.apache.spark.util;
/**
 * :: DeveloperApi ::
 * Estimates the sizes of Java objects (number of bytes of memory they occupy), for use in
 * memory-aware caches.
 * <p>
 * Based on the following JavaWorld article:
 * http://www.javaworld.com/javaworld/javaqa/2003-12/02-qa-1226-sizeof.html
 */
public  class SizeEstimator {
  /**
   * The state of an ongoing size estimation. Contains a stack of objects to visit as well as an
   * IdentityHashMap of visited objects, and provides utility methods for enqueueing new objects
   * to visit.
   */
  static private  class SearchState {
    public  java.util.IdentityHashMap<java.lang.Object, java.lang.Object> visited ()  { throw new RuntimeException(); }
    // not preceding
    public   SearchState (java.util.IdentityHashMap<java.lang.Object, java.lang.Object> visited)  { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.Object> stack ()  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
    public  void enqueue (java.lang.Object obj)  { throw new RuntimeException(); }
    public  boolean isFinished ()  { throw new RuntimeException(); }
    public  java.lang.Object dequeue ()  { throw new RuntimeException(); }
  }
  /**
   * Cached information about each class. We remember two things: the "shell size" of the class
   * (size of all non-static fields plus the java.lang.Object size), and any fields that are
   * pointers to objects.
   */
  static private  class ClassInfo {
    public  long shellSize ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.reflect.Field> pointerFields ()  { throw new RuntimeException(); }
    // not preceding
    public   ClassInfo (long shellSize, scala.collection.immutable.List<java.lang.reflect.Field> pointerFields)  { throw new RuntimeException(); }
  }
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
  static public  long estimate (java.lang.Object obj)  { throw new RuntimeException(); }
  static private  int BYTE_SIZE ()  { throw new RuntimeException(); }
  static private  int BOOLEAN_SIZE ()  { throw new RuntimeException(); }
  static private  int CHAR_SIZE ()  { throw new RuntimeException(); }
  static private  int SHORT_SIZE ()  { throw new RuntimeException(); }
  static private  int INT_SIZE ()  { throw new RuntimeException(); }
  static private  int LONG_SIZE ()  { throw new RuntimeException(); }
  static private  int FLOAT_SIZE ()  { throw new RuntimeException(); }
  static private  int DOUBLE_SIZE ()  { throw new RuntimeException(); }
  static private  scala.collection.immutable.List<java.lang.Object> fieldSizes ()  { throw new RuntimeException(); }
  static private  int ALIGN_SIZE ()  { throw new RuntimeException(); }
  static private  java.util.concurrent.ConcurrentMap<java.lang.Class<?>, org.apache.spark.util.SizeEstimator.ClassInfo> classInfos ()  { throw new RuntimeException(); }
  static private  boolean is64bit ()  { throw new RuntimeException(); }
  static private  boolean isCompressedOops ()  { throw new RuntimeException(); }
  static private  int pointerSize ()  { throw new RuntimeException(); }
  static private  int objectSize ()  { throw new RuntimeException(); }
  static private  void initialize ()  { throw new RuntimeException(); }
  static private  boolean getIsCompressedOops ()  { throw new RuntimeException(); }
  static private  long estimate (java.lang.Object obj, java.util.IdentityHashMap<java.lang.Object, java.lang.Object> visited)  { throw new RuntimeException(); }
  static private  void visitSingleObject (java.lang.Object obj, org.apache.spark.util.SizeEstimator.SearchState state)  { throw new RuntimeException(); }
  static private  int ARRAY_SIZE_FOR_SAMPLING ()  { throw new RuntimeException(); }
  static private  int ARRAY_SAMPLE_SIZE ()  { throw new RuntimeException(); }
  static private  void visitArray (java.lang.Object array, java.lang.Class<?> arrayClass, org.apache.spark.util.SizeEstimator.SearchState state)  { throw new RuntimeException(); }
  static private  long sampleArray (java.lang.Object array, org.apache.spark.util.SizeEstimator.SearchState state, java.util.Random rand, org.apache.spark.util.collection.OpenHashSet<java.lang.Object> drawn, int length)  { throw new RuntimeException(); }
  static private  int primitiveSize (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  /**
   * Get or compute the ClassInfo for a given class.
   * @param cls (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.util.SizeEstimator.ClassInfo getClassInfo (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  static private  long alignSize (long size)  { throw new RuntimeException(); }
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
  static private  long alignSizeUp (long size, int alignSize)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
}
