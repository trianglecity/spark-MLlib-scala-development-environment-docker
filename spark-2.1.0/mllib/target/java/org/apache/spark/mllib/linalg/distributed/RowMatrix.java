package org.apache.spark.mllib.linalg.distributed;
/**
 * Represents a row-oriented distributed Matrix with no meaningful row indices.
 * <p>
 * param:  rows rows stored as an RDD[Vector]
 * param:  nRows number of rows. A non-positive value means unknown, and then the number of rows will
 *              be determined by the number of records in the RDD <code>rows</code>.
 * param:  nCols number of columns. A non-positive value means unknown, and then the number of
 *              columns will be determined by the size of the first row.
 */
public  class RowMatrix implements org.apache.spark.mllib.linalg.distributed.DistributedMatrix, org.apache.spark.internal.Logging {
  /**
   * Fills a full square matrix from its upper triangular part.
   * @param n (undocumented)
   * @param U (undocumented)
   * @return (undocumented)
   */
  static private  org.apache.spark.mllib.linalg.Matrix triuToFull (int n, double[] U)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> rows ()  { throw new RuntimeException(); }
  private  long nRows ()  { throw new RuntimeException(); }
  private  int nCols ()  { throw new RuntimeException(); }
  // not preceding
  public   RowMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> rows, long nRows, int nCols)  { throw new RuntimeException(); }
  /** Alternative constructor leaving matrix dimensions to be determined automatically. */
  public   RowMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> rows)  { throw new RuntimeException(); }
  /** Gets or computes the number of columns. */
  public  long numCols ()  { throw new RuntimeException(); }
  /** Gets or computes the number of rows. */
  public  long numRows ()  { throw new RuntimeException(); }
  /**
   * Multiplies the Gramian matrix <code>A^T A</code> by a dense vector on the right without computing <code>A^T A</code>.
   * <p>
   * @param v a dense vector whose length must match the number of columns of this matrix
   * @return a dense vector representing the product
   */
    breeze.linalg.DenseVector<java.lang.Object> multiplyGramianMatrixBy (breeze.linalg.DenseVector<java.lang.Object> v)  { throw new RuntimeException(); }
  /**
   * Computes the Gramian matrix <code>A^T A</code>.
   * <p>
   * @note This cannot be computed on matrices with more than 65535 columns.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix computeGramianMatrix ()  { throw new RuntimeException(); }
  private  void checkNumColumns (int cols)  { throw new RuntimeException(); }
  /**
   * Computes singular value decomposition of this matrix. Denote this matrix by A (m x n). This
   * will compute matrices U, S, V such that A ~= U * S * V', where S contains the leading k
   * singular values, U and V contain the corresponding singular vectors.
   * <p>
   * At most k largest non-zero singular values and associated vectors are returned. If there are k
   * such values, then the dimensions of the return will be:
   *  - U is a RowMatrix of size m x k that satisfies U' * U = eye(k),
   *  - s is a Vector of size k, holding the singular values in descending order,
   *  - V is a Matrix of size n x k that satisfies V' * V = eye(k).
   * <p>
   * We assume n is smaller than m, though this is not strictly required.
   * The singular values and the right singular vectors are derived
   * from the eigenvalues and the eigenvectors of the Gramian matrix A' * A. U, the matrix
   * storing the right singular vectors, is computed via matrix multiplication as
   * U = A * (V * S^-1^), if requested by user. The actual method to use is determined
   * automatically based on the cost:
   *  - If n is small (n &amp;lt; 100) or k is large compared with n (k &amp;gt; n / 2), we compute
   *    the Gramian matrix first and then compute its top eigenvalues and eigenvectors locally
   *    on the driver. This requires a single pass with O(n^2^) storage on each executor and
   *    on the driver, and O(n^2^ k) time on the driver.
   *  - Otherwise, we compute (A' * A) * v in a distributive way and send it to ARPACK's DSAUPD to
   *    compute (A' * A)'s top eigenvalues and eigenvectors on the driver node. This requires O(k)
   *    passes, O(n) storage on each executor, and O(n k) storage on the driver.
   * <p>
   * Several internal parameters are set to default values. The reciprocal condition number rCond
   * is set to 1e-9. All singular values smaller than rCond * sigma(0) are treated as zeros, where
   * sigma(0) is the largest singular value. The maximum number of Arnoldi update iterations for
   * ARPACK is set to 300 or k * 3, whichever is larger. The numerical tolerance for ARPACK's
   * eigen-decomposition is set to 1e-10.
   * <p>
   * @param k number of leading singular values to keep (0 &amp;lt; k &amp;lt;= n).
   *          It might return less than k if
   *          there are numerically zero singular values or there are not enough Ritz values
   *          converged before the maximum number of Arnoldi update iterations is reached (in case
   *          that matrix A is ill-conditioned).
   * @param computeU whether to compute U
   * @param rCond the reciprocal condition number. All singular values smaller than rCond * sigma(0)
   *              are treated as zero, where sigma(0) is the largest singular value.
   * @return SingularValueDecomposition(U, s, V). U = null if computeU = false.
   * <p>
   * @note The conditions that decide which method to use internally and the default parameters are
   * subject to change.
   */
  public  org.apache.spark.mllib.linalg.SingularValueDecomposition<org.apache.spark.mllib.linalg.distributed.RowMatrix, org.apache.spark.mllib.linalg.Matrix> computeSVD (int k, boolean computeU, double rCond)  { throw new RuntimeException(); }
  /**
   * The actual SVD implementation, visible for testing.
   * <p>
   * @param k number of leading singular values to keep (0 &amp;lt; k &amp;lt;= n)
   * @param computeU whether to compute U
   * @param rCond the reciprocal condition number
   * @param maxIter max number of iterations (if ARPACK is used)
   * @param tol termination tolerance (if ARPACK is used)
   * @param mode computation mode (auto: determine automatically which mode to use,
   *             local-svd: compute gram matrix and computes its full SVD locally,
   *             local-eigs: compute gram matrix and computes its top eigenvalues locally,
   *             dist-eigs: compute the top eigenvalues of the gram matrix distributively)
   * @return SingularValueDecomposition(U, s, V). U = null if computeU = false.
   */
    org.apache.spark.mllib.linalg.SingularValueDecomposition<org.apache.spark.mllib.linalg.distributed.RowMatrix, org.apache.spark.mllib.linalg.Matrix> computeSVD (int k, boolean computeU, double rCond, int maxIter, double tol, java.lang.String mode)  { throw new RuntimeException(); }
  /**
   * Computes the covariance matrix, treating each row as an observation.
   * <p>
   * @return a local dense matrix of size n x n
   * <p>
   * @note This cannot be computed on matrices with more than 65535 columns.
   */
  public  org.apache.spark.mllib.linalg.Matrix computeCovariance ()  { throw new RuntimeException(); }
  /**
   * Computes the top k principal components and a vector of proportions of
   * variance explained by each principal component.
   * Rows correspond to observations and columns correspond to variables.
   * The principal components are stored a local matrix of size n-by-k.
   * Each column corresponds for one principal component,
   * and the columns are in descending order of component variance.
   * The row data do not need to be "centered" first; it is not necessary for
   * the mean of each column to be 0.
   * <p>
   * @param k number of top principal components.
   * @return a matrix of size n-by-k, whose columns are principal components, and
   * a vector of values which indicate how much variance each principal component
   * explains
   * <p>
   * @note This cannot be computed on matrices with more than 65535 columns.
   */
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Matrix, org.apache.spark.mllib.linalg.Vector> computePrincipalComponentsAndExplainedVariance (int k)  { throw new RuntimeException(); }
  /**
   * Computes the top k principal components only.
   * <p>
   * @param k number of top principal components.
   * @return a matrix of size n-by-k, whose columns are principal components
   * @see computePrincipalComponentsAndExplainedVariance
   */
  public  org.apache.spark.mllib.linalg.Matrix computePrincipalComponents (int k)  { throw new RuntimeException(); }
  /**
   * Computes column-wise summary statistics.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.MultivariateStatisticalSummary computeColumnSummaryStatistics ()  { throw new RuntimeException(); }
  /**
   * Multiply this matrix by a local matrix on the right.
   * <p>
   * @param B a local matrix whose number of rows must match the number of columns of this matrix
   * @return a {@link org.apache.spark.mllib.linalg.distributed.RowMatrix} representing the product,
   *         which preserves partitioning
   */
  public  org.apache.spark.mllib.linalg.distributed.RowMatrix multiply (org.apache.spark.mllib.linalg.Matrix B)  { throw new RuntimeException(); }
  /**
   * Compute all cosine similarities between columns of this matrix using the brute-force
   * approach of computing normalized dot products.
   * <p>
   * @return An n x n sparse upper-triangular matrix of cosine similarities between
   *         columns of this matrix.
   */
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix columnSimilarities ()  { throw new RuntimeException(); }
  /**
   * Compute similarities between columns of this matrix using a sampling approach.
   * <p>
   * The threshold parameter is a trade-off knob between estimate quality and computational cost.
   * <p>
   * Setting a threshold of 0 guarantees deterministic correct results, but comes at exactly
   * the same cost as the brute-force approach. Setting the threshold to positive values
   * incurs strictly less computational cost than the brute-force approach, however the
   * similarities computed will be estimates.
   * <p>
   * The sampling guarantees relative-error correctness for those pairs of columns that have
   * similarity greater than the given similarity threshold.
   * <p>
   * To describe the guarantee, we set some notation:
   * Let A be the smallest in magnitude non-zero element of this matrix.
   * Let B be the largest  in magnitude non-zero element of this matrix.
   * Let L be the maximum number of non-zeros per row.
   * <p>
   * For example, for {0,1} matrices: A=B=1.
   * Another example, for the Netflix matrix: A=1, B=5
   * <p>
   * For those column pairs that are above the threshold,
   * the computed similarity is correct to within 20% relative error with probability
   * at least 1 - (0.981)^10/B^
   * <p>
   * The shuffle size is bounded by the *smaller* of the following two expressions:
   * <p>
   * O(n log(n) L / (threshold * A))
   * O(m L^2^)
   * <p>
   * The latter is the cost of the brute-force approach, so for non-zero thresholds,
   * the cost is always cheaper than the brute-force approach.
   * <p>
   * @param threshold Set to 0 for deterministic guaranteed correctness.
   *                  Similarities above this threshold are estimated
   *                  with the cost vs estimate quality trade-off described above.
   * @return An n x n sparse upper-triangular matrix of cosine similarities
   *         between columns of this matrix.
   */
  public  org.apache.spark.mllib.linalg.distributed.CoordinateMatrix columnSimilarities (double threshold)  { throw new RuntimeException(); }
  /**
   * Compute QR decomposition for {@link RowMatrix}. The implementation is designed to optimize the QR
   * decomposition (factorization) for the {@link RowMatrix} of a tall and skinny shape.
   * Reference:
   *  Paul G. Constantine, David F. Gleich. "Tall and skinny QR factorizations in MapReduce
   *  architectures" (see <a href="http://dx.doi.org/10.1145/1996092.1996103">here</a>)
   * <p>
   * @param computeQ whether to computeQ
   * @return QRDecomposition(Q, R), Q = null if computeQ = false.
   */
  public  org.apache.spark.mllib.linalg.QRDecomposition<org.apache.spark.mllib.linalg.distributed.RowMatrix, org.apache.spark.mllib.linalg.Matrix> tallSkinnyQR (boolean computeQ)  { throw new RuntimeException(); }
  /**
   * Find all similar columns using the DIMSUM sampling algorithm, described in two papers
   * <p>
   * http://arxiv.org/abs/1206.2082
   * http://arxiv.org/abs/1304.1467
   * <p>
   * @param colMags A vector of column magnitudes
   * @param gamma The oversampling parameter. For provable results, set to 10 * log(n) / s,
   *              where s is the smallest similarity score to be estimated,
   *              and n is the number of columns
   * @return An n x n sparse upper-triangular matrix of cosine similarities
   *         between columns of this matrix.
   */
    org.apache.spark.mllib.linalg.distributed.CoordinateMatrix columnSimilaritiesDIMSUM (double[] colMags, double gamma)  { throw new RuntimeException(); }
    breeze.linalg.DenseMatrix<java.lang.Object> toBreeze ()  { throw new RuntimeException(); }
  /** Updates or verifies the number of rows. */
  private  void updateNumRows (long m)  { throw new RuntimeException(); }
}
