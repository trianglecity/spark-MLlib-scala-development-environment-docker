package org.apache.spark.mllib.feature;
/**
 * A feature transformer that projects vectors to a low-dimensional space using PCA.
 * <p>
 * param:  k number of principal components
 */
public  class PCA {
  public  int k ()  { throw new RuntimeException(); }
  // not preceding
  public   PCA (int k)  { throw new RuntimeException(); }
  /**
   * Computes a {@link PCAModel} that contains the principal components of the input vectors.
   * <p>
   * @param sources source vectors
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.PCAModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> sources)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>fit()</code>.
   * @param sources (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.PCAModel fit (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> sources)  { throw new RuntimeException(); }
}
