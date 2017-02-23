package org.apache.spark.mllib.clustering;
public  class ExpectationSum implements scala.Serializable {
  static public  org.apache.spark.mllib.clustering.ExpectationSum zero (int k, int d)  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.clustering.ExpectationSum add (double[] weights, org.apache.spark.mllib.stat.distribution.MultivariateGaussian[] dists, org.apache.spark.mllib.clustering.ExpectationSum sums, breeze.linalg.Vector<java.lang.Object> x)  { throw new RuntimeException(); }
  public  double logLikelihood ()  { throw new RuntimeException(); }
  public  double[] weights ()  { throw new RuntimeException(); }
  public  breeze.linalg.DenseVector<java.lang.Object>[] means ()  { throw new RuntimeException(); }
  public  breeze.linalg.DenseMatrix<java.lang.Object>[] sigmas ()  { throw new RuntimeException(); }
  // not preceding
  public   ExpectationSum (double logLikelihood, double[] weights, breeze.linalg.DenseVector<java.lang.Object>[] means, breeze.linalg.DenseMatrix<java.lang.Object>[] sigmas)  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
}
