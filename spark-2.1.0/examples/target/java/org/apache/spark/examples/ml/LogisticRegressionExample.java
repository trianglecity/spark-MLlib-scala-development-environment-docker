package org.apache.spark.examples.ml;
/**
 * An example runner for logistic regression with elastic-net (mixing L1/L2) regularization.
 * Run with
 * <pre><code>
 * bin/run-example ml.LogisticRegressionExample [options]
 * </code></pre>
 * A synthetic dataset can be found at <code>data/mllib/sample_libsvm_data.txt</code> which can be
 * trained by
 * <pre><code>
 * bin/run-example ml.LogisticRegressionExample --regParam 0.3 --elasticNetParam 0.8 \
 *   data/mllib/sample_libsvm_data.txt
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class LogisticRegressionExample {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.ml.LogisticRegressionExample.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  java.lang.String testInput ()  { throw new RuntimeException(); }
    public  java.lang.String dataFormat ()  { throw new RuntimeException(); }
    public  double regParam ()  { throw new RuntimeException(); }
    public  double elasticNetParam ()  { throw new RuntimeException(); }
    public  int maxIter ()  { throw new RuntimeException(); }
    public  boolean fitIntercept ()  { throw new RuntimeException(); }
    public  double tol ()  { throw new RuntimeException(); }
    public  double fracTest ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, java.lang.String testInput, java.lang.String dataFormat, double regParam, double elasticNetParam, int maxIter, boolean fitIntercept, double tol, double fracTest)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction9<java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.examples.ml.LogisticRegressionExample.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.ml.LogisticRegressionExample.Params params)  { throw new RuntimeException(); }
}
