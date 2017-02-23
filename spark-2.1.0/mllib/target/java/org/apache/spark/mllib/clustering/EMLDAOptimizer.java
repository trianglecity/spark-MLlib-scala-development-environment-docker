package org.apache.spark.mllib.clustering;
/**
 * :: DeveloperApi ::
 * <p>
 * Optimizer for EM algorithm which stores data + parameter graph, plus algorithm parameters.
 * <p>
 * Currently, the underlying implementation uses Expectation-Maximization (EM), implemented
 * according to the Asuncion et al. (2009) paper referenced below.
 * <p>
 * References:
 *  - Original LDA paper (journal version):
 *    Blei, Ng, and Jordan.  "Latent Dirichlet Allocation."  JMLR, 2003.
 *     - This class implements their "smoothed" LDA model.
 *  - Paper which clearly explains several algorithms, including EM:
 *    Asuncion, Welling, Smyth, and Teh.
 *    "On Smoothing and Inference for Topic Models."  UAI, 2009.
 */
public final class EMLDAOptimizer implements org.apache.spark.mllib.clustering.LDAOptimizer {
  public   EMLDAOptimizer ()  { throw new RuntimeException(); }
  private  boolean keepLastCheckpoint ()  { throw new RuntimeException(); }
  /**
   * If using checkpointing, this indicates whether to keep the last checkpoint (vs clean up).
   * @return (undocumented)
   */
  public  boolean getKeepLastCheckpoint ()  { throw new RuntimeException(); }
  /**
   * If using checkpointing, this indicates whether to keep the last checkpoint (vs clean up).
   * Deleting the checkpoint can cause failures if a data partition is lost, so set this bit with
   * care.
   * <p>
   * Default: true
   * <p>
   * @note Checkpoints will be cleaned up via reference counting, regardless.
   * @param keepLastCheckpoint (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.EMLDAOptimizer setKeepLastCheckpoint (boolean keepLastCheckpoint)  { throw new RuntimeException(); }
    org.apache.spark.graphx.Graph<breeze.linalg.DenseVector<java.lang.Object>, java.lang.Object> graph ()  { throw new RuntimeException(); }
    int k ()  { throw new RuntimeException(); }
    int vocabSize ()  { throw new RuntimeException(); }
    double docConcentration ()  { throw new RuntimeException(); }
    double topicConcentration ()  { throw new RuntimeException(); }
    int checkpointInterval ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.impl.PeriodicGraphCheckpointer<breeze.linalg.DenseVector<java.lang.Object>, java.lang.Object> graphCheckpointer ()  { throw new RuntimeException(); }
  /**
   * Compute bipartite term/doc graph.
   * @param docs (undocumented)
   * @param lda (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.EMLDAOptimizer initialize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> docs, org.apache.spark.mllib.clustering.LDA lda)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.EMLDAOptimizer next ()  { throw new RuntimeException(); }
  /**
   * Aggregate distributions over topics from all term vertices.
   * <p>
   * Note: This executes an action on the graph RDDs.
   * @return (undocumented)
   */
    breeze.linalg.DenseVector<java.lang.Object> globalTopicTotals ()  { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> computeGlobalTopicTotals ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.LDAModel getLDAModel (double[] iterationTimes)  { throw new RuntimeException(); }
}
