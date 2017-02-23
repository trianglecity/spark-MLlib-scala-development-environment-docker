package org.apache.spark.mllib.tree.model;
/**
 */
public  class GradientBoostedTreesModel$ implements org.apache.spark.mllib.util.Loader<org.apache.spark.mllib.tree.model.GradientBoostedTreesModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GradientBoostedTreesModel$ MODULE$ = null;
  public   GradientBoostedTreesModel$ ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> computeInitialPredictionAndError (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, double initTreeWeight, org.apache.spark.mllib.tree.model.DecisionTreeModel initTree, org.apache.spark.mllib.tree.loss.Loss loss)  { throw new RuntimeException(); }
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
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> updatePredictionError (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndError, double treeWeight, org.apache.spark.mllib.tree.model.DecisionTreeModel tree, org.apache.spark.mllib.tree.loss.Loss loss)  { throw new RuntimeException(); }
    java.lang.String formatVersion ()  { throw new RuntimeException(); }
  /**
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
