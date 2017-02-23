package org.apache.spark.examples.ml;
/**
 * Example of defining a parameter trait for a user-defined type of {@link Classifier}.
 * <p>
 * NOTE: This is private since it is an example. In practice, you may not want it to be private.
 */
public  interface MyLogisticRegressionParams extends org.apache.spark.ml.classification.ClassifierParams {
  /**
   * Param for max number of iterations
   * <p>
   * NOTE: The usual way to add a parameter to a model or algorithm is to include:
   *   - val myParamName: ParamType
   *   - def getMyParamName
   *   - def setMyParamName
   * Here, we have a trait to be mixed in with the Estimator and Model (MyLogisticRegression
   * and MyLogisticRegressionModel). We place the setter (setMaxIter) method in the Estimator
   * class since the maxIter parameter is only used during training (not in the Model).
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxIter ()  ;
  public  int getMaxIter ()  ;
}
