package org.apache.spark.examples.ml;
/**
 * Example of defining a type of {@link Classifier}.
 * <p>
 * NOTE: This is private since it is an example. In practice, you may not want it to be private.
 */
public  class MyLogisticRegression extends org.apache.spark.ml.classification.Classifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.examples.ml.MyLogisticRegression, org.apache.spark.examples.ml.MyLogisticRegressionModel> implements org.apache.spark.examples.ml.MyLogisticRegressionParams {
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MyLogisticRegression (java.lang.String uid)  { throw new RuntimeException(); }
  public   MyLogisticRegression ()  { throw new RuntimeException(); }
  public  org.apache.spark.examples.ml.MyLogisticRegression setMaxIter (int value)  { throw new RuntimeException(); }
  protected  org.apache.spark.examples.ml.MyLogisticRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.examples.ml.MyLogisticRegression copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
