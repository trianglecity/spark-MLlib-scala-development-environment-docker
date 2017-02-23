package org.apache.spark.mllib.tree.model;
/**
 * :: DeveloperApi ::
 * Split applied to a feature
 * param:  feature feature index
 * param:  threshold Threshold for continuous feature.
 *                  Split left if feature is less than or equal to threshold, else right.
 * param:  featureType type of feature -- categorical or continuous
 * param:  categories Split left if categorical feature value is in this set, else right.
 */
public  class Split implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int feature ()  { throw new RuntimeException(); }
  public  double threshold ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value featureType ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.Object> categories ()  { throw new RuntimeException(); }
  // not preceding
  public   Split (int feature, double threshold, scala.Enumeration.Value featureType, scala.collection.immutable.List<java.lang.Object> categories)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
