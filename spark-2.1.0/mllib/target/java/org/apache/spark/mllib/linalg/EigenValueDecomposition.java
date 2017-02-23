package org.apache.spark.mllib.linalg;
/**
 * Compute eigen-decomposition.
 */
public  class EigenValueDecomposition {
  /**
   * Compute the leading k eigenvalues and eigenvectors on a symmetric square matrix using ARPACK.
   * The caller needs to ensure that the input matrix is real symmetric. This function requires
   * memory for <code>n*(4*k+4)</code> doubles.
   * <p>
   * @param mul a function that multiplies the symmetric matrix with a DenseVector.
   * @param n dimension of the square matrix (maximum Int.MaxValue).
   * @param k number of leading eigenvalues required, where k must be positive and less than n.
   * @param tol tolerance of the eigs computation.
   * @param maxIterations the maximum number of Arnoldi update iterations.
   * @return a dense vector of eigenvalues in descending order and a dense matrix of eigenvectors
   *         (columns of the matrix).
   * @note The number of computed eigenvalues might be smaller than k when some Ritz values do not
   *       satisfy the convergence criterion specified by tol (see ARPACK Users Guide, Chapter 4.6
   *       for more details). The maximum number of Arnoldi update iterations is set to 300 in this
   *       function.
   */
  static public  scala.Tuple2<breeze.linalg.DenseVector<java.lang.Object>, breeze.linalg.DenseMatrix<java.lang.Object>> symmetricEigs (scala.Function1<breeze.linalg.DenseVector<java.lang.Object>, breeze.linalg.DenseVector<java.lang.Object>> mul, int n, int k, double tol, int maxIterations)  { throw new RuntimeException(); }
}
