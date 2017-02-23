package org.apache.spark.examples.mllib;
/**
 * An example Power Iteration Clustering http://www.icml2010.org/papers/387.pdf app.
 * Takes an input of K concentric circles and the number of points in the innermost circle.
 * The output should be K clusters - each cluster containing precisely the points associated
 * with each of the input circles.
 * <p>
 * Run with
 * <pre><code>
 * ./bin/run-example mllib.PowerIterationClusteringExample [options]
 *
 * Where options include:
 *   k:  Number of circles/clusters
 *   n:  Number of sampled points on innermost circle.. There are proportionally more points
 *      within the outer/larger circles
 *   maxIterations:   Number of Power Iterations
 * </code></pre>
 * <p>
 * Here is a sample run and output:
 * <p>
 * ./bin/run-example mllib.PowerIterationClusteringExample -k 2 --n 10 --maxIterations 15
 * <p>
 * Cluster assignments: 1 -> [0,1,2,3,4,5,6,7,8,9],
 *   0 -> [10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29]
 * <p>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class PowerIterationClusteringExample {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.PowerIterationClusteringExample.Params> implements scala.Product, scala.Serializable {
    public  int k ()  { throw new RuntimeException(); }
    public  int numPoints ()  { throw new RuntimeException(); }
    public  int maxIterations ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (int k, int numPoints, int maxIterations)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.examples.mllib.PowerIterationClusteringExample.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.PowerIterationClusteringExample.Params params)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> generateCircle (double radius, int n)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> generateCirclesRdd (org.apache.spark.SparkContext sc, int nCircles, int nPoints)  { throw new RuntimeException(); }
  /**
   * Gaussian Similarity:  http://en.wikipedia.org/wiki/Radial_basis_function_kernel
   * @param p1 (undocumented)
   * @param p2 (undocumented)
   * @return (undocumented)
   */
  static public  double gaussianSimilarity (scala.Tuple2<java.lang.Object, java.lang.Object> p1, scala.Tuple2<java.lang.Object, java.lang.Object> p2)  { throw new RuntimeException(); }
}
