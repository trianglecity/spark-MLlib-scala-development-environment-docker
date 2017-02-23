package org.apache.spark.streaming.util;
public  class RawTextHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RawTextHelper$ MODULE$ = null;
  public   RawTextHelper$ ()  { throw new RuntimeException(); }
  /**
   * Splits lines and counts the words.
   * @param iter (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.String, java.lang.Object>> splitAndCountPartitions (scala.collection.Iterator<java.lang.String> iter)  { throw new RuntimeException(); }
  /**
   * Gets the top k words in terms of word counts. Assumes that each word exists only once
   * in the <code>data</code> iterator (that is, the counts have been reduced).
   * @param data (undocumented)
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.String, java.lang.Object>> topK (scala.collection.Iterator<scala.Tuple2<java.lang.String, java.lang.Object>> data, int k)  { throw new RuntimeException(); }
  /**
   * Warms up the SparkContext in master and slave by running tasks to force JIT kick in
   * before real workload starts.
   * @param sc (undocumented)
   */
  public  void warmUp (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  long add (long v1, long v2)  { throw new RuntimeException(); }
  public  long subtract (long v1, long v2)  { throw new RuntimeException(); }
  public  long max (long v1, long v2)  { throw new RuntimeException(); }
}
