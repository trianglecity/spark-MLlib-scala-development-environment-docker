package org.apache.spark.mllib.random;
/**
 * :: DeveloperApi ::
 * Generates i.i.d. samples from the Weibull distribution with the
 * given shape and scale parameter.
 * <p>
 * param:  alpha shape parameter for the Weibull distribution.
 * param:  beta scale parameter for the Weibull distribution.
 */
public  class WeibullGenerator implements org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> {
  public  double alpha ()  { throw new RuntimeException(); }
  public  double beta ()  { throw new RuntimeException(); }
  // not preceding
  public   WeibullGenerator (double alpha, double beta)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.distribution.WeibullDistribution rng ()  { throw new RuntimeException(); }
  public  double nextValue ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.random.WeibullGenerator copy ()  { throw new RuntimeException(); }
}
