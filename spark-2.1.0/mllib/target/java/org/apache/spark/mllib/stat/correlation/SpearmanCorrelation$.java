package org.apache.spark.mllib.stat.correlation;
/**
 * Compute Spearman's correlation for two RDDs of the type RDD[Double] or the correlation matrix
 * for an RDD of the type RDD[Vector].
 * <p>
 * Definition of Spearman's correlation can be found at
 * http://en.wikipedia.org/wiki/Spearman's_rank_correlation_coefficient
 */
public  class SpearmanCorrelation$ implements org.apache.spark.mllib.stat.correlation.Correlation, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SpearmanCorrelation$ MODULE$ = null;
  public   SpearmanCorrelation$ ()  { throw new RuntimeException(); }
  /**
   * Compute Spearman's correlation for two datasets.
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  double computeCorrelation (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y)  { throw new RuntimeException(); }
  /**
   * Compute Spearman's correlation matrix S, for the input matrix, where S(i, j) is the
   * correlation between column i and j.
   * @param X (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix computeCorrelationMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X)  { throw new RuntimeException(); }
}
