package org.apache.spark.examples.mllib;
/**
 * An example naive Bayes app. Run with
 * <pre><code>
 * ./bin/run-example org.apache.spark.examples.mllib.SparseNaiveBayes [options] &lt;input&gt;
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class SparseNaiveBayes {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.SparseNaiveBayes.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  int minPartitions ()  { throw new RuntimeException(); }
    public  int numFeatures ()  { throw new RuntimeException(); }
    public  double lambda ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, int minPartitions, int numFeatures, double lambda)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction4<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.examples.mllib.SparseNaiveBayes.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.SparseNaiveBayes.Params params)  { throw new RuntimeException(); }
}
