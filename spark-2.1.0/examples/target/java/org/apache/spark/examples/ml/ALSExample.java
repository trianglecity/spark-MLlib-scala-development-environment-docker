package org.apache.spark.examples.ml;
/**
 * An example demonstrating ALS.
 * Run with
 * <pre><code>
 * bin/run-example ml.ALSExample
 * </code></pre>
 */
public  class ALSExample {
  static public  class Rating implements scala.Product, scala.Serializable {
    public  int userId ()  { throw new RuntimeException(); }
    public  int movieId ()  { throw new RuntimeException(); }
    public  float rating ()  { throw new RuntimeException(); }
    public  long timestamp ()  { throw new RuntimeException(); }
    // not preceding
    public   Rating (int userId, int movieId, float rating, long timestamp)  { throw new RuntimeException(); }
  }
  static public  class Rating$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.examples.ml.ALSExample.Rating> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Rating$ MODULE$ = null;
    public   Rating$ ()  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.examples.ml.ALSExample.Rating parseRating (java.lang.String str)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
