package org.apache.spark.ml.classification;
public  class NaiveBayes$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.classification.NaiveBayes>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NaiveBayes$ MODULE$ = null;
  public   NaiveBayes$ ()  { throw new RuntimeException(); }
  /** String name for multinomial model type. */
    java.lang.String Multinomial ()  { throw new RuntimeException(); }
  /** String name for Bernoulli model type. */
    java.lang.String Bernoulli ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<java.lang.String> supportedModelTypes ()  { throw new RuntimeException(); }
    void requireNonnegativeValues (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
    void requireZeroOneBernoulliValues (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.NaiveBayes load (java.lang.String path)  { throw new RuntimeException(); }
}
