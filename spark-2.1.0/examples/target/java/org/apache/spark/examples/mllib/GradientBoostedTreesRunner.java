package org.apache.spark.examples.mllib;
/**
 * An example runner for Gradient Boosting using decision trees as weak learners. Run with
 * <pre><code>
 * ./bin/run-example mllib.GradientBoostedTreesRunner [options]
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 * <p>
 * Note: This script treats all features as real-valued (not categorical).
 *       To include categorical features, modify categoricalFeaturesInfo.
 */
public  class GradientBoostedTreesRunner {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.GradientBoostedTreesRunner.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  java.lang.String testInput ()  { throw new RuntimeException(); }
    public  java.lang.String dataFormat ()  { throw new RuntimeException(); }
    public  java.lang.String algo ()  { throw new RuntimeException(); }
    public  int maxDepth ()  { throw new RuntimeException(); }
    public  int numIterations ()  { throw new RuntimeException(); }
    public  double fracTest ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, java.lang.String testInput, java.lang.String dataFormat, java.lang.String algo, int maxDepth, int numIterations, double fracTest)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.examples.mllib.GradientBoostedTreesRunner.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.GradientBoostedTreesRunner.Params params)  { throw new RuntimeException(); }
}
