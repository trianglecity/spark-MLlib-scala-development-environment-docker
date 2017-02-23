package org.apache.spark.mllib.tree.impurity;
/**
 * Trait for calculating information gain.
 * This trait is used for
 *  (a) setting the impurity parameter in {@link org.apache.spark.mllib.tree.configuration.Strategy}
 *  (b) calculating impurity values from sufficient statistics.
 */
public  interface Impurity extends scala.Serializable {
  /**
   * :: DeveloperApi ::
   * information calculation for multiclass classification
   * @param counts Array[Double] with counts for each label
   * @param totalCount sum of counts for all labels
   * @return information value, or 0 if totalCount = 0
   */
  public  double calculate (double[] counts, double totalCount)  ;
  /**
   * :: DeveloperApi ::
   * information calculation for regression
   * @param count number of instances
   * @param sum sum of labels
   * @param sumSquares summation of squares of the labels
   * @return information value, or 0 if count = 0
   */
  public  double calculate (double count, double sum, double sumSquares)  ;
}
