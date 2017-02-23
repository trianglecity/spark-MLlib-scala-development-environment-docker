package org.apache.spark.ml.feature;
/**
 * This class performs on-the-fly one-hot encoding of features as you iterate over them. To
 * indicate which input features should be one-hot encoded, an array of the feature counts
 * must be passed in ahead of time.
 * <p>
 * param:  numFeatures Array of feature counts for each input feature. For nominal features this
 *                    count is equal to the number of categories. For numeric features the count
 *                    should be set to 1.
 */
  class FeatureEncoder implements scala.Serializable {
  public   FeatureEncoder (int[] numFeatures)  { throw new RuntimeException(); }
  /** The size of the output vector. */
  public  int outputSize ()  { throw new RuntimeException(); }
  /** Precomputed offsets for the location of each output feature. */
  private  int[] outputOffsets ()  { throw new RuntimeException(); }
  /**
   * Given an input row of features, invokes the specific function for every non-zero output.
   * <p>
   * @param value The row value to encode, either a Double or Vector.
   * @param f The callback to invoke on each non-zero (index, value) output pair.
   */
  public  void foreachNonzeroOutput (Object value, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
