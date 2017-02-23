package org.apache.spark.ml.r;
public  class LogisticRegressionWrapper$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.r.LogisticRegressionWrapper> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogisticRegressionWrapper$ MODULE$ = null;
  public   LogisticRegressionWrapper$ ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.LogisticRegressionWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, double regParam, double elasticNetParam, int maxIter, double tol, java.lang.String family, boolean standardization, double[] thresholds, java.lang.String weightCol)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LogisticRegressionWrapper> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.r.LogisticRegressionWrapper load (java.lang.String path)  { throw new RuntimeException(); }
}
