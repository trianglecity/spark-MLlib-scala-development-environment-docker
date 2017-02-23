package org.apache.spark.util.collection;
/**
 * A general interface for collections to keep track of their estimated sizes in bytes.
 * We sample with a slow exponential back-off using the SizeEstimator to amortize the time,
 * as each call to SizeEstimator is somewhat expensive (order of a few milliseconds).
 */
  interface SizeTracker {
  static public  class Sample implements scala.Product, scala.Serializable {
    public  long size ()  { throw new RuntimeException(); }
    public  long numUpdates ()  { throw new RuntimeException(); }
    // not preceding
    public   Sample (long size, long numUpdates)  { throw new RuntimeException(); }
  }
  static public  class Sample$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.util.collection.SizeTracker.Sample> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Sample$ MODULE$ = null;
    public   Sample$ ()  { throw new RuntimeException(); }
  }
  /**
   * Controls the base of the exponential which governs the rate of sampling.
   * E.g., a value of 2 would mean we sample at 1, 2, 4, 8, ... elements.
   * @return (undocumented)
   */
  public  double SAMPLE_GROWTH_RATE ()  ;
  /** Samples taken since last resetSamples(). Only the last two are kept for extrapolation. */
  public  scala.collection.mutable.Queue<org.apache.spark.util.collection.SizeTracker.Sample> samples ()  ;
  /** The average number of bytes per update between our last two samples. */
  public  double bytesPerUpdate ()  ;
  /** Total number of insertions and updates into the map since the last resetSamples(). */
  public  long numUpdates ()  ;
  /** The value of 'numUpdates' at which we will take our next sample. */
  public  long nextSampleNum ()  ;
  /**
   * Reset samples collected so far.
   * This should be called after the collection undergoes a dramatic change in size.
   */
  public  void resetSamples ()  ;
  /**
   * Callback to be invoked after every update.
   */
  public  void afterUpdate ()  ;
  /**
   * Take a new sample of the current collection's size.
   */
  public  void takeSample ()  ;
  /**
   * Estimate the current size of the collection in bytes. O(1) time.
   * @return (undocumented)
   */
  public  long estimateSize ()  ;
}
