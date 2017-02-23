package org.apache.spark.ml.tree;
public  class TreeEnsembleModel$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TreeEnsembleModel$ MODULE$ = null;
  public   TreeEnsembleModel$ ()  { throw new RuntimeException(); }
  /**
   * Given a tree ensemble model, compute the importance of each feature.
   * This generalizes the idea of "Gini" importance to other losses,
   * following the explanation of Gini importance from "Random Forests" documentation
   * by Leo Breiman and Adele Cutler, and following the implementation from scikit-learn.
   * <p>
   * For collections of trees, including boosting and bagging, Hastie et al.
   * propose to use the average of single tree importances across all trees in the ensemble.
   * <p>
   * This feature importance is calculated as follows:
   *  - Average over trees:
   *     - importance(feature j) = sum (over nodes which split on feature j) of the gain,
   *       where gain is scaled by the number of instances passing through node
   *     - Normalize importances for tree to sum to 1.
   *  - Normalize feature importance vector to sum to 1.
   * <p>
   *  References:
   *  - Hastie, Tibshirani, Friedman. "The Elements of Statistical Learning, 2nd Edition." 2001.
   * <p>
   * @param trees  Unweighted collection of trees
   * @param numFeatures  Number of features in model (even if not all are explicitly used by
   *                     the model).
   *                     If -1, then numFeatures is set based on the max feature index in all trees.
   * @return  Feature importance values, of length numFeatures.
   */
  public <M extends org.apache.spark.ml.tree.DecisionTreeModel> org.apache.spark.ml.linalg.Vector featureImportances (M[] trees, int numFeatures)  { throw new RuntimeException(); }
  /**
   * Given a Decision Tree model, compute the importance of each feature.
   * This generalizes the idea of "Gini" importance to other losses,
   * following the explanation of Gini importance from "Random Forests" documentation
   * by Leo Breiman and Adele Cutler, and following the implementation from scikit-learn.
   * <p>
   * This feature importance is calculated as follows:
   *  - importance(feature j) = sum (over nodes which split on feature j) of the gain,
   *    where gain is scaled by the number of instances passing through node
   *  - Normalize importances for tree to sum to 1.
   * <p>
   * @param tree  Decision tree to compute importances for.
   * @param numFeatures  Number of features in model (even if not all are explicitly used by
   *                     the model).
   *                     If -1, then numFeatures is set based on the max feature index in all trees.
   * @return  Feature importance values, of length numFeatures.
   * @param evidence$1 (undocumented)
   */
  public <M extends org.apache.spark.ml.tree.DecisionTreeModel> org.apache.spark.ml.linalg.Vector featureImportances (M tree, int numFeatures, scala.reflect.ClassTag<M> evidence$1)  { throw new RuntimeException(); }
  /**
   * Recursive method for computing feature importances for one tree.
   * This walks down the tree, adding to the importance of 1 feature at each node.
   * <p>
   * @param node  Current node in recursion
   * @param importances  Aggregate feature importances, modified by this method
   */
  public  void computeFeatureImportance (org.apache.spark.ml.tree.Node node, org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> importances)  { throw new RuntimeException(); }
  /**
   * Normalize the values of this map to sum to 1, in place.
   * If all values are 0, this method does nothing.
   * <p>
   * @param map  Map with non-negative values.
   */
  public  void normalizeMapValues (org.apache.spark.util.collection.OpenHashMap<java.lang.Object, java.lang.Object> map)  { throw new RuntimeException(); }
}
