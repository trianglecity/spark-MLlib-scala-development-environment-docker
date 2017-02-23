package org.apache.spark.mllib.tree.model;
/**
 * Decision tree model for classification or regression.
 * This model stores the decision tree structure and parameters.
 * param:  topNode root node
 * param:  algo algorithm type -- classification or regression
 */
public  class DecisionTreeModel implements scala.Serializable, org.apache.spark.mllib.util.Saveable {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    public  java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  class PredictData implements scala.Product, scala.Serializable {
      public  double predict ()  { throw new RuntimeException(); }
      public  double prob ()  { throw new RuntimeException(); }
      // not preceding
      public   PredictData (double predict, double prob)  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.Predict toPredict ()  { throw new RuntimeException(); }
    }
    public  class PredictData implements scala.Serializable {
      public   PredictData ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.PredictData apply (org.apache.spark.mllib.tree.model.Predict p)  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.PredictData apply (org.apache.spark.sql.Row r)  { throw new RuntimeException(); }
    }
    public  class SplitData implements scala.Product, scala.Serializable {
      public  int feature ()  { throw new RuntimeException(); }
      public  double threshold ()  { throw new RuntimeException(); }
      public  int featureType ()  { throw new RuntimeException(); }
      public  scala.collection.Seq<java.lang.Object> categories ()  { throw new RuntimeException(); }
      // not preceding
      public   SplitData (int feature, double threshold, int featureType, scala.collection.Seq<java.lang.Object> categories)  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.Split toSplit ()  { throw new RuntimeException(); }
    }
    public  class SplitData implements scala.Serializable {
      public   SplitData ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.SplitData apply (org.apache.spark.mllib.tree.model.Split s)  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.SplitData apply (org.apache.spark.sql.Row r)  { throw new RuntimeException(); }
    }
    /** Model data for model import/export */
    public  class NodeData implements scala.Product, scala.Serializable {
      public  int treeId ()  { throw new RuntimeException(); }
      public  int nodeId ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.PredictData predict ()  { throw new RuntimeException(); }
      public  double impurity ()  { throw new RuntimeException(); }
      public  boolean isLeaf ()  { throw new RuntimeException(); }
      public  scala.Option<org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.SplitData> split ()  { throw new RuntimeException(); }
      public  scala.Option<java.lang.Object> leftNodeId ()  { throw new RuntimeException(); }
      public  scala.Option<java.lang.Object> rightNodeId ()  { throw new RuntimeException(); }
      public  scala.Option<java.lang.Object> infoGain ()  { throw new RuntimeException(); }
      // not preceding
      public   NodeData (int treeId, int nodeId, org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.PredictData predict, double impurity, boolean isLeaf, scala.Option<org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.SplitData> split, scala.Option<java.lang.Object> leftNodeId, scala.Option<java.lang.Object> rightNodeId, scala.Option<java.lang.Object> infoGain)  { throw new RuntimeException(); }
    }
    public  class NodeData implements scala.Serializable {
      public   NodeData ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.NodeData apply (int treeId, org.apache.spark.mllib.tree.model.Node n)  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.NodeData apply (org.apache.spark.sql.Row r)  { throw new RuntimeException(); }
    }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, org.apache.spark.mllib.tree.model.DecisionTreeModel model)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.tree.model.DecisionTreeModel load (org.apache.spark.SparkContext sc, java.lang.String path, java.lang.String algo, int numNodes)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.tree.model.Node[] constructTrees (org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.NodeData> nodes)  { throw new RuntimeException(); }
    /**
     * Given a list of nodes from a tree, construct the tree.
     * @param data array of all node data in a tree.
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.tree.model.Node constructTree (org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.NodeData[] data)  { throw new RuntimeException(); }
    /**
     * Builds a node from the node data map and adds new nodes to the input nodes map.
     * @param id (undocumented)
     * @param dataMap (undocumented)
     * @param nodes (undocumented)
     * @return (undocumented)
     */
    private  org.apache.spark.mllib.tree.model.Node constructNode (int id, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.tree.model.DecisionTreeModel.SaveLoadV1_0.NodeData> dataMap, scala.collection.mutable.Map<java.lang.Object, org.apache.spark.mllib.tree.model.Node> nodes)  { throw new RuntimeException(); }
  }
  /**
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.Node topNode ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value algo ()  { throw new RuntimeException(); }
  // not preceding
  public   DecisionTreeModel (org.apache.spark.mllib.tree.model.Node topNode, scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  /**
   * Predict values for a single data point using the model trained.
   * <p>
   * @param features array representing a single data point
   * @return Double prediction from the trained model
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector features)  { throw new RuntimeException(); }
  /**
   * Predict values for the given data set using the model trained.
   * <p>
   * @param features RDD representing data points to be predicted
   * @return RDD of predictions for each of the given data points
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> features)  { throw new RuntimeException(); }
  /**
   * Predict values for the given data set using the model trained.
   * <p>
   * @param features JavaRDD representing data points to be predicted
   * @return JavaRDD of predictions for each of the given data points
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Double> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> features)  { throw new RuntimeException(); }
  /**
   * Get number of nodes in tree, including leaf nodes.
   * @return (undocumented)
   */
  public  int numNodes ()  { throw new RuntimeException(); }
  /**
   * Get depth of tree.
   * E.g.: Depth 0 means 1 leaf node.  Depth 1 means 1 internal node and 2 leaf nodes.
   * @return (undocumented)
   */
  public  int depth ()  { throw new RuntimeException(); }
  /**
   * Print a summary of the model.
   * @return (undocumented)
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Print the full model to a string.
   * @return (undocumented)
   */
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  /**
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
