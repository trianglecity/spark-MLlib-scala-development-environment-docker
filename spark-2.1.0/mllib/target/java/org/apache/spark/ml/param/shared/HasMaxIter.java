package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param maxIter.
 */
  interface HasMaxIter extends org.apache.spark.ml.param.Params {
  /**
   * Param for maximum number of iterations (&amp;gt;= 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxIter ()  ;
  /** @group getParam */
  public  int getMaxIter ()  ;
}
