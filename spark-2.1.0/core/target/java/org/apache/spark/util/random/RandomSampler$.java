package org.apache.spark.util.random;
public  class RandomSampler$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomSampler$ MODULE$ = null;
  public   RandomSampler$ ()  { throw new RuntimeException(); }
  /** Default random number generator used by random samplers. */
  public  java.util.Random newDefaultRNG ()  { throw new RuntimeException(); }
  /**
   * Default maximum gap-sampling fraction.
   * For sampling fractions <= this value, the gap sampling optimization will be applied.
   * Above this value, it is assumed that "traditional" Bernoulli sampling is faster.  The
   * optimal value for this will depend on the RNG.  More expensive RNGs will tend to make
   * the optimal value higher.  The most reliable way to determine this value for a new RNG
   * is to experiment.  When tuning for a new RNG, I would expect a value of 0.5 to be close
   * in most cases, as an initial guess.
   * @return (undocumented)
   */
  public  double defaultMaxGapSamplingFraction ()  { throw new RuntimeException(); }
  /**
   * Default epsilon for floating point numbers sampled from the RNG.
   * The gap-sampling compute logic requires taking log(x), where x is sampled from an RNG.
   * To guard against errors from taking log(0), a positive epsilon lower bound is applied.
   * A good value for this parameter is at or near the minimum positive floating
   * point value returned by "nextDouble()" (or equivalent), for the RNG being used.
   * @return (undocumented)
   */
  public  double rngEpsilon ()  { throw new RuntimeException(); }
  /**
   * Sampling fraction arguments may be results of computation, and subject to floating
   * point jitter.  I check the arguments with this epsilon slop factor to prevent spurious
   * warnings for cases such as summing some numbers to get a sampling fraction of 1.000000001
   * @return (undocumented)
   */
  public  double roundingEpsilon ()  { throw new RuntimeException(); }
}
