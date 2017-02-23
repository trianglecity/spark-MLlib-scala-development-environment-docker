package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents a row-oriented {@link org.apache.spark.mllib.linalg.distributed.DistributedMatrix} with
 * indexed rows.
 * <p>
 * param:  rows indexed rows of this matrix
 * param:  nRows number of rows. A non-positive value means unknown, and then the number of rows will
 *              be determined by the max row index plus one.
 * param:  nCols number of columns. A non-positive value means unknown, and then the number of
 *              columns will be determined by the size of the first row.
 */
public  class IndexedRowMatrix implements org.apache.spark.mllib.linalg.distributed.DistributedMatrix {
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.IndexedRow> rows ()  { throw new RuntimeException(); }
  private  long nRows ()  { throw new RuntimeException(); }
  private  int nCols ()  { throw new RuntimeException(); }
  // not preceding
  public   IndexedRowMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.IndexedRow> rows, long nRows, int nCols)  { throw new RuntimeException(); }
  /** Alternative constructor leaving matrix dimensions to be determined automatically. */
  public   IndexedRowMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.IndexedRow> rows)  { throw new RuntimeException(); }
  public  long numCols ()  { throw new RuntimeException(); }
  public  long numRows ()  { throw new RuntimeException(); }
  /**
   * Compute all cosine similarities between columns of this matrix using the brute-force
   * approach of computing normalized dot products.
   * <p>
   * @return An n x n sparse upper-triangular matrix of cosine similarities between
   *         columns of this matrix.
   */
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix columnSimilarities ()  { throw new RuntimeException(); }
  /**
   * Drops row indices and converts this matrix to a
   * {@link org.apache.spark.mllib.linalg.distributed.RowMatrix}.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.RowMatrix toRowMatrix ()  { throw new RuntimeException(); }
  /**
   * Converts to BlockMatrix. Creates blocks of <code>SparseMatrix</code> with size 1024 x 1024.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix toBlockMatrix ()  { throw new RuntimeException(); }
  /**
   * Converts to BlockMatrix. Creates blocks of <code>SparseMatrix</code>.
   * @param rowsPerBlock The number of rows of each block. The blocks at the bottom edge may have
   *                     a smaller value. Must be an integer value greater than 0.
   * @param colsPerBlock The number of columns of each block. The blocks at the right edge may have
   *                     a smaller value. Must be an integer value greater than 0.
   * @return a {@link BlockMatrix}
   */
  public  org.apache.spark.mllib.linalg.distributed.BlockMatrix toBlockMatrix (int rowsPerBlock, int colsPerBlock)  { throw new RuntimeException(); }
  /**
   * Converts this matrix to a
   * {@link org.apache.spark.mllib.linalg.distributed.CoordinateMatrix}.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix toCoordinateMatrix ()  { throw new RuntimeException(); }
  /**
   * Computes the singular value decomposition of this IndexedRowMatrix.
   * Denote this matrix by A (m x n), this will compute matrices U, S, V such that A = U * S * V'.
   * <p>
   * The cost and implementation of this method is identical to that in
   * {@link org.apache.spark.mllib.linalg.distributed.RowMatrix}
   * With the addition of indices.
   * <p>
   * At most k largest non-zero singular values and associated vectors are returned.
   * If there are k such values, then the dimensions of the return will be:
   * <p>
   * U is an {@link org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix} of size m x k that
   * satisfies U'U = eye(k),
   * s is a Vector of size k, holding the singular values in descending order,
   * and V is a local Matrix of size n x k that satisfies V'V = eye(k).
   * <p>
   * @param k number of singular values to keep. We might return less than k if there are
   *          numerically zero singular values. See rCond.
   * @param computeU whether to compute U
   * @param rCond the reciprocal condition number. All singular values smaller than rCond * sigma(0)
   *              are treated as zero, where sigma(0) is the largest singular value.
   * @return SingularValueDecomposition(U, s, V)
   */
  public  org.apache.spark.mllib.linalg.SingularValueDecomposition<org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix, org.apache.spark.mllib.linalg.Matrix> computeSVD (int k, boolean computeU, double rCond)  { throw new RuntimeException(); }
  /**
   * Multiply this matrix by a local matrix on the right.
   * <p>
   * @param B a local matrix whose number of rows must match the number of columns of this matrix
   * @return an IndexedRowMatrix representing the product, which preserves partitioning
   */
  public  org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix multiply (org.apache.spark.mllib.linalg.Matrix B)  { throw new RuntimeException(); }
  /**
   * Computes the Gramian matrix <code>A^T A</code>.
   * <p>
   * @note This cannot be computed on matrices with more than 65535 columns.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix computeGramianMatrix ()  { throw new RuntimeException(); }
    breeze.linalg.DenseMatrix<java.lang.Object> toBreeze ()  { throw new RuntimeException(); }
}
