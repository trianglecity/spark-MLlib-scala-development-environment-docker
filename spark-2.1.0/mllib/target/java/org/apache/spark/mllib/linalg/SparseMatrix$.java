package org.apache.spark.mllib.linalg;
/**
 * Factory methods for {@link org.apache.spark.mllib.linalg.SparseMatrix}.
 */
public  class SparseMatrix$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparseMatrix$ MODULE$ = null;
  public   SparseMatrix$ ()  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> from Coordinate List (COO) format. Input must be an array of
   * (i, j, value) tuples. Entries that have duplicate values of i and j are
   * added together. Tuples where value is equal to zero will be omitted.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param entries Array of (i, j, value) tuples
   * @return The corresponding <code>SparseMatrix</code>
   */
  public  org.apache.spark.mllib.linalg.SparseMatrix fromCOO (int numRows, int numCols, scala.collection.Iterable<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> entries)  { throw new RuntimeException(); }
  /**
   * Generate an Identity Matrix in <code>SparseMatrix</code> format.
   * @param n number of rows and columns of the matrix
   * @return <code>SparseMatrix</code> with size <code>n</code> x <code>n</code> and values of ones on the diagonal
   */
  public  org.apache.spark.mllib.linalg.SparseMatrix speye (int n)  { throw new RuntimeException(); }
  /**
   * Generates the skeleton of a random <code>SparseMatrix</code> with a given random number generator.
   * The values of the matrix returned are undefined.
   * @param numRows (undocumented)
   * @param numCols (undocumented)
   * @param density (undocumented)
   * @param rng (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.mllib.linalg.SparseMatrix genRandMatrix (int numRows, int numCols, double density, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> consisting of <code>i.i.d</code>. uniform random numbers. The number of non-zero
   * elements equal the ceiling of <code>numRows</code> x <code>numCols</code> x <code>density</code>
   * <p>
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param density the desired density for the matrix
   * @param rng a random number generator
   * @return <code>SparseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in U(0, 1)
   */
  public  org.apache.spark.mllib.linalg.SparseMatrix sprand (int numRows, int numCols, double density, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> consisting of <code>i.i.d</code>. gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param density the desired density for the matrix
   * @param rng a random number generator
   * @return <code>SparseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in N(0, 1)
   */
  public  org.apache.spark.mllib.linalg.SparseMatrix sprandn (int numRows, int numCols, double density, java.util.Random rng)  { throw new RuntimeException(); }
  /**
   * Generate a diagonal matrix in <code>SparseMatrix</code> format from the supplied values.
   * @param vector a <code>Vector</code> that will form the values on the diagonal of the matrix
   * @return Square <code>SparseMatrix</code> with size <code>values.length</code> x <code>values.length</code> and non-zero
   *         <code>values</code> on the diagonal
   */
  public  org.apache.spark.mllib.linalg.SparseMatrix spdiag (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
  /**
   * Convert new linalg type to spark.mllib type.  Light copy; only copies references
   * @param m (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.SparseMatrix fromML (org.apache.spark.ml.linalg.SparseMatrix m)  { throw new RuntimeException(); }
}
