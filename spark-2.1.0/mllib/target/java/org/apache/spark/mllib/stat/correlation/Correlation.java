package org.apache.spark.mllib.stat.correlation;
/**
 * Trait for correlation algorithms.
 */
  interface Correlation {
  /**
   * Compute correlation for two datasets.
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  double computeCorrelation (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y)  ;
  /**
   * Compute the correlation matrix S, for the input matrix, where S(i, j) is the correlation
   * between column i and j. S(i, j) can be NaN if the correlation is undefined for column i and j.
   * @param X (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix computeCorrelationMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X)  ;
  /**
   * Combine the two input RDD[Double]s into an RDD[Vector] and compute the correlation using the
   * correlation implementation for RDD[Vector]. Can be NaN if correlation is undefined for the
   * input vectors.
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  double computeCorrelationWithMatrixImpl (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y)  ;
}
