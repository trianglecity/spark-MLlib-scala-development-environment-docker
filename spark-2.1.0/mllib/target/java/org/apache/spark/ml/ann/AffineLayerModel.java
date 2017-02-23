package org.apache.spark.ml.ann;
/**
 * Model of Affine layer
 * <p>
 * param:  weights weights
 * param:  layer layer properties
 */
  class AffineLayerModel implements org.apache.spark.ml.ann.LayerModel {
  /**
   * Creates a model of Affine layer
   * <p>
   * @param layer layer properties
   * @param weights vector for weights initialization
   * @param random random number generator
   * @return model of Affine layer
   */
  static public  org.apache.spark.ml.ann.AffineLayerModel apply (org.apache.spark.ml.ann.AffineLayer layer, breeze.linalg.DenseVector<java.lang.Object> weights, java.util.Random random)  { throw new RuntimeException(); }
  /**
   * Initialize weights randomly in the interval.
   * Uses [Bottou-88] heuristic [-a/sqrt(in); a/sqrt(in)],
   * where <code>a</code> is chosen in such a way that the weight variance corresponds
   * to the points to the maximal curvature of the activation function
   * (which is approximately 2.38 for a standard sigmoid).
   * <p>
   * @param numIn number of inputs
   * @param numOut number of outputs
   * @param weights vector for weights initialization
   * @param random random number generator
   */
  static public  void randomWeights (int numIn, int numOut, breeze.linalg.DenseVector<java.lang.Object> weights, java.util.Random random)  { throw new RuntimeException(); }
  public  breeze.linalg.DenseVector<java.lang.Object> weights ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.AffineLayer layer ()  { throw new RuntimeException(); }
  // not preceding
     AffineLayerModel (breeze.linalg.DenseVector<java.lang.Object> weights, org.apache.spark.ml.ann.AffineLayer layer)  { throw new RuntimeException(); }
  public  breeze.linalg.DenseMatrix<java.lang.Object> w ()  { throw new RuntimeException(); }
  public  breeze.linalg.DenseVector<java.lang.Object> b ()  { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> ones ()  { throw new RuntimeException(); }
  public  void eval (breeze.linalg.DenseMatrix<java.lang.Object> data, breeze.linalg.DenseMatrix<java.lang.Object> output)  { throw new RuntimeException(); }
  public  void computePrevDelta (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> prevDelta)  { throw new RuntimeException(); }
  public  void grad (breeze.linalg.DenseMatrix<java.lang.Object> delta, breeze.linalg.DenseMatrix<java.lang.Object> input, breeze.linalg.DenseVector<java.lang.Object> cumGrad)  { throw new RuntimeException(); }
}
