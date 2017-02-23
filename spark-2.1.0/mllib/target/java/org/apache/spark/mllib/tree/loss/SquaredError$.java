package org.apache.spark.mllib.tree.loss;
/**
 * :: DeveloperApi ::
 * Class for squared error loss calculation.
 * <p>
 * The squared (L2) error is defined as:
 *   (y - F(x))**2
 * where y is the label and F(x) is the model prediction for features x.
 */
public  class SquaredError$ implements org.apache.spark.mllib.tree.loss.Loss {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SquaredError$ MODULE$ = null;
  public   SquaredError$ ()  { throw new RuntimeException(); }
  /**
   * Method to calculate the gradients for the gradient boosting calculation for least
   * squares error calculation.
   * The gradient with respect to F(x) is: - 2 (y - F(x))
   * @param prediction Predicted label.
   * @param label True label.
   * @return Loss gradient
   */
  public  double gradient (double prediction, double label)  { throw new RuntimeException(); }
    double computeError (double prediction, double label)  { throw new RuntimeException(); }
}
