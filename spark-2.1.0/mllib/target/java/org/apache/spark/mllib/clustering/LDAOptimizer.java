package org.apache.spark.mllib.clustering;
/**
 * :: DeveloperApi ::
 * <p>
 * An LDAOptimizer specifies which optimization/learning/inference algorithm to use, and it can
 * hold optimizer-specific parameters for users to set.
 */
public  interface LDAOptimizer {
  /**
   * Initializer for the optimizer. LDA passes the common parameters to the optimizer and
   * the internal structure can be initialized properly.
   * @param docs (undocumented)
   * @param lda (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.LDAOptimizer initialize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> docs, org.apache.spark.mllib.clustering.LDA lda)  ;
    org.apache.spark.mllib.clustering.LDAOptimizer next ()  ;
    org.apache.spark.mllib.clustering.LDAModel getLDAModel (double[] iterationTimes)  ;
}
