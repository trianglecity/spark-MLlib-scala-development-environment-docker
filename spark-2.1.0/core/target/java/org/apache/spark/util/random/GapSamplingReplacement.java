package org.apache.spark.util.random;
/** advance to first sample as part of object construction. */
  class GapSamplingReplacement implements scala.Serializable {
  public  double f ()  { throw new RuntimeException(); }
  public  java.util.Random rng ()  { throw new RuntimeException(); }
  // not preceding
  public   GapSamplingReplacement (double f, java.util.Random rng, double epsilon)  { throw new RuntimeException(); }
  protected  double q ()  { throw new RuntimeException(); }
  /**
   * Sample from Poisson distribution, conditioned such that the sampled value is >= 1.
   * This is an adaptation from the algorithm for Generating Poisson distributed random variables:
   * http://en.wikipedia.org/wiki/Poisson_distribution
   * @return (undocumented)
   */
  protected  int poissonGE1 ()  { throw new RuntimeException(); }
  private  int countForDropping ()  { throw new RuntimeException(); }
  public  int sample ()  { throw new RuntimeException(); }
  /**
   * Skip elements with replication factor zero (i.e. elements that won't be sampled).
   * Samples 'k' from geometric distribution  P(k) = (1-q)(q)^k, where q = e^(-f), that is
   * q is the probability of Poisson(0; f)
   */
  private  void advance ()  { throw new RuntimeException(); }
}
