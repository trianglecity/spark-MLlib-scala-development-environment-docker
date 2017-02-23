package org.apache.spark.ml.classification;
/**
 * MultiClassSummarizer computes the number of distinct labels and corresponding counts,
 * and validates the data to see if the labels used for k class multi-label classification
 * are in the range of {0, 1, ..., k - 1} in an online fashion.
 * <p>
 * Two MultilabelSummarizer can be merged together to have a statistical summary of the
 * corresponding joint dataset.
 */
  class MultiClassSummarizer implements scala.Serializable {
  public   MultiClassSummarizer ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, scala.Tuple2<java.lang.Object, java.lang.Object>> distinctMap ()  { throw new RuntimeException(); }
  private  long totalInvalidCnt ()  { throw new RuntimeException(); }
  /**
   * Add a new label into this MultilabelSummarizer, and update the distinct map.
   * <p>
   * @param label The label for this data point.
   * @param weight The weight of this instances.
   * @return This MultilabelSummarizer
   */
  public  org.apache.spark.ml.classification.MultiClassSummarizer add (double label, double weight)  { throw new RuntimeException(); }
  /**
   * Merge another MultilabelSummarizer, and update the distinct map.
   * (Note that it will merge the smaller distinct map into the larger one using in-place
   * merging, so either <code>this</code> or <code>other</code> object will be modified and returned.)
   * <p>
   * @param other The other MultilabelSummarizer to be merged.
   * @return Merged MultilabelSummarizer object.
   */
  public  org.apache.spark.ml.classification.MultiClassSummarizer merge (org.apache.spark.ml.classification.MultiClassSummarizer other)  { throw new RuntimeException(); }
  /** @return The total invalid input counts. */
  public  long countInvalid ()  { throw new RuntimeException(); }
  /** @return The number of distinct labels in the input dataset. */
  public  int numClasses ()  { throw new RuntimeException(); }
  /** @return The weightSum of each label in the input dataset. */
  public  double[] histogram ()  { throw new RuntimeException(); }
}
