package org.apache.spark.ml.ann;
/**
 * Trait that holds Layer weights (or parameters).
 * Implements functions needed for forward propagation, computing delta and gradient.
 * Can return weights in Vector format.
 */
  interface LayerModel extends scala.Serializable {
  public  breeze.linalg.DenseVector<java.lang.Object> weights ()  ;
  /**
   * Evaluates the data (process the data through the layer).
   * Output is allocated based on the size provided by the
   * LayerModel implementation and the stack (batch) size.
   * Developer is responsible for checking the size of output
   * when writing to it.
   * <p>
   * @param data data
   * @param output output (modified in place)
   */
  public  void eval (breeze.linalg.DenseMatrix<java.lang.Object> data, breeze.linalg.DenseMatrix<java.lang.Object> output)  ;
  /**
   * Computes the delta for back propagation.
   * Delta is allocated based on the size provided by the
   * LayerModel implementation and the stack (batch) size.
   * Developer is responsible for checking the size of
   * prevDelta when writing to it.
   * <p>
   * @param delta delta of this layer
   * @param output output of this layer
   * @param prevDelta the previous delta (modified in place)
   */
  public  void computePrevDelta (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> prevDelta)  ;
  /**
   * Computes the gradient.
   * cumGrad is a wrapper on the part of the weight vector.
   * Size of cumGrad is based on weightSize provided by
   * implementation of LayerModel.
   * <p>
   * @param delta delta for this layer
   * @param input input data
   * @param cumGrad cumulative gradient (modified in place)
   */
  public  void grad (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> input, breeze.linalg.DenseVector<java.lang.Object> cumGrad)  ;
}
