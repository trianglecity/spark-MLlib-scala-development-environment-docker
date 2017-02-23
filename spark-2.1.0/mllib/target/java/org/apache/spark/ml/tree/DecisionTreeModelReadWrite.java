package org.apache.spark.ml.tree;
/** Helper classes for tree model persistence */
public  class DecisionTreeModelReadWrite {
  /**
   * Info for a {@link org.apache.spark.ml.tree.Split}
   * <p>
   * param:  featureIndex  Index of feature split on
   * param:  leftCategoriesOrThreshold  For categorical feature, set of leftCategories.
   *                                   For continuous feature, threshold.
   * param:  numCategories  For categorical feature, number of categories.
   *                       For continuous feature, -1.
   */
  static public  class SplitData implements scala.Product, scala.Serializable {
    public  int featureIndex ()  { throw new RuntimeException(); }
    public  double[] leftCategoriesOrThreshold ()  { throw new RuntimeException(); }
    public  int numCategories ()  { throw new RuntimeException(); }
    // not preceding
    public   SplitData (int featureIndex, double[] leftCategoriesOrThreshold, int numCategories)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tree.Split getSplit ()  { throw new RuntimeException(); }
  }
  static public  class SplitData$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SplitData$ MODULE$ = null;
    public   SplitData$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tree.DecisionTreeModelReadWrite.SplitData apply (org.apache.spark.ml.tree.Split split)  { throw new RuntimeException(); }
  }
  /**
   * Info for a {@link Node}
   * <p>
   * param:  id  Index used for tree reconstruction.  Indices follow a pre-order traversal.
   * param:  impurityStats  Stats array.  Impurity type is stored in metadata.
   * param:  gain  Gain, or arbitrary value if leaf node.
   * param:  leftChild  Left child index, or arbitrary value if leaf node.
   * param:  rightChild  Right child index, or arbitrary value if leaf node.
   * param:  split  Split info, or arbitrary value if leaf node.
   */
  static public  class NodeData implements scala.Product, scala.Serializable {
    public  int id ()  { throw new RuntimeException(); }
    public  double prediction ()  { throw new RuntimeException(); }
    public  double impurity ()  { throw new RuntimeException(); }
    public  double[] impurityStats ()  { throw new RuntimeException(); }
    public  double gain ()  { throw new RuntimeException(); }
    public  int leftChild ()  { throw new RuntimeException(); }
    public  int rightChild ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tree.DecisionTreeModelReadWrite.SplitData split ()  { throw new RuntimeException(); }
    // not preceding
    public   NodeData (int id, double prediction, double impurity, double[] impurityStats, double gain, int leftChild, int rightChild, org.apache.spark.ml.tree.DecisionTreeModelReadWrite.SplitData split)  { throw new RuntimeException(); }
  }
  static public  class NodeData$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NodeData$ MODULE$ = null;
    public   NodeData$ ()  { throw new RuntimeException(); }
    /**
     * Create {@link NodeData} instances for this node and all children.
     * <p>
     * @param id  Current ID.  IDs are assigned via a pre-order traversal.
     * @return (sequence of nodes in pre-order traversal order, largest ID in subtree)
     *         The nodes are returned in pre-order traversal (root first) so that it is easy to
     *         get the ID of the subtree's root node.
     * @param node (undocumented)
     */
    public  scala.Tuple2<scala.collection.Seq<org.apache.spark.ml.tree.DecisionTreeModelReadWrite.NodeData>, java.lang.Object> build (org.apache.spark.ml.tree.Node node, int id)  { throw new RuntimeException(); }
  }
  /**
   * Load a decision tree from a file.
   * @return  Root node of reconstructed tree
   * @param path (undocumented)
   * @param metadata (undocumented)
   * @param sparkSession (undocumented)
   */
  static public  org.apache.spark.ml.tree.Node loadTreeNodes (java.lang.String path, org.apache.spark.ml.util.DefaultParamsReader.Metadata metadata, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Given all data for all nodes in a tree, rebuild the tree.
   * @param data  Unsorted node data
   * @param impurityType  Impurity type for this tree
   * @return Root node of reconstructed tree
   */
  static public  org.apache.spark.ml.tree.Node buildTreeFromNodes (org.apache.spark.ml.tree.DecisionTreeModelReadWrite.NodeData[] data, java.lang.String impurityType)  { throw new RuntimeException(); }
}
