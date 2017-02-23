package org.apache.spark.mllib.tree.loss;
/**
 * :: DeveloperApi ::
 * Class for squared error loss calculation.
 * <p>
 * The squared (L2) error is defined as:
 *   (y - F(x))**2
 * where y is the label and F(x) is the model prediction for features x.
 */
public  class SquaredError {
  /**
   * Method to calculate the gradients for the gradient boosting calculation for least
   * squares error calculation.
   * The gradient with respect to F(x) is: - 2 (y - F(x))
   * @param prediction Predicted label.
   * @param label True label.
   * @return Loss gradient
   */
  static public  double gradient (double prediction, double label)  { throw new RuntimeException(); }
  static   double computeError (double prediction, double label)  { throw new RuntimeException(); }
}
