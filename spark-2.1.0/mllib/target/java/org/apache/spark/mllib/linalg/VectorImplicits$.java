package org.apache.spark.mllib.linalg;
/**
 * Implicit methods available in Scala for converting {@link org.apache.spark.mllib.linalg.Vector} to
 * {@link org.apache.spark.ml.linalg.Vector} and vice versa.
 */
public  class VectorImplicits$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final VectorImplicits$ MODULE$ = null;
  public   VectorImplicits$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector mllibVectorToMLVector (org.apache.spark.mllib.linalg.Vector v)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector mllibDenseVectorToMLDenseVector (org.apache.spark.mllib.linalg.DenseVector v)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.SparseVector mllibSparseVectorToMLSparseVector (org.apache.spark.mllib.linalg.SparseVector v)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector mlVectorToMLlibVector (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseVector mlDenseVectorToMLlibDenseVector (org.apache.spark.ml.linalg.DenseVector v)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.SparseVector mlSparseVectorToMLlibSparseVector (org.apache.spark.ml.linalg.SparseVector v)  { throw new RuntimeException(); }
}
