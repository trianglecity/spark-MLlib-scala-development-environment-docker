package org.apache.spark.mllib.evaluation.binary;
/**
 * Implementation of {@link org.apache.spark.mllib.evaluation.binary.BinaryConfusionMatrix}.
 * <p>
 * param:  count label counter for labels with scores greater than or equal to the current score
 * param:  totalCount label counter for all labels
 */
  class BinaryConfusionMatrixImpl implements org.apache.spark.mllib.evaluation.binary.BinaryConfusionMatrix, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter count ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter totalCount ()  { throw new RuntimeException(); }
  // not preceding
  public   BinaryConfusionMatrixImpl (org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter count, org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter totalCount)  { throw new RuntimeException(); }
  /** number of true positives */
  public  long numTruePositives ()  { throw new RuntimeException(); }
  /** number of false positives */
  public  long numFalsePositives ()  { throw new RuntimeException(); }
  /** number of false negatives */
  public  long numFalseNegatives ()  { throw new RuntimeException(); }
  /** number of true negatives */
  public  long numTrueNegatives ()  { throw new RuntimeException(); }
  /** number of positives */
  public  long numPositives ()  { throw new RuntimeException(); }
  /** number of negatives */
  public  long numNegatives ()  { throw new RuntimeException(); }
}
