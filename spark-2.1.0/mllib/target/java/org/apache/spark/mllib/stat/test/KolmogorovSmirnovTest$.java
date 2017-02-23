package org.apache.spark.mllib.stat.test;
/**
 * Conduct the two-sided Kolmogorov Smirnov (KS) test for data sampled from a
 * continuous distribution. By comparing the largest difference between the empirical cumulative
 * distribution of the sample data and the theoretical distribution we can provide a test for the
 * the null hypothesis that the sample data comes from that theoretical distribution.
 * For more information on KS Test:
 * @see <a href="https://en.wikipedia.org/wiki/Kolmogorov%E2%80%93Smirnov_test">
 * Kolmogorov-Smirnov test (Wikipedia)</a>
 * <p>
 * Implementation note: We seek to implement the KS test with a minimal number of distributed
 * passes. We sort the RDD, and then perform the following operations on a per-partition basis:
 * calculate an empirical cumulative distribution value for each observation, and a theoretical
 * cumulative distribution value. We know the latter to be correct, while the former will be off by
 * a constant (how large the constant is depends on how many values precede it in other partitions).
 * However, given that this constant simply shifts the empirical CDF upwards, but doesn't
 * change its shape, and furthermore, that constant is the same within a given partition, we can
 * pick 2 values in each partition that can potentially resolve to the largest global distance.
 * Namely, we pick the minimum distance and the maximum distance. Additionally, we keep track of how
 * many elements are in each partition. Once these three values have been returned for every
 * partition, we can collect and operate locally. Locally, we can now adjust each distance by the
 * appropriate constant (the cumulative sum of number of elements in the prior partitions divided by
 * the data set size). Finally, we take the maximum absolute value, and this is the statistic.
 */
// not preceding
public  class KolmogorovSmirnovTest$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KolmogorovSmirnovTest$ MODULE$ = null;
  /**
   * A convenience function that allows running the KS test for 1 set of sample data against
   * a named distribution
   * @param data the sample data that we wish to evaluate
   * @param distName the name of the theoretical distribution
   * @param params Variable length parameter for distribution's parameters
   * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the
   *        test results (p-value, statistic, and null hypothesis)
   */
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, java.lang.String distName, double... params)  { throw new RuntimeException(); }
  public   KolmogorovSmirnovTest$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, scala.Function1<java.lang.Object, java.lang.Object> cdf)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, org.apache.commons.math3.distribution.RealDistribution distObj)  { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> oneSampleDifferences (scala.collection.Iterator<java.lang.Object> partData, double n, scala.Function1<java.lang.Object, java.lang.Object> cdf)  { throw new RuntimeException(); }
  private  scala.collection.Iterator<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> searchOneSampleCandidates (scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> partDiffs)  { throw new RuntimeException(); }
  private  double searchOneSampleStatistic (scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>[] localData, double n)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, java.lang.String distName, scala.collection.Seq<java.lang.Object> params)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult evalOneSampleP (double ksStat, long n)  { throw new RuntimeException(); }
}
