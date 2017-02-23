package org.apache.spark.examples.mllib;
/**
 * An example k-means app. Run with
 * <pre><code>
 * ./bin/run-example org.apache.spark.examples.mllib.DenseKMeans [options] &lt;input&gt;
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class DenseKMeans {
  static public  class InitializationMode$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InitializationMode$ MODULE$ = null;
    public   InitializationMode$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Random ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value Parallel ()  { throw new RuntimeException(); }
  }
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.DenseKMeans.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  int k ()  { throw new RuntimeException(); }
    public  int numIterations ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value initializationMode ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, int k, int numIterations, scala.Enumeration.Value initializationMode)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction4<java.lang.String, java.lang.Object, java.lang.Object, scala.Enumeration.Value, org.apache.spark.examples.mllib.DenseKMeans.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.DenseKMeans.Params params)  { throw new RuntimeException(); }
}
