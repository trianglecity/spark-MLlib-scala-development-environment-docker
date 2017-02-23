package org.apache.spark.util.collection;
/**
 * Implementation of WritablePartitionedPairCollection that wraps a map in which the keys are tuples
 * of (partition ID, K)
 */
  class PartitionedAppendOnlyMap<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.util.collection.SizeTrackingAppendOnlyMap<scala.Tuple2<java.lang.Object, K>, V> implements org.apache.spark.util.collection.WritablePartitionedPairCollection<K, V> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PartitionedAppendOnlyMap ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, V>> partitionedDestructiveSortedIterator (scala.Option<java.util.Comparator<K>> keyComparator)  { throw new RuntimeException(); }
  public  void insert (int partition, K key, V value)  { throw new RuntimeException(); }
}
