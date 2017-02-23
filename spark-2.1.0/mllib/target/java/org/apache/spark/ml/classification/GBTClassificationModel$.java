package org.apache.spark.ml.classification;
public  class GBTClassificationModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.classification.GBTClassificationModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GBTClassificationModel$ MODULE$ = null;
  public   GBTClassificationModel$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.GBTClassificationModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.GBTClassificationModel load (java.lang.String path)  { throw new RuntimeException(); }
  /** Convert a model from the old API */
    org.apache.spark.ml.classification.GBTClassificationModel fromOld (org.apache.spark.mllib.tree.model.GradientBoostedTreesModel oldModel, org.apache.spark.ml.classification.GBTClassifier parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numFeatures)  { throw new RuntimeException(); }
}
