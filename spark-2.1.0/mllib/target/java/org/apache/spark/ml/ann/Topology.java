package org.apache.spark.ml.ann;
/**
 * Trait for the artificial neural network (ANN) topology properties
 */
  interface Topology extends scala.Serializable {
  public  org.apache.spark.ml.ann.TopologyModel model (org.apache.spark.ml.linalg.Vector weights)  ;
  public  org.apache.spark.ml.ann.TopologyModel model (long seed)  ;
}
