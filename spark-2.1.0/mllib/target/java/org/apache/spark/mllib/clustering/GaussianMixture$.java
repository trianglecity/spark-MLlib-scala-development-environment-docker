package org.apache.spark.mllib.clustering;
public  class GaussianMixture$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GaussianMixture$ MODULE$ = null;
  public   GaussianMixture$ ()  { throw new RuntimeException(); }
  /**
   * Heuristic to distribute the computation of the <code>MultivariateGaussian</code>s, approximately when
   * d is greater than 25 except for when k is very small.
   * @param k  Number of topics
   * @param d  Number of features
   * @return (undocumented)
   */
  public  boolean shouldDistributeGaussians (int k, int d)  { throw new RuntimeException(); }
}
