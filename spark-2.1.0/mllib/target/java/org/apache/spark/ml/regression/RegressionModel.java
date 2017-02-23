package org.apache.spark.ml.regression;
/**
 * :: DeveloperApi ::
 * <p>
 * Model produced by a {@link Regressor}.
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., {@link org.apache.spark.mllib.linalg.Vector}
 * @tparam M  Concrete Model type.
 */
public abstract class RegressionModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.regression.RegressionModel<FeaturesType, M>> extends org.apache.spark.ml.PredictionModel<FeaturesType, M> implements org.apache.spark.ml.PredictorParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.regression.RegressionModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   RegressionModel ()  { throw new RuntimeException(); }
}
