package org.apache.spark.ml.regression;
public  class GeneralizedLinearRegression$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.regression.GeneralizedLinearRegression>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GeneralizedLinearRegression$ MODULE$ = null;
  public   GeneralizedLinearRegression$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression load (java.lang.String path)  { throw new RuntimeException(); }
  /** Set of family and link pairs that GeneralizedLinearRegression supports. */
    scala.collection.immutable.Set<scala.Tuple2<org.apache.spark.ml.regression.GeneralizedLinearRegression.Family, org.apache.spark.ml.regression.GeneralizedLinearRegression.Link>> supportedFamilyAndLinkPairs ()  { throw new RuntimeException(); }
  /** Set of family names that GeneralizedLinearRegression supports. */
    scala.collection.immutable.Set<java.lang.String> supportedFamilyNames ()  { throw new RuntimeException(); }
  /** Set of link names that GeneralizedLinearRegression supports. */
    scala.collection.immutable.Set<java.lang.String> supportedLinkNames ()  { throw new RuntimeException(); }
    double epsilon ()  { throw new RuntimeException(); }
}
