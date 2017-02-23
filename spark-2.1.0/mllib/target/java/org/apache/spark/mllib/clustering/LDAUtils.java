package org.apache.spark.mllib.clustering;
/**
 * Utility methods for LDA.
 */
public  class LDAUtils {
  /**
   * Log Sum Exp with overflow protection using the identity:
   * For any a: $\log \sum_{n=1}^N \exp\{x_n\} = a + \log \sum_{n=1}^N \exp\{x_n - a\}$
   * @param x (undocumented)
   * @return (undocumented)
   */
  static   double logSumExp (breeze.linalg.DenseVector<java.lang.Object> x)  { throw new RuntimeException(); }
  /**
   * For theta ~ Dir(alpha), computes E[log(theta)] given alpha. Currently the implementation
   * uses {@link breeze.numerics.digamma} which is accurate but expensive.
   * @param alpha (undocumented)
   * @return (undocumented)
   */
  static   breeze.linalg.DenseVector<java.lang.Object> dirichletExpectation (breeze.linalg.DenseVector<java.lang.Object> alpha)  { throw new RuntimeException(); }
  /**
   * Computes {@link dirichletExpectation()} row-wise, assuming each row of alpha are
   * Dirichlet parameters.
   * @param alpha (undocumented)
   * @return (undocumented)
   */
  static   breeze.linalg.DenseMatrix<java.lang.Object> dirichletExpectation (breeze.linalg.DenseMatrix<java.lang.Object> alpha)  { throw new RuntimeException(); }
}
