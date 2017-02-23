package org.apache.spark.ml.regression;
public  class RandomForestRegressionModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.regression.RandomForestRegressionModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomForestRegressionModel$ MODULE$ = null;
  public   RandomForestRegressionModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.RandomForestRegressionModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.RandomForestRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
    org.apache.spark.ml.regression.RandomForestRegressionModel fromOld (org.apache.spark.mllib.tree.model.RandomForestModel oldModel, org.apache.spark.ml.regression.RandomForestRegressor parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
}
