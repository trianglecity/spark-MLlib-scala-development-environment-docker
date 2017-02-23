package org.apache.spark.ml.regression;
/**
 * :: Experimental ::
 * Summary of {@link GeneralizedLinearRegression} model and predictions.
 * <p>
 * param:  dataset Dataset to be summarized.
 * param:  origModel Model to be summarized.  This is copied to create an internal
 *                  model which cannot be modified from outside.
 */
public  class GeneralizedLinearRegressionSummary implements scala.Serializable {
     GeneralizedLinearRegressionSummary (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.regression.GeneralizedLinearRegressionModel origModel)  { throw new RuntimeException(); }
  /**
   * Field in "predictions" which gives the predicted value of each instance.
   * This is set to a new column name if the original model's <code>predictionCol</code> is not set.
   * @return (undocumented)
   */
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  /**
   * Private copy of model to ensure Params are not modified outside this class.
   * Coefficients is not a deep copy, but that is acceptable.
   * <p>
   * @note {@link predictionCol} must be set correctly before the value of {@link model} is set,
   * and {@link model} must be set before {@link predictions} is set!
   * @return (undocumented)
   */
  protected  org.apache.spark.ml.regression.GeneralizedLinearRegressionModel model ()  { throw new RuntimeException(); }
  /**
   * Predictions output by the model's <code>transform</code> method.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
    org.apache.spark.ml.regression.GeneralizedLinearRegression.Family family ()  { throw new RuntimeException(); }
    org.apache.spark.ml.regression.GeneralizedLinearRegression.Link link ()  { throw new RuntimeException(); }
  /** Number of instances in DataFrame predictions. */
    long numInstances ()  { throw new RuntimeException(); }
  /** The numeric rank of the fitted linear model. */
  public  long rank ()  { throw new RuntimeException(); }
  /** Degrees of freedom. */
  public  long degreesOfFreedom ()  { throw new RuntimeException(); }
  /** The residual degrees of freedom. */
  public  long residualDegreeOfFreedom ()  { throw new RuntimeException(); }
  /** The residual degrees of freedom for the null model. */
  public  long residualDegreeOfFreedomNull ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Column weightCol ()  { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> devianceResiduals ()  { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> pearsonResiduals ()  { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> workingResiduals ()  { throw new RuntimeException(); }
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> responseResiduals ()  { throw new RuntimeException(); }
  /**
   * Get the default residuals (deviance residuals) of the fitted model.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> residuals ()  { throw new RuntimeException(); }
  /**
   * Get the residuals of the fitted model by type.
   * <p>
   * @param residualsType The type of residuals which should be returned.
   *                      Supported options: deviance, pearson, working and response.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> residuals (java.lang.String residualsType)  { throw new RuntimeException(); }
  /**
   * The deviance for the null model.
   * @return (undocumented)
   */
  public  double nullDeviance ()  { throw new RuntimeException(); }
  /**
   * The deviance for the fitted model.
   * @return (undocumented)
   */
  public  double deviance ()  { throw new RuntimeException(); }
  /**
   * The dispersion of the fitted model.
   * It is taken as 1.0 for the "binomial" and "poisson" families, and otherwise
   * estimated by the residual Pearson's Chi-Squared statistic (which is defined as
   * sum of the squares of the Pearson residuals) divided by the residual degrees of freedom.
   * @return (undocumented)
   */
  public  double dispersion ()  { throw new RuntimeException(); }
  /** Akaike Information Criterion (AIC) for the fitted model. */
  public  double aic ()  { throw new RuntimeException(); }
}
