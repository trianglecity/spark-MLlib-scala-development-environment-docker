package org.apache.spark.ml.ann;
/**
 * Factory for some of the frequently-used topologies
 */
public  class FeedForwardTopology$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FeedForwardTopology$ MODULE$ = null;
  public   FeedForwardTopology$ ()  { throw new RuntimeException(); }
  /**
   * Creates a feed forward topology from the array of layers
   * <p>
   * @param layers array of layers
   * @return feed forward topology
   */
  public  org.apache.spark.ml.ann.FeedForwardTopology apply (org.apache.spark.ml.ann.Layer[] layers)  { throw new RuntimeException(); }
  /**
   * Creates a multi-layer perceptron
   * <p>
   * @param layerSizes sizes of layers including input and output size
   * @param softmaxOnTop whether to use SoftMax or Sigmoid function for an output layer.
   *                Softmax is default
   * @return multilayer perceptron topology
   */
  public  org.apache.spark.ml.ann.FeedForwardTopology multiLayerPerceptron (int[] layerSizes, boolean softmaxOnTop)  { throw new RuntimeException(); }
}
