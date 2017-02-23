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
public  class MovieLensALS {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.MovieLensALS.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  boolean kryo ()  { throw new RuntimeException(); }
    public  int numIterations ()  { throw new RuntimeException(); }
    public  double lambda ()  { throw new RuntimeException(); }
    public  int rank ()  { throw new RuntimeException(); }
    public  int numUserBlocks ()  { throw new RuntimeException(); }
    public  int numProductBlocks ()  { throw new RuntimeException(); }
    public  boolean implicitPrefs ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, boolean kryo, int numIterations, double lambda, int rank, int numUserBlocks, int numProductBlocks, boolean implicitPrefs)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction8<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.examples.mllib.MovieLensALS.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.MovieLensALS.Params params)  { throw new RuntimeException(); }
  /** Compute RMSE (Root Mean Squared Error). */
  static public  double computeRmse (org.apache.spark.mllib.recommendation.MatrixFactorizationModel model, org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> data, boolean implicitPrefs)  { throw new RuntimeException(); }
}
