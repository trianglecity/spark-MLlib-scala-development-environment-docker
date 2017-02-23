package org.apache.spark.examples.mllib;
/**
 * An example app for binary classification. Run with
 * <pre><code>
 * bin/run-example org.apache.spark.examples.mllib.BinaryClassification
 * </code></pre>
 * A synthetic dataset is located at <code>data/mllib/sample_binary_classification_data.txt</code>.
 * If you use it as a template to create your own app, please use <code>spark-submit</code> to submit your app.
 */
public  class BinaryClassification {
  static public  class Algorithm$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Algorithm$ MODULE$ = null;
    public   Algorithm$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value SVM ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value LR ()  { throw new RuntimeException(); }
  }
  static public  class RegType$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegType$ MODULE$ = null;
    public   RegType$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value L1 ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value L2 ()  { throw new RuntimeException(); }
  }
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.BinaryClassification.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String input ()  { throw new RuntimeException(); }
    public  int numIterations ()  { throw new RuntimeException(); }
    public  double stepSize ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value algorithm ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value regType ()  { throw new RuntimeException(); }
    public  double regParam ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String input, int numIterations, double stepSize, scala.Enumeration.Value algorithm, scala.Enumeration.Value regType, double regParam)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction6<java.lang.String, java.lang.Object, java.lang.Object, scala.Enumeration.Value, scala.Enumeration.Value, java.lang.Object, org.apache.spark.examples.mllib.BinaryClassification.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.BinaryClassification.Params params)  { throw new RuntimeException(); }
}
