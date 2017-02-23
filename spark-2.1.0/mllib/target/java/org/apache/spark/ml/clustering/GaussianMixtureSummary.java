package org.apache.spark.ml.clustering;
/**
 * :: Experimental ::
 * Summary of GaussianMixture.
 * <p>
 * param:  predictions  <code>DataFrame</code> produced by <code>GaussianMixtureModel.transform()</code>.
 * param:  predictionCol  Name for column of predicted clusters in <code>predictions</code>.
 * param:  probabilityCol  Name for column of predicted probability of each cluster
 *                        in <code>predictions</code>.
 * param:  featuresCol  Name for column of features in <code>predictions</code>.
 * param:  k  Number of clusters.
 */
public  class GaussianMixtureSummary extends org.apache.spark.ml.clustering.ClusteringSummary {
  public  java.lang.String probabilityCol ()  { throw new RuntimeException(); }
  // not preceding
     GaussianMixtureSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String probabilityCol, java.lang.String featuresCol, int k)  { throw new RuntimeException(); }
  /**
   * Probability of each cluster.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> probability ()  { throw new RuntimeException(); }
}
