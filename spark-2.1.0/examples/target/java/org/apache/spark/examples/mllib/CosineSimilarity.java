package org.apache.spark.examples.mllib;
/**
 * Compute the similar columns of a matrix, using cosine similarity.
 * <p>
 * The input matrix must be stored in row-oriented dense format, one line per row with its entries
 * separated by space. For example,
 * <pre><code>
 * 0.5 1.0
 * 2.0 3.0
 * 4.0 5.0
 * </code></pre>
 * represents a 3-by-2 matrix, whose first row is (0.5, 1.0).
 * <p>
 * Example invocation:
 * <p>
 * bin/run-example mllib.CosineSimilarity \
 * --threshold 0.1 data/mllib/sample_svm_data.txt
 */
public  class CosineSimilarity {
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.CosineSimilarity.Params> implements scala.Product, scala.Serializable {
    public  java.lang.String inputFile ()  { throw new RuntimeException(); }
    public  double threshold ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (java.lang.String inputFile, double threshold)  { throw new RuntimeException(); }
  }
  static public  class Params$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.Object, org.apache.spark.examples.mllib.CosineSimilarity.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.CosineSimilarity.Params params)  { throw new RuntimeException(); }
}
