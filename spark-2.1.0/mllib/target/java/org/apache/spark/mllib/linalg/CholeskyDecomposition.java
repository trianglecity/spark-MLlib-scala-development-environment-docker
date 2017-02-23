package org.apache.spark.mllib.linalg;
/**
 * Compute Cholesky decomposition.
 */
public  class CholeskyDecomposition {
  /**
   * Solves a symmetric positive definite linear system via Cholesky factorization.
   * The input arguments are modified in-place to store the factorization and the solution.
   * @param A the upper triangular part of A
   * @param bx right-hand side
   * @return the solution array
   */
  static public  double[] solve (double[] A, double[] bx)  { throw new RuntimeException(); }
  /**
   * Computes the inverse of a real symmetric positive definite matrix A
   * using the Cholesky factorization A = U**T*U.
   * The input arguments are modified in-place to store the inverse matrix.
   * @param UAi the upper triangular factor U from the Cholesky factorization A = U**T*U
   * @param k the dimension of A
   * @return the upper triangle of the (symmetric) inverse of A
   */
  static public  double[] inverse (double[] UAi, int k)  { throw new RuntimeException(); }
  static private  void checkReturnValue (org.netlib.util.intW info, java.lang.String method)  { throw new RuntimeException(); }
}
