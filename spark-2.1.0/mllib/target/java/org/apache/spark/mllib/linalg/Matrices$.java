package org.apache.spark.mllib.linalg;
/**
 * Factory methods for {@link org.apache.spark.mllib.linalg.Matrix}.
 */
public  class Matrices$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Matrices$ MODULE$ = null;
  public   Matrices$ ()  { throw new RuntimeException(); }
  /**
   * Creates a column-major dense matrix.
   * <p>
   * @param numRows number of rows
   * @param numCols number of columns
   * @param values matrix entries in column major
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix dense (int numRows, int numCols, double[] values)  { throw new RuntimeException(); }
  /**
   * Creates a column-major sparse matrix in Compressed Sparse Column (CSC) format.
   * <p>
   * @param numRows number of rows
   * @param numCols number of columns
   * @param colPtrs the index corresponding to the start of a new column
   * @param rowIndices the row index of the entry
   * @param values non-zero matrix entries in column major
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix sparse (int numRows, int numCols, int[] colPtrs, int[] rowIndices, double[] values)  { throw new RuntimeException(); }
  /**
   * Creates a Matrix instance from a breeze matrix.
   * @param breeze a breeze matrix
   * @return a Matrix instance
   */
    org.apache.spark.mllib.linalg.Matrix fromBreeze (breeze.linalg.Matrix<java.lang.Object> breeze)  { throw new RuntimeException(); }
  /**
   * Generate a <code>Matrix</code> consisting of zeros.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @return <code>Matrix</code> with size <code>numRows</code> x <code>numCols</code> and values of zeros
   */
  public  org.apache.spark.mllib.linalg.Matrix zeros (int numRows, int numCols)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of ones.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @return <code>Matrix</code> with size <code>numRows</code> x <code>numCols</code> and values of ones
   */
  public  org.apache.spark.mllib.linalg.Matrix ones (int numRows, int numCols)  { throw new RuntimeException(); }
  /**
   * Generate a dense Identity Matrix in <code>Matrix</code> format.
   * @param n number of rows and columns of the matrix
   * @return <code>Matrix</code> with size <code>n</code> x <code>n</code> and values of ones on the diagonal
   */
  public  org.apache.spark.mllib.linalg.Matrix eye (int n)  { throw new RuntimeException(); }
  /**
   * Generate a sparse Identity Matrix in <code>Matrix</code> format.
   * @param n number of rows and columns of the matrix
   * @return <code>Matrix</code> with size <code>n</code> x <code>n</code> and values of ones on the diagonal
   */
  public  org.apache.spark.mllib.linalg.Matrix speye (int n)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of <code>i.i.d.</code> uniform random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param rng a random number generator
   * @return <code>Matrix</code> with size <code>numRows</code> x <code>numCols</code> and values in U(0, 1)
   */
  public  org.apache.spark.mllib.linalg.Matrix rand (int numRows, int numCols, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> consisting of <code>i.i.d.</code> gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param density the desired density for the matrix
   * @param rng a random number generator
   * @return <code>Matrix</code> with size <code>numRows</code> x <code>numCols</code> and values in U(0, 1)
   */
  public  org.apache.spark.mllib.linalg.Matrix sprand (int numRows, int numCols, double density, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of <code>i.i.d.</code> gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param rng a random number generator
   * @return <code>Matrix</code> with size <code>numRows</code> x <code>numCols</code> and values in N(0, 1)
   */
  public  org.apache.spark.mllib.linalg.Matrix randn (int numRows, int numCols, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> consisting of <code>i.i.d.</code> gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param density the desired density for the matrix
   * @param rng a random number generator
   * @return <code>Matrix</code> with size <code>numRows</code> x <code>numCols</code> and values in N(0, 1)
   */
  public  org.apache.spark.mllib.linalg.Matrix sprandn (int numRows, int numCols, double density, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a diagonal matrix in <code>Matrix</code> format from the supplied values.
   * @param vector a <code>Vector</code> that will form the values on the diagonal of the matrix
   * @return Square <code>Matrix</code> with size <code>values.length</code> x <code>values.length</code> and <code>values</code>
   *         on the diagonal
   */
  public  org.apache.spark.mllib.linalg.Matrix diag (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
  /**
   * Horizontally concatenate a sequence of matrices. The returned matrix will be in the format
   * the matrices are supplied in. Supplying a mix of dense and sparse matrices will result in
   * a sparse matrix. If the Array is empty, an empty <code>DenseMatrix</code> will be returned.
   * @param matrices array of matrices
   * @return a single <code>Matrix</code> composed of the matrices that were horizontally concatenated
   */
  public  org.apache.spark.mllib.linalg.Matrix horzcat (org.apache.spark.mllib.linalg.Matrix[] matrices)  { throw new RuntimeException(); }
  /**
   * Vertically concatenate a sequence of matrices. The returned matrix will be in the format
   * the matrices are supplied in. Supplying a mix of dense and sparse matrices will result in
   * a sparse matrix. If the Array is empty, an empty <code>DenseMatrix</code> will be returned.
   * @param matrices array of matrices
   * @return a single <code>Matrix</code> composed of the matrices that were vertically concatenated
   */
  public  org.apache.spark.mllib.linalg.Matrix vertcat (org.apache.spark.mllib.linalg.Matrix[] matrices)  { throw new RuntimeException(); }
  /**
   * Convert new linalg type to spark.mllib type.  Light copy; only copies references
   * @param m (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix fromML (org.apache.spark.ml.linalg.Matrix m)  { throw new RuntimeException(); }
}
