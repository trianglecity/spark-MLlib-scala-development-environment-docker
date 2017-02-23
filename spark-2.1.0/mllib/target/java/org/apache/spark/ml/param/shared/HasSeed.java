package org.apache.spark.ml.param.shared;
/**
 * Trait for shared param seed (default: this.getClass.getName.hashCode.toLong).
 */
  interface HasSeed extends org.apache.spark.ml.param.Params {
  /**
   * Param for random seed.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.LongParam seed ()  ;
  /** @group getParam */
  public  long getSeed ()  ;
}
