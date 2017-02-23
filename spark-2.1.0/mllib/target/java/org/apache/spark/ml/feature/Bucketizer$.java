package org.apache.spark.ml.feature;
public  class Bucketizer$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.Bucketizer>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Bucketizer$ MODULE$ = null;
  public   Bucketizer$ ()  { throw new RuntimeException(); }
    java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
    java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
    java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
    java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  /**
   * We require splits to be of length >= 3 and to be in strictly increasing order.
   * No NaN split should be accepted.
   * @param splits (undocumented)
   * @return (undocumented)
   */
    boolean checkSplits (double[] splits)  { throw new RuntimeException(); }
  /**
   * Binary searching in several buckets to place each data point.
   * @param splits array of split points
   * @param feature data point
   * @param keepInvalid NaN flag.
   *                    Set "true" to make an extra bucket for NaN values;
   *                    Set "false" to report an error for NaN values
   * @return bucket for each data point
   * @throws SparkException if a feature is < splits.head or > splits.last
   */
    double binarySearchForBuckets (double[] splits, double feature, boolean keepInvalid)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Bucketizer load (java.lang.String path)  { throw new RuntimeException(); }
}
