package org.apache.spark.ml.classification;
/**
 * Params for {@link OneVsRest}.
 */
  interface OneVsRestParams extends org.apache.spark.ml.PredictorParams, org.apache.spark.ml.classification.ClassifierTypeTrait {
  /**
   * param for the base binary classifier that we reduce multiclass classification into.
   * The base classifier input and output columns are ignored in favor of
   * the ones specified in {@link OneVsRest}.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.classification.Classifier<?, ? extends org.apache.spark.ml.classification.Classifier<java.lang.Object, org.apache.spark.ml.classification.Classifier, org.apache.spark.ml.classification.ClassificationModel>, ? extends org.apache.spark.ml.classification.ClassificationModel<java.lang.Object, org.apache.spark.ml.classification.ClassificationModel>>> classifier ()  ;
  /** @group getParam */
  public  org.apache.spark.ml.classification.Classifier<?, ? extends org.apache.spark.ml.classification.Classifier<java.lang.Object, org.apache.spark.ml.classification.Classifier, org.apache.spark.ml.classification.ClassificationModel>, ? extends org.apache.spark.ml.classification.ClassificationModel<java.lang.Object, org.apache.spark.ml.classification.ClassificationModel>> getClassifier ()  ;
}
