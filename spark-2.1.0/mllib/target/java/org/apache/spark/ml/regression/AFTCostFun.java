package org.apache.spark.ml.regression;
/**
 * AFTCostFun implements Breeze's DiffFunction[T] for AFT cost.
 * It returns the loss and gradient at a particular point (parameters).
 * It's used in Breeze's convex optimization routines.
 */
public  class AFTCostFun implements breeze.optimize.DiffFunction<breeze.linalg.DenseVector<java.lang.Object>> {
  public   AFTCostFun (org.apache.spark.rdd.RDD<org.apache.spark.ml.regression.AFTPoint> data, boolean fitIntercept, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, int aggregationDepth)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, breeze.linalg.DenseVector<java.lang.Object>> calculate (breeze.linalg.DenseVector<java.lang.Object> parameters)  { throw new RuntimeException(); }
}
