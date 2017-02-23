package org.apache.spark.mllib.stat;
/**
 * :: DeveloperApi ::
 * MultivariateOnlineSummarizer implements {@link MultivariateStatisticalSummary} to compute the mean,
 * variance, minimum, maximum, counts, and nonzero counts for instances in sparse or dense vector
 * format in an online fashion.
 * <p>
 * Two MultivariateOnlineSummarizer can be merged together to have a statistical summary of
 * the corresponding joint dataset.
 * <p>
 * A numerically stable algorithm is implemented to compute the mean and variance of instances:
 * Reference: <a href="http://en.wikipedia.org/wiki/Algorithms_for_calculating_variance">
 * variance-wiki</a>
 * Zero elements (including explicit zero values) are skipped when calling add(),
 * to have time complexity O(nnz) instead of O(n) for each column.
 * <p>
 * For weighted instances, the unbiased estimation of variance is defined by the reliability
 * weights:
 * see <a href="https://en.wikipedia.org/wiki/Weighted_arithmetic_mean#Reliability_weights">
 * Reliability weights (Wikipedia)</a>.
 */
public  class MultivariateOnlineSummarizer implements org.apache.spark.mllib.stat.MultivariateStatisticalSummary, scala.Serializable {
  public   MultivariateOnlineSummarizer ()  { throw new RuntimeException(); }
  private  int n ()  { throw new RuntimeException(); }
  private  double[] currMean ()  { throw new RuntimeException(); }
  private  double[] currM2n ()  { throw new RuntimeException(); }
  private  double[] currM2 ()  { throw new RuntimeException(); }
  private  double[] currL1 ()  { throw new RuntimeException(); }
  private  long totalCnt ()  { throw new RuntimeException(); }
  private  double totalWeightSum ()  { throw new RuntimeException(); }
  private  double weightSquareSum ()  { throw new RuntimeException(); }
  private  double[] weightSum ()  { throw new RuntimeException(); }
  private  long[] nnz ()  { throw new RuntimeException(); }
  private  double[] currMax ()  { throw new RuntimeException(); }
  private  double[] currMin ()  { throw new RuntimeException(); }
  /**
   * Add a new sample to this summarizer, and update the statistical summary.
   * <p>
   * @param sample The sample in dense/sparse vector format to be added into this summarizer.
   * @return This MultivariateOnlineSummarizer object.
   */
  public  org.apache.spark.mllib.stat.MultivariateOnlineSummarizer add (org.apache.spark.mllib.linalg.Vector sample)  { throw new RuntimeException(); }
    org.apache.spark.mllib.stat.MultivariateOnlineSummarizer add (org.apache.spark.mllib.linalg.Vector instance, double weight)  { throw new RuntimeException(); }
  /**
   * Merge another MultivariateOnlineSummarizer, and update the statistical summary.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other MultivariateOnlineSummarizer to be merged.
   * @return This MultivariateOnlineSummarizer object.
   */
  public  org.apache.spark.mllib.stat.MultivariateOnlineSummarizer merge (org.apache.spark.mllib.stat.MultivariateOnlineSummarizer other)  { throw new RuntimeException(); }
  /**
   * Sample mean of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector mean ()  { throw new RuntimeException(); }
  /**
   * Unbiased estimate of sample variance of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector variance ()  { throw new RuntimeException(); }
  /**
   * Sample size.
   * <p>
   * @return (undocumented)
   */
  public  long count ()  { throw new RuntimeException(); }
  /**
   * Number of nonzero elements in each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector numNonzeros ()  { throw new RuntimeException(); }
  /**
   * Maximum value of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector max ()  { throw new RuntimeException(); }
  /**
   * Minimum value of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector min ()  { throw new RuntimeException(); }
  /**
   * L2 (Euclidian) norm of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normL2 ()  { throw new RuntimeException(); }
  /**
   * L1 norm of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normL1 ()  { throw new RuntimeException(); }
}
