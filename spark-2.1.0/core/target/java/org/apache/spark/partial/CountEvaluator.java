package org.apache.spark.partial;
/**
 * An ApproximateEvaluator for counts.
 */
  class CountEvaluator implements org.apache.spark.partial.ApproximateEvaluator<java.lang.Object, org.apache.spark.partial.BoundedDouble> {
  static public  org.apache.spark.partial.BoundedDouble bound (double confidence, long sum, double p)  { throw new RuntimeException(); }
  public   CountEvaluator (int totalOutputs, double confidence)  { throw new RuntimeException(); }
  private  int outputsMerged ()  { throw new RuntimeException(); }
  private  long sum ()  { throw new RuntimeException(); }
  public  void merge (int outputId, long taskResult)  { throw new RuntimeException(); }
  public  org.apache.spark.partial.BoundedDouble currentResult ()  { throw new RuntimeException(); }
}
