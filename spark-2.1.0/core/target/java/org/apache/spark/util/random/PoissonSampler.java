package org.apache.spark.util.random;
/**
 * :: DeveloperApi ::
 * A sampler for sampling with replacement, based on values drawn from Poisson distribution.
 * <p>
 * param:  fraction the sampling fraction (with replacement)
 * param:  useGapSamplingIfPossible if true, use gap sampling when sampling ratio is low.
 * @tparam T item type
 */
public  class PoissonSampler<T extends java.lang.Object> implements org.apache.spark.util.random.RandomSampler<T, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PoissonSampler (double fraction, boolean useGapSamplingIfPossible)  { throw new RuntimeException(); }
  public   PoissonSampler (double fraction)  { throw new RuntimeException(); }
  private  org.apache.commons.math3.distribution.PoissonDistribution rng ()  { throw new RuntimeException(); }
  private  java.util.Random rngGap ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
  private  org.apache.spark.util.random.GapSamplingReplacement gapSamplingReplacement ()  { throw new RuntimeException(); }
  public  int sample ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> sample (scala.collection.Iterator<T> items)  { throw new RuntimeException(); }
  public  org.apache.spark.util.random.PoissonSampler<T> clone ()  { throw new RuntimeException(); }
}
