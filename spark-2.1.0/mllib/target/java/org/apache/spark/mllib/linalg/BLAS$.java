package org.apache.spark.mllib.linalg;
/**
 * BLAS routines for MLlib's vectors and matrices.
 */
public  class BLAS$ implements scala.Serializable, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BLAS$ MODULE$ = null;
  public   BLAS$ ()  { throw new RuntimeException(); }
  private  com.github.fommil.netlib.BLAS _f2jBLAS ()  { throw new RuntimeException(); }
  private  com.github.fommil.netlib.BLAS _nativeBLAS ()  { throw new RuntimeException(); }
  private  com.github.fommil.netlib.BLAS f2jBLAS ()  { throw new RuntimeException(); }
  /**
   * y += a * x
   * @param a (undocumented)
   * @param x (undocumented)
   * @param y (undocumented)
   */
  public  void axpy (double a, org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y)  { throw new RuntimeException(); }
  /**
   * y += a * x
   * @param a (undocumented)
   * @param x (undocumented)
   * @param y (undocumented)
   */
  private  void axpy (double a, org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y += a * x
   * @param a (undocumented)
   * @param x (undocumented)
   * @param y (undocumented)
   */
  private  void axpy (double a, org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  /** Y += a * x */
    void axpy (double a, org.apache.spark.mllib.linalg.DenseMatrix X, org.apache.spark.mllib.linalg.DenseMatrix Y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  public  double dot (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  private  double dot (org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  private  double dot (org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * dot(x, y)
   * @param x (undocumented)
   * @param y (undocumented)
   * @return (undocumented)
   */
  private  double dot (org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.SparseVector y)  { throw new RuntimeException(); }
  /**
   * y = x
   * @param x (undocumented)
   * @param y (undocumented)
   */
  public  void copy (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y)  { throw new RuntimeException(); }
  /**
   * x = a * x
   * @param a (undocumented)
   * @param x (undocumented)
   */
  public  void scal (double a, org.apache.spark.mllib.linalg.Vector x)  { throw new RuntimeException(); }
  private  com.github.fommil.netlib.BLAS nativeBLAS ()  { throw new RuntimeException(); }
  /**
   * Adds alpha * v * v.t to a matrix in-place. This is the same as BLAS's ?SPR.
   * <p>
   * @param U the upper triangular part of the matrix in a {@link DenseVector}(column major)
   * @param alpha (undocumented)
   * @param v (undocumented)
   */
  public  void spr (double alpha, org.apache.spark.mllib.linalg.Vector v, org.apache.spark.mllib.linalg.DenseVector U)  { throw new RuntimeException(); }
  /**
   * Adds alpha * v * v.t to a matrix in-place. This is the same as BLAS's ?SPR.
   * <p>
   * @param U the upper triangular part of the matrix packed in an array (column major)
   * @param alpha (undocumented)
   * @param v (undocumented)
   */
  public  void spr (double alpha, org.apache.spark.mllib.linalg.Vector v, double[] U)  { throw new RuntimeException(); }
  /**
   * A := alpha * x * x^T^ + A
   * @param alpha a real scalar that will be multiplied to x * x^T^.
   * @param x the vector x that contains the n elements.
   * @param A the symmetric matrix A. Size of n x n.
   */
  public  void syr (double alpha, org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.DenseMatrix A)  { throw new RuntimeException(); }
  private  void syr (double alpha, org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseMatrix A)  { throw new RuntimeException(); }
  private  void syr (double alpha, org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseMatrix A)  { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * @param alpha a scalar to scale the multiplication A * B.
   * @param A the matrix A that will be left multiplied to B. Size of m x k.
   * @param B the matrix B that will be left multiplied by A. Size of k x n.
   * @param beta a scalar that can be used to scale matrix C.
   * @param C the resulting matrix C. Size of m x n. C.isTransposed must be false.
   */
  public  void gemm (double alpha, org.apache.spark.mllib.linalg.Matrix A, org.apache.spark.mllib.linalg.DenseMatrix B, double beta, org.apache.spark.mllib.linalg.DenseMatrix C)  { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * For <code>DenseMatrix</code> A.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param B (undocumented)
   * @param beta (undocumented)
   * @param C (undocumented)
   */
  private  void gemm (double alpha, org.apache.spark.mllib.linalg.DenseMatrix A, org.apache.spark.mllib.linalg.DenseMatrix B, double beta, org.apache.spark.mllib.linalg.DenseMatrix C)  { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * For <code>SparseMatrix</code> A.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param B (undocumented)
   * @param beta (undocumented)
   * @param C (undocumented)
   */
  private  void gemm (double alpha, org.apache.spark.mllib.linalg.SparseMatrix A, org.apache.spark.mllib.linalg.DenseMatrix B, double beta, org.apache.spark.mllib.linalg.DenseMatrix C)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * @param alpha a scalar to scale the multiplication A * x.
   * @param A the matrix A that will be left multiplied to x. Size of m x n.
   * @param x the vector x that will be left multiplied by A. Size of n x 1.
   * @param beta a scalar that can be used to scale vector y.
   * @param y the resulting vector y. Size of m x 1.
   */
  public  void gemv (double alpha, org.apache.spark.mllib.linalg.Matrix A, org.apache.spark.mllib.linalg.Vector x, double beta, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>DenseMatrix</code> A and <code>DenseVector</code> x.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param x (undocumented)
   * @param beta (undocumented)
   * @param y (undocumented)
   */
  private  void gemv (double alpha, org.apache.spark.mllib.linalg.DenseMatrix A, org.apache.spark.mllib.linalg.DenseVector x, double beta, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>DenseMatrix</code> A and <code>SparseVector</code> x.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param x (undocumented)
   * @param beta (undocumented)
   * @param y (undocumented)
   */
  private  void gemv (double alpha, org.apache.spark.mllib.linalg.DenseMatrix A, org.apache.spark.mllib.linalg.SparseVector x, double beta, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>SparseMatrix</code> A and <code>SparseVector</code> x.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param x (undocumented)
   * @param beta (undocumented)
   * @param y (undocumented)
   */
  private  void gemv (double alpha, org.apache.spark.mllib.linalg.SparseMatrix A, org.apache.spark.mllib.linalg.SparseVector x, double beta, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>SparseMatrix</code> A and <code>DenseVector</code> x.
   * @param alpha (undocumented)
   * @param A (undocumented)
   * @param x (undocumented)
   * @param beta (undocumented)
   * @param y (undocumented)
   */
  private  void gemv (double alpha, org.apache.spark.mllib.linalg.SparseMatrix A, org.apache.spark.mllib.linalg.DenseVector x, double beta, org.apache.spark.mllib.linalg.DenseVector y)  { throw new RuntimeException(); }
}
