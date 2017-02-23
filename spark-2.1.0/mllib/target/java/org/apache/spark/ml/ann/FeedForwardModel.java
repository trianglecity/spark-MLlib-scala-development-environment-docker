package org.apache.spark.ml.ann;
/**
 * Model of Feed Forward Neural Network.
 * Implements forward, gradient computation and can return weights in vector format.
 * <p>
 * param:  weights network weights
 * param:  topology network topology
 */
  class FeedForwardModel implements org.apache.spark.ml.ann.TopologyModel {
  /**
   * Creates a model from a topology and weights
   * <p>
   * @param topology topology
   * @param weights weights
   * @return model
   */
  static public  org.apache.spark.ml.ann.FeedForwardModel apply (org.apache.spark.ml.ann.FeedForwardTopology topology, org.apache.spark.ml.linalg.Vector weights)  { throw new RuntimeException(); }
  /**
   * Creates a model given a topology and seed
   * <p>
   * @param topology topology
   * @param seed seed for generating the weights
   * @return model
   */
  static public  org.apache.spark.ml.ann.FeedForwardModel apply (org.apache.spark.ml.ann.FeedForwardTopology topology, long seed)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector weights ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.FeedForwardTopology topology ()  { throw new RuntimeException(); }
  // not preceding
  private   FeedForwardModel (org.apache.spark.ml.linalg.Vector weights, org.apache.spark.ml.ann.FeedForwardTopology topology)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.Layer[] layers ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel[] layerModels ()  { throw new RuntimeException(); }
  private  int offset ()  { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object>[] outputs ()  { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object>[] deltas ()  { throw new RuntimeException(); }
  public  breeze.linalg.DenseMatrix<java.lang.Object>[] forward (breeze.linalg.DenseMatrix<java.lang.Object> data)  { throw new RuntimeException(); }
  public  double computeGradient (breeze.linalg.DenseMatrix<java.lang.Object> data, breeze.linalg.DenseMatrix<java.lang.Object> target, org.apache.spark.ml.linalg.Vector cumGradient, int realBatchSize)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predict (org.apache.spark.ml.linalg.Vector data)  { throw new RuntimeException(); }
}
