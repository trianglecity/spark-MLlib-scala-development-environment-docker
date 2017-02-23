package org.apache.spark.ml.linalg;
/**
 * Factory methods for {@link org.apache.spark.ml.linalg.Vector}.
 * We don't use the name <code>Vector</code> because Scala imports
 * {@link scala.collection.immutable.Vector} by default.
 */
// not preceding
public  class Vectors$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Vectors$ MODULE$ = null;
  /**
   * Creates a dense vector from its values.
   * @param firstValue (undocumented)
   * @param otherValues (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector dense (double firstValue, double... otherValues)  { throw new RuntimeException(); }
  public   Vectors$ ()  { throw new RuntimeException(); }
  /**
   * Creates a dense vector from its values.
   * @param firstValue (undocumented)
   * @param otherValues (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector dense (double firstValue, scala.collection.Seq<java.lang.Object> otherValues)  { throw new RuntimeException(); }
  /**
   * Creates a dense vector from a double array.
   * @param values (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector dense (double[] values)  { throw new RuntimeException(); }
  /**
   * Creates a sparse vector providing its index array and value array.
   * <p>
   * @param size vector size.
   * @param indices index array, must be strictly increasing.
   * @param values value array, must have the same length as indices.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector sparse (int size, int[] indices, double[] values)  { throw new RuntimeException(); }
  /**
   * Creates a sparse vector using unordered (index, value) pairs.
   * <p>
   * @param size vector size.
   * @param elements vector elements in (index, value) pairs.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector sparse (int size, scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> elements)  { throw new RuntimeException(); }
  /**
   * Creates a sparse vector using unordered (index, value) pairs in a Java friendly way.
   * <p>
   * @param size vector size.
   * @param elements vector elements in (index, value) pairs.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector sparse (int size, java.lang.Iterable<scala.Tuple2<java.lang.Integer, java.lang.Double>> elements)  { throw new RuntimeException(); }
  /**
   * Creates a vector of all zeros.
   * <p>
   * @param size vector size
   * @return a zero vector
   */
  public  org.apache.spark.ml.linalg.Vector zeros (int size)  { throw new RuntimeException(); }
  /**
   * Creates a vector instance from a breeze vector.
   * @param breezeVector (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.ml.linalg.Vector fromBreeze (breeze.linalg.Vector<java.lang.Object> breezeVector)  { throw new RuntimeException(); }
  /**
   * Returns the p-norm of this vector.
   * @param vector input vector.
   * @param p norm.
   * @return norm in L^p^ space.
   */
  public  double norm (org.apache.spark.ml.linalg.Vector vector, double p)  { throw new RuntimeException(); }
  /**
   * Returns the squared distance between two Vectors.
   * @param v1 first Vector.
   * @param v2 second Vector.
   * @return squared distance between two Vectors.
   */
  public  double sqdist (org.apache.spark.ml.linalg.Vector v1, org.apache.spark.ml.linalg.Vector v2)  { throw new RuntimeException(); }
  /**
   * Returns the squared distance between DenseVector and SparseVector.
   * @param v1 (undocumented)
   * @param v2 (undocumented)
   * @return (undocumented)
   */
    double sqdist (org.apache.spark.ml.linalg.SparseVector v1, org.apache.spark.ml.linalg.DenseVector v2)  { throw new RuntimeException(); }
  /**
   * Check equality between sparse/dense vectors
   * @param v1Indices (undocumented)
   * @param v1Values (undocumented)
   * @param v2Indices (undocumented)
   * @param v2Values (undocumented)
   * @return (undocumented)
   */
    boolean equals (scala.collection.IndexedSeq<java.lang.Object> v1Indices, double[] v1Values, scala.collection.IndexedSeq<java.lang.Object> v2Indices, double[] v2Values)  { throw new RuntimeException(); }
  /** Max number of nonzero entries used in computing hash code. */
    int MAX_HASH_NNZ ()  { throw new RuntimeException(); }
}
