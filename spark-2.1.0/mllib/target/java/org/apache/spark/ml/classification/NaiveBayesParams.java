package org.apache.spark.ml.classification;
/**
 * Params for Naive Bayes Classifiers.
 */
  interface NaiveBayesParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.param.shared.HasWeightCol {
  /**
   * The smoothing parameter.
   * (default = 1.0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam smoothing ()  ;
  /** @group getParam */
  public  double getSmoothing ()  ;
  /**
   * The model type which is a string (case-sensitive).
   * Supported options: "multinomial" and "bernoulli".
   * (default = multinomial)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> modelType ()  ;
  /** @group getParam */
  public  java.lang.String getModelType ()  ;
}
