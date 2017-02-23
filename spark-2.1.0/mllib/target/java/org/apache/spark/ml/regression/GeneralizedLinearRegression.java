package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * <p>
 * Fit a Generalized Linear Model
 * (see <a href="https://en.wikipedia.org/wiki/Generalized_linear_model">
 * Generalized linear model (Wikipedia)</a>)
 * specified by giving a symbolic description of the linear
 * predictor (link function) and a description of the error distribution (family).
 * It supports "gaussian", "binomial", "poisson" and "gamma" as family.
 * Valid link functions for each family is listed below. The first link function of each family
 * is the default one.
 *  - "gaussian" : "identity", "log", "inverse"
 *  - "binomial" : "logit", "probit", "cloglog"
 *  - "poisson"  : "log", "identity", "sqrt"
 *  - "gamma"    : "inverse", "identity", "log"
 */
public  class GeneralizedLinearRegression extends org.apache.spark.ml.regression.Regressor<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.GeneralizedLinearRegression, org.apache.spark.ml.regression.GeneralizedLinearRegressionModel> implements org.apache.spark.ml.regression.GeneralizedLinearRegressionBase, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.internal.Logging {
  /**
   * A description of the error distribution to be used in the model.
   * <p>
   * param:  name the name of the family.
   */
  static  abstract class Family implements scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   Family (java.lang.String name)  { throw new RuntimeException(); }
    /** The default link instance of this family. */
    public abstract  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  ;
    /** Initialize the starting value for mu. */
    public abstract  double initialize (double y, double weight)  ;
    /** The variance of the endogenous variable's mean, given the value mu. */
    public abstract  double variance (double mu)  ;
    /** Deviance of (y, mu) pair. */
    public abstract  double deviance (double y, double mu, double weight)  ;
    /**
     * Akaike Information Criterion (AIC) value of the family for a given dataset.
     * <p>
     * @param predictions an RDD of (y, mu, weight) of instances in evaluation dataset
     * @param deviance the deviance for the fitted model in evaluation dataset
     * @param numInstances number of instances in evaluation dataset
     * @param weightSum weights sum of instances in evaluation dataset
     * @return (undocumented)
     */
    public abstract  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  ;
    /** Trim the fitted value so that it will be in valid range. */
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  static public  class Family$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Family$ MODULE$ = null;
    public   Family$ ()  { throw new RuntimeException(); }
    /**
     * Gets the {@link Family} object from its name.
     * <p>
     * @param name family name: "gaussian", "binomial", "poisson" or "gamma".
     * @return (undocumented)
     */
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Family fromName (java.lang.String name)  { throw new RuntimeException(); }
  }
  /**
   * Gaussian exponential family distribution.
   * The default link for the Gaussian family is the identity link.
   */
  static public  class Gaussian$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Family {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Gaussian$ MODULE$ = null;
    public   Gaussian$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  /**
   * Binomial exponential family distribution.
   * The default link for the Binomial family is the logit link.
   */
  static public  class Binomial$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Family {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Binomial$ MODULE$ = null;
    public   Binomial$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  /**
   * Poisson exponential family distribution.
   * The default link for the Poisson family is the log link.
   */
  static public  class Poisson$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Family {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Poisson$ MODULE$ = null;
    public   Poisson$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  /**
   * Gamma exponential family distribution.
   * The default link for the Gamma family is the inverse link.
   */
  static public  class Gamma$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Family {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Gamma$ MODULE$ = null;
    public   Gamma$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  /**
   * A description of the link function to be used in the model.
   * The link function provides the relationship between the linear predictor
   * and the mean of the distribution function.
   * <p>
   * param:  name the name of link function.
   */
  static  abstract class Link implements scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   Link (java.lang.String name)  { throw new RuntimeException(); }
    /** The link function. */
    public abstract  double link (double mu)  ;
    /** Derivative of the link function. */
    public abstract  double deriv (double mu)  ;
    /** The inverse link function. */
    public abstract  double unlink (double eta)  ;
  }
  static public  class Link$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Link$ MODULE$ = null;
    public   Link$ ()  { throw new RuntimeException(); }
    /**
     * Gets the {@link Link} object from its name.
     * <p>
     * @param name link name: "identity", "logit", "log",
     *             "inverse", "probit", "cloglog" or "sqrt".
     * @return (undocumented)
     */
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link fromName (java.lang.String name)  { throw new RuntimeException(); }
  }
  static public  class Identity$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Identity$ MODULE$ = null;
    public   Identity$ ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  static public  class Logit$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Logit$ MODULE$ = null;
    public   Logit$ ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  static public  class Log$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Log$ MODULE$ = null;
    public   Log$ ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  static public  class Inverse$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Inverse$ MODULE$ = null;
    public   Inverse$ ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  static public  class Probit$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Probit$ MODULE$ = null;
    public   Probit$ ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  static public  class CLogLog$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CLogLog$ MODULE$ = null;
    public   CLogLog$ ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  static public  class Sqrt$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Sqrt$ MODULE$ = null;
    public   Sqrt$ ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  /**
   * Wrapper of family and link combination used in the model.
   */
  static   class FamilyAndLink implements scala.Serializable {
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Family family ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link link ()  { throw new RuntimeException(); }
    // not preceding
    public   FamilyAndLink (org.apache.spark.ml.regression.GeneralizedLinearRegression.Family family, org.apache.spark.ml.regression.GeneralizedLinearRegression.Link link)  { throw new RuntimeException(); }
    /** Linear predictor based on given mu. */
    public  double predict (double mu)  { throw new RuntimeException(); }
    /** Fitted value based on linear predictor eta. */
    public  double fitted (double eta)  { throw new RuntimeException(); }
    /**
     * Get the initial guess model for {@link IterativelyReweightedLeastSquares}.
     * @param instances (undocumented)
     * @param fitIntercept (undocumented)
     * @param regParam (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.ml.optim.WeightedLeastSquaresModel initialize (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, boolean fitIntercept, double regParam)  { throw new RuntimeException(); }
    /**
     * The reweight function used to update offsets and weights
     * at each iteration of {@link IterativelyReweightedLeastSquares}.
     * @return (undocumented)
     */
    public  scala.Function2<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.WeightedLeastSquaresModel, scala.Tuple2<java.lang.Object, java.lang.Object>> reweightFunc ()  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.regression.GeneralizedLinearRegression load (java.lang.String path)  { throw new RuntimeException(); }
  /** Set of family and link pairs that GeneralizedLinearRegression supports. */
  static   scala.collection.immutable.Set<scala.Tuple2<org.apache.spark.ml.regression.GeneralizedLinearRegression.Family, org.apache.spark.ml.regression.GeneralizedLinearRegression.Link>> supportedFamilyAndLinkPairs ()  { throw new RuntimeException(); }
  /** Set of family names that GeneralizedLinearRegression supports. */
  static   scala.collection.immutable.Set<java.lang.String> supportedFamilyNames ()  { throw new RuntimeException(); }
  /** Set of link names that GeneralizedLinearRegression supports. */
  static   scala.collection.immutable.Set<java.lang.String> supportedLinkNames ()  { throw new RuntimeException(); }
  static   double epsilon ()  { throw new RuntimeException(); }
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
  static protected  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema, boolean logging)  { throw new RuntimeException(); }
  static public  M fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> otherParamPairs)  { throw new RuntimeException(); }
  static public  M fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap paramMap)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<M> fit (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap[] paramMaps)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getLabelCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public  Learner setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  Learner setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  Learner setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  M fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> extractLabeledPoints (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  static public final  boolean getFitIntercept ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  static public final  double getTol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  static public final  double getRegParam ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getWeightCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  static public final  java.lang.String getSolver ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> family ()  { throw new RuntimeException(); }
  static public  java.lang.String getFamily ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> link ()  { throw new RuntimeException(); }
  static public  java.lang.String getLink ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> linkPredictionCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getLinkPredictionCol ()  { throw new RuntimeException(); }
  static   boolean hasLinkPredictionCol ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   GeneralizedLinearRegression (java.lang.String uid)  { throw new RuntimeException(); }
  public   GeneralizedLinearRegression ()  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link family}.
   * Default is "gaussian".
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setFamily (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link link}.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setLink (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets if we should fit the intercept.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setFitIntercept (boolean value)  { throw new RuntimeException(); }
  /**
   * Sets the maximum number of iterations (applicable for solver "irls").
   * Default is 25.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setMaxIter (int value)  { throw new RuntimeException(); }
  /**
   * Sets the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * Default is 1E-6.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setTol (double value)  { throw new RuntimeException(); }
  /**
   * Sets the regularization parameter for L2 regularization.
   * The regularization term is
   * <blockquote>
   *    $$
   *    0.5 * regParam * L2norm(coefficients)^2
   *    $$
   * </blockquote>
   * Default is 0.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setRegParam (double value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the solver algorithm used for optimization.
   * Currently only supports "irls" which is also the default solver.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setSolver (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the link prediction (linear predictor) column name.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setLinkPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.GeneralizedLinearRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
