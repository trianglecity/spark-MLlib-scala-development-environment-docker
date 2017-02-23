package org.apache.spark.mllib.clustering;
/**
 * Multivariate Gaussian Mixture Model (GMM) consisting of k Gaussians, where points
 * are drawn from each Gaussian i=1..k with probability w(i); mu(i) and sigma(i) are
 * the respective mean and covariance for each Gaussian distribution i=1..k.
 * <p>
 * param:  weights Weights for each Gaussian distribution in the mixture, where weights(i) is
 *                the weight for Gaussian i, and weights.sum == 1
 * param:  gaussians Array of MultivariateGaussian where gaussians(i) represents
 *                  the Multivariate Gaussian (Normal) Distribution for Gaussian i
 */
public  class GaussianMixtureModel implements scala.Serializable, org.apache.spark.mllib.util.Saveable {
  static private  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  class Data implements scala.Product, scala.Serializable {
      public  double weight ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Vector mu ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Matrix sigma ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (double weight, org.apache.spark.mllib.linalg.Vector mu, org.apache.spark.mllib.linalg.Matrix sigma)  { throw new RuntimeException(); }
    }
    public  class Data extends scala.runtime.AbstractFunction3<java.lang.Object, org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.linalg.Matrix, org.apache.spark.mllib.clustering.GaussianMixtureModel.SaveLoadV1_0.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    public  java.lang.String formatVersionV1_0 ()  { throw new RuntimeException(); }
    public  java.lang.String classNameV1_0 ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, double[] weights, org.apache.spark.mllib.stat.distribution.MultivariateGaussian[] gaussians)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.GaussianMixtureModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.clustering.GaussianMixtureModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  double[] weights ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.distribution.MultivariateGaussian[] gaussians ()  { throw new RuntimeException(); }
  // not preceding
  public   GaussianMixtureModel (double[] weights, org.apache.spark.mllib.stat.distribution.MultivariateGaussian[] gaussians)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Number of gaussians in mixture
   * @return (undocumented)
   */
  public  int k ()  { throw new RuntimeException(); }
  /**
   * Maps given points to their cluster indices.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Maps given point to its cluster index.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  int predict (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predict()</code>
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Integer> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Given the input vectors, return the membership value of each vector
   * to all mixture components.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<double[]> predictSoft (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Given the input vector, return the membership values to all mixture components.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  double[] predictSoft (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Compute the partial assignments for each vector
   * @param pt (undocumented)
   * @param dists (undocumented)
   * @param weights (undocumented)
   * @param k (undocumented)
   * @return (undocumented)
   */
  private  double[] computeSoftAssignments (breeze.linalg.DenseVector<java.lang.Object> pt, org.apache.spark.mllib.stat.distribution.MultivariateGaussian[] dists, double[] weights, int k)  { throw new RuntimeException(); }
}
