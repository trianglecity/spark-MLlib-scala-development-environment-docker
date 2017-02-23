package org.apache.spark.ml.ann;
  class SoftmaxLayerModelWithCrossEntropyLoss implements org.apache.spark.ml.ann.LayerModel, org.apache.spark.ml.ann.LossFunction {
  public   SoftmaxLayerModelWithCrossEntropyLoss ()  { throw new RuntimeException(); }
  public  breeze.linalg.DenseVector<java.lang.Object> weights ()  { throw new RuntimeException(); }
  public  void eval (breeze.linalg.DenseMatrix<java.lang.Object> data, breeze.linalg.DenseMatrix<java.lang.Object> output)  { throw new RuntimeException(); }
  public  void computePrevDelta (breeze.linalg.DenseMatrix<java.lang.Object> nextDelta, breeze.linalg.DenseMatrix<java.lang.Object> input, breeze.linalg.DenseMatrix<java.lang.Object> delta)  { throw new RuntimeException(); }
  public  void grad (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> input, breeze.linalg.DenseVector<java.lang.Object> cumGrad)  { throw new RuntimeException(); }
  public  double loss (breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> target, breeze.linalg.DenseMatrix<java.lang.Object> delta)  { throw new RuntimeException(); }
}
