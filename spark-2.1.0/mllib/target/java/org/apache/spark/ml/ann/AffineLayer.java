package org.apache.spark.ml.ann;
/**
 * Layer properties of affine transformations, that is y=A*x+b
 * <p>
 * param:  numIn number of inputs
 * param:  numOut number of outputs
 */
  class AffineLayer implements org.apache.spark.ml.ann.Layer {
  public  int numIn ()  { throw new RuntimeException(); }
  public  int numOut ()  { throw new RuntimeException(); }
  // not preceding
  public   AffineLayer (int numIn, int numOut)  { throw new RuntimeException(); }
  public  int weightSize ()  { throw new RuntimeException(); }
  public  int getOutputSize (int inputSize)  { throw new RuntimeException(); }
  public  boolean inPlace ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel createModel (breeze.linalg.DenseVector<java.lang.Object> weights)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel initModel (breeze.linalg.DenseVector<java.lang.Object> weights, java.util.Random random)  { throw new RuntimeException(); }
}
