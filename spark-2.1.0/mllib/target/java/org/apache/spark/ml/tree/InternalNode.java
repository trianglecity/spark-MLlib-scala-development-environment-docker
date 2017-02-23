package org.apache.spark.ml.tree;
/**
 * Internal Decision Tree node.
 * param:  prediction  Prediction this node would make if it were a leaf node
 * param:  impurity  Impurity measure at this node (for training data)
 * param:  gain Information gain value. Values less than 0 indicate missing values;
 *             this quirk will be removed with future updates.
 * param:  leftChild  Left-hand child node
 * param:  rightChild  Right-hand child node
 * param:  split  Information about the test used to split to the left or right child.
 */
public  class InternalNode extends org.apache.spark.ml.tree.Node {
  /**
   * Helper method for {@link Node.subtreeToString()}.
   * @param split  Split to print
   * @param left  Indicates whether this is the part of the split going to the left,
   *              or that going to the right.
   * @return (undocumented)
   */
  static private  java.lang.String splitToString (org.apache.spark.ml.tree.Split split, boolean left)  { throw new RuntimeException(); }
  static public  int subtreeToString$default$1 ()  { throw new RuntimeException(); }
  public  double prediction ()  { throw new RuntimeException(); }
  public  double impurity ()  { throw new RuntimeException(); }
  public  double gain ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.Node leftChild ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.Node rightChild ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tree.Split split ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityStats ()  { throw new RuntimeException(); }
  // not preceding
     InternalNode (double prediction, double impurity, double gain, org.apache.spark.ml.tree.Node leftChild, org.apache.spark.ml.tree.Node rightChild, org.apache.spark.ml.tree.Split split, org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityStats)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.apache.spark.ml.tree.LeafNode predictImpl (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
    int numDescendants ()  { throw new RuntimeException(); }
    java.lang.String subtreeToString (int indentFactor)  { throw new RuntimeException(); }
    int subtreeDepth ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.tree.model.Node toOld (int id)  { throw new RuntimeException(); }
    int maxSplitFeatureIndex ()  { throw new RuntimeException(); }
    org.apache.spark.ml.tree.Node deepCopy ()  { throw new RuntimeException(); }
}
