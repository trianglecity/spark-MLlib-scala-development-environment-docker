package org.apache.spark.mllib.classification;
/**
 * Train a classification model for Multinomial/Binary Logistic Regression using
 * Limited-memory BFGS. Standard feature scaling and L2 regularization are used by default.
 * <p>
 * Earlier implementations of LogisticRegressionWithLBFGS applies a regularization
 * penalty to all elements including the intercept. If this is called with one of
 * standard updaters (L1Updater, or SquaredL2Updater) this is translated
 * into a call to ml.LogisticRegression, otherwise this will use the existing mllib
 * GeneralizedLinearAlgorithm trainer, resulting in a regularization penalty to the
 * intercept.
 * <p>
 * @note Labels used in Logistic Regression should be {0, 1, ..., k - 1}
 * for k classes multi-label classification problem.
 */
public  class LogisticRegressionWithLBFGS extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.classification.LogisticRegressionModel> implements scala.Serializable {
  public   LogisticRegressionWithLBFGS ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.LBFGS optimizer ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators ()  { throw new RuntimeException(); }
  private  scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object> multiLabelValidator ()  { throw new RuntimeException(); }
  /**
   * Set the number of possible outcomes for k classes classification problem in
   * Multinomial Logistic Regression.
   * By default, it is binary logistic regression so k will be set to 2.
   * @param numClasses (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionWithLBFGS setNumClasses (int numClasses)  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.classification.LogisticRegressionModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  /**
   * Run Logistic Regression with the configured parameters on an input RDD
   * of LabeledPoint entries.
   * <p>
   * If a known updater is used calls the ml implementation, to avoid
   * applying a regularization penalty to the intercept, otherwise
   * defaults to the mllib implementation. If more than two classes
   * or feature scaling is disabled, always uses mllib implementation.
   * If using ml implementation, uses ml code to generate initial weights.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * Run Logistic Regression with the configured parameters on an input RDD
   * of LabeledPoint entries starting from the initial weights provided.
   * <p>
   * If a known updater is used calls the ml implementation, to avoid
   * applying a regularization penalty to the intercept, otherwise
   * defaults to the mllib implementation. If more than two classes
   * or feature scaling is disabled, always uses mllib implementation.
   * Uses user provided weights.
   * <p>
   * In the ml LogisticRegression implementation, the number of corrections
   * used in the LBFGS update can not be configured. So <code>optimizer.setNumCorrections()</code>
   * will have no effect if we fall into that route.
   * @param input (undocumented)
   * @param initialWeights (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.classification.LogisticRegressionModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.linalg.Vector initialWeights, boolean userSuppliedWeights)  { throw new RuntimeException(); }
}
