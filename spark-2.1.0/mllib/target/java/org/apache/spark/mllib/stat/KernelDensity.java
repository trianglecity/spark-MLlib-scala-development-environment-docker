package org.apache.spark.mllib.stat;
/**
 * Kernel density estimation. Given a sample from a population, estimate its probability density
 * function at each of the given evaluation points using kernels. Only Gaussian kernel is supported.
 * <p>
 * Scala example:
 * <p>
 * <pre><code>
 * val sample = sc.parallelize(Seq(0.0, 1.0, 4.0, 4.0))
 * val kd = new KernelDensity()
 *   .setSample(sample)
 *   .setBandwidth(3.0)
 * val densities = kd.estimate(Array(-1.0, 2.0, 5.0))
 * </code></pre>
 */
public  class KernelDensity implements scala.Serializable {
  /** Evaluates the PDF of a normal distribution. */
  static public  double normPdf (double mean, double standardDeviation, double logStandardDeviationPlusHalfLog2Pi, double x)  { throw new RuntimeException(); }
  public   KernelDensity ()  { throw new RuntimeException(); }
  /** Bandwidth of the kernel function. */
  private  double bandwidth ()  { throw new RuntimeException(); }
  /** A sample from a population. */
  private  org.apache.spark.rdd.RDD<java.lang.Object> sample ()  { throw new RuntimeException(); }
  /**
   * Sets the bandwidth (standard deviation) of the Gaussian kernel (default: <code>1.0</code>).
   * @param bandwidth (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.KernelDensity setBandwidth (double bandwidth)  { throw new RuntimeException(); }
  /**
   * Sets the sample to use for density estimation.
   * @param sample (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.KernelDensity setSample (org.apache.spark.rdd.RDD<java.lang.Object> sample)  { throw new RuntimeException(); }
  /**
   * Sets the sample to use for density estimation (for Java users).
   * @param sample (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.KernelDensity setSample (org.apache.spark.api.java.JavaRDD<java.lang.Double> sample)  { throw new RuntimeException(); }
  /**
   * Estimates probability density function at the given array of points.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  double[] estimate (double[] points)  { throw new RuntimeException(); }
}
