package org.apache.spark.ml.ann;
/**
 * Trait for ANN topology model
 */
  interface TopologyModel extends scala.Serializable {
  public  org.apache.spark.ml.linalg.Vector weights ()  ;
  /**
   * Array of layers
   * @return (undocumented)
   */
  public  org.apache.spark.ml.ann.Layer[] layers ()  ;
  /**
   * Array of layer models
   * @return (undocumented)
   */
  public  org.apache.spark.ml.ann.LayerModel[] layerModels ()  ;
  /**
   * Forward propagation
   * <p>
   * @param data input data
   * @return array of outputs for each of the layers
   */
  public  breeze.linalg.DenseMatrix<java.lang.Object>[] forward (breeze.linalg.DenseMatrix<java.lang.Object> data)  ;
  /**
   * Prediction of the model
   * <p>
   * @param data input data
   * @return prediction
   */
  public  org.apache.spark.ml.linalg.Vector predict (org.apache.spark.ml.linalg.Vector data)  ;
  /**
   * Computes gradient for the network
   * <p>
   * @param data input data
   * @param target target output
   * @param cumGradient cumulative gradient
   * @param blockSize block size
   * @return error
   */
  public  double computeGradient (breeze.linalg.DenseMatrix<java.lang.Object> data, breeze.linalg.DenseMatrix<java.lang.Object> target, org.apache.spark.ml.linalg.Vector cumGradient, int blockSize)  ;
}
