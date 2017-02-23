package org.apache.spark.mllib.api.python;
/**
 * Wrapper around LDAModel to provide helper methods in Python
 */
  class LDAModelWrapper {
  public   LDAModelWrapper (org.apache.spark.mllib.clustering.LDAModel model)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Matrix topicsMatrix ()  { throw new RuntimeException(); }
  public  int vocabSize ()  { throw new RuntimeException(); }
  public  byte[] describeTopics ()  { throw new RuntimeException(); }
  public  byte[] describeTopics (int maxTermsPerTopic)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
