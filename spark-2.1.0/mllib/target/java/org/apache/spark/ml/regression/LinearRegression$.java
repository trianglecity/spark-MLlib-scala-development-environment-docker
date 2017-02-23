package org.apache.spark.ml.regression;
public  class LinearRegression$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.regression.LinearRegression>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LinearRegression$ MODULE$ = null;
  public   LinearRegression$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.LinearRegression load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * When using <code>LinearRegression.solver</code> == "normal", the solver must limit the number of
   * features to at most this number.  The entire covariance matrix X^T^X will be collected
   * to the driver. This limit helps prevent memory overflow errors.
   * @return (undocumented)
   */
  public  int MAX_FEATURES_FOR_NORMAL_SOLVER ()  { throw new RuntimeException(); }
}
