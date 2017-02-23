package org.apache.spark.ml.stat.distribution;
/**
 * This class provides basic functionality for a Multivariate Gaussian (Normal) Distribution. In
 * the event that the covariance matrix is singular, the density will be computed in a
 * reduced dimensional subspace under which the distribution is supported.
 * (see <a href="http://en.wikipedia.org/wiki/Multivariate_normal_distribution#Degenerate_case">
 * here</a>)
 * <p>
 * param:  mean The mean vector of the distribution
 * param:  cov The covariance matrix of the distribution
 */
public  class MultivariateGaussian implements scala.Serializable {
  public  org.apache.spark.ml.linalg.Vector mean ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix cov ()  { throw new RuntimeException(); }
  // not preceding
  public   MultivariateGaussian (org.apache.spark.ml.linalg.Vector mean, org.apache.spark.ml.linalg.Matrix cov)  { throw new RuntimeException(); }
  /** Private constructor taking Breeze types */
     MultivariateGaussian (breeze.linalg.DenseVector<java.lang.Object> mean, breeze.linalg.DenseMatrix<java.lang.Object> cov)  { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> breezeMu ()  { throw new RuntimeException(); }
  /**
   * Compute distribution dependent constants:
   *    rootSigmaInv = D^(-1/2)^ * U.t, where sigma = U * D * U.t
   *    u = log((2*pi)^(-k/2)^ * det(sigma)^(-1/2)^)
   * @return (undocumented)
   */
  private  breeze.linalg.DenseMatrix<java.lang.Object> rootSigmaInv ()  { throw new RuntimeException(); }
  private  double u ()  { throw new RuntimeException(); }
  /**
   * Returns density of this multivariate Gaussian at given point, x
   * @param x (undocumented)
   * @return (undocumented)
   */
  public  double pdf (org.apache.spark.ml.linalg.Vector x)  { throw new RuntimeException(); }
  /**
   * Returns the log-density of this multivariate Gaussian at given point, x
   * @param x (undocumented)
   * @return (undocumented)
   */
  public  double logpdf (org.apache.spark.ml.linalg.Vector x)  { throw new RuntimeException(); }
  /** Returns density of this multivariate Gaussian at given point, x */
    double pdf (breeze.linalg.Vector<java.lang.Object> x)  { throw new RuntimeException(); }
  /** Returns the log-density of this multivariate Gaussian at given point, x */
    double logpdf (breeze.linalg.Vector<java.lang.Object> x)  { throw new RuntimeException(); }
  /**
   * Calculate distribution dependent components used for the density function:
   *    pdf(x) = (2*pi)^(-k/2)^ * det(sigma)^(-1/2)^ * exp((-1/2) * (x-mu).t * inv(sigma) * (x-mu))
   * where k is length of the mean vector.
   * <p>
   * We here compute distribution-fixed parts
   *  log((2*pi)^(-k/2)^ * det(sigma)^(-1/2)^)
   * and
   *  D^(-1/2)^ * U, where sigma = U * D * U.t
   * <p>
   * Both the determinant and the inverse can be computed from the singular value decomposition
   * of sigma.  Noting that covariance matrices are always symmetric and positive semi-definite,
   * we can use the eigendecomposition. We also do not compute the inverse directly; noting
   * that
   * <p>
   *    sigma = U * D * U.t
   *    inv(Sigma) = U * inv(D) * U.t
   *               = (D^{-1/2}^ * U.t).t * (D^{-1/2}^ * U.t)
   * <p>
   * and thus
   * <p>
   *    -0.5 * (x-mu).t * inv(Sigma) * (x-mu) = -0.5 * norm(D^{-1/2}^ * U.t  * (x-mu))^2^
   * <p>
   * To guard against singular covariance matrices, this method computes both the
   * pseudo-determinant and the pseudo-inverse (Moore-Penrose).  Singular values are considered
   * to be non-zero only if they exceed a tolerance based on machine precision, matrix size, and
   * relation to the maximum singular value (same tolerance used by, e.g., Octave).
   * @return (undocumented)
   */
  private  scala.Tuple2<breeze.linalg.DenseMatrix<java.lang.Object>, java.lang.Object> calculateCovarianceConstants ()  { throw new RuntimeException(); }
}
