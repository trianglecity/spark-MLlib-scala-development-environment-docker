package org.apache.spark.ml.tree;
/**
 * Split which tests a categorical feature.
 * param:  featureIndex  Index of the feature to test
 * param:  _leftCategories  If the feature value is in this set of categories, then the split goes
 *                         left. Otherwise, it goes right.
 * param:  numCategories  Number of categories for this feature.
 */
public  class CategoricalSplit implements org.apache.spark.ml.tree.Split {
  public  int featureIndex ()  { throw new RuntimeException(); }
  public  int numCategories ()  { throw new RuntimeException(); }
  // not preceding
     CategoricalSplit (int featureIndex, double[] _leftCategories, int numCategories)  { throw new RuntimeException(); }
  /**
   * If true, then "categories" is the set of categories for splitting to the left, and vice versa.
   * @return (undocumented)
   */
  private  boolean isLeft ()  { throw new RuntimeException(); }
  /** Set of categories determining the splitting rule, along with {@link isLeft}. */
  private  scala.collection.immutable.Set<java.lang.Object> categories ()  { throw new RuntimeException(); }
    boolean shouldGoLeft (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
    boolean shouldGoLeft (int binnedFeature, org.apache.spark.ml.tree.Split[] splits)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
    org.apache.spark.mllib.tree.model.Split toOld ()  { throw new RuntimeException(); }
  /** Get sorted categories which split to the left */
  public  double[] leftCategories ()  { throw new RuntimeException(); }
  /** Get sorted categories which split to the right */
  public  double[] rightCategories ()  { throw new RuntimeException(); }
  /** [0, numCategories) \ cats */
  private  scala.collection.immutable.Set<java.lang.Object> setComplement (scala.collection.immutable.Set<java.lang.Object> cats)  { throw new RuntimeException(); }
}
