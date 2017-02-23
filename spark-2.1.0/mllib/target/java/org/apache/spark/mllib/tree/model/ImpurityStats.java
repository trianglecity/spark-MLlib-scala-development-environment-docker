package org.apache.spark.mllib.tree.model;
/**
 * Impurity statistics for each split
 * param:  gain information gain value
 * param:  impurity current node impurity
 * param:  impurityCalculator impurity statistics for current node
 * param:  leftImpurityCalculator impurity statistics for left child node
 * param:  rightImpurityCalculator impurity statistics for right child node
 * param:  valid whether the current split satisfies minimum info gain or
 *              minimum number of instances per node
 */
  class ImpurityStats implements scala.Serializable {
  /**
   * Return an {@link org.apache.spark.mllib.tree.model.ImpurityStats} object to
   * denote that current split doesn't satisfies minimum info gain or
   * minimum number of instances per node.
   * @param impurityCalculator (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.model.ImpurityStats getInvalidImpurityStats (org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityCalculator)  { throw new RuntimeException(); }
  /**
   * Return an {@link org.apache.spark.mllib.tree.model.ImpurityStats} object
   * that only 'impurity' and 'impurityCalculator' are defined.
   * @param impurityCalculator (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.model.ImpurityStats getEmptyImpurityStats (org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityCalculator)  { throw new RuntimeException(); }
  public  double gain ()  { throw new RuntimeException(); }
  public  double impurity ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityCalculator ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator leftImpurityCalculator ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator rightImpurityCalculator ()  { throw new RuntimeException(); }
  public  boolean valid ()  { throw new RuntimeException(); }
  // not preceding
  public   ImpurityStats (double gain, double impurity, org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityCalculator, org.apache.spark.mllib.tree.impurity.ImpurityCalculator leftImpurityCalculator, org.apache.spark.mllib.tree.impurity.ImpurityCalculator rightImpurityCalculator, boolean valid)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  double leftImpurity ()  { throw new RuntimeException(); }
  public  double rightImpurity ()  { throw new RuntimeException(); }
}
