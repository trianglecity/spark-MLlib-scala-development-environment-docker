package org.apache.spark.util.random;
/**
 * :: DeveloperApi ::
 * A sampler based on Bernoulli trials for partitioning a data sequence.
 * <p>
 * param:  lb lower bound of the acceptance range
 * param:  ub upper bound of the acceptance range
 * param:  complement whether to use the complement of the range specified, default to false
 * @tparam T item type
 */
public  class BernoulliCellSampler<T extends java.lang.Object> implements org.apache.spark.util.random.RandomSampler<T, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BernoulliCellSampler (double lb, double ub, boolean complement)  { throw new RuntimeException(); }
  private  java.util.Random rng ()  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
  public  int sample ()  { throw new RuntimeException(); }
  /**
   *  Return a sampler that is the complement of the range specified of the current sampler.
   * @return (undocumented)
   */
  public  org.apache.spark.util.random.BernoulliCellSampler<T> cloneComplement ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.random.BernoulliCellSampler<T> clone ()  { throw new RuntimeException(); }
}
