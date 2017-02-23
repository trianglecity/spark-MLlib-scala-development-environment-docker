package org.apache.spark.ml.classification;
public  class RandomForestClassificationModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.classification.RandomForestClassificationModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomForestClassificationModel$ MODULE$ = null;
  public   RandomForestClassificationModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.RandomForestClassificationModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassificationModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
    org.apache.spark.ml.classification.RandomForestClassificationModel fromOld (org.apache.spark.mllib.tree.model.RandomForestModel oldModel, org.apache.spark.ml.classification.RandomForestClassifier parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, int numFeatures)  { throw new RuntimeException(); }
}
