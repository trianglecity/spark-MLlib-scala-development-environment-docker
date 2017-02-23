package org.apache.spark.ml.clustering;
/**
 * Local (non-distributed) model fitted by {@link LDA}.
 * <p>
 * This model stores the inferred topics only; it does not store info about the training dataset.
 */
public  class LocalLDAModel extends org.apache.spark.ml.clustering.LDAModel {
  static   class LocalLDAModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   LocalLDAModelWriter (org.apache.spark.ml.clustering.LocalLDAModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  int vocabSize ()  { throw new RuntimeException(); }
      public  org.apache.spark.ml.linalg.Matrix topicsMatrix ()  { throw new RuntimeException(); }
      public  org.apache.spark.ml.linalg.Vector docConcentration ()  { throw new RuntimeException(); }
      public  double topicConcentration ()  { throw new RuntimeException(); }
      public  double gammaShape ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (int vocabSize, org.apache.spark.ml.linalg.Matrix topicsMatrix, org.apache.spark.ml.linalg.Vector docConcentration, double topicConcentration, double gammaShape)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction5<java.lang.Object, org.apache.spark.ml.linalg.Matrix, org.apache.spark.ml.linalg.Vector, java.lang.Object, java.lang.Object, org.apache.spark.ml.clustering.LocalLDAModel.LocalLDAModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class LocalLDAModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LocalLDAModel> {
    public   LocalLDAModelReader ()  { throw new RuntimeException(); }
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.clustering.LocalLDAModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LocalLDAModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.LocalLDAModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  protected  org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel ()  { throw new RuntimeException(); }
  // not preceding
     LocalLDAModel (java.lang.String uid, int vocabSize, org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.LocalLDAModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.clustering.LDAModel getModel ()  { throw new RuntimeException(); }
  public  boolean isDistributed ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
