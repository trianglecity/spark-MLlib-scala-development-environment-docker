package org.apache.spark.mllib.feature;
/**
 * Normalizes samples individually to unit L^p^ norm
 * <p>
 * For any 1 &amp;lt;= p &amp;lt; Double.PositiveInfinity, normalizes samples using
 * sum(abs(vector).^p^)^(1/p)^ as norm.
 * <p>
 * For p = Double.PositiveInfinity, max(abs(vector)) will be used as norm for normalization.
 * <p>
 * param:  p Normalization in L^p^ space, p = 2 by default.
 */
public  class Normalizer implements org.apache.spark.mllib.feature.VectorTransformer {
  public   Normalizer (double p)  { throw new RuntimeException(); }
  public   Normalizer ()  { throw new RuntimeException(); }
  /**
   * Applies unit length normalization on a vector.
   * <p>
   * @param vector vector to be normalized.
   * @return normalized vector. If the norm of the input is zero, it will return the input vector.
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
}
