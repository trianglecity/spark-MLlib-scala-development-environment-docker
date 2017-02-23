package org.apache.spark.mllib.tree.impurity;
/**
 * Interface for updating views of a vector of sufficient statistics,
 * in order to compute impurity from a sample.
 * Note: Instances of this class do not hold the data; they operate on views of the data.
 * param:  statsSize  Length of the vector of sufficient statistics for one bin.
 */
 abstract class ImpurityAggregator implements scala.Serializable {
  public  int statsSize ()  { throw new RuntimeException(); }
  // not preceding
  public   ImpurityAggregator (int statsSize)  { throw new RuntimeException(); }
  /**
   * Merge the stats from one bin into another.
   * @param allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
   * @param offset    Start index of stats for (node, feature, bin) which is modified by the merge.
   * @param otherOffset  Start index of stats for (node, feature, other bin) which is not modified.
   */
  public  void merge (double[] allStats, int offset, int otherOffset)  { throw new RuntimeException(); }
  /**
   * Update stats for one (node, feature, bin) with the given label.
   * @param allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
   * @param offset    Start index of stats for this (node, feature, bin).
   * @param label (undocumented)
   * @param instanceWeight (undocumented)
   */
  public abstract  void update (double[] allStats, int offset, double label, double instanceWeight)  ;
  /**
   * Get an {@link ImpurityCalculator} for a (node, feature, bin).
   * @param allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
   * @param offset    Start index of stats for this (node, feature, bin).
   * @return (undocumented)
   */
  public abstract  org.apache.spark.mllib.tree.impurity.ImpurityCalculator getCalculator (double[] allStats, int offset)  ;
}
