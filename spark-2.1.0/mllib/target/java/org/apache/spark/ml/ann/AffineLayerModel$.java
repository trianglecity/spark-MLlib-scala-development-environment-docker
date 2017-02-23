package org.apache.spark.ml.ann;
/**
 * Fabric for Affine layer models
 */
public  class AffineLayerModel$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AffineLayerModel$ MODULE$ = null;
  public   AffineLayerModel$ ()  { throw new RuntimeException(); }
  /**
   * Creates a model of Affine layer
   * <p>
   * @param layer layer properties
   * @param weights vector for weights initialization
   * @param random random number generator
   * @return model of Affine layer
   */
  public  org.apache.spark.ml.ann.AffineLayerModel apply (org.apache.spark.ml.ann.AffineLayer layer, breeze.linalg.DenseVector<java.lang.Object> weights, java.util.Random random)  { throw new RuntimeException(); }
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
  public  void randomWeights (int numIn, int numOut, breeze.linalg.DenseVector<java.lang.Object> weights, java.util.Random random)  { throw new RuntimeException(); }
}
