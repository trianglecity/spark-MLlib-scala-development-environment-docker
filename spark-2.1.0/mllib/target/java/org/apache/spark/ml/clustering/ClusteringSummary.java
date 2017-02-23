package org.apache.spark.ml.clustering;
/**
 * :: Experimental ::
 * Summary of clustering algorithms.
 * <p>
 * param:  predictions  <code>DataFrame</code> produced by model.transform().
 * param:  predictionCol  Name for column of predicted clusters in <code>predictions</code>.
 * param:  featuresCol  Name for column of features in <code>predictions</code>.
 * param:  k  Number of clusters.
 */
public  class ClusteringSummary implements scala.Serializable {
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String featuresCol ()  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
  // not preceding
     ClusteringSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String featuresCol, int k)  { throw new RuntimeException(); }
  /**
   * Cluster centers of the transformed data.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> cluster ()  { throw new RuntimeException(); }
  /**
   * Size of (number of data points in) each cluster.
   * @return (undocumented)
   */
  public  long[] clusterSizes ()  { throw new RuntimeException(); }
}
