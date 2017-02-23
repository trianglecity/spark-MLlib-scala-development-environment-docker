package org.apache.spark.ml.tree;
public  class EnsembleModelReadWrite$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EnsembleModelReadWrite$ MODULE$ = null;
  public   EnsembleModelReadWrite$ ()  { throw new RuntimeException(); }
  /**
   * Helper method for saving a tree ensemble to disk.
   * <p>
   * @param instance  Tree ensemble model
   * @param path  Path to which to save the ensemble model.
   * @param extraMetadata  Metadata such as numFeatures, numClasses, numTrees.
   * @param sql (undocumented)
   */
  public <M extends org.apache.spark.ml.param.Params> void saveImpl (M instance, java.lang.String path, org.apache.spark.sql.SparkSession sql, org.json4s.JsonAST.JObject extraMetadata)  { throw new RuntimeException(); }
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
  public  scala.Tuple3<org.apache.spark.ml.util.DefaultParamsReader.Metadata, scala.Tuple2<org.apache.spark.ml.util.DefaultParamsReader.Metadata, org.apache.spark.ml.tree.Node>[], double[]> loadImpl (java.lang.String path, org.apache.spark.sql.SparkSession sql, java.lang.String className, java.lang.String treeClassName)  { throw new RuntimeException(); }
}
