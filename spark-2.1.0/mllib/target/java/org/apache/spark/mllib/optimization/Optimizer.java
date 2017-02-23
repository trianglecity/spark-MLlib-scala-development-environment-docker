package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Trait for optimization problem solvers.
 */
public  interface Optimizer extends scala.Serializable {
  /**
   * Solve the provided convex optimization problem.
   * @param data (undocumented)
   * @param initialWeights (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector optimize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.linalg.Vector initialWeights)  ;
}
