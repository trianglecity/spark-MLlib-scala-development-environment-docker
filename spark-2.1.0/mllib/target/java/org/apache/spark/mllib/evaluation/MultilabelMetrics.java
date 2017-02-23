package org.apache.spark.mllib.evaluation;
/**
 * Evaluator for multilabel classification.
 * param:  predictionAndLabels an RDD of (predictions, labels) pairs,
 * both are non-null Arrays, each with unique elements.
 */
public  class MultilabelMetrics {
  public   MultilabelMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<double[], double[]>> predictionAndLabels)  { throw new RuntimeException(); }
  /**
   * An auxiliary constructor taking a DataFrame.
   * @param predictionAndLabels a DataFrame with two double array columns: prediction and label
   */
     MultilabelMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictionAndLabels)  { throw new RuntimeException(); }
  private  long numDocs ()  { throw new RuntimeException(); }
  private  long numLabels ()  { throw new RuntimeException(); }
  /**
   * Returns subset accuracy
   * (for equal sets of labels)
   * @return (undocumented)
   */
  public  double subsetAccuracy ()  { throw new RuntimeException(); }
  /**
   * Returns accuracy
   * @return (undocumented)
   */
  public  double accuracy ()  { throw new RuntimeException(); }
  /**
   * Returns Hamming-loss
   * @return (undocumented)
   */
  public  double hammingLoss ()  { throw new RuntimeException(); }
  /**
   * Returns document-based precision averaged by the number of documents
   * @return (undocumented)
   */
  public  double precision ()  { throw new RuntimeException(); }
  /**
   * Returns document-based recall averaged by the number of documents
   * @return (undocumented)
   */
  public  double recall ()  { throw new RuntimeException(); }
  /**
   * Returns document-based f1-measure averaged by the number of documents
   * @return (undocumented)
   */
  public  double f1Measure ()  { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> tpPerClass ()  { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> fpPerClass ()  { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> fnPerClass ()  { throw new RuntimeException(); }
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
   * Returns f1-measure for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double f1Measure (double label)  { throw new RuntimeException(); }
  private  long sumTp ()  { throw new RuntimeException(); }
  private  long sumFpClass ()  { throw new RuntimeException(); }
  private  long sumFnClass ()  { throw new RuntimeException(); }
  /**
   * Returns micro-averaged label-based precision
   * (equals to micro-averaged document-based precision)
   * @return (undocumented)
   */
  public  double microPrecision ()  { throw new RuntimeException(); }
  /**
   * Returns micro-averaged label-based recall
   * (equals to micro-averaged document-based recall)
   * @return (undocumented)
   */
  public  double microRecall ()  { throw new RuntimeException(); }
  /**
   * Returns micro-averaged label-based f1-measure
   * (equals to micro-averaged document-based f1-measure)
   * @return (undocumented)
   */
  public  double microF1Measure ()  { throw new RuntimeException(); }
  /**
   * Returns the sequence of labels in ascending order
   * @return (undocumented)
   */
  public  double[] labels ()  { throw new RuntimeException(); }
}
