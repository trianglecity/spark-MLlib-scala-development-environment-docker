package org.apache.spark.mllib.evaluation.binary;
/**
 * A counter for positives and negatives.
 * <p>
 * param:  numPositives number of positive labels
 * param:  numNegatives number of negative labels
 */
  class BinaryLabelCounter implements scala.Serializable {
  public  long numPositives ()  { throw new RuntimeException(); }
  public  long numNegatives ()  { throw new RuntimeException(); }
  // not preceding
  public   BinaryLabelCounter (long numPositives, long numNegatives)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.evaluation.binary.BinaryLabelCounter clone ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
