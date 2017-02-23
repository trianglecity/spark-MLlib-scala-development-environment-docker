package org.apache.spark.ml.linalg;
/**
 * Factory methods for {@link org.apache.spark.ml.linalg.DenseMatrix}.
 */
public  class DenseMatrix$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DenseMatrix$ MODULE$ = null;
  public   DenseMatrix$ ()  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of zeros.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values of zeros
   */
  public  org.apache.spark.ml.linalg.DenseMatrix zeros (int numRows, int numCols)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of ones.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values of ones
   */
  public  org.apache.spark.ml.linalg.DenseMatrix ones (int numRows, int numCols)  { throw new RuntimeException(); }
  /**
   * Generate an Identity Matrix in <code>DenseMatrix</code> format.
   * @param n number of rows and columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>n</code> x <code>n</code> and values of ones on the diagonal
   */
  public  org.apache.spark.ml.linalg.DenseMatrix eye (int n)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of <code>i.i.d.</code> uniform random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param rng a random number generator
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in U(0, 1)
   */
  public  org.apache.spark.ml.linalg.DenseMatrix rand (int numRows, int numCols, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of <code>i.i.d.</code> gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param rng a random number generator
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in N(0, 1)
   */
  public  org.apache.spark.ml.linalg.DenseMatrix randn (int numRows, int numCols, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a diagonal matrix in <code>DenseMatrix</code> format from the supplied values.
   * @param vector a <code>Vector</code> that will form the values on the diagonal of the matrix
   * @return Square <code>DenseMatrix</code> with size <code>values.length</code> x <code>values.length</code> and <code>values</code>
   *         on the diagonal
   */
  public  org.apache.spark.ml.linalg.DenseMatrix diag (org.apache.spark.ml.linalg.Vector vector)  { throw new RuntimeException(); }
}
