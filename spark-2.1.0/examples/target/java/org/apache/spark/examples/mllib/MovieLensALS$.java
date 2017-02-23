package org.apache.spark.examples.mllib;
/**
 * An example app for ALS on MovieLens data (http://grouplens.org/datasets/movielens/).
 * Run with
 * <pre><code>
 * bin/run-example org.apache.spark.examples.mllib.MovieLensALS
 * </code></pre>
 * A synthetic dataset in MovieLens format can be found at <code>data/mllib/sample_movielens_data.txt</code>.
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class MovieLensALS$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MovieLensALS$ MODULE$ = null;
  public   MovieLensALS$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  public  void run (org.apache.spark.examples.mllib.MovieLensALS.Params params)  { throw new RuntimeException(); }
  /** Compute RMSE (Root Mean Squared Error). */
  public  double computeRmse (org.apache.spark.mllib.recommendation.MatrixFactorizationModel model, org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> data, boolean implicitPrefs)  { throw new RuntimeException(); }
}
