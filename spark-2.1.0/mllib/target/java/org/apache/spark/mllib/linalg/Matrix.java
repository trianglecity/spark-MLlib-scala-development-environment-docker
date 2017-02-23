package org.apache.spark.mllib.linalg;
/**
 * Trait for a local matrix.
 */
public  interface Matrix extends scala.Serializable {
  /** Number of rows. */
  public  int numRows ()  ;
  /** Number of columns. */
  public  int numCols ()  ;
  /** Flag that keeps track whether the matrix is transposed or not. False by default. */
  public  boolean isTransposed ()  ;
  /** Converts to a dense array in column major. */
  public  double[] toArray ()  ;
  /**
   * Returns an iterator of column vectors.
   * This operation could be expensive, depending on the underlying storage.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.mllib.linalg.Vector> colIter ()  ;
  /**
   * Returns an iterator of row vectors.
   * This operation could be expensive, depending on the underlying storage.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.mllib.linalg.Vector> rowIter ()  ;
  /** Converts to a breeze matrix. */
    breeze.linalg.Matrix<java.lang.Object> asBreeze ()  ;
  /** Gets the (i, j)-th element. */
  public  double apply (int i, int j)  ;
  /** Return the index for the (i, j)-th element in the backing array. */
    int index (int i, int j)  ;
  /** Update element at (i, j) */
    void update (int i, int j, double v)  ;
  /** Get a deep copy of the matrix. */
  public  org.apache.spark.mllib.linalg.Matrix copy ()  ;
  /**
   * Transpose the Matrix. Returns a new <code>Matrix</code> instance sharing the same underlying data.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix transpose ()  ;
  /**
   * Convenience method for <code>Matrix</code>-<code>DenseMatrix</code> multiplication.
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.DenseMatrix multiply (org.apache.spark.mllib.linalg.DenseMatrix y)  ;
  /**
   * Convenience method for <code>Matrix</code>-<code>DenseVector</code> multiplication. For binary compatibility.
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.DenseVector multiply (org.apache.spark.mllib.linalg.DenseVector y)  ;
  /**
   * Convenience method for <code>Matrix</code>-<code>Vector</code> multiplication.
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.DenseVector multiply (org.apache.spark.mllib.linalg.Vector y)  ;
  /** A human readable representation of the matrix */
  public  java.lang.String toString ()  ;
  /** A human readable representation of the matrix with maximum lines and width */
  public  java.lang.String toString (int maxLines, int maxLineWidth)  ;
  /**
   * Map the values of this matrix using a function. Generates a new matrix. Performs the
   * function on only the backing array. For example, an operation such as addition or
   * subtraction will only be performed on the non-zero values in a <code>SparseMatrix</code>.
   * @param f (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.linalg.Matrix map (scala.Function1<java.lang.Object, java.lang.Object> f)  ;
  /**
   * Update all the values of this matrix using the function f. Performed in-place on the
   * backing array. For example, an operation such as addition or subtraction will only be
   * performed on the non-zero values in a <code>SparseMatrix</code>.
   * @param f (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.linalg.Matrix update (scala.Function1<java.lang.Object, java.lang.Object> f)  ;
  /**
   * Applies a function <code>f</code> to all the active elements of dense and sparse matrix. The ordering
   * of the elements are not defined.
   * <p>
   * @param f the function takes three parameters where the first two parameters are the row
   *          and column indices respectively with the type <code>Int</code>, and the final parameter is the
   *          corresponding value in the matrix with type <code>Double</code>.
   */
    void foreachActive (scala.Function3<java.lang.Object, java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  ;
  /**
   * Find the number of non-zero active values.
   * @return (undocumented)
   */
  public  int numNonzeros ()  ;
  /**
   * Find the number of values stored explicitly. These values can be zero as well.
   * @return (undocumented)
   */
  public  int numActives ()  ;
  /**
   * Convert this matrix to the new mllib-local representation.
   * This does NOT copy the data; it copies references.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Matrix asML ()  ;
}
