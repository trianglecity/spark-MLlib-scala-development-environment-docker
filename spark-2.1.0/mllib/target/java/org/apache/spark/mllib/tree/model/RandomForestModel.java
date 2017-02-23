package org.apache.spark.mllib.tree.model;
/**
 * Represents a random forest model.
 * <p>
 * param:  algo algorithm for the ensemble model, either Classification or Regression
 * param:  trees tree ensembles
 */
public  class RandomForestModel extends org.apache.spark.mllib.tree.model.TreeEnsembleModel implements org.apache.spark.mllib.util.Saveable {
  static private  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisClassName ()  { throw new RuntimeException(); }
  }
  /**
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  static public  org.apache.spark.mllib.tree.model.RandomForestModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  static protected  double[] treeWeights ()  { throw new RuntimeException(); }
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
  // not preceding
  public   RandomForestModel (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees)  { throw new RuntimeException(); }
  /**
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
