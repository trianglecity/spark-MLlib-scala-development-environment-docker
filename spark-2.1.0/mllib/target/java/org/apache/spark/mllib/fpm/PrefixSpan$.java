package org.apache.spark.mllib.fpm;
public  class PrefixSpan$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PrefixSpan$ MODULE$ = null;
  public   PrefixSpan$ ()  { throw new RuntimeException(); }
  /**
   * Find the complete set of frequent sequential patterns in the input sequences.
   * @param data ordered sequences of itemsets. We represent a sequence internally as Array[Int],
   *             where each itemset is represented by a contiguous sequence of distinct and ordered
   *             positive integers. We use 0 as the delimiter at itemset boundaries, including the
   *             first and the last position.
   * @return an RDD of (frequent sequential pattern, count) pairs,
   * @see Postfix
   * @param minCount (undocumented)
   * @param maxPatternLength (undocumented)
   * @param maxLocalProjDBSize (undocumented)
   */
    org.apache.spark.rdd.RDD<scala.Tuple2<int[], java.lang.Object>> genFreqPatterns (org.apache.spark.rdd.RDD<int[]> data, long minCount, int maxPatternLength, long maxLocalProjDBSize)  { throw new RuntimeException(); }
}
