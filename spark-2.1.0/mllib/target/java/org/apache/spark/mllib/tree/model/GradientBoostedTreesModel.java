package org.apache.spark.mllib.tree.model;
/**
 * Represents a gradient boosted trees model.
 * <p>
 * param:  algo algorithm for the ensemble model, either Classification or Regression
 * param:  trees tree ensembles
 * param:  treeWeights tree ensemble weights
 */
public  class GradientBoostedTreesModel extends org.apache.spark.mllib.tree.model.TreeEnsembleModel implements org.apache.spark.mllib.util.Saveable {
  static private  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisClassName ()  { throw new RuntimeException(); }
  }
  /**
   * :: DeveloperApi ::
   * Compute the initial predictions and errors for a dataset for the first
   * iteration of gradient boosting.
   * @param data: training data.
   * @param initTreeWeight: learning rate assigned to the first tree.
   * @param initTree: first DecisionTreeModel.
   * @param loss: evaluation metric.
   * @return an RDD with each element being a zip of the prediction and error
   *         corresponding to every sample.
   */
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> computeInitialPredictionAndError (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, double initTreeWeight, org.apache.spark.mllib.tree.model.DecisionTreeModel initTree, org.apache.spark.mllib.tree.loss.Loss loss)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Update a zipped predictionError RDD
   * (as obtained with computeInitialPredictionAndError)
   * @param data: training data.
   * @param predictionAndError: predictionError RDD
   * @param treeWeight: Learning rate.
   * @param tree: Tree using which the prediction and error should be updated.
   * @param loss: evaluation metric.
   * @return an RDD with each element being a zip of the prediction and error
   *         corresponding to each sample.
   */
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> updatePredictionError (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndError, double treeWeight, org.apache.spark.mllib.tree.model.DecisionTreeModel tree, org.apache.spark.mllib.tree.loss.Loss loss)  { throw new RuntimeException(); }
  /**
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  static public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  static protected  scala.Enumeration.Value combiningStrategy ()  { throw new RuntimeException(); }
  static public  double predict (org.apache.spark.mllib.linalg.Vector features)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> features)  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<java.lang.Double> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> features)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  static public  int numTrees ()  { throw new RuntimeException(); }
  static public  int totalNumNodes ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value algo ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees ()  { throw new RuntimeException(); }
  public  double[] treeWeights ()  { throw new RuntimeException(); }
  // not preceding
  public   GradientBoostedTreesModel (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees, double[] treeWeights)  { throw new RuntimeException(); }
  /**
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Method to compute error or loss for every iteration of gradient boosting.
   * @param data RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}
   * @param loss evaluation metric.
   * @return an array with index i having the losses or errors for the ensemble
   *         containing the first i+1 trees
   */
  public  double[] evaluateEachIteration (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, org.apache.spark.mllib.tree.loss.Loss loss)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
