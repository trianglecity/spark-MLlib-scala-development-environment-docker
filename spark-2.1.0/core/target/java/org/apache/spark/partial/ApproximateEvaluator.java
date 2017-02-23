package org.apache.spark.partial;
/**
 * An object that computes a function incrementally by merging in results of type U from multiple
 * tasks. Allows partial evaluation at any point by calling currentResult().
 */
  interface ApproximateEvaluator<U extends java.lang.Object, R extends java.lang.Object> {
  public  void merge (int outputId, U taskResult)  ;
  public  R currentResult ()  ;
}
