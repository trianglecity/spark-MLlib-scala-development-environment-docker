package org.apache.spark.ml.classification;
/**
 * :: DeveloperApi ::
 * <p>
 * Single-label binary or multiclass classification.
 * Classes are indexed {0, 1, ..., numClasses - 1}.
 * <p>
 * @tparam FeaturesType  Type of input features.  E.g., <code>Vector</code>
 * @tparam E  Concrete Estimator type
 * @tparam M  Concrete Model type
 */
public abstract class Classifier<FeaturesType extends java.lang.Object, E extends org.apache.spark.ml.classification.Classifier<FeaturesType, E, M>, M extends org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.Predictor<FeaturesType, E, M> implements org.apache.spark.ml.classification.ClassifierParams {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.Classifier), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("E"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ClassificationModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   Classifier ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  E setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Extract {@link labelCol} and {@link featuresCol} from the given dataset,
   * and put it in an RDD with strong types.
   * <p>
   * @param dataset  DataFrame with columns for labels ({@link org.apache.spark.sql.types.NumericType})
   *                 and features ({@link Vector}).
   * @param numClasses  Number of classes label can take.  Labels must be integers in the range
   *                    [0, numClasses).
   * @throws SparkException  if any label is not an integer >= 0
   * @return (undocumented)
   */
  protected  org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.LabeledPoint> extractLabeledPoints (org.apache.spark.sql.Dataset<?> dataset, int numClasses)  { throw new RuntimeException(); }
  /**
   * Get the number of classes.  This looks in column metadata first, and if that is missing,
   * then this assumes classes are indexed 0,1,...,numClasses-1 and computes numClasses
   * by finding the maximum label value.
   * <p>
   * Label validation (ensuring all labels are integers >= 0) needs to be handled elsewhere,
   * such as in {@link extractLabeledPoints()}.
   * <p>
   * @param dataset  Dataset which contains a column {@link labelCol}
   * @param maxNumClasses  Maximum number of classes allowed when inferred from data.  If numClasses
   *                       is specified in the metadata, then maxNumClasses is ignored.
   * @return  number of classes
   * @throws IllegalArgumentException  if metadata does not specify numClasses, and the
   *                                   actual numClasses exceeds maxNumClasses
   */
  protected  int getNumClasses (org.apache.spark.sql.Dataset<?> dataset, int maxNumClasses)  { throw new RuntimeException(); }
}
