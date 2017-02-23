package org.apache.spark.mllib.tree.configuration;
/**
 * Configuration options for {@link org.apache.spark.mllib.tree.GradientBoostedTrees}.
 * <p>
 * param:  treeStrategy Parameters for the tree algorithm. We support regression and binary
 *                     classification for boosting. Impurity setting will be ignored.
 * param:  loss Loss function used for minimization during gradient boosting.
 * param:  numIterations Number of iterations of boosting.  In other words, the number of
 *                      weak hypotheses used in the final model.
 * param:  learningRate Learning rate for shrinking the contribution of each estimator. The
 *                     learning rate should be between in the interval (0, 1]
 * param:  validationTol validationTol is a condition which decides iteration termination when
 *                      runWithValidation is used.
 *                      The end of iteration is decided based on below logic:
 *                      If the current loss on the validation set is greater than 0.01, the diff
 *                      of validation error is compared to relative tolerance which is
 *                      validationTol * (current loss on the validation set).
 *                      If the current loss on the validation set is less than or equal to 0.01,
 *                      the diff of validation error is compared to absolute tolerance which is
 *                      validationTol * 0.01.
 *                      Ignored when
 *                      <code>org.apache.spark.mllib.tree.GradientBoostedTrees.run()</code> is used.
 */
public  class BoostingStrategy implements scala.Serializable, scala.Product {
  /**
   * Returns default configuration for the boosting algorithm
   * @param algo Learning goal.  Supported: "Classification" or "Regression"
   * @return Configuration for boosting algorithm
   */
  static public  org.apache.spark.mllib.tree.configuration.BoostingStrategy defaultParams (java.lang.String algo)  { throw new RuntimeException(); }
  /**
   * Returns default configuration for the boosting algorithm
   * @param algo Learning goal.  Supported:
   *             <code>org.apache.spark.mllib.tree.configuration.Algo.Classification</code>,
   *             <code>org.apache.spark.mllib.tree.configuration.Algo.Regression</code>
   * @return Configuration for boosting algorithm
   */
  static public  org.apache.spark.mllib.tree.configuration.BoostingStrategy defaultParams (scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.configuration.Strategy treeStrategy ()  { throw new RuntimeException(); }
  public  void setTreeStrategy (org.apache.spark.mllib.tree.configuration.Strategy x$1)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.loss.Loss loss ()  { throw new RuntimeException(); }
  public  void setLoss (org.apache.spark.mllib.tree.loss.Loss x$1)  { throw new RuntimeException(); }
  public  int numIterations ()  { throw new RuntimeException(); }
  public  void setNumIterations (int x$1)  { throw new RuntimeException(); }
  public  double learningRate ()  { throw new RuntimeException(); }
  public  void setLearningRate (double x$1)  { throw new RuntimeException(); }
  public  double validationTol ()  { throw new RuntimeException(); }
  public  void setValidationTol (double x$1)  { throw new RuntimeException(); }
  // not preceding
  public   BoostingStrategy (org.apache.spark.mllib.tree.configuration.Strategy treeStrategy, org.apache.spark.mllib.tree.loss.Loss loss, int numIterations, double learningRate, double validationTol)  { throw new RuntimeException(); }
  /**
   * Check validity of parameters.
   * Throws exception if invalid.
   */
    void assertValid ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.tree.configuration.Strategy getTreeStrategy ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.loss.Loss getLoss ()  { throw new RuntimeException(); }
  public  int getNumIterations ()  { throw new RuntimeException(); }
  public  double getLearningRate ()  { throw new RuntimeException(); }
  public  double getValidationTol ()  { throw new RuntimeException(); }
}
