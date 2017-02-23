package org.apache.spark.mllib.clustering;
/**
 * Distributed model fitted by {@link LDA}.
 * This type of model is currently only produced by Expectation-Maximization (EM).
 * <p>
 * This model stores the inferred topics, the full training dataset, and the topic distribution
 * for each training document.
 */
public  class DistributedLDAModel$ implements org.apache.spark.mllib.util.Loader<org.apache.spark.mllib.clustering.DistributedLDAModel> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DistributedLDAModel$ MODULE$ = null;
  public   DistributedLDAModel$ ()  { throw new RuntimeException(); }
  /**
   * The {@link DistributedLDAModel} constructor's default arguments assume gammaShape = 100
   * to ensure equivalence in LDAModel.toLocal conversion.
   * @return (undocumented)
   */
    double defaultGammaShape ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.DistributedLDAModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
