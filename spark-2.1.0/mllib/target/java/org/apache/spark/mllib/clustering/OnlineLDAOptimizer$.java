package org.apache.spark.mllib.clustering;
/**
 * Serializable companion object containing helper methods and shared code for
 * {@link OnlineLDAOptimizer} and {@link LocalLDAModel}.
 */
public  class OnlineLDAOptimizer$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OnlineLDAOptimizer$ MODULE$ = null;
  public   OnlineLDAOptimizer$ ()  { throw new RuntimeException(); }
  /**
   * Uses variational inference to infer the topic distribution <code>gammad</code> given the term counts
   * for a document. <code>termCounts</code> must contain at least one non-zero entry, otherwise Breeze will
   * throw a BLAS error.
   * <p>
   * An optimization (Lee, Seung: Algorithms for non-negative matrix factorization, NIPS 2001)
   * avoids explicit computation of variational parameter <code>phi</code>.
   * @see <a href="http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.31.7566">here</a>
   * <p>
   * @return Returns a tuple of <code>gammad</code> - estimate of gamma, the topic distribution, <code>sstatsd</code> -
   *         statistics for updating lambda and <code>ids</code> - list of termCounts vector indices.
   * @param termCounts (undocumented)
   * @param expElogbeta (undocumented)
   * @param alpha (undocumented)
   * @param gammaShape (undocumented)
   * @param k (undocumented)
   */
    scala.Tuple3<breeze.linalg.DenseVector<java.lang.Object>, breeze.linalg.DenseMatrix<java.lang.Object>, scala.collection.immutable.List<java.lang.Object>> variationalTopicInference (org.apache.spark.mllib.linalg.Vector termCounts, breeze.linalg.DenseMatrix<java.lang.Object> expElogbeta, breeze.linalg.Vector<java.lang.Object> alpha, double gammaShape, int k)  { throw new RuntimeException(); }
}
