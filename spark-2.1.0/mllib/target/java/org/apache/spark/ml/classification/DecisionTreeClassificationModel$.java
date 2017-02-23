package org.apache.spark.ml.classification;
public  class DecisionTreeClassificationModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.classification.DecisionTreeClassificationModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeClassificationModel$ MODULE$ = null;
  public   DecisionTreeClassificationModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.DecisionTreeClassificationModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassificationModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
    org.apache.spark.ml.classification.DecisionTreeClassificationModel fromOld (org.apache.spark.mllib.tree.model.DecisionTreeModel oldModel, org.apache.spark.ml.classification.DecisionTreeClassifier parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
}
