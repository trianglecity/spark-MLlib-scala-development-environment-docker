package org.apache.spark.ml.clustering;
/**
 * :: Experimental ::
 * Summary of KMeans.
 * <p>
 * param:  predictions  <code>DataFrame</code> produced by <code>KMeansModel.transform()</code>.
 * param:  predictionCol  Name for column of predicted clusters in <code>predictions</code>.
 * param:  featuresCol  Name for column of features in <code>predictions</code>.
 * param:  k  Number of clusters.
 */
public  class KMeansSummary extends org.apache.spark.ml.clustering.ClusteringSummary {
     KMeansSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String featuresCol, int k)  { throw new RuntimeException(); }
}
