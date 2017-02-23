package org.apache.spark.ml.classification;
public  class ProbabilisticClassificationModel$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ProbabilisticClassificationModel$ MODULE$ = null;
  public   ProbabilisticClassificationModel$ ()  { throw new RuntimeException(); }
  /**
   * Normalize a vector of raw predictions to be a multinomial probability vector, in place.
   * <p>
   * The input raw predictions should be nonnegative.
   * The output vector sums to 1, unless the input vector is all-0 (in which case the output is
   * all-0 too).
   * <p>
   * NOTE: This is NOT applicable to all models, only ones which effectively use class
   *       instance counts for raw predictions.
   * @param v (undocumented)
   */
  public  void normalizeToProbabilitiesInPlace (org.apache.spark.ml.linalg.DenseVector v)  { throw new RuntimeException(); }
}
