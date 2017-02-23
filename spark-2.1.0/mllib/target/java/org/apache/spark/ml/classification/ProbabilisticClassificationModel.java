package org.apache.spark.ml.classification;
/**
 * :: DeveloperApi ::
 * <p>
 * Model produced by a {@link ProbabilisticClassifier}.
 * Classes are indexed {0, 1, ..., numClasses - 1}.
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., <code>Vector</code>
 * @tparam M  Concrete Model type
 */
public abstract class ProbabilisticClassificationModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M> implements org.apache.spark.ml.classification.ProbabilisticClassifierParams {
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
  static public  void normalizeToProbabilitiesInPlace (org.apache.spark.ml.linalg.DenseVector v)  { throw new RuntimeException(); }
  static public abstract  java.lang.String uid ()  ;
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
  static public  org.apache.spark.ml.Estimator<M> parent ()  { throw new RuntimeException(); }
  static public  void parent_$eq (org.apache.spark.ml.Estimator<M> x$1)  { throw new RuntimeException(); }
  static public  M setParent (org.apache.spark.ml.Estimator<M> parent)  { throw new RuntimeException(); }
  static public  boolean hasParent ()  { throw new RuntimeException(); }
  static public abstract  M copy (org.apache.spark.ml.param.ParamMap extra)  ;
  static public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getLabelCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getPredictionCol ()  { throw new RuntimeException(); }
  static public  M setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  M setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  int numFeatures ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transformImpl (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getRawPredictionCol ()  { throw new RuntimeException(); }
  static public  M setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  static public abstract  int numClasses ()  ;
  static protected  double predict (FeaturesType features)  { throw new RuntimeException(); }
  static protected abstract  org.apache.spark.ml.linalg.Vector predictRaw (FeaturesType features)  ;
  static public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getProbabilityCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleArrayParam thresholds ()  { throw new RuntimeException(); }
  static public  double[] getThresholds ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema, boolean fitting, org.apache.spark.sql.types.DataType featuresDataType)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ProbabilisticClassificationModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   ProbabilisticClassificationModel ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  M setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  M setThresholds (double[] value)  { throw new RuntimeException(); }
  /**
   * Transforms dataset by reading from {@link featuresCol}, and appending new columns as specified by
   * parameters:
   *  - predicted labels as {@link predictionCol} of type {@link Double}
   *  - raw predictions (confidences) as {@link rawPredictionCol} of type <code>Vector</code>
   *  - probability of each class as {@link probabilityCol} of type <code>Vector</code>.
   * <p>
   * @param dataset input dataset
   * @return transformed dataset
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Estimate the probability of each class given the raw prediction,
   * doing the computation in-place.
   * These predictions are also called class conditional probabilities.
   * <p>
   * This internal method is used to implement {@link transform()} and output {@link probabilityCol}.
   * <p>
   * @return Estimated class conditional probabilities (modified input vector)
   * @param rawPrediction (undocumented)
   */
  protected abstract  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  ;
  /** Non-in-place version of {@link raw2probabilityInPlace()} */
  protected  org.apache.spark.ml.linalg.Vector raw2probability (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  protected  double raw2prediction (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  /**
   * Predict the probability of each class given the features.
   * These predictions are also called class conditional probabilities.
   * <p>
   * This internal method is used to implement {@link transform()} and output {@link probabilityCol}.
   * <p>
   * @return Estimated class conditional probabilities
   * @param features (undocumented)
   */
  protected  org.apache.spark.ml.linalg.Vector predictProbability (FeaturesType features)  { throw new RuntimeException(); }
  /**
   * Given a vector of class conditional probabilities, select the predicted label.
   * This supports thresholds which favor particular labels.
   * @return  predicted label
   * @param probability (undocumented)
   */
  protected  double probability2prediction (org.apache.spark.ml.linalg.Vector probability)  { throw new RuntimeException(); }
}
