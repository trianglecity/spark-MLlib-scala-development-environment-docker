package org.apache.spark.ml.clustering;
/**
 * Latent Dirichlet Allocation (LDA), a topic model designed for text documents.
 * <p>
 * Terminology:
 *  - "term" = "word": an element of the vocabulary
 *  - "token": instance of a term appearing in a document
 *  - "topic": multinomial distribution over terms representing some concept
 *  - "document": one piece of text, corresponding to one row in the input data
 * <p>
 * Original LDA paper (journal version):
 *  Blei, Ng, and Jordan.  "Latent Dirichlet Allocation."  JMLR, 2003.
 * <p>
 * Input data (featuresCol):
 *  LDA is given a collection of documents as input data, via the featuresCol parameter.
 *  Each document is specified as a <code>Vector</code> of length vocabSize, where each entry is the
 *  count for the corresponding term (word) in the document.  Feature transformers such as
 *  {@link org.apache.spark.ml.feature.Tokenizer} and {@link org.apache.spark.ml.feature.CountVectorizer}
 *  can be useful for converting text to word count vectors.
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Latent_Dirichlet_allocation">
 * Latent Dirichlet allocation (Wikipedia)</a>
 */
public  class LDA extends org.apache.spark.ml.Estimator<org.apache.spark.ml.clustering.LDAModel> implements org.apache.spark.ml.clustering.LDAParams, org.apache.spark.ml.util.DefaultParamsWritable {
  static private  class LDAReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LDA> {
    public   LDAReader ()  { throw new RuntimeException(); }
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.LDA load (java.lang.String path)  { throw new RuntimeException(); }
  }
  /** Get dataset for spark.mllib LDA */
  static   org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> getOldDataset (org.apache.spark.sql.Dataset<?> dataset, java.lang.String featuresCol)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LDA> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.LDA load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   LDA (java.lang.String uid)  { throw new RuntimeException(); }
  public   LDA ()  { throw new RuntimeException(); }
  /**
   * The features for LDA should be a <code>Vector</code> representing the word counts in a document.
   * The vector should be of length vocabSize, with counts for each term (word).
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.LDA setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setSeed (long value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setK (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setDocConcentration (double[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setDocConcentration (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setTopicConcentration (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setOptimizer (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setTopicDistributionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.LDA setLearningOffset (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.LDA setLearningDecay (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setSubsamplingRate (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.LDA setOptimizeDocConcentration (boolean value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.LDA setKeepLastCheckpoint (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.LDA copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.LDAModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
