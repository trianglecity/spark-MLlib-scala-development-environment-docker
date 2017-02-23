package org.apache.spark.mllib.random;
/**
 * :: DeveloperApi ::
 * Generates i.i.d. samples from the gamma distribution with the given shape and scale.
 * <p>
 * param:  shape shape for the gamma distribution.
 * param:  scale scale for the gamma distribution
 */
public  class GammaGenerator implements org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> {
  public  double shape ()  { throw new RuntimeException(); }
  public  double scale ()  { throw new RuntimeException(); }
  // not preceding
  public   GammaGenerator (double shape, double scale)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.distribution.GammaDistribution rng ()  { throw new RuntimeException(); }
  public  double nextValue ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.GammaGenerator copy ()  { throw new RuntimeException(); }
}
