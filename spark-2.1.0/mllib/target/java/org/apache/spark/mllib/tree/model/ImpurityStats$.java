package org.apache.spark.mllib.tree.model;
public  class ImpurityStats$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ImpurityStats$ MODULE$ = null;
  public   ImpurityStats$ ()  { throw new RuntimeException(); }
  /**
   * Return an {@link org.apache.spark.mllib.tree.model.ImpurityStats} object to
   * denote that current split doesn't satisfies minimum info gain or
   * minimum number of instances per node.
   * @param impurityCalculator (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.ImpurityStats getInvalidImpurityStats (org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityCalculator)  { throw new RuntimeException(); }
  /**
   * Return an {@link org.apache.spark.mllib.tree.model.ImpurityStats} object
   * that only 'impurity' and 'impurityCalculator' are defined.
   * @param impurityCalculator (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.ImpurityStats getEmptyImpurityStats (org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityCalculator)  { throw new RuntimeException(); }
}
