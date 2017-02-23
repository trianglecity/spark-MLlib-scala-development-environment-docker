package org.apache.spark.ml.linalg;
/**
 * BLAS routines for MLlib's vectors and matrices.
 */
public  class BLAS {
  static private  com.github.fommil.netlib.BLAS _f2jBLAS ()  { throw new RuntimeException(); }
  static private  com.github.fommil.netlib.BLAS _nativeBLAS ()  { throw new RuntimeException(); }
  static private  com.github.fommil.netlib.BLAS f2jBLAS ()  { throw new RuntimeException(); }
  /**
   * y += a * x
   * @param a (undocumented)
   * @param x (undocumented)
   * @param y (undocumented)
   */
  static public  void axpy (double a, org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  { throw new RuntimeException(); }
  /**
   * y += a * x
   * @param a (undocumented)
   * @param x (undocumented)
   * @param y (undocumented)
   */
  static private  void axpy (double a, org.apache.spark.ml.linalg.DenseVector x, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y += a * x
   * @param a (undocumented)
   * @param x (undocumented)
   * @param y (undocumented)
   */
  static private  void axpy (double a, org.apache.spark.ml.linalg.SparseVector x, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /** Y += a * x */
  static   void axpy (double a, org.apache.spark.ml.linalg.DenseMatrix X, org.apache.spark.ml.linalg.DenseMatrix Y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  static public  double dot (org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  static private  double dot (org.apache.spark.ml.linalg.DenseVector x, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  static private  double dot (org.apache.spark.ml.linalg.SparseVector x, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  static private  double dot (org.apache.spark.ml.linalg.SparseVector x, org.apache.spark.ml.linalg.SparseVector y)  { throw new RuntimeException(); }
  /**
   * y = x
   * @param x (undocumented)
   * @param y (undocumented)
   */
  static public  void copy (org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  { throw new RuntimeException(); }
  /**
   * x = a * x
   * @param a (undocumented)
   * @param x (undocumented)
   */
  static public  void scal (double a, org.apache.spark.ml.linalg.Vector x)  { throw new RuntimeException(); }
  static private  com.github.fommil.netlib.BLAS nativeBLAS ()  { throw new RuntimeException(); }
  /**
   * Adds alpha * x * x.t to a matrix in-place. This is the same as BLAS's ?SPR.
   * <p>
   * @param U the upper triangular part of the matrix in a {@link DenseVector}(column major)
   * @param alpha (undocumented)
   * @param v (undocumented)
   */
  static public  void spr (double alpha, org.apache.spark.ml.linalg.Vector v, org.apache.spark.ml.linalg.DenseVector U)  { throw new RuntimeException(); }
  /**
   * y := alpha*A*x + beta*y
   * <p>
   * @param n The order of the n by n matrix A.
   * @param A The upper triangular part of A in a {@link DenseVector} (column major).
   * @param x The {@link DenseVector} transformed by A.
   * @param y The {@link DenseVector} to be modified in place.
   * @param alpha (undocumented)
   * @param beta (undocumented)
   */
  static public  void dspmv (int n, double alpha, org.apache.spark.ml.linalg.DenseVector A, org.apache.spark.ml.linalg.DenseVector x, double beta, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * Adds alpha * x * x.t to a matrix in-place. This is the same as BLAS's ?SPR.
   * <p>
   * @param U the upper triangular part of the matrix packed in an array (column major)
   * @param alpha (undocumented)
   * @param v (undocumented)
   */
  static public  void spr (double alpha, org.apache.spark.ml.linalg.Vector v, double[] U)  { throw new RuntimeException(); }
  /**
   * A := alpha * x * x^T^ + A
   * @param alpha a real scalar that will be multiplied to x * x^T^.
   * @param x the vector x that contains the n elements.
   * @param A the symmetric matrix A. Size of n x n.
   */
  static public  void syr (double alpha, org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.DenseMatrix A)  { throw new RuntimeException(); }
  static private  void syr (double alpha, org.apache.spark.ml.linalg.DenseVector x, org.apache.spark.ml.linalg.DenseMatrix A)  { throw new RuntimeException(); }
  static private  void syr (double alpha, org.apache.spark.ml.linalg.SparseVector x, org.apache.spark.ml.linalg.DenseMatrix A)  { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * @param alpha a scalar to scale the multiplication A * B.
   * @param A the matrix A that will be left multiplied to B. Size of m x k.
   * @param B the matrix B that will be left multiplied by A. Size of k x n.
   * @param beta a scalar that can be used to scale matrix C.
   * @param C the resulting matrix C. Size of m x n. C.isTransposed must be false.
   */
  static public  void gemm (double alpha, org.apache.spark.ml.linalg.Matrix A, org.apache.spark.ml.linalg.DenseMatrix B, double beta, org.apache.spark.ml.linalg.DenseMatrix C)  { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * For <code>DenseMatrix</code> A.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param B (undocumented)
   * @param beta (undocumented)
   * @param C (undocumented)
   */
  static private  void gemm (double alpha, org.apache.spark.ml.linalg.DenseMatrix A, org.apache.spark.ml.linalg.DenseMatrix B, double beta, org.apache.spark.ml.linalg.DenseMatrix C)  { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * For <code>SparseMatrix</code> A.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param B (undocumented)
   * @param beta (undocumented)
   * @param C (undocumented)
   */
  static private  void gemm (double alpha, org.apache.spark.ml.linalg.SparseMatrix A, org.apache.spark.ml.linalg.DenseMatrix B, double beta, org.apache.spark.ml.linalg.DenseMatrix C)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * @param alpha a scalar to scale the multiplication A * x.
   * @param A the matrix A that will be left multiplied to x. Size of m x n.
   * @param x the vector x that will be left multiplied by A. Size of n x 1.
   * @param beta a scalar that can be used to scale vector y.
   * @param y the resulting vector y. Size of m x 1.
   */
  static public  void gemv (double alpha, org.apache.spark.ml.linalg.Matrix A, org.apache.spark.ml.linalg.Vector x, double beta, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>DenseMatrix</code> A and <code>DenseVector</code> x.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param x (undocumented)
   * @param beta (undocumented)
   * @param y (undocumented)
   */
  static private  void gemv (double alpha, org.apache.spark.ml.linalg.DenseMatrix A, org.apache.spark.ml.linalg.DenseVector x, double beta, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>DenseMatrix</code> A and <code>SparseVector</code> x.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param x (undocumented)
   * @param beta (undocumented)
   * @param y (undocumented)
   */
  static private  void gemv (double alpha, org.apache.spark.ml.linalg.DenseMatrix A, org.apache.spark.ml.linalg.SparseVector x, double beta, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>SparseMatrix</code> A and <code>SparseVector</code> x.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param x (undocumented)
   * @param beta (undocumented)
   * @param y (undocumented)
   */
  static private  void gemv (double alpha, org.apache.spark.ml.linalg.SparseMatrix A, org.apache.spark.ml.linalg.SparseVector x, double beta, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>SparseMatrix</code> A and <code>DenseVector</code> x.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param x (undocumented)
   * @param beta (undocumented)
   * @param y (undocumented)
   */
  static private  void gemv (double alpha, org.apache.spark.ml.linalg.SparseMatrix A, org.apache.spark.ml.linalg.DenseVector x, double beta, org.apache.spark.ml.linalg.DenseVector y)  { throw new RuntimeException(); }
}
