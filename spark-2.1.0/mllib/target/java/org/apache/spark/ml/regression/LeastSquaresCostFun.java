package org.apache.spark.ml.regression;
/**
 * LeastSquaresCostFun implements Breeze's DiffFunction[T] for Least Squares cost.
 * It returns the loss and gradient with L2 regularization at a particular point (coefficients).
 * It's used in Breeze's convex optimization routines.
 */
public  class LeastSquaresCostFun implements breeze.optimize.DiffFunction<breeze.linalg.DenseVector<java.lang.Object>> {
  public   LeastSquaresCostFun (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, double labelStd, double labelMean, boolean fitIntercept, boolean standardization, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesMean, double effectiveL2regParam, int aggregationDepth)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, breeze.linalg.DenseVector<java.lang.Object>> calculate (breeze.linalg.DenseVector<java.lang.Object> coefficients)  { throw new RuntimeException(); }
}
