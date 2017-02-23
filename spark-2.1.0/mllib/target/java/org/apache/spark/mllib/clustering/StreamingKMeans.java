package org.apache.spark.mllib.clustering;
/**
 * StreamingKMeans provides methods for configuring a
 * streaming k-means analysis, training the model on streaming,
 * and using the model to make predictions on streaming data.
 * See KMeansModel for details on algorithm and update rules.
 * <p>
 * Use a builder pattern to construct a streaming k-means analysis
 * in an application, like:
 * <p>
 * <pre><code>
 *  val model = new StreamingKMeans()
 *    .setDecayFactor(0.5)
 *    .setK(3)
 *    .setRandomCenters(5, 100.0)
 *    .trainOn(DStream)
 * </code></pre>
 */
public  class StreamingKMeans implements org.apache.spark.internal.Logging, scala.Serializable {
  static public final  java.lang.String BATCHES ()  { throw new RuntimeException(); }
  static public final  java.lang.String POINTS ()  { throw new RuntimeException(); }
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
  public  int k ()  { throw new RuntimeException(); }
  public  double decayFactor ()  { throw new RuntimeException(); }
  public  java.lang.String timeUnit ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingKMeans (int k, double decayFactor, java.lang.String timeUnit)  { throw new RuntimeException(); }
  public   StreamingKMeans ()  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.clustering.StreamingKMeansModel model ()  { throw new RuntimeException(); }
  /**
   * Set the number of clusters.
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.StreamingKMeans setK (int k)  { throw new RuntimeException(); }
  /**
   * Set the forgetfulness of the previous centroids.
   * @param a (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.StreamingKMeans setDecayFactor (double a)  { throw new RuntimeException(); }
  /**
   * Set the half life and time unit ("batches" or "points"). If points, then the decay factor
   * is raised to the power of number of new points and if batches, then decay factor will be
   * used as is.
   * @param halfLife (undocumented)
   * @param timeUnit (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.StreamingKMeans setHalfLife (double halfLife, java.lang.String timeUnit)  { throw new RuntimeException(); }
  /**
   * Specify initial centers directly.
   * @param centers (undocumented)
   * @param weights (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.StreamingKMeans setInitialCenters (org.apache.spark.mllib.linalg.Vector[] centers, double[] weights)  { throw new RuntimeException(); }
  /**
   * Initialize random centers, requiring only the number of dimensions.
   * <p>
   * @param dim Number of dimensions
   * @param weight Weight for each center
   * @param seed Random seed
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.StreamingKMeans setRandomCenters (int dim, double weight, long seed)  { throw new RuntimeException(); }
  /**
   * Return the latest model.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.StreamingKMeansModel latestModel ()  { throw new RuntimeException(); }
  /**
   * Update the clustering model by training on batches of data from a DStream.
   * This operation registers a DStream for training the model,
   * checks whether the cluster centers have been initialized,
   * and updates the model using each batch of data from the stream.
   * <p>
   * @param data DStream containing vector data
   */
  public  void trainOn (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>trainOn</code>.
   * @param data (undocumented)
   */
  public  void trainOn (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Use the clustering model to make predictions on batches of data from a DStream.
   * <p>
   * @param data DStream containing vector data
   * @return DStream containing predictions
   */
  public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> predictOn (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predictOn</code>.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Integer> predictOn (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Use the model to make predictions on the values of a DStream and carry over its keys.
   * <p>
   * @param data DStream containing (key, feature vector) pairs
   * @tparam K key type
   * @return DStream containing the input keys and the predictions as values
   * @param evidence$1 (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, java.lang.Object>> predictOnValues (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, org.apache.spark.mllib.linalg.Vector>> data, scala.reflect.ClassTag<K> evidence$1)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predictOnValues</code>.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Integer> predictOnValues (org.apache.spark.streaming.api.java.JavaPairDStream<K, org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /** Check whether cluster centers have been initialized. */
  private  void assertInitialized ()  { throw new RuntimeException(); }
}
