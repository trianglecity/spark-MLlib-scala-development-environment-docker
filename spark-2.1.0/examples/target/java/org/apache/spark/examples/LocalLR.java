package org.apache.spark.examples;
/**
 * Logistic regression based classification.
 * <p>
 * This is an example implementation for learning how to use Spark. For more conventional use,
 * please refer to org.apache.spark.ml.classification.LogisticRegression.
 */
public  class LocalLR {
  static public  class DataPoint implements scala.Product, scala.Serializable {
    public  breeze.linalg.Vector<java.lang.Object> x ()  { throw new RuntimeException(); }
    public  double y ()  { throw new RuntimeException(); }
    // not preceding
    public   DataPoint (breeze.linalg.Vector<java.lang.Object> x, double y)  { throw new RuntimeException(); }
  }
  static public  class DataPoint$ extends scala.runtime.AbstractFunction2<breeze.linalg.Vector<java.lang.Object>, java.lang.Object, org.apache.spark.examples.LocalLR.DataPoint> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DataPoint$ MODULE$ = null;
    public   DataPoint$ ()  { throw new RuntimeException(); }
  }
  static public  int N ()  { throw new RuntimeException(); }
  static public  int D ()  { throw new RuntimeException(); }
  static public  double R ()  { throw new RuntimeException(); }
  static public  int ITERATIONS ()  { throw new RuntimeException(); }
  static public  java.util.Random rand ()  { throw new RuntimeException(); }
  static public  org.apache.spark.examples.LocalLR.DataPoint[] generateData ()  { throw new RuntimeException(); }
  static public  void showWarning ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
