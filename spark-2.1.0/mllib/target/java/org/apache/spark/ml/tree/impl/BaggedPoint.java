package org.apache.spark.ml.tree.impl;
/**
 * Internal representation of a datapoint which belongs to several subsamples of the same dataset,
 * particularly for bagging (e.g., for random forests).
 * <p>
 * This holds one instance, as well as an array of weights which represent the (weighted)
 * number of times which this instance appears in each subsamplingRate.
 * E.g., (datum, [1, 0, 4]) indicates that there are 3 subsamples of the dataset and that
 * this datum has 1 copy, 0 copies, and 4 copies in the 3 subsamples, respectively.
 * <p>
 * param:  datum  Data instance
 * param:  subsampleWeights  Weight of this instance in each subsampled dataset.
 * <p>
 * TODO: This does not currently support (Double) weighted instances.  Once MLlib has weighted
 *       dataset support, update.  (We store subsampleWeights as Double for this future extension.)
 */
  class BaggedPoint<Datum extends java.lang.Object> implements scala.Serializable {
  /**
   * Convert an input dataset into its BaggedPoint representation,
   * choosing subsamplingRate counts for each instance.
   * Each subsamplingRate has the same number of instances as the original dataset,
   * and is created by subsampling without replacement.
   * @param input Input dataset.
   * @param subsamplingRate Fraction of the training data used for learning decision tree.
   * @param numSubsamples Number of subsamples of this RDD to take.
   * @param withReplacement Sampling with/without replacement.
   * @param seed Random seed.
   * @return BaggedPoint dataset representation.
   */
  static public <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDD (org.apache.spark.rdd.RDD<Datum> input, double subsamplingRate, int numSubsamples, boolean withReplacement, long seed)  { throw new RuntimeException(); }
  static private <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDDSamplingWithoutReplacement (org.apache.spark.rdd.RDD<Datum> input, double subsamplingRate, int numSubsamples, long seed)  { throw new RuntimeException(); }
  static private <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDDSamplingWithReplacement (org.apache.spark.rdd.RDD<Datum> input, double subsample, int numSubsamples, long seed)  { throw new RuntimeException(); }
  static private <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDDWithoutSampling (org.apache.spark.rdd.RDD<Datum> input)  { throw new RuntimeException(); }
  public  Datum datum ()  { throw new RuntimeException(); }
  public  double[] subsampleWeights ()  { throw new RuntimeException(); }
  // not preceding
  public   BaggedPoint (Datum datum, double[] subsampleWeights)  { throw new RuntimeException(); }
}
