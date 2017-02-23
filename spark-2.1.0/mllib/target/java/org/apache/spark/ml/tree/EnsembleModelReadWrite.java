package org.apache.spark.ml.tree;
public  class EnsembleModelReadWrite {
  /**
   * Info for one {@link Node} in a tree ensemble
   * <p>
   * param:  treeID  Tree index
   * param:  nodeData  Data for this node
   */
  static public  class EnsembleNodeData implements scala.Product, scala.Serializable {
    public  int treeID ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tree.DecisionTreeModelReadWrite.NodeData nodeData ()  { throw new RuntimeException(); }
    // not preceding
    public   EnsembleNodeData (int treeID, org.apache.spark.ml.tree.DecisionTreeModelReadWrite.NodeData nodeData)  { throw new RuntimeException(); }
  }
  static public  class EnsembleNodeData$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EnsembleNodeData$ MODULE$ = null;
    public   EnsembleNodeData$ ()  { throw new RuntimeException(); }
    /**
     * Create {@link EnsembleNodeData} instances for the given tree.
     * <p>
     * @return Sequence of nodes for this tree
     * @param tree (undocumented)
     * @param treeID (undocumented)
     */
    public  scala.collection.Seq<org.apache.spark.ml.tree.EnsembleModelReadWrite.EnsembleNodeData> build (org.apache.spark.ml.tree.DecisionTreeModel tree, int treeID)  { throw new RuntimeException(); }
  }
  /**
   * Helper method for saving a tree ensemble to disk.
   * <p>
   * @param instance  Tree ensemble model
   * @param path  Path to which to save the ensemble model.
   * @param extraMetadata  Metadata such as numFeatures, numClasses, numTrees.
   * @param sql (undocumented)
   */
  static public <M extends org.apache.spark.ml.param.Params> void saveImpl (M instance, java.lang.String path, org.apache.spark.sql.SparkSession sql, org.json4s.JsonAST.JObject extraMetadata)  { throw new RuntimeException(); }
  /**
   * Helper method for loading a tree ensemble from disk.
   * This reconstructs all trees, returning the root nodes.
   * @param path  Path given to <code>saveImpl</code>
   * @param className  Class name for ensemble model type
   * @param treeClassName  Class name for tree model type in the ensemble
   * @return  (ensemble metadata, array over trees of (tree metadata, root node)),
   *          where the root node is linked with all descendents
   * @see <code>saveImpl</code> for how the model was saved
   * @param sql (undocumented)
   */
  static public  scala.Tuple3<org.apache.spark.ml.util.DefaultParamsReader.Metadata, scala.Tuple2<org.apache.spark.ml.util.DefaultParamsReader.Metadata, org.apache.spark.ml.tree.Node>[], double[]> loadImpl (java.lang.String path, org.apache.spark.sql.SparkSession sql, java.lang.String className, java.lang.String treeClassName)  { throw new RuntimeException(); }
}
