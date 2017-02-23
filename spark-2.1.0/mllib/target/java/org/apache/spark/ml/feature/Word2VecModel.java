package org.apache.spark.ml.feature;
/**
 * Model fitted by {@link Word2Vec}.
 */
public  class Word2VecModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.Word2VecModel> implements org.apache.spark.ml.feature.Word2VecBase, org.apache.spark.ml.util.MLWritable {
  static   class Word2VecModelWriter extends org.apache.spark.ml.util.MLWriter {
    public   Word2VecModelWriter (org.apache.spark.ml.feature.Word2VecModel instance)  { throw new RuntimeException(); }
    private  class Data implements scala.Product, scala.Serializable {
      public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> wordIndex ()  { throw new RuntimeException(); }
      public  scala.collection.Seq<java.lang.Object> wordVectors ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (scala.collection.immutable.Map<java.lang.String, java.lang.Object> wordIndex, scala.collection.Seq<java.lang.Object> wordVectors)  { throw new RuntimeException(); }
    }
    private  class Data extends scala.runtime.AbstractFunction2<scala.collection.immutable.Map<java.lang.String, java.lang.Object>, scala.collection.Seq<java.lang.Object>, org.apache.spark.ml.feature.Word2VecModel.Word2VecModelWriter.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class Word2VecModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.Word2VecModel> {
    public   Word2VecModelReader ()  { throw new RuntimeException(); }
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.feature.Word2VecModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.Word2VecModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Word2VecModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  static public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  static public final  int getMaxIter ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  static public final  double getStepSize ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam vectorSize ()  { throw new RuntimeException(); }
  static public  int getVectorSize ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam windowSize ()  { throw new RuntimeException(); }
  static public  int getWindowSize ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam numPartitions ()  { throw new RuntimeException(); }
  static public  int getNumPartitions ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam minCount ()  { throw new RuntimeException(); }
  static public  int getMinCount ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.IntParam maxSentenceLength ()  { throw new RuntimeException(); }
  static public  int getMaxSentenceLength ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType validateAndTransformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.feature.Word2VecModel wordVectors ()  { throw new RuntimeException(); }
  // not preceding
     Word2VecModel (java.lang.String uid, org.apache.spark.mllib.feature.Word2VecModel wordVectors)  { throw new RuntimeException(); }
  /**
   * Returns a dataframe with two fields, "word" and "vector", with "word" being a String and
   * and the vector the DenseVector that it is mapped to.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getVectors ()  { throw new RuntimeException(); }
  /**
   * Find "num" number of words closest in similarity to the given word, not
   * including the word itself. Returns a dataframe with the words and the
   * cosine similarities between the synonyms and the given word.
   * @param word (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> findSynonyms (java.lang.String word, int num)  { throw new RuntimeException(); }
  /**
   * Find "num" number of words whose vector representation most similar to the supplied vector.
   * If the supplied vector is the vector representation of a word in the model's vocabulary,
   * that word will be in the results.  Returns a dataframe with the words and the cosine
   * similarities between the synonyms and the given word vector.
   * @param vec (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> findSynonyms (org.apache.spark.ml.linalg.Vector vec, int num)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2VecModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2VecModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Transform a sentence column to a vector column to represent the whole sentence. The transform
   * is performed by averaging all word vectors it contains.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Word2VecModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}
