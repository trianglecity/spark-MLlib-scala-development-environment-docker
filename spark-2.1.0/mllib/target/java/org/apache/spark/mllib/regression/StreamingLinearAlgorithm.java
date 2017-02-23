package org.apache.spark.mllib.regression;
/**
 * :: DeveloperApi ::
 * StreamingLinearAlgorithm implements methods for continuously
 * training a generalized linear model model on streaming data,
 * and using it for prediction on (possibly different) streaming data.
 * <p>
 * This class takes as type parameters a GeneralizedLinearModel,
 * and a GeneralizedLinearAlgorithm, making it easy to extend to construct
 * streaming versions of any analyses using GLMs.
 * Initial weights must be set before calling trainOn or predictOn.
 * Only weights will be updated, not an intercept. If the model needs
 * an intercept, it should be manually appended to the input data.
 * <p>
 * For example usage, see <code>StreamingLinearRegressionWithSGD</code>.
 * <p>
 * NOTE: In some use cases, the order in which trainOn and predictOn
 * are called in an application will affect the results. When called on
 * the same DStream, if trainOn is called before predictOn, when new data
 * arrive the model will update and the prediction will be based on the new
 * model. Whereas if predictOn is called first, the prediction will use the model
 * from the previous update.
 * <p>
 * NOTE: It is ok to call predictOn repeatedly on multiple streams; this
 * will generate predictions for each one all using the current model.
 * It is also ok to call trainOn on different streams; this will update
 * the model using each of the different sources, in sequence.
 * <p>
 */
public abstract class StreamingLinearAlgorithm<M extends org.apache.spark.mllib.regression.GeneralizedLinearModel, A extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M>> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Ident(org.apache.spark.mllib.regression.GeneralizedLinearModel))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm), List(TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   StreamingLinearAlgorithm ()  { throw new RuntimeException(); }
  /** The model to be updated and used for prediction. */
  protected abstract  scala.Option<M> model ()  ;
  /** The algorithm to use for updating. */
  protected abstract  A algorithm ()  ;
  /**
   * Return the latest model.
   * <p>
   * @return (undocumented)
   */
  public  M latestModel ()  { throw new RuntimeException(); }
  /**
   * Update the model by training on batches of data from a DStream.
   * This operation registers a DStream for training the model,
   * and updates the model based on every subsequent
   * batch of data from the stream.
   * <p>
   * @param data DStream containing labeled data
   */
  public  void trainOn (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>trainOn</code>.
   * @param data (undocumented)
   */
  public  void trainOn (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
  /**
   * Use the model to make predictions on batches of data from a DStream
   * <p>
   * @param data DStream containing feature vectors
   * @return DStream containing predictions
   * <p>
   */
  public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> predictOn (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predictOn</code>.
   * <p>
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Double> predictOn (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Use the model to make predictions on the values of a DStream and carry over its keys.
   * @param data DStream containing feature vectors
   * @tparam K key type
   * @return DStream containing the input keys and the predictions as values
   * <p>
   * @param evidence$1 (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, java.lang.Object>> predictOnValues (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, org.apache.spark.mllib.linalg.Vector>> data, scala.reflect.ClassTag<K> evidence$1)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predictOnValues</code>.
   * <p>
   * @param data (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Double> predictOnValues (org.apache.spark.streaming.api.java.JavaPairDStream<K, org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
}
