package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param tol.
 */
  interface HasTol extends org.apache.spark.ml.param.Params {
  /**
   * Param for the convergence tolerance for iterative algorithms (&amp;gt;= 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam tol ()  ;
  /** @group getParam */
  public  double getTol ()  ;
}
