package org.apache.spark.mllib.clustering;
/**
 * Distributed LDA model.
 * This model stores the inferred topics, the full training dataset, and the topic distributions.
 */
public  class DistributedLDAModel extends org.apache.spark.mllib.clustering.LDAModel {
  static private  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    public  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    public  java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  class Data implements scala.Product, scala.Serializable {
      public  org.apache.spark.mllib.linalg.Vector globalTopicTotals ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector globalTopicTotals)  { throw new RuntimeException(); }
    }
    public  class Data extends scala.runtime.AbstractFunction1<org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.clustering.DistributedLDAModel.SaveLoadV1_0.Data> implements scala.Serializable {
      public   Data ()  { throw new RuntimeException(); }
    }
    public  class VertexData implements scala.Product, scala.Serializable {
      public  long id ()  { throw new RuntimeException(); }
      public  org.apache.spark.mllib.linalg.Vector topicWeights ()  { throw new RuntimeException(); }
      // not preceding
      public   VertexData (long id, org.apache.spark.mllib.linalg.Vector topicWeights)  { throw new RuntimeException(); }
    }
    public  class VertexData extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.mllib.linalg.Vector, org.apache.spark.mllib.clustering.DistributedLDAModel.SaveLoadV1_0.VertexData> implements scala.Serializable {
      public   VertexData ()  { throw new RuntimeException(); }
    }
    public  class EdgeData implements scala.Product, scala.Serializable {
      public  long srcId ()  { throw new RuntimeException(); }
      public  long dstId ()  { throw new RuntimeException(); }
      public  double tokenCounts ()  { throw new RuntimeException(); }
      // not preceding
      public   EdgeData (long srcId, long dstId, double tokenCounts)  { throw new RuntimeException(); }
    }
    public  class EdgeData extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.mllib.clustering.DistributedLDAModel.SaveLoadV1_0.EdgeData> implements scala.Serializable {
      public   EdgeData ()  { throw new RuntimeException(); }
    }
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, org.apache.spark.graphx.Graph<breeze.linalg.DenseVector<java.lang.Object>, java.lang.Object> graph, breeze.linalg.DenseVector<java.lang.Object> globalTopicTotals, int k, int vocabSize, org.apache.spark.mllib.linalg.Vector docConcentration, double topicConcentration, double[] iterationTimes, double gammaShape)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.DistributedLDAModel load (org.apache.spark.SparkContext sc, java.lang.String path, int vocabSize, org.apache.spark.mllib.linalg.Vector docConcentration, double topicConcentration, double[] iterationTimes, double gammaShape)  { throw new RuntimeException(); }
  }
  /**
   * The {@link DistributedLDAModel} constructor's default arguments assume gammaShape = 100
   * to ensure equivalence in LDAModel.toLocal conversion.
   * @return (undocumented)
   */
  static   double defaultGammaShape ()  { throw new RuntimeException(); }
  static public  org.apache.spark.mllib.clustering.DistributedLDAModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
    org.apache.spark.graphx.Graph<breeze.linalg.DenseVector<java.lang.Object>, java.lang.Object> graph ()  { throw new RuntimeException(); }
    breeze.linalg.DenseVector<java.lang.Object> globalTopicTotals ()  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
  public  int vocabSize ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector docConcentration ()  { throw new RuntimeException(); }
  public  double topicConcentration ()  { throw new RuntimeException(); }
    double[] iterationTimes ()  { throw new RuntimeException(); }
  protected  double gammaShape ()  { throw new RuntimeException(); }
    java.lang.String[] checkpointFiles ()  { throw new RuntimeException(); }
  // not preceding
     DistributedLDAModel (org.apache.spark.graphx.Graph<breeze.linalg.DenseVector<java.lang.Object>, java.lang.Object> graph, breeze.linalg.DenseVector<java.lang.Object> globalTopicTotals, int k, int vocabSize, org.apache.spark.mllib.linalg.Vector docConcentration, double topicConcentration, double[] iterationTimes, double gammaShape, java.lang.String[] checkpointFiles)  { throw new RuntimeException(); }
  /**
   * Convert model to a local model.
   * The local model stores the inferred topics but not the topic distributions for training
   * documents.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LocalLDAModel toLocal ()  { throw new RuntimeException(); }
  /**
   * Inferred topics, where each topic is represented by a distribution over terms.
   * This is a matrix of size vocabSize x k, where each column is a topic.
   * No guarantees are given about the ordering of the topics.
   * <p>
   * WARNING: This matrix is collected from an RDD. Beware memory usage when vocabSize, k are large.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix topicsMatrix ()  { throw new RuntimeException(); }
  public  scala.Tuple2<int[], double[]>[] describeTopics (int maxTermsPerTopic)  { throw new RuntimeException(); }
  /**
   * Return the top documents for each topic
   * <p>
   * @param maxDocumentsPerTopic  Maximum number of documents to collect for each topic.
   * @return  Array over topics.  Each element represent as a pair of matching arrays:
   *          (IDs for the documents, weights of the topic in these documents).
   *          For each topic, documents are sorted in order of decreasing topic weights.
   */
  public  scala.Tuple2<long[], double[]>[] topDocumentsPerTopic (int maxDocumentsPerTopic)  { throw new RuntimeException(); }
  /**
   * Return the top topic for each (doc, term) pair.  I.e., for each document, what is the most
   * likely topic generating each term?
   * <p>
   * @return RDD of (doc ID, assignment of top topic index for each term),
   *         where the assignment is specified via a pair of zippable arrays
   *         (term indices, topic indices).  Note that terms will be omitted if not present in
   *         the document.
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, int[], int[]>> topicAssignments ()  { throw new RuntimeException(); }
  /** Java-friendly version of {@link topicAssignments} */
  public  org.apache.spark.api.java.JavaRDD<scala.Tuple3<java.lang.Long, int[], int[]>> javaTopicAssignments ()  { throw new RuntimeException(); }
  /**
   * Log likelihood of the observed tokens in the training set,
   * given the current parameter estimates:
   *  log P(docs | topics, topic distributions for docs, alpha, eta)
   * <p>
   * Note:
   *  - This excludes the prior; for that, use {@link logPrior}.
   *  - Even with {@link logPrior}, this is NOT the same as the data log likelihood given the
   *    hyperparameters.
   * @return (undocumented)
   */
  public  double logLikelihood ()  { throw new RuntimeException(); }
  /**
   * Log probability of the current parameter estimate:
   * log P(topics, topic distributions for docs | alpha, eta)
   * @return (undocumented)
   */
  public  double logPrior ()  { throw new RuntimeException(); }
  /**
   * For each document in the training set, return the distribution over topics for that document
   * ("theta_doc").
   * <p>
   * @return  RDD of (document ID, topic distribution) pairs
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> topicDistributions ()  { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link topicDistributions}
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaPairRDD<java.lang.Long, org.apache.spark.mllib.linalg.Vector> javaTopicDistributions ()  { throw new RuntimeException(); }
  /**
   * For each document, return the top k weighted topics for that document and their weights.
   * @return RDD of (doc ID, topic indices, topic weights)
   * @param k (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, int[], double[]>> topTopicsPerDocument (int k)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link topTopicsPerDocument}
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<scala.Tuple3<java.lang.Long, int[], double[]>> javaTopTopicsPerDocument (int k)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
