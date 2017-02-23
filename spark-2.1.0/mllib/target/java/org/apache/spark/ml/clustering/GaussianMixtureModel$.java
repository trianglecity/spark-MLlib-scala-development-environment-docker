package org.apache.spark.ml.clustering;
public  class GaussianMixtureModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.clustering.GaussianMixtureModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GaussianMixtureModel$ MODULE$ = null;
  public   GaussianMixtureModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.GaussianMixtureModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.GaussianMixtureModel load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Compute the probability (partial assignment) for each cluster for the given data point.
   * @param features  Data point
   * @param dists  Gaussians for model
   * @param weights  Weights for each Gaussian
   * @return  Probability (partial assignment) for each of the k clusters
   */
    double[] computeProbabilities (breeze.linalg.DenseVector<java.lang.Object> features, org.apache.spark.ml.stat.distribution.MultivariateGaussian[] dists, double[] weights)  { throw new RuntimeException(); }
}
