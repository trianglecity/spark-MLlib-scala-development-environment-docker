package org.apache.spark.mllib.clustering;
public  class LDA$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LDA$ MODULE$ = null;
  public   LDA$ ()  { throw new RuntimeException(); }
  /** Term vertex IDs are {-1, -2, ..., -vocabSize} */
    long term2index (int term)  { throw new RuntimeException(); }
    int index2term (long termIndex)  { throw new RuntimeException(); }
    boolean isDocumentVertex (scala.Tuple2<java.lang.Object, ?> v)  { throw new RuntimeException(); }
    boolean isTermVertex (scala.Tuple2<java.lang.Object, ?> v)  { throw new RuntimeException(); }
  /**
   * Compute gamma_{wjk}, a distribution over topics k.
   * @param docTopicCounts (undocumented)
   * @param termTopicCounts (undocumented)
   * @param totalTopicCounts (undocumented)
   * @param vocabSize (undocumented)
   * @param eta (undocumented)
   * @param alpha (undocumented)
   * @return (undocumented)
   */
    breeze.linalg.DenseVector<java.lang.Object> computePTopic (breeze.linalg.DenseVector<java.lang.Object> docTopicCounts, breeze.linalg.DenseVector<java.lang.Object> termTopicCounts, breeze.linalg.DenseVector<java.lang.Object> totalTopicCounts, int vocabSize, double eta, double alpha)  { throw new RuntimeException(); }
}
