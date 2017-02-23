package org.apache.spark.mllib.linalg;
/**
 * Column-major dense matrix.
 * The entry values are stored in a single array of doubles with columns listed in sequence.
 * For example, the following matrix
 * <pre><code>
 *   1.0 2.0
 *   3.0 4.0
 *   5.0 6.0
 * </code></pre>
 * is stored as <code>[1.0, 3.0, 5.0, 2.0, 4.0, 6.0]</code>.
 * <p>
 * param:  numRows number of rows
 * param:  numCols number of columns
 * param:  values matrix entries in column major if not transposed or in row major otherwise
 * param:  isTransposed whether the matrix is transposed. If true, <code>values</code> stores the matrix in
 *                     row major.
 */
public  class DenseMatrix implements org.apache.spark.mllib.linalg.Matrix {
  /**
   * Generate a <code>DenseMatrix</code> consisting of zeros.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values of zeros
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix zeros (int numRows, int numCols)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of ones.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values of ones
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix ones (int numRows, int numCols)  { throw new RuntimeException(); }
  /**
   * Generate an Identity Matrix in <code>DenseMatrix</code> format.
   * @param n number of rows and columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>n</code> x <code>n</code> and values of ones on the diagonal
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix eye (int n)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of <code>i.i.d.</code> uniform random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param rng a random number generator
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in U(0, 1)
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix rand (int numRows, int numCols, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of <code>i.i.d.</code> gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param rng a random number generator
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in N(0, 1)
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix randn (int numRows, int numCols, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a diagonal matrix in <code>DenseMatrix</code> format from the supplied values.
   * @param vector a <code>Vector</code> that will form the values on the diagonal of the matrix
   * @return Square <code>DenseMatrix</code> with size <code>values.length</code> x <code>values.length</code> and <code>values</code>
   *         on the diagonal
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix diag (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
  /**
   * Convert new linalg type to spark.mllib type.  Light copy; only copies references
   * @param m (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix fromML (org.apache.spark.ml.linalg.DenseMatrix m)  { throw new RuntimeException(); }
  static public  double[] toArray ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<org.apache.spark.mllib.linalg.Vector> rowIter ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.DenseMatrix multiply (org.apache.spark.mllib.linalg.DenseMatrix y)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.DenseVector multiply (org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.linalg.DenseVector multiply (org.apache.spark.mllib.linalg.Vector y)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString (int maxLines, int maxLineWidth)  { throw new RuntimeException(); }
  public  int numRows ()  { throw new RuntimeException(); }
  public  int numCols ()  { throw new RuntimeException(); }
  public  double[] values ()  { throw new RuntimeException(); }
  public  boolean isTransposed ()  { throw new RuntimeException(); }
  // not preceding
  public   DenseMatrix (int numRows, int numCols, double[] values, boolean isTransposed)  { throw new RuntimeException(); }
  /**
   * Column-major dense matrix.
   * The entry values are stored in a single array of doubles with columns listed in sequence.
   * For example, the following matrix
   * <pre><code>
   *   1.0 2.0
   *   3.0 4.0
   *   5.0 6.0
   * </code></pre>
   * is stored as <code>[1.0, 3.0, 5.0, 2.0, 4.0, 6.0]</code>.
   * <p>
   * @param numRows number of rows
   * @param numCols number of columns
   * @param values matrix entries in column major
   */
  public   DenseMatrix (int numRows, int numCols, double[] values)  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
    breeze.linalg.Matrix<java.lang.Object> asBreeze ()  { throw new RuntimeException(); }
    double apply (int i)  { throw new RuntimeException(); }
  public  double apply (int i, int j)  { throw new RuntimeException(); }
    int index (int i, int j)  { throw new RuntimeException(); }
    void update (int i, int j, double v)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseMatrix copy ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.linalg.DenseMatrix map (scala.Function1<java.lang.Object, java.lang.Object> f)  { throw new RuntimeException(); }
    org.apache.spark.mllib.linalg.DenseMatrix update (scala.Function1<java.lang.Object, java.lang.Object> f)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseMatrix transpose ()  { throw new RuntimeException(); }
    void foreachActive (scala.Function3<java.lang.Object, java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public  int numNonzeros ()  { throw new RuntimeException(); }
  public  int numActives ()  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> from the given <code>DenseMatrix</code>. The new matrix will have isTransposed
   * set to false.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.SparseMatrix toSparse ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.mllib.linalg.Vector> colIter ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseMatrix asML ()  { throw new RuntimeException(); }
}
