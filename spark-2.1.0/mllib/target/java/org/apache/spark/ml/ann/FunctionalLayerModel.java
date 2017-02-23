package org.apache.spark.ml.ann;
/**
 * Functional layer model. Holds no weights.
 * <p>
 * param:  layer functional layer
 */
  class FunctionalLayerModel implements org.apache.spark.ml.ann.LayerModel {
  public  org.apache.spark.ml.ann.FunctionalLayer layer ()  { throw new RuntimeException(); }
  // not preceding
     FunctionalLayerModel (org.apache.spark.ml.ann.FunctionalLayer layer)  { throw new RuntimeException(); }
  public  breeze.linalg.DenseVector<java.lang.Object> weights ()  { throw new RuntimeException(); }
  public  void eval (breeze.linalg.DenseMatrix<java.lang.Object> data, breeze.linalg.DenseMatrix<java.lang.Object> output)  { throw new RuntimeException(); }
  public  void computePrevDelta (breeze.linalg.DenseMatrix<java.lang.Object> nextDelta, breeze.linalg.DenseMatrix<java.lang.Object> input, breeze.linalg.DenseMatrix<java.lang.Object> delta)  { throw new RuntimeException(); }
  public  void grad (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> input, breeze.linalg.DenseVector<java.lang.Object> cumGrad)  { throw new RuntimeException(); }
}
