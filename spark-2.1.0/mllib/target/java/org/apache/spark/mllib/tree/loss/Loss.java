package org.apache.spark.mllib.tree.loss;
/**
 * :: DeveloperApi ::
 * Trait for adding "pluggable" loss functions for the gradient boosting algorithm.
 */
public  interface Loss extends scala.Serializable {
  /**
   * Method to calculate the gradients for the gradient boosting calculation.
   * @param prediction Predicted feature
   * @param label true label.
   * @return Loss gradient.
   */
  public  double gradient (double prediction, double label)  ;
  /**
   * Method to calculate error of the base learner for the gradient boosting calculation.
   * <p>
   * @param model Model of the weak learner.
   * @param data Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return Measure of model error on data
   * <p>
   * @note This method is not used by the gradient boosting algorithm but is useful for debugging
   * purposes.
   */
  public  double computeError (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data)  ;
  /**
   * Method to calculate loss when the predictions are already known.
   * <p>
   * @param prediction Predicted label.
   * @param label True label.
   * @return Measure of model error on datapoint.
   * <p>
   * @note This method is used in the method evaluateEachIteration to avoid recomputing the
   * predicted values from previously fit trees.
   */
    double computeError (double prediction, double label)  ;
}
