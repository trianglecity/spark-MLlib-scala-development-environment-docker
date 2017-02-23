package org.apache.spark.ml.regression;
public  class DecisionTreeRegressionModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.regression.DecisionTreeRegressionModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeRegressionModel$ MODULE$ = null;
  public   DecisionTreeRegressionModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.DecisionTreeRegressionModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.DecisionTreeRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
    org.apache.spark.ml.regression.DecisionTreeRegressionModel fromOld (org.apache.spark.mllib.tree.model.DecisionTreeModel oldModel, org.apache.spark.ml.regression.DecisionTreeRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
}
