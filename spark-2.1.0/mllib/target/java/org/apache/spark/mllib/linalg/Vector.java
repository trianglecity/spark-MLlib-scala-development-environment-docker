package org.apache.spark.mllib.linalg;
/**
 * Represents a numeric vector, whose index type is Int and value type is Double.
 * <p>
 * @note Users should not implement this interface.
 */
public  interface Vector extends scala.Serializable {
  /**
   * Size of the vector.
   * @return (undocumented)
   */
  public  int size ()  ;
  /**
   * Converts the instance to a double array.
   * @return (undocumented)
   */
  public  double[] toArray ()  ;
  public  boolean equals (Object other)  ;
  /**
   * Returns a hash code value for the vector. The hash code is based on its size and its first 128
   * nonzero entries, using a hash algorithm similar to <code>java.util.Arrays.hashCode</code>.
   * @return (undocumented)
   */
  public  int hashCode ()  ;
  /**
   * Converts the instance to a breeze vector.
   * @return (undocumented)
   */
    breeze.linalg.Vector<java.lang.Object> asBreeze ()  ;
  /**
   * Gets the value of the ith element.
   * @param i index
   * @return (undocumented)
   */
  public  double apply (int i)  ;
  /**
   * Makes a deep copy of this vector.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector copy ()  ;
  /**
   * Applies a function <code>f</code> to all the active elements of dense and sparse vector.
   * <p>
   * @param f the function takes two parameters where the first parameter is the index of
   *          the vector with type <code>Int</code>, and the second parameter is the corresponding value
   *          with type <code>Double</code>.
   */
  public  void foreachActive (scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  ;
  /**
   * Number of active entries.  An "active entry" is an element which is explicitly stored,
   * regardless of its value.
   * <p>
   * @note Inactive entries have value 0.
   * @return (undocumented)
   */
  public  int numActives ()  ;
  /**
   * Number of nonzero elements. This scans all active values and count nonzeros.
   * @return (undocumented)
   */
  public  int numNonzeros ()  ;
  /**
   * Converts this vector to a sparse vector with all explicit zeros removed.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.SparseVector toSparse ()  ;
  /**
   * Converts this vector to a dense vector.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.DenseVector toDense ()  ;
  /**
   * Returns a vector in either dense or sparse format, whichever uses less storage.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector compressed ()  ;
  /**
   * Find the index of a maximal element.  Returns the first maximal element in case of a tie.
   * Returns -1 if vector has length 0.
   * @return (undocumented)
   */
  public  int argmax ()  ;
  /**
   * Converts the vector to a JSON string.
   * @return (undocumented)
   */
  public  java.lang.String toJson ()  ;
  /**
   * Convert this vector to the new mllib-local representation.
   * This does NOT copy the data; it copies references.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector asML ()  ;
}
