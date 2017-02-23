package org.apache.spark.mllib.evaluation.binary;
/**
 * Trait for a binary confusion matrix.
 */
  interface BinaryConfusionMatrix {
  /** number of true positives */
  public  long numTruePositives ()  ;
  /** number of false positives */
  public  long numFalsePositives ()  ;
  /** number of false negatives */
  public  long numFalseNegatives ()  ;
  /** number of true negatives */
  public  long numTrueNegatives ()  ;
  /** number of positives */
  public  long numPositives ()  ;
  /** number of negatives */
  public  long numNegatives ()  ;
}
