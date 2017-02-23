package org.apache.spark.ml.classification;
/**
 * LogisticCostFun implements Breeze's DiffFunction[T] for a multinomial (softmax) logistic loss
 * function, as used in multi-class classification (it is also used in binary logistic regression).
 * It returns the loss and gradient with L2 regularization at a particular point (coefficients).
 * It's used in Breeze's convex optimization routines.
 */
public  class LogisticCostFun implements breeze.optimize.DiffFunction<breeze.linalg.DenseVector<java.lang.Object>> {
  public   LogisticCostFun (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, int numClasses, boolean fitIntercept, boolean standardization, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, double regParamL2, boolean multinomial, int aggregationDepth)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, breeze.linalg.DenseVector<java.lang.Object>> calculate (breeze.linalg.DenseVector<java.lang.Object> coefficients)  { throw new RuntimeException(); }
}
