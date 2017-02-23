package org.apache.spark.mllib.tree.loss;
/**
 * :: DeveloperApi ::
 * Class for absolute error loss calculation (for regression).
 * <p>
 * The absolute (L1) error is defined as:
 *  |y - F(x)|
 * where y is the label and F(x) is the model prediction for features x.
 */
public  class AbsoluteError {
  /**
   * Method to calculate the gradients for the gradient boosting calculation for least
   * absolute error calculation.
   * The gradient with respect to F(x) is: sign(F(x) - y)
   * @param prediction Predicted label.
   * @param label True label.
   * @return Loss gradient
   */
  static public  double gradient (double prediction, double label)  { throw new RuntimeException(); }
  static   double computeError (double prediction, double label)  { throw new RuntimeException(); }
}
