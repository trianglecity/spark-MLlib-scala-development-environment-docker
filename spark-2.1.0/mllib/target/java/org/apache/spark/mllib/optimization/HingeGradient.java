package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Compute gradient and loss for a Hinge loss function, as used in SVM binary classification.
 * See also the documentation for the precise formulation.
 * <p>
 * @note This assumes that the labels are {0,1}
 */
public  class HingeGradient extends org.apache.spark.mllib.optimization.Gradient {
  public   HingeGradient ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights)  { throw new RuntimeException(); }
  public  double compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights, org.apache.spark.mllib.linalg.Vector cumGradient)  { throw new RuntimeException(); }
}
