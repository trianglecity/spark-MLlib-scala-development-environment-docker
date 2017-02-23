package org.apache.spark.examples.mllib;
/**
 * An example app for summarizing multivariate data from a file. Run with
 * <pre><code>
 * bin/run-example org.apache.spark.examples.mllib.MultivariateSummarizer
 * </code></pre>
 * By default, this loads a synthetic dataset from <code>data/mllib/sample_linear_regression_data.txt</code>.
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class MultivariateSummarizer {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.MultivariateSummarizer.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.examples.mllib.MultivariateSummarizer.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.MultivariateSummarizer.Params params)  { throw new RuntimeException(); }
}
