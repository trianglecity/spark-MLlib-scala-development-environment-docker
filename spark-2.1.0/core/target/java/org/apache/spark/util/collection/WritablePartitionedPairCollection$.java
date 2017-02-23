package org.apache.spark.util.collection;
public  class WritablePartitionedPairCollection$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WritablePartitionedPairCollection$ MODULE$ = null;
  public   WritablePartitionedPairCollection$ ()  { throw new RuntimeException(); }
  /**
   * A comparator for (Int, K) pairs that orders them by only their partition ID.
   * @return (undocumented)
   */
  public <K extends java.lang.Object> java.util.Comparator<scala.Tuple2<java.lang.Object, K>> partitionComparator ()  { throw new RuntimeException(); }
  /**
   * A comparator for (Int, K) pairs that orders them both by their partition ID and a key ordering.
   * @param keyComparator (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> java.util.Comparator<scala.Tuple2<java.lang.Object, K>> partitionKeyComparator (java.util.Comparator<K> keyComparator)  { throw new RuntimeException(); }
}
