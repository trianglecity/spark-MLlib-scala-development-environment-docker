package org.apache.spark.mllib.regression.impl;
/**
 * Helper methods for import/export of GLM regression models.
 */
public  class GLMRegressionModel {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    /** Model data for model import/export */
    public  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector weights ()  { throw new RuntimeException(); }
      public  double intercept ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
    }
    public  class Data extends scala.runtime.AbstractFunction2<org.apache.spark.mllib.linalg.Vector, java.lang.Object, org.apache.spark.mllib.regression.impl.GLMRegressionModel.SaveLoadV1_0.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    /**
     * Helper method for saving GLM regression model metadata and data.
     * @param modelClass  String name for model class, to be saved with metadata
     * @param sc (undocumented)
     * @param path (undocumented)
     * @param weights (undocumented)
     * @param intercept (undocumented)
     */
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, java.lang.String modelClass, org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
    /**
     * Helper method for loading GLM regression model data.
     * @param modelClass  String name for model class (used for error messages)
     * @param numFeatures  Number of features, to be checked against loaded data.
     *                     The length of the weights vector should equal numFeatures.
     * @param sc (undocumented)
     * @param path (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.regression.impl.GLMRegressionModel.SaveLoadV1_0.Data loadData (org.apache.spark.SparkContext sc, java.lang.String path, java.lang.String modelClass, int numFeatures)  { throw new RuntimeException(); }
  }
}
