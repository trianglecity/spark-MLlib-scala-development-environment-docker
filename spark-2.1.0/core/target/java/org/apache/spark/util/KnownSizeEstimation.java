package org.apache.spark.util;
/**
 * A trait that allows a class to give {@link SizeEstimator} more accurate size estimation.
 * When a class extends it, {@link SizeEstimator} will query the <code>estimatedSize</code> first.
 * If <code>estimatedSize</code> does not return {@link None}, {@link SizeEstimator} will use the returned size
 * as the size of the object. Otherwise, {@link SizeEstimator} will do the estimation work.
 * The difference between a {@link KnownSizeEstimation} and
 * {@link org.apache.spark.util.collection.SizeTracker} is that, a
 * {@link org.apache.spark.util.collection.SizeTracker} still uses {@link SizeEstimator} to
 * estimate the size. However, a {@link KnownSizeEstimation} can provide a better estimation without
 * using {@link SizeEstimator}.
 */
  interface KnownSizeEstimation {
  public  long estimatedSize ()  ;
}
