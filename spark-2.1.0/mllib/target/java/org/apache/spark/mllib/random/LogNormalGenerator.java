package org.apache.spark.mllib.random;
/**
 * :: DeveloperApi ::
 * Generates i.i.d. samples from the log normal distribution with the
 * given mean and standard deviation.
 * <p>
 * param:  mean mean for the log normal distribution.
 * param:  std standard deviation for the log normal distribution
 */
public  class LogNormalGenerator implements org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> {
  public  double mean ()  { throw new RuntimeException(); }
  public  double std ()  { throw new RuntimeException(); }
  // not preceding
  public   LogNormalGenerator (double mean, double std)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.distribution.LogNormalDistribution rng ()  { throw new RuntimeException(); }
  public  double nextValue ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.LogNormalGenerator copy ()  { throw new RuntimeException(); }
}
