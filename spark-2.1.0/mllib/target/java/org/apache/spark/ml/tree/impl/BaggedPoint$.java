package org.apache.spark.ml.tree.impl;
public  class BaggedPoint$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BaggedPoint$ MODULE$ = null;
  public   BaggedPoint$ ()  { throw new RuntimeException(); }
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
  public <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDD (org.apache.spark.rdd.RDD<Datum> input, double subsamplingRate, int numSubsamples, boolean withReplacement, long seed)  { throw new RuntimeException(); }
  private <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDDSamplingWithoutReplacement (org.apache.spark.rdd.RDD<Datum> input, double subsamplingRate, int numSubsamples, long seed)  { throw new RuntimeException(); }
  private <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDDSamplingWithReplacement (org.apache.spark.rdd.RDD<Datum> input, double subsample, int numSubsamples, long seed)  { throw new RuntimeException(); }
  private <Datum extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<Datum>> convertToBaggedRDDWithoutSampling (org.apache.spark.rdd.RDD<Datum> input)  { throw new RuntimeException(); }
}
