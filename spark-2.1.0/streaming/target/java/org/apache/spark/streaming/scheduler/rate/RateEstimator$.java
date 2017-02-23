package org.apache.spark.streaming.scheduler.rate;
public  class RateEstimator$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RateEstimator$ MODULE$ = null;
  public   RateEstimator$ ()  { throw new RuntimeException(); }
  /**
   * Return a new <code>RateEstimator</code> based on the value of
   * <code>spark.streaming.backpressure.rateEstimator</code>.
   * <p>
   * The only known and acceptable estimator right now is <code>pid</code>.
   * <p>
   * @return An instance of RateEstimator
   * @throws IllegalArgumentException if the configured RateEstimator is not <code>pid</code>.
   * @param conf (undocumented)
   * @param batchInterval (undocumented)
   */
  public  org.apache.spark.streaming.scheduler.rate.RateEstimator create (org.apache.spark.SparkConf conf, org.apache.spark.streaming.Duration batchInterval)  { throw new RuntimeException(); }
}
