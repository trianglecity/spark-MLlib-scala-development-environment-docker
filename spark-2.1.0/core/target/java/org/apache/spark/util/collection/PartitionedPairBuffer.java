package org.apache.spark.util.collection;
/**
 * Append-only buffer of key-value pairs, each with a corresponding partition ID, that keeps track
 * of its estimated size in bytes.
 * <p>
 * The buffer can support up to <code>1073741823 (2 ^ 30 - 1)</code> elements.
 */
  class PartitionedPairBuffer<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.util.collection.WritablePartitionedPairCollection<K, V>, org.apache.spark.util.collection.SizeTracker {
  static public  int MAXIMUM_CAPACITY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.util.collection.WritablePartitionedIterator destructiveSortedWritablePartitionedIterator (scala.Option<java.util.Comparator<K>> keyComparator)  { throw new RuntimeException(); }
  static protected  void resetSamples ()  { throw new RuntimeException(); }
  static protected  void afterUpdate ()  { throw new RuntimeException(); }
  static public  long estimateSize ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PartitionedPairBuffer (int initialCapacity)  { throw new RuntimeException(); }
  private  int capacity ()  { throw new RuntimeException(); }
  private  int curSize ()  { throw new RuntimeException(); }
  private  java.lang.Object[] data ()  { throw new RuntimeException(); }
  /** Add an element into the buffer */
  public  void insert (int partition, K key, V value)  { throw new RuntimeException(); }
  /** Double the size of the array because we've reached capacity */
  private  void growArray ()  { throw new RuntimeException(); }
  /** Iterate through the data in a given order. For this class this is not really destructive. */
  public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, V>> partitionedDestructiveSortedIterator (scala.Option<java.util.Comparator<K>> keyComparator)  { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, V>> iterator ()  { throw new RuntimeException(); }
}
