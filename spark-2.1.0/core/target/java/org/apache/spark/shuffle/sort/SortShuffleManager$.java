package org.apache.spark.shuffle.sort;
public  class SortShuffleManager$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SortShuffleManager$ MODULE$ = null;
  public   SortShuffleManager$ ()  { throw new RuntimeException(); }
  /**
   * The maximum number of shuffle output partitions that SortShuffleManager supports when
   * buffering map outputs in a serialized form. This is an extreme defensive programming measure,
   * since it's extremely unlikely that a single shuffle produces over 16 million output partitions.
   * @return (undocumented)
   * */
  public  int MAX_SHUFFLE_OUTPUT_PARTITIONS_FOR_SERIALIZED_MODE ()  { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle should use an optimized serialized shuffle
   * path or whether it should fall back to the original path that operates on deserialized objects.
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  public  boolean canUseSerializedShuffle (org.apache.spark.ShuffleDependency<?, ?, ?> dependency)  { throw new RuntimeException(); }
}
