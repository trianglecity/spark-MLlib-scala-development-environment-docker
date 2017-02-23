package org.apache.spark.ml;
/**
 * A simple pipeline, which acts as an estimator. A Pipeline consists of a sequence of stages, each
 * of which is either an {@link Estimator} or a {@link Transformer}. When {@link Pipeline#fit} is called, the
 * stages are executed in order. If a stage is an {@link Estimator}, its {@link Estimator#fit} method will
 * be called on the input dataset to fit a model. Then the model, which is a transformer, will be
 * used to transform the dataset as the input to the next stage. If a stage is a {@link Transformer},
 * its {@link Transformer#transform} method will be called to produce the dataset for the next stage.
 * The fitted model from a {@link Pipeline} is a {@link PipelineModel}, which consists of fitted models and
 * transformers, corresponding to the pipeline stages. If there are no stages, the pipeline acts as
 * an identity transformer.
 */
public  class Pipeline extends org.apache.spark.ml.Estimator<org.apache.spark.ml.PipelineModel> implements org.apache.spark.ml.util.MLWritable {
  /**
   * Methods for <code>MLReader</code> and <code>MLWriter</code> shared between {@link Pipeline} and {@link PipelineModel}
   */
  static public  class SharedReadWrite$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SharedReadWrite$ MODULE$ = null;
    public   SharedReadWrite$ ()  { throw new RuntimeException(); }
    /** Check that all stages are Writable */
    public  void validateStages (org.apache.spark.ml.PipelineStage[] stages)  { throw new RuntimeException(); }
    /**
     * Save metadata and stages for a {@link Pipeline} or {@link PipelineModel}
     *  - save metadata to path/metadata
     *  - save stages to stages/IDX_UID
     * @param instance (undocumented)
     * @param stages (undocumented)
     * @param sc (undocumented)
     * @param path (undocumented)
     */
    public  void saveImpl (org.apache.spark.ml.param.Params instance, org.apache.spark.ml.PipelineStage[] stages, org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
    /**
     * Load metadata and stages for a {@link Pipeline} or {@link PipelineModel}
     * @return  (UID, list of stages)
     * @param expectedClassName (undocumented)
     * @param sc (undocumented)
     * @param path (undocumented)
     */
    public  scala.Tuple2<java.lang.String, org.apache.spark.ml.PipelineStage[]> load (java.lang.String expectedClassName, org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
    /** Get path for saving the given stage. */
    public  java.lang.String getStagePath (java.lang.String stageUid, int stageIdx, int numStages, java.lang.String stagesDir)  { throw new RuntimeException(); }
  }
  static   class PipelineWriter extends org.apache.spark.ml.util.MLWriter {
    public   PipelineWriter (org.apache.spark.ml.Pipeline instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class PipelineReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.Pipeline> {
    public   PipelineReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.Pipeline load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.Pipeline> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.Pipeline load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Pipeline (java.lang.String uid)  { throw new RuntimeException(); }
  public   Pipeline ()  { throw new RuntimeException(); }
  /**
   * param for pipeline stages
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.PipelineStage[]> stages ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.Pipeline setStages (org.apache.spark.ml.PipelineStage[] value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  org.apache.spark.ml.PipelineStage[] getStages ()  { throw new RuntimeException(); }
  /**
   * Fits the pipeline to the input dataset with additional parameters. If a stage is an
   * {@link Estimator}, its {@link Estimator#fit} method will be called on the input dataset to fit a model.
   * Then the model, which is a transformer, will be used to transform the dataset as the input to
   * the next stage. If a stage is a {@link Transformer}, its {@link Transformer#transform} method will be
   * called to produce the dataset for the next stage. The fitted model from a {@link Pipeline} is an
   * {@link PipelineModel}, which consists of fitted models and transformers, corresponding to the
   * pipeline stages. If there are no stages, the output model acts as an identity transformer.
   * <p>
   * @param dataset input dataset
   * @return fitted pipeline
   */
  public  org.apache.spark.ml.PipelineModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.Pipeline copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
