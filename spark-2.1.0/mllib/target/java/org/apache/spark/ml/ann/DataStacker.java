package org.apache.spark.ml.ann;
/**
 * Stacks pairs of training samples (input, output) in one vector allowing them to pass
 * through Optimizer/Gradient interfaces. If stackSize is more than one, makes blocks
 * or matrices of inputs and outputs and then stack them in one vector.
 * This can be used for further batch computations after unstacking.
 * <p>
 * param:  stackSize stack size
 * param:  inputSize size of the input vectors
 * param:  outputSize size of the output vectors
 */
  class DataStacker implements scala.Serializable {
  public   DataStacker (int stackSize, int inputSize, int outputSize)  { throw new RuntimeException(); }
  /**
   * Stacks the data
   * <p>
   * @param data RDD of vector pairs
   * @return RDD of double (always zero) and vector that contains the stacked vectors
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.ml.linalg.Vector>> stack (org.apache.spark.rdd.RDD<scala.Tuple2<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector>> data)  { throw new RuntimeException(); }
  /**
   * Unstack the stacked vectors into matrices for batch operations
   * <p>
   * @param data stacked vector
   * @return pair of matrices holding input and output data and the real stack size
   */
  public  scala.Tuple3<breeze.linalg.DenseMatrix<java.lang.Object>, breeze.linalg.DenseMatrix<java.lang.Object>, java.lang.Object> unstack (org.apache.spark.ml.linalg.Vector data)  { throw new RuntimeException(); }
}
