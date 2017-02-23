package org.apache.spark.ml.clustering;
/**
 * :: Experimental ::
 * Summary of BisectingKMeans.
 * <p>
 * param:  predictions  <code>DataFrame</code> produced by <code>BisectingKMeansModel.transform()</code>.
 * param:  predictionCol  Name for column of predicted clusters in <code>predictions</code>.
 * param:  featuresCol  Name for column of features in <code>predictions</code>.
 * param:  k  Number of clusters.
 */
public  class BisectingKMeansSummary extends org.apache.spark.ml.clustering.ClusteringSummary {
     BisectingKMeansSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String featuresCol, int k)  { throw new RuntimeException(); }
}
