package org.apache.spark.ml;
/**
 * :: DeveloperApi ::
 * Abstraction for a model for prediction tasks (regression and classification).
 * <p>
 * @tparam FeaturesType  Type of features.
 *                       E.g., {@link org.apache.spark.mllib.linalg.VectorUDT} for vector features.
 * @tparam M  Specialization of {@link PredictionModel}.  If you subclass this type, use this type
 *            parameter to specify the concrete type for the corresponding model.
 */
public abstract class PredictionModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.PredictionModel<FeaturesType, M>> extends org.apache.spark.ml.Model<M> implements org.apache.spark.ml.PredictorParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.PredictionModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   PredictionModel ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  M setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  M setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** Returns the number of features the model was trained on. If unknown, returns -1 */
  public  int numFeatures ()  { throw new RuntimeException(); }
  /**
   * Returns the SQL DataType corresponding to the FeaturesType type parameter.
   * <p>
   * This is used by {@link validateAndTransformSchema()}.
   * This workaround is needed since SQL has different APIs for Scala and Java.
   * <p>
   * The default value is VectorUDT, but it may be overridden if FeaturesType is not Vector.
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.types.DataType featuresDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Transforms dataset by reading from {@link featuresCol}, calling <code>predict</code>, and storing
   * the predictions as a new column {@link predictionCol}.
   * <p>
   * @param dataset input dataset
   * @return transformed dataset with {@link predictionCol} of type {@link Double}
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transformImpl (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Predict label for the given features.
   * This internal method is used to implement {@link transform()} and output {@link predictionCol}.
   * @param features (undocumented)
   * @return (undocumented)
   */
  protected abstract  double predict (FeaturesType features)  ;
}
