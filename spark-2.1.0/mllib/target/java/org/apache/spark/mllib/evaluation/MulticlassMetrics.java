package org.apache.spark.mllib.evaluation;
/**
 * Evaluator for multiclass classification.
 * <p>
 * param:  predictionAndLabels an RDD of (prediction, label) pairs.
 */
public  class MulticlassMetrics {
  public   MulticlassMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndLabels)  { throw new RuntimeException(); }
  /**
   * An auxiliary constructor taking a DataFrame.
   * @param predictionAndLabels a DataFrame with two double columns: prediction and label
   */
     MulticlassMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictionAndLabels)  { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> labelCountByClass ()  { throw new RuntimeException(); }
  private  long labelCount ()  { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> tpByClass ()  { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> fpByClass ()  { throw new RuntimeException(); }
  private  scala.collection.Map<scala.Tuple2<java.lang.Object, java.lang.Object>, java.lang.Object> confusions ()  { throw new RuntimeException(); }
  /**
   * Returns confusion matrix:
   * predicted classes are in columns,
   * they are ordered by class label ascending,
   * as in "labels"
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix confusionMatrix ()  { throw new RuntimeException(); }
  /**
   * Returns true positive rate for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double truePositiveRate (double label)  { throw new RuntimeException(); }
  /**
   * Returns false positive rate for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double falsePositiveRate (double label)  { throw new RuntimeException(); }
  /**
   * Returns precision for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double precision (double label)  { throw new RuntimeException(); }
  /**
   * Returns recall for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double recall (double label)  { throw new RuntimeException(); }
  /**
   * Returns f-measure for a given label (category)
   * @param label the label.
   * @param beta the beta parameter.
   * @return (undocumented)
   */
  public  double fMeasure (double label, double beta)  { throw new RuntimeException(); }
  /**
   * Returns f1-measure for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double fMeasure (double label)  { throw new RuntimeException(); }
  /**
   * Returns precision
   * @return (undocumented)
   *
   * @deprecated Use accuracy. Since 2.0.0. 
  */
  public  double precision ()  { throw new RuntimeException(); }
  /**
   * Returns recall
   * (equals to precision for multiclass classifier
   * because sum of all false positives is equal to sum
   * of all false negatives)
   * @return (undocumented)
   *
   * @deprecated Use accuracy. Since 2.0.0. 
  */
  public  double recall ()  { throw new RuntimeException(); }
  /**
   * Returns f-measure
   * (equals to precision and recall because precision equals recall)
   * @return (undocumented)
   *
   * @deprecated Use accuracy. Since 2.0.0. 
  */
  public  double fMeasure ()  { throw new RuntimeException(); }
  /**
   * Returns accuracy
   * (equals to the total number of correctly classified instances
   * out of the total number of instances.)
   * @return (undocumented)
   */
  public  double accuracy ()  { throw new RuntimeException(); }
  /**
   * Returns weighted true positive rate
   * (equals to precision, recall and f-measure)
   * @return (undocumented)
   */
  public  double weightedTruePositiveRate ()  { throw new RuntimeException(); }
  /**
   * Returns weighted false positive rate
   * @return (undocumented)
   */
  public  double weightedFalsePositiveRate ()  { throw new RuntimeException(); }
  /**
   * Returns weighted averaged recall
   * (equals to precision, recall and f-measure)
   * @return (undocumented)
   */
  public  double weightedRecall ()  { throw new RuntimeException(); }
  /**
   * Returns weighted averaged precision
   * @return (undocumented)
   */
  public  double weightedPrecision ()  { throw new RuntimeException(); }
  /**
   * Returns weighted averaged f-measure
   * @param beta the beta parameter.
   * @return (undocumented)
   */
  public  double weightedFMeasure (double beta)  { throw new RuntimeException(); }
  /**
   * Returns weighted averaged f1-measure
   * @return (undocumented)
   */
  public  double weightedFMeasure ()  { throw new RuntimeException(); }
  /**
   * Returns the sequence of labels in ascending order
   * @return (undocumented)
   */
  public  double[] labels ()  { throw new RuntimeException(); }
}
