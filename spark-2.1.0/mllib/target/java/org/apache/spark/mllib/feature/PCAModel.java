package org.apache.spark.mllib.feature;
/**
 * Model fitted by {@link PCA} that can project vectors to a low-dimensional space using PCA.
 * <p>
 * param:  k number of principal components.
 * param:  pc a principal components Matrix. Each column is one principal component.
 */
public  class PCAModel implements org.apache.spark.mllib.feature.VectorTransformer {
  public  int k ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseMatrix pc ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseVector explainedVariance ()  { throw new RuntimeException(); }
  // not preceding
     PCAModel (int k, org.apache.spark.mllib.linalg.DenseMatrix pc, org.apache.spark.mllib.linalg.DenseVector explainedVariance)  { throw new RuntimeException(); }
  /**
   * Transform a vector by computed Principal Components.
   * <p>
   * @param vector vector to be transformed.
   *               Vector must be the same length as the source vectors given to <code>PCA.fit()</code>.
   * @return transformed vector. Vector will be of length k.
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
}
