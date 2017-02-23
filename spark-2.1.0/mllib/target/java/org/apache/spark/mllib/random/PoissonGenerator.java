package org.apache.spark.mllib.random;
/**
 * :: DeveloperApi ::
 * Generates i.i.d. samples from the Poisson distribution with the given mean.
 * <p>
 * param:  mean mean for the Poisson distribution.
 */
public  class PoissonGenerator implements org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> {
  public  double mean ()  { throw new RuntimeException(); }
  // not preceding
  public   PoissonGenerator (double mean)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.distribution.PoissonDistribution rng ()  { throw new RuntimeException(); }
  public  double nextValue ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.PoissonGenerator copy ()  { throw new RuntimeException(); }
}
