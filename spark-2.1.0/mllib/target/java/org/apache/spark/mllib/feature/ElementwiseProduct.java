package org.apache.spark.mllib.feature;
/**
 * Outputs the Hadamard product (i.e., the element-wise product) of each input vector with a
 * provided "weight" vector. In other words, it scales each column of the dataset by a scalar
 * multiplier.
 * param:  scalingVec The values used to scale the reference vector's individual components.
 */
public  class ElementwiseProduct implements org.apache.spark.mllib.feature.VectorTransformer {
  public  org.apache.spark.mllib.linalg.Vector scalingVec ()  { throw new RuntimeException(); }
  // not preceding
  public   ElementwiseProduct (org.apache.spark.mllib.linalg.Vector scalingVec)  { throw new RuntimeException(); }
  /**
   * Does the hadamard product transformation.
   * <p>
   * @param vector vector to be transformed.
   * @return transformed vector.
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
}
