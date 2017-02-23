package org.apache.spark.mllib.clustering;
/**
 * This class performs expectation maximization for multivariate Gaussian
 * Mixture Models (GMMs).  A GMM represents a composite distribution of
 * independent Gaussian distributions with associated "mixing" weights
 * specifying each's contribution to the composite.
 * <p>
 * Given a set of sample points, this class will maximize the log-likelihood
 * for a mixture of k Gaussians, iterating until the log-likelihood changes by
 * less than convergenceTol, or until it has reached the max number of iterations.
 * While this process is generally guaranteed to converge, it is not guaranteed
 * to find a global optimum.
 * <p>
 * param:  k Number of independent Gaussians in the mixture model.
 * param:  convergenceTol Maximum change in log-likelihood at which convergence
 *                       is considered to have occurred.
 * param:  maxIterations Maximum number of iterations allowed.
 * <p>
 * @note For high-dimensional data (with many features), this algorithm may perform poorly.
 * This is due to high-dimensional data (a) making it difficult to cluster at all (based
 * on statistical/theoretical arguments) and (b) numerical issues with Gaussian distributions.
 */
public  class GaussianMixture implements scala.Serializable {
  /**
   * Heuristic to distribute the computation of the <code>MultivariateGaussian</code>s, approximately when
   * d is greater than 25 except for when k is very small.
   * @param k  Number of topics
   * @param d  Number of features
   * @return (undocumented)
   */
  static public  boolean shouldDistributeGaussians (int k, int d)  { throw new RuntimeException(); }
  private  int k ()  { throw new RuntimeException(); }
  private  double convergenceTol ()  { throw new RuntimeException(); }
  private  int maxIterations ()  { throw new RuntimeException(); }
  private  long seed ()  { throw new RuntimeException(); }
  // not preceding
  private   GaussianMixture (int k, double convergenceTol, int maxIterations, long seed)  { throw new RuntimeException(); }
  /**
   * Constructs a default instance. The default parameters are {k: 2, convergenceTol: 0.01,
   * maxIterations: 100, seed: random}.
   */
  public   GaussianMixture ()  { throw new RuntimeException(); }
  private  int nSamples ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.mllib.clustering.GaussianMixtureModel> initialModel ()  { throw new RuntimeException(); }
  /**
   * Set the initial GMM starting point, bypassing the random initialization.
   * You must call setK() prior to calling this method, and the condition
   * (model.k == this.k) must be met; failure will result in an IllegalArgumentException
   * @param model (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setInitialModel (org.apache.spark.mllib.clustering.GaussianMixtureModel model)  { throw new RuntimeException(); }
  /**
   * Return the user supplied initial GMM, if supplied
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.mllib.clustering.GaussianMixtureModel> getInitialModel ()  { throw new RuntimeException(); }
  /**
   * Set the number of Gaussians in the mixture model.  Default: 2
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setK (int k)  { throw new RuntimeException(); }
  /**
   * Return the number of Gaussians in the mixture model
   * @return (undocumented)
   */
  public  int getK ()  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations allowed. Default: 100
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setMaxIterations (int maxIterations)  { throw new RuntimeException(); }
  /**
   * Return the maximum number of iterations allowed
   * @return (undocumented)
   */
  public  int getMaxIterations ()  { throw new RuntimeException(); }
  /**
   * Set the largest change in log-likelihood at which convergence is
   * considered to have occurred.
   * @param convergenceTol (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setConvergenceTol (double convergenceTol)  { throw new RuntimeException(); }
  /**
   * Return the largest change in log-likelihood at which convergence is
   * considered to have occurred.
   * @return (undocumented)
   */
  public  double getConvergenceTol ()  { throw new RuntimeException(); }
  /**
   * Set the random seed
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setSeed (long seed)  { throw new RuntimeException(); }
  /**
   * Return the random seed
   * @return (undocumented)
   */
  public  long getSeed ()  { throw new RuntimeException(); }
  /**
   * Perform expectation maximization
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixtureModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>run()</code>
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixtureModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.Object, org.apache.spark.mllib.stat.distribution.MultivariateGaussian> updateWeightsAndGaussians (breeze.linalg.DenseVector<java.lang.Object> mean, breeze.linalg.DenseMatrix<java.lang.Object> sigma, double weight, double sumWeights)  { throw new RuntimeException(); }
  /** Average of dense breeze vectors */
  private  breeze.linalg.DenseVector<java.lang.Object> vectorMean (scala.collection.mutable.IndexedSeq<breeze.linalg.Vector<java.lang.Object>> x)  { throw new RuntimeException(); }
  /**
   * Construct matrix where diagonal entries are element-wise
   * variance of input vectors (computes biased variance)
   * @param x (undocumented)
   * @return (undocumented)
   */
  private  breeze.linalg.DenseMatrix<java.lang.Object> initCovariance (scala.collection.mutable.IndexedSeq<breeze.linalg.Vector<java.lang.Object>> x)  { throw new RuntimeException(); }
}
