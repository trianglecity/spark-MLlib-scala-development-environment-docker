package org.apache.spark.mllib.clustering;
/**
 * StreamingKMeansModel extends MLlib's KMeansModel for streaming
 * algorithms, so it can keep track of a continuously updated weight
 * associated with each cluster, and also update the model by
 * doing a single iteration of the standard k-means algorithm.
 * <p>
 * The update algorithm uses the "mini-batch" KMeans rule,
 * generalized to incorporate forgetfullness (i.e. decay).
 * The update rule (for each cluster) is:
 * <p>
 * <blockquote>
 *    $$
 *    \begin{align}
 *     c_t+1 &amp;= [(c_t * n_t * a) + (x_t * m_t)] / [n_t + m_t] \\
 *     n_t+t &amp;= n_t * a + m_t
 *    \end{align}
 *    $$
 * </blockquote>
 * <p>
 * Where c_t is the previously estimated centroid for that cluster,
 * n_t is the number of points assigned to it thus far, x_t is the centroid
 * estimated on the current batch, and m_t is the number of points assigned
 * to that centroid in the current batch.
 * <p>
 * The decay factor 'a' scales the contribution of the clusters as estimated thus far,
 * by applying a as a discount weighting on the current point when evaluating
 * new incoming data. If a=1, all batches are weighted equally. If a=0, new centroids
 * are determined entirely by recent data. Lower values correspond to
 * more forgetting.
 * <p>
 * Decay can optionally be specified by a half life and associated
 * time unit. The time unit can either be a batch of data or a single
 * data point. Considering data arrived at time t, the half life h is defined
 * such that at time t + h the discount applied to the data from t is 0.5.
 * The definition remains the same whether the time unit is given
 * as batches or points.
 */
public  class StreamingKMeansModel extends org.apache.spark.mllib.clustering.KMeansModel implements org.apache.spark.internal.Logging {
  public  org.apache.spark.mllib.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  public  double[] clusterWeights ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingKMeansModel (org.apache.spark.mllib.linalg.Vector[] clusterCenters, double[] clusterWeights)  { throw new RuntimeException(); }
  /**
   * Perform a k-means update on a batch of data.
   * @param data (undocumented)
   * @param decayFactor (undocumented)
   * @param timeUnit (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.StreamingKMeansModel update (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, double decayFactor, java.lang.String timeUnit)  { throw new RuntimeException(); }
}
