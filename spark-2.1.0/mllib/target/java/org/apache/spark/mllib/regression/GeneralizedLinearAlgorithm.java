package org.apache.spark.mllib.regression;
/**
 * :: DeveloperApi ::
 * GeneralizedLinearAlgorithm implements methods to train a Generalized Linear Model (GLM).
 * This class should be extended with an Optimizer to create a new GLM.
 * <p>
 */
public abstract class GeneralizedLinearAlgorithm<M extends org.apache.spark.mllib.regression.GeneralizedLinearModel> implements org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Ident(org.apache.spark.mllib.regression.GeneralizedLinearModel))))
  public   GeneralizedLinearAlgorithm ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators ()  { throw new RuntimeException(); }
  /**
   * The optimizer to solve the problem.
   * <p>
   * @return (undocumented)
   */
  public abstract  org.apache.spark.mllib.optimization.Optimizer optimizer ()  ;
  /** Whether to add intercept (default: false). */
  protected  boolean addIntercept ()  { throw new RuntimeException(); }
  protected  boolean validateData ()  { throw new RuntimeException(); }
  /**
   * In <code>GeneralizedLinearModel</code>, only single linear predictor is allowed for both weights
   * and intercept. However, for multinomial logistic regression, with K possible outcomes,
   * we are training K-1 independent binary logistic regression models which requires K-1 sets
   * of linear predictor.
   * <p>
   * As a result, the workaround here is if more than two sets of linear predictors are needed,
   * we construct bigger <code>weights</code> vector which can hold both weights and intercepts.
   * If the intercepts are added, the dimension of <code>weights</code> will be
   * (numOfLinearPredictor) * (numFeatures + 1) . If the intercepts are not added,
   * the dimension of <code>weights</code> will be (numOfLinearPredictor) * numFeatures.
   * <p>
   * Thus, the intercepts will be encapsulated into weights, and we leave the value of intercept
   * in GeneralizedLinearModel as zero.
   * @return (undocumented)
   */
  protected  int numOfLinearPredictor ()  { throw new RuntimeException(); }
  /**
   * Whether to perform feature scaling before model training to reduce the condition numbers
   * which can significantly help the optimizer converging faster. The scaling correction will be
   * translated back to resulting model weights, so it's transparent to users.
   * Note: This technique is used in both libsvm and glmnet packages. Default false.
   * @return (undocumented)
   */
    boolean useFeatureScaling ()  { throw new RuntimeException(); }
  /**
   * The dimension of training features.
   * <p>
   * @return (undocumented)
   */
  public  int getNumFeatures ()  { throw new RuntimeException(); }
  /**
   * The dimension of training features.
   * @return (undocumented)
   */
  protected  int numFeatures ()  { throw new RuntimeException(); }
  /**
   * Set if the algorithm should use feature scaling to improve the convergence during optimization.
   * @param useFeatureScaling (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setFeatureScaling (boolean useFeatureScaling)  { throw new RuntimeException(); }
  /**
   * Create a model given the weights and intercept
   * @param weights (undocumented)
   * @param intercept (undocumented)
   * @return (undocumented)
   */
  protected abstract  M createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  ;
  /**
   * Get if the algorithm uses addIntercept
   * <p>
   * @return (undocumented)
   */
  public  boolean isAddIntercept ()  { throw new RuntimeException(); }
  /**
   * Set if the algorithm should add an intercept. Default false.
   * We set the default to false because adding the intercept will cause memory allocation.
   * <p>
   * @param addIntercept (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setIntercept (boolean addIntercept)  { throw new RuntimeException(); }
  /**
   * Set if the algorithm should validate data before training. Default true.
   * <p>
   * @param validateData (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setValidateData (boolean validateData)  { throw new RuntimeException(); }
  /**
   * Generate the initial weights when the user does not supply them
   * @param input (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.mllib.linalg.Vector generateInitialWeights (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * Run the algorithm with the configured parameters on an input
   * RDD of LabeledPoint entries.
   * <p>
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  M run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * Run the algorithm with the configured parameters on an input RDD
   * of LabeledPoint entries starting from the initial weights provided.
   * <p>
   * @param input (undocumented)
   * @param initialWeights (undocumented)
   * @return (undocumented)
   */
  public  M run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
}
