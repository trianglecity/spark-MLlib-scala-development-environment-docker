package org.apache.spark.mllib.random;
/**
 * :: DeveloperApi ::
 * Generates i.i.d. samples from the exponential distribution with the given mean.
 * <p>
 * param:  mean mean for the exponential distribution.
 */
public  class ExponentialGenerator implements org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> {
  public  double mean ()  { throw new RuntimeException(); }
  // not preceding
  public   ExponentialGenerator (double mean)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.distribution.ExponentialDistribution rng ()  { throw new RuntimeException(); }
  public  double nextValue ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.ExponentialGenerator copy ()  { throw new RuntimeException(); }
}
