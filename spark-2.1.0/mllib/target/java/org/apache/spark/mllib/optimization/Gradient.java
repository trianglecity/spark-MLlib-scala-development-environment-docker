package org.apache.spark.mllib.optimization;
/**
 * :: DeveloperApi ::
 * Class used to compute the gradient for a loss function, given a single data point.
 */
public abstract class Gradient implements scala.Serializable {
  public   Gradient ()  { throw new RuntimeException(); }
  /**
   * Compute the gradient and loss given the features of a single data point.
   * <p>
   * @param data features for one data point
   * @param label label for this data point
   * @param weights weights/coefficients corresponding to features
   * <p>
   * @return (gradient: Vector, loss: Double)
   */
  public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights)  { throw new RuntimeException(); }
  /**
   * Compute the gradient and loss given the features of a single data point,
   * add the gradient to a provided vector to avoid creating new objects, and return loss.
   * <p>
   * @param data features for one data point
   * @param label label for this data point
   * @param weights weights/coefficients corresponding to features
   * @param cumGradient the computed gradient will be added to this vector
   * <p>
   * @return loss
   */
  public abstract  double compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights, org.apache.spark.mllib.linalg.Vector cumGradient)  ;
}
