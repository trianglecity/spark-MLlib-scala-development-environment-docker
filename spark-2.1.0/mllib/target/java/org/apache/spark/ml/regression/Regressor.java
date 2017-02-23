package org.apache.spark.ml.regression;
/**
 * Single-label regression
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., {@link org.apache.spark.mllib.linalg.Vector}
 * @tparam Learner  Concrete Estimator type
 * @tparam M  Concrete Model type
 */
 abstract class Regressor<FeaturesType extends java.lang.Object, Learner extends org.apache.spark.ml.regression.Regressor<FeaturesType, Learner, M>, M extends org.apache.spark.ml.regression.RegressionModel<FeaturesType, M>> extends org.apache.spark.ml.Predictor<FeaturesType, Learner, M> implements org.apache.spark.ml.PredictorParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.regression.Regressor), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("Learner"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.regression.RegressionModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   Regressor ()  { throw new RuntimeException(); }
}
