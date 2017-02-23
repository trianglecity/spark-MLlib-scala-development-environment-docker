package org.apache.spark.ml.classification;
/** Label to vector converter. */
public  class LabelConverter$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LabelConverter$ MODULE$ = null;
  public   LabelConverter$ ()  { throw new RuntimeException(); }
  /**
   * Encodes a label as a vector.
   * Returns a vector of given length with zeroes at all positions
   * and value 1.0 at the position that corresponds to the label.
   * <p>
   * @param labeledPoint labeled point
   * @param labelCount total number of labels
   * @return pair of features and vector encoding of a label
   */
  public  scala.Tuple2<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> encodeLabeledPoint (org.apache.spark.ml.feature.LabeledPoint labeledPoint, int labelCount)  { throw new RuntimeException(); }
  /**
   * Converts a vector to a label.
   * Returns the position of the maximal element of a vector.
   * <p>
   * @param output label encoded with a vector
   * @return label
   */
  public  double decodeLabel (org.apache.spark.ml.linalg.Vector output)  { throw new RuntimeException(); }
}
