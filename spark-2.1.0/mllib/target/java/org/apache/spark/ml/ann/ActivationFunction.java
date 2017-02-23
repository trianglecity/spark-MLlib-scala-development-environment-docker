package org.apache.spark.ml.ann;
/**
 * Trait for functions and their derivatives for functional layers
 */
  interface ActivationFunction extends scala.Serializable {
  /**
   * Implements a function
   * @return (undocumented)
   */
  public  scala.Function1<java.lang.Object, java.lang.Object> eval ()  ;
  /**
   * Implements a derivative of a function (needed for the back propagation)
   * @return (undocumented)
   */
  public  scala.Function1<java.lang.Object, java.lang.Object> derivative ()  ;
}
