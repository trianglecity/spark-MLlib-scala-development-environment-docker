package org.apache.spark.ml.tree;
/**
 * Decision tree leaf node.
 * param:  prediction  Prediction this node makes
 * param:  impurity  Impurity measure at this node (for training data)
 */
public  class LeafNode extends org.apache.spark.ml.tree.Node {
  public  double prediction ()  { throw new RuntimeException(); }
  public  double impurity ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityStats ()  { throw new RuntimeException(); }
  // not preceding
     LeafNode (double prediction, double impurity, org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityStats)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.apache.spark.ml.tree.LeafNode predictImpl (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
    int numDescendants ()  { throw new RuntimeException(); }
    java.lang.String subtreeToString (int indentFactor)  { throw new RuntimeException(); }
    int subtreeDepth ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.tree.model.Node toOld (int id)  { throw new RuntimeException(); }
    int maxSplitFeatureIndex ()  { throw new RuntimeException(); }
    org.apache.spark.ml.tree.Node deepCopy ()  { throw new RuntimeException(); }
}
