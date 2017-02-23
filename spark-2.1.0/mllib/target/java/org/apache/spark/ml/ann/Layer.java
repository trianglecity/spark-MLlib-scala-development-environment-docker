package org.apache.spark.ml.ann;
/**
 * Trait that holds Layer properties, that are needed to instantiate it.
 * Implements Layer instantiation.
 * <p>
 */
  interface Layer extends scala.Serializable {
  /**
   * Number of weights that is used to allocate memory for the weights vector
   * @return (undocumented)
   */
  public  int weightSize ()  ;
  /**
   * Returns the output size given the input size (not counting the stack size).
   * Output size is used to allocate memory for the output.
   * <p>
   * @param inputSize input size
   * @return output size
   */
  public  int getOutputSize (int inputSize)  ;
  /**
   * If true, the memory is not allocated for the output of this layer.
   * The memory allocated to the previous layer is used to write the output of this layer.
   * Developer can set this to true if computing delta of a previous layer
   * does not involve its output, so the current layer can write there.
   * This also mean that both layers have the same number of outputs.
   * @return (undocumented)
   */
  public  boolean inPlace ()  ;
  /**
   * Returns the instance of the layer based on weights provided.
   * Size of weights must be equal to weightSize
   * <p>
   * @param initialWeights vector with layer weights
   * @return the layer model
   */
  public  org.apache.spark.ml.ann.LayerModel createModel (breeze.linalg.DenseVector<java.lang.Object> initialWeights)  ;
  /**
   * Returns the instance of the layer with random generated weights.
   * <p>
   * @param weights vector for weights initialization, must be equal to weightSize
   * @param random random number generator
   * @return the layer model
   */
  public  org.apache.spark.ml.ann.LayerModel initModel (breeze.linalg.DenseVector<java.lang.Object> weights, java.util.Random random)  ;
}
