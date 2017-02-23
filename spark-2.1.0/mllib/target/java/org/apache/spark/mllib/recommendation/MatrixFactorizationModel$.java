package org.apache.spark.mllib.recommendation;
public  class MatrixFactorizationModel$ implements org.apache.spark.mllib.util.Loader<org.apache.spark.mllib.recommendation.MatrixFactorizationModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MatrixFactorizationModel$ MODULE$ = null;
  public   MatrixFactorizationModel$ ()  { throw new RuntimeException(); }
  /**
   * Makes recommendations for a single user (or product).
   * @param recommendToFeatures (undocumented)
   * @param recommendableFeatures (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  private  scala.Tuple2<java.lang.Object, java.lang.Object>[] recommend (double[] recommendToFeatures, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> recommendableFeatures, int num)  { throw new RuntimeException(); }
  /**
   * Makes recommendations for all users (or products).
   * @param rank rank
   * @param srcFeatures src features to receive recommendations
   * @param dstFeatures dst features used to make recommendations
   * @param num number of recommendations for each record
   * @return an RDD of (srcId: Int, recommendations), where recommendations are stored as an array
   *         of (dstId, rating) pairs.
   */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.Tuple2<java.lang.Object, java.lang.Object>[]>> recommendForAll (int rank, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> srcFeatures, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> dstFeatures, int num)  { throw new RuntimeException(); }
  /**
   * Blockifies features to use Level-3 BLAS.
   * @param rank (undocumented)
   * @param features (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<int[], org.apache.spark.mllib.linalg.DenseMatrix>> blockify (int rank, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> features)  { throw new RuntimeException(); }
  /**
   * Load a model from the given path.
   * <p>
   * The model should have been saved by <code>Saveable.save</code>.
   * <p>
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
