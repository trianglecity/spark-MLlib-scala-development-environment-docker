package org.apache.spark.streaming.receiver;
/**
 * Provides waitToPush() method to limit the rate at which receivers consume data.
 * <p>
 * waitToPush method will block the thread if too many messages have been pushed too quickly,
 * and only return when a new message has been pushed. It assumes that only one message is
 * pushed at a time.
 * <p>
 * The spark configuration spark.streaming.receiver.maxRate gives the maximum number of messages
 * per second that each receiver will accept.
 * <p>
 * param:  conf spark configuration
 */
 abstract class RateLimiter implements org.apache.spark.internal.Logging {
  public   RateLimiter (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  private  long maxRateLimit ()  { throw new RuntimeException(); }
  private  com.google.common.util.concurrent.RateLimiter rateLimiter ()  { throw new RuntimeException(); }
  public  void waitToPush ()  { throw new RuntimeException(); }
  /**
   * Return the current rate limit. If no limit has been set so far, it returns <pre><code>Long.MaxValue</code></pre>.
   * @return (undocumented)
   */
  public  long getCurrentLimit ()  { throw new RuntimeException(); }
  /**
   * Set the rate limit to <code>newRate</code>. The new rate will not exceed the maximum rate configured by
   * <pre><code>spark.streaming.receiver.maxRate</code></pre>, even if <code>newRate</code> is higher than that.
   *
   * &#64;param newRate A new rate in records per second. It has no effect if it's 0 or negative.
   * @param newRate (undocumented)
   */
    void updateRate (long newRate)  { throw new RuntimeException(); }
  /**
   * Get the initial rateLimit to initial rateLimiter
   * @return (undocumented)
   */
  private  long getInitialRateLimit ()  { throw new RuntimeException(); }
}
