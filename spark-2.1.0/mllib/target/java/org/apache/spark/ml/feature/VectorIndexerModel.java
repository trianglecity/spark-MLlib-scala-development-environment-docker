package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link VectorIndexer}. Transform categorical features to use 0-based indices
 * instead of their original values.
 *  - Categorical features are mapped to indices.
 *  - Continuous features (columns) are left unchanged.
 * This also appends metadata to the output column, marking features as Numeric (continuous),
 * Nominal (categorical), or Binary (either continuous or categorical).
 * Non-ML metadata is not carried over from the input to the output column.
 * <p>
 * This maintains vector sparsity.
 * <p>
 * param:  numFeatures  Number of features, i.e., length of Vectors which this transforms
 * param:  categoryMaps  Feature value index.  Keys are categorical feature indices (column indices).
 *                      Values are maps from original features values to 0-based category indices.
 *                      If a feature is not in this map, it is treated as continuous.
 */
public  class VectorIndexerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.VectorIndexerModel> implements org.apache.spark.ml.feature.VectorIndexerParams, org.apache.spark.ml.util.MLWritable {
  static   class VectorIndexerModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   VectorIndexerModelWriter (org.apache.spark.ml.feature.VectorIndexerModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  int numFeatures ()  { throw new RuntimeException(); }
      public  scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> categoryMaps ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (int numFeatures, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> categoryMaps)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction2<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>>, org.apache.spark.ml.feature.VectorIndexerModel.VectorIndexerModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class VectorIndexerModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.VectorIndexerModel> {
    public   VectorIndexerModelReader ()  { throw new RuntimeException(); }
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.VectorIndexerModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.VectorIndexerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorIndexerModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getInputCol ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  static public final  java.lang.String getOutputCol ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.IntParam maxCategories ()  { throw new RuntimeException(); }
  static public  int getMaxCategories ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> categoryMaps ()  { throw new RuntimeException(); }
  // not preceding
     VectorIndexerModel (java.lang.String uid, int numFeatures, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> categoryMaps)  { throw new RuntimeException(); }
  /** Java-friendly version of {@link categoryMaps} */
  public  java.util.Map<java.lang.Integer, java.util.Map<java.lang.Double, java.lang.Integer>> javaCategoryMaps ()  { throw new RuntimeException(); }
  /**
   * Pre-computed feature attributes, with some missing info.
   * In transform(), set attribute name and other info, if available.
   * @return (undocumented)
   */
  private  org.apache.spark.ml.attribute.Attribute[] partialFeatureAttributes ()  { throw new RuntimeException(); }
  /** Per-vector transform function */
  private  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> transformFunc ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Prepare the output column field, including per-feature metadata.
   * @param schema  Input schema
   * @return  Output column field.  This field does not contain non-ML metadata.
   */
  private  org.apache.spark.sql.types.StructField prepOutputField (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorIndexerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
