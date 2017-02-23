package org.apache.spark.ml.clustering;
/**
 * Distributed model fitted by {@link LDA}.
 * This type of model is currently only produced by Expectation-Maximization (EM).
 * <p>
 * This model stores the inferred topics, the full training dataset, and the topic distribution
 * for each training document.
 * <p>
 * param:  oldLocalModelOption  Used to implement {@link oldLocalModel} as a lazy val, but keeping
 *                             <code>copy()</code> cheap.
 */
public  class DistributedLDAModel extends org.apache.spark.ml.clustering.LDAModel {
  static   class DistributedWriter extends org.apache.spark.ml.util.MLWriter {
    public   DistributedWriter (org.apache.spark.ml.clustering.DistributedLDAModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class DistributedLDAModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.DistributedLDAModel> {
    public   DistributedLDAModelReader ()  { throw new RuntimeException(); }
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.DistributedLDAModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.DistributedLDAModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.DistributedLDAModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamPair<?> firstParamPair, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> otherParamPairs)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap paramMap)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.Estimator<M> parent ()  { throw new RuntimeException(); }
  static public  void parent_$eq (org.apache.spark.ml.Estimator<M> x$1)  { throw new RuntimeException(); }
  static public  M setParent (org.apache.spark.ml.Estimator<M> parent)  { throw new RuntimeException(); }
  static public  boolean hasParent ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getFeaturesCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  static public final  int getCheckpointInterval ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  static public  int getK ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleArrayParam docConcentration ()  { throw new RuntimeException(); }
  static public  double[] getDocConcentration ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.ml.linalg.Vector getOldDocConcentration ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam topicConcentration ()  { throw new RuntimeException(); }
  static public  double getTopicConcentration ()  { throw new RuntimeException(); }
  static protected  double getOldTopicConcentration ()  { throw new RuntimeException(); }
  static public final  java.lang.String[] supportedOptimizers ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> optimizer ()  { throw new RuntimeException(); }
  static public  java.lang.String getOptimizer ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> topicDistributionCol ()  { throw new RuntimeException(); }
  static public  java.lang.String getTopicDistributionCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam learningOffset ()  { throw new RuntimeException(); }
  static public  double getLearningOffset ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam learningDecay ()  { throw new RuntimeException(); }
  static public  double getLearningDecay ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  { throw new RuntimeException(); }
  static public  double getSubsamplingRate ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam optimizeDocConcentration ()  { throw new RuntimeException(); }
  static public  boolean getOptimizeDocConcentration ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.BooleanParam keepLastCheckpoint ()  { throw new RuntimeException(); }
  static public  boolean getKeepLastCheckpoint ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static   org.apache.spark.mllib.clustering.LDAOptimizer getOldOptimizer ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  static public  java.lang.String uid ()  { throw new RuntimeException(); }
  static public  int vocabSize ()  { throw new RuntimeException(); }
  static   org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  static   double[] getEffectiveDocConcentration ()  { throw new RuntimeException(); }
  static   double getEffectiveTopicConcentration ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.LDAModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.LDAModel setSeed (long value)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.linalg.Vector estimatedDocConcentration ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.linalg.Matrix topicsMatrix ()  { throw new RuntimeException(); }
  static public  double logLikelihood (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public  double logPerplexity (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> describeTopics (int maxTermsPerTopic)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> describeTopics ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.clustering.DistributedLDAModel oldDistributedModel ()  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.mllib.clustering.LocalLDAModel> oldLocalModelOption ()  { throw new RuntimeException(); }
  // not preceding
     DistributedLDAModel (java.lang.String uid, int vocabSize, org.apache.spark.mllib.clustering.DistributedLDAModel oldDistributedModel, org.apache.spark.sql.SparkSession sparkSession, scala.Option<org.apache.spark.mllib.clustering.LocalLDAModel> oldLocalModelOption)  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel ()  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.clustering.LDAModel getModel ()  { throw new RuntimeException(); }
  /**
   * Convert this distributed model to a local representation.  This discards info about the
   * training dataset.
   * <p>
   * WARNING: This involves collecting a large {@link topicsMatrix} to the driver.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.LocalLDAModel toLocal ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.DistributedLDAModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  boolean isDistributed ()  { throw new RuntimeException(); }
  /**
   * Log likelihood of the observed tokens in the training set,
   * given the current parameter estimates:
   *  log P(docs | topics, topic distributions for docs, Dirichlet hyperparameters)
   * <p>
   * Notes:
   *  - This excludes the prior; for that, use {@link logPrior}.
   *  - Even with {@link logPrior}, this is NOT the same as the data log likelihood given the
   *    hyperparameters.
   *  - This is computed from the topic distributions computed during training. If you call
   *    <code>logLikelihood()</code> on the same training dataset, the topic distributions will be computed
   *    again, possibly giving different results.
   * @return (undocumented)
   */
  public  double trainingLogLikelihood ()  { throw new RuntimeException(); }
  /**
   * Log probability of the current parameter estimate:
   * log P(topics, topic distributions for docs | Dirichlet hyperparameters)
   * @return (undocumented)
   */
  public  double logPrior ()  { throw new RuntimeException(); }
  private  java.lang.String[] _checkpointFiles ()  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * <p>
   * If using checkpointing and <code>LDA.keepLastCheckpoint</code> is set to true, then there may be
   * saved checkpoint files.  This method is provided so that users can manage those files.
   * <p>
   * Note that removing the checkpoints can cause failures if a partition is lost and is needed
   * by certain {@link DistributedLDAModel} methods.  Reference counting will clean up the checkpoints
   * when this model and derivative data go out of scope.
   * <p>
   * @return  Checkpoint files from training
   */
  public  java.lang.String[] getCheckpointFiles ()  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * <p>
   * Remove any remaining checkpoint files from training.
   * <p>
   * @see getCheckpointFiles
   */
  public  void deleteCheckpointFiles ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
