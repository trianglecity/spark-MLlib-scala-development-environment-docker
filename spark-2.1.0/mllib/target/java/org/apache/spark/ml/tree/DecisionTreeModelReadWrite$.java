package org.apache.spark.ml.tree;
/** Helper classes for tree model persistence */
public  class DecisionTreeModelReadWrite$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeModelReadWrite$ MODULE$ = null;
  public   DecisionTreeModelReadWrite$ ()  { throw new RuntimeException(); }
  /**
   * Load a decision tree from a file.
   * @return  Root node of reconstructed tree
   * @param path (undocumented)
   * @param metadata (undocumented)
   * @param sparkSession (undocumented)
   */
  public  org.apache.spark.ml.tree.Node loadTreeNodes (java.lang.String path, org.apache.spark.ml.util.DefaultParamsReader.Metadata metadata, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Given all data for all nodes in a tree, rebuild the tree.
   * @param data  Unsorted node data
   * @param impurityType  Impurity type for this tree
   * @return Root node of reconstructed tree
   */
  public  org.apache.spark.ml.tree.Node buildTreeFromNodes (org.apache.spark.ml.tree.DecisionTreeModelReadWrite.NodeData[] data, java.lang.String impurityType)  { throw new RuntimeException(); }
}
