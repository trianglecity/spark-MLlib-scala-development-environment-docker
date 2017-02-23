package org.apache.spark.ml.clustering;
/**
 * Multivariate Gaussian Mixture Model (GMM) consisting of k Gaussians, where points
 * are drawn from each Gaussian i with probability weights(i).
 * <p>
 * param:  weights Weight for each Gaussian distribution in the mixture.
 *                This is a multinomial probability distribution over the k Gaussians,
 *                where weights(i) is the weight for Gaussian i, and weights sum to 1.
 * param:  gaussians Array of <code>MultivariateGaussian</code> where gaussians(i) represents
 *                  the Multivariate Gaussian (Normal) Distribution for Gaussian i
 */
public  class GaussianMixtureModel extends org.apache.spark.ml.Model<org.apache.spark.ml.clustering.GaussianMixtureModel> implements org.apache.spark.ml.clustering.GaussianMixtureParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link GaussianMixtureModel} */
  static   class GaussianMixtureModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   GaussianMixtureModelWriter (org.apache.spark.ml.clustering.GaussianMixtureModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  double[] weights ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Vector[] mus ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Matrix[] sigmas ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (double[] weights, org.apache.spark.mllib.linalg.Vector[] mus, org.apache.spark.mllib.linalg.Matrix[] sigmas)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction3<double[], org.apache.spark.mllib.linalg.Vector[], org.apache.spark.mllib.linalg.Matrix[], org.apache.spark.ml.clustering.GaussianMixtureModel.GaussianMixtureModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class GaussianMixtureModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.GaussianMixtureModel> {
    public   GaussianMixtureModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.GaussianMixtureModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.GaussianMixtureModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.GaussianMixtureModel load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Compute the probability (partial assignment) for each cluster for the given data point.
   * @param features  Data point
   * @param dists  Gaussians for model
   * @param weights  Weights for each Gaussian
   * @return  Probability (partial assignment) for each of the k clusters
   */
  static   double[] computeProbabilities (breeze.linalg.DenseVector<java.lang.Object> features, org.apache.spark.ml.stat.distribution.MultivariateGaussian[] dists, double[] weights)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  static public  java.lang.String explainParam (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  java.lang.String explainParams ()  { throw new RuntimeException(); }
  static public final  boolean isSet (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final  boolean isDefined (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  boolean hasParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (java.lang.String param, Object value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.ParamPair<?> paramPair)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Params clear (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> T getOrDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> T $ (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> org.apache.spark.ml.param.Params setDefault (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params setDefault (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> getDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> boolean hasDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends org.apache.spark.ml.param.Params> T defaultCopy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap ()  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> T copyValues (T to, org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> org.apache.spark.ml.param.ParamMap copyValues$default$2 ()  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.Estimator<M> parent ()  { throw new RuntimeException(); }
  static public  void parent_$eq (org.apache.spark.ml.Estimator<M> x$1)  { throw new RuntimeException(); }
  static public  M setParent (org.apache.spark.ml.Estimator<M> parent)  { throw new RuntimeException(); }
  static public  boolean hasParent ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getProbabilityCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  static public final  double getTol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  static public  int getK ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  double[] weights ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.stat.distribution.MultivariateGaussian[] gaussians ()  { throw new RuntimeException(); }
  // not preceding
     GaussianMixtureModel (java.lang.String uid, double[] weights, org.apache.spark.ml.stat.distribution.MultivariateGaussian[] gaussians)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixtureModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixtureModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixtureModel setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.GaussianMixtureModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    int predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
    org.apache.spark.ml.linalg.Vector predictProbability (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  /**
   * Retrieve Gaussian distributions as a DataFrame.
   * Each row represents a Gaussian Distribution.
   * Two columns are defined: mean and cov.
   * Schema:
   * <pre><code>
   *  root
   *   |-- mean: vector (nullable = true)
   *   |-- cov: matrix (nullable = true)
   * </code></pre>
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> gaussiansDF ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.ml.util.MLWriter} instance for this ML instance.
   * <p>
   * For {@link GaussianMixtureModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ml.clustering.GaussianMixtureSummary> trainingSummary ()  { throw new RuntimeException(); }
    org.apache.spark.ml.clustering.GaussianMixtureModel setSummary (scala.Option<org.apache.spark.ml.clustering.GaussianMixtureSummary> summary)  { throw new RuntimeException(); }
  /**
   * Return true if there exists summary of model.
   * @return (undocumented)
   */
  public  boolean hasSummary ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is
   * thrown if <code>trainingSummary == None</code>.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.GaussianMixtureSummary summary ()  { throw new RuntimeException(); }
}
