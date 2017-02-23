package org.apache.spark.examples.ml;
/**
 * An example of how to use {@link org.apache.spark.sql.DataFrame} for ML. Run with
 * <pre><code>
 * ./bin/run-example ml.DataFrameExample [options]
 * </code></pre>
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class DataFrameExample {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.ml.DataFrameExample.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.examples.ml.DataFrameExample.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.ml.DataFrameExample.Params params)  { throw new RuntimeException(); }
}
