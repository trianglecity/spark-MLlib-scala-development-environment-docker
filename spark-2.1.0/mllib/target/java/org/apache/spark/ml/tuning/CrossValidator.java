package org.apache.spark.ml.tuning;
/**
 * K-fold cross validation performs model selection by splitting the dataset into a set of
 * non-overlapping randomly partitioned folds which are used as separate training and test datasets
 * e.g., with k=3 folds, K-fold cross validation will generate 3 (training, test) dataset pairs,
 * each of which uses 2/3 of the data for training and 1/3 for testing. Each fold is used as the
 * test set exactly once.
 */
public  class CrossValidator extends org.apache.spark.ml.Estimator<org.apache.spark.ml.tuning.CrossValidatorModel> implements org.apache.spark.ml.tuning.CrossValidatorParams, org.apache.spark.ml.util.MLWritable, org.apache.spark.internal.Logging {
  static   class CrossValidatorWriter extends org.apache.spark.ml.util.MLWriter {
    public   CrossValidatorWriter (org.apache.spark.ml.tuning.CrossValidator instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class CrossValidatorReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.CrossValidator> {
    public   CrossValidatorReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tuning.CrossValidator load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.CrossValidator> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.CrossValidator load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.Estimator<?> getEstimator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.ParamMap[] getEstimatorParamMaps ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.evaluation.Evaluator> evaluator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.evaluation.Evaluator getEvaluator ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType transformSchemaImpl (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.IntParam numFolds ()  { throw new RuntimeException(); }
  static public  int getNumFolds ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   CrossValidator (java.lang.String uid)  { throw new RuntimeException(); }
  public   CrossValidator ()  { throw new RuntimeException(); }
  private  com.github.fommil.netlib.F2jBLAS f2jBLAS ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEstimator (org.apache.spark.ml.Estimator<?> value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEstimatorParamMaps (org.apache.spark.ml.param.ParamMap[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEvaluator (org.apache.spark.ml.evaluation.Evaluator value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setNumFolds (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setSeed (long value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidatorModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidator copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
