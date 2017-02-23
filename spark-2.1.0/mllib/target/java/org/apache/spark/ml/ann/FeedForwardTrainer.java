package org.apache.spark.ml.ann;
/**
 * MLlib-style trainer class that trains a network given the data and topology
 * <p>
 * param:  topology topology of ANN
 * param:  inputSize input size
 * param:  outputSize output size
 */
  class FeedForwardTrainer implements scala.Serializable {
  public  int inputSize ()  { throw new RuntimeException(); }
  public  int outputSize ()  { throw new RuntimeException(); }
  // not preceding
  public   FeedForwardTrainer (org.apache.spark.ml.ann.Topology topology, int inputSize, int outputSize)  { throw new RuntimeException(); }
  private  long _seed ()  { throw new RuntimeException(); }
  private  org.apache.spark.ml.linalg.Vector _weights ()  { throw new RuntimeException(); }
  private  int _stackSize ()  { throw new RuntimeException(); }
  private  org.apache.spark.ml.ann.DataStacker dataStacker ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.Gradient _gradient ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.Updater _updater ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.Optimizer optimizer ()  { throw new RuntimeException(); }
  /**
   * Returns seed
   * @return (undocumented)
   */
  public  long getSeed ()  { throw new RuntimeException(); }
  /**
   * Sets seed
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.ann.FeedForwardTrainer setSeed (long value)  { throw new RuntimeException(); }
  /**
   * Returns weights
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector getWeights ()  { throw new RuntimeException(); }
  /**
   * Sets weights
   * <p>
   * @param value weights
   * @return trainer
   */
  public  org.apache.spark.ml.ann.FeedForwardTrainer setWeights (org.apache.spark.ml.linalg.Vector value)  { throw new RuntimeException(); }
  /**
   * Sets the stack size
   * <p>
   * @param value stack size
   * @return trainer
   */
  public  org.apache.spark.ml.ann.FeedForwardTrainer setStackSize (int value)  { throw new RuntimeException(); }
  /**
   * Sets the SGD optimizer
   * <p>
   * @return SGD optimizer
   */
  public  org.apache.spark.mllib.optimization.GradientDescent SGDOptimizer ()  { throw new RuntimeException(); }
  /**
   * Sets the LBFGS optimizer
   * <p>
   * @return LBGS optimizer
   */
  public  org.apache.spark.mllib.optimization.LBFGS LBFGSOptimizer ()  { throw new RuntimeException(); }
  /**
   * Sets the updater
   * <p>
   * @param value updater
   * @return trainer
   */
  public  org.apache.spark.ml.ann.FeedForwardTrainer setUpdater (org.apache.spark.mllib.optimization.Updater value)  { throw new RuntimeException(); }
  /**
   * Sets the gradient
   * <p>
   * @param value gradient
   * @return trainer
   */
  public  org.apache.spark.ml.ann.FeedForwardTrainer setGradient (org.apache.spark.mllib.optimization.Gradient value)  { throw new RuntimeException(); }
  private  void updateGradient (org.apache.spark.mllib.optimization.Gradient gradient)  { throw new RuntimeException(); }
  private  void updateUpdater (org.apache.spark.mllib.optimization.Updater updater)  { throw new RuntimeException(); }
  /**
   * Trains the ANN
   * <p>
   * @param data RDD of input and output vector pairs
   * @return model
   */
  public  org.apache.spark.ml.ann.TopologyModel train (org.apache.spark.rdd.RDD<scala.Tuple2<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector>> data)  { throw new RuntimeException(); }
}
