package org.apache.spark.mllib.api.python;
/**
 * A Wrapper of MatrixFactorizationModel to provide helper method for Python.
 */
  class MatrixFactorizationModelWrapper extends org.apache.spark.mllib.recommendation.MatrixFactorizationModel {
  public   MatrixFactorizationModelWrapper (org.apache.spark.mllib.recommendation.MatrixFactorizationModel model)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> predict (org.apache.spark.api.java.JavaRDD<java.lang.Object[]> userAndProducts)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object[]> getUserFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object[]> getProductFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object[]> wrappedRecommendProductsForUsers (int num)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object[]> wrappedRecommendUsersForProducts (int num)  { throw new RuntimeException(); }
}
