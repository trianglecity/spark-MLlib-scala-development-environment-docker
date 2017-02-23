package org.apache.spark.streaming.scheduler.rate;
/**
 * Implements a proportional-integral-derivative (PID) controller which acts on
 * the speed of ingestion of elements into Spark Streaming. A PID controller works
 * by calculating an '''error''' between a measured output and a desired value. In the
 * case of Spark Streaming the error is the difference between the measured processing
 * rate (number of elements/processing delay) and the previous rate.
 * <p>
 * @see https://en.wikipedia.org/wiki/PID_controller
 * <p>
 * param:  batchIntervalMillis the batch duration, in milliseconds
 * param:  proportional how much the correction should depend on the current
 *        error. This term usually provides the bulk of correction and should be positive or zero.
 *        A value too large would make the controller overshoot the setpoint, while a small value
 *        would make the controller too insensitive. The default value is 1.
 * param:  integral how much the correction should depend on the accumulation
 *        of past errors. This value should be positive or 0. This term accelerates the movement
 *        towards the desired value, but a large value may lead to overshooting. The default value
 *        is 0.2.
 * param:  derivative how much the correction should depend on a prediction
 *        of future errors, based on current rate of change. This value should be positive or 0.
 *        This term is not used very often, as it impacts stability of the system. The default
 *        value is 0.
 * param:  minRate what is the minimum rate that can be estimated.
 *        This must be greater than zero, so that the system always receives some data for rate
 *        estimation to work.
 */
  class PIDRateEstimator implements org.apache.spark.streaming.scheduler.rate.RateEstimator, org.apache.spark.internal.Logging {
  public   PIDRateEstimator (long batchIntervalMillis, double proportional, double integral, double derivative, double minRate)  { throw new RuntimeException(); }
  private  boolean firstRun ()  { throw new RuntimeException(); }
  private  long latestTime ()  { throw new RuntimeException(); }
  private  double latestRate ()  { throw new RuntimeException(); }
  private  double latestError ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> compute (long time, long numElements, long processingDelay, long schedulingDelay)  { throw new RuntimeException(); }
}
