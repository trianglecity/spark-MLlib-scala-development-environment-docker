package org.apache.spark.mllib.clustering;
/**
 * Latent Dirichlet Allocation (LDA), a topic model designed for text documents.
 * <p>
 * Terminology:
 *  - "word" = "term": an element of the vocabulary
 *  - "token": instance of a term appearing in a document
 *  - "topic": multinomial distribution over words representing some concept
 * <p>
 * References:
 *  - Original LDA paper (journal version):
 *    Blei, Ng, and Jordan.  "Latent Dirichlet Allocation."  JMLR, 2003.
 * <p>
 * @see <a href="http://en.wikipedia.org/wiki/Latent_Dirichlet_allocation">
 * Latent Dirichlet allocation (Wikipedia)</a>
 */
public  class LDA implements org.apache.spark.internal.Logging {
  /** Term vertex IDs are {-1, -2, ..., -vocabSize} */
  static   long term2index (int term)  { throw new RuntimeException(); }
  static   int index2term (long termIndex)  { throw new RuntimeException(); }
  static   boolean isDocumentVertex (scala.Tuple2<java.lang.Object, ?> v)  { throw new RuntimeException(); }
  static   boolean isTermVertex (scala.Tuple2<java.lang.Object, ?> v)  { throw new RuntimeException(); }
  /**
   * Compute gamma_{wjk}, a distribution over topics k.
   * @param docTopicCounts (undocumented)
   * @param termTopicCounts (undocumented)
   * @param totalTopicCounts (undocumented)
   * @param vocabSize (undocumented)
   * @param eta (undocumented)
   * @param alpha (undocumented)
   * @return (undocumented)
   */
  static   breeze.linalg.DenseVector<java.lang.Object> computePTopic (breeze.linalg.DenseVector<java.lang.Object> docTopicCounts, breeze.linalg.DenseVector<java.lang.Object> termTopicCounts, breeze.linalg.DenseVector<java.lang.Object> totalTopicCounts, int vocabSize, double eta, double alpha)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  private  int k ()  { throw new RuntimeException(); }
  private  int maxIterations ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.linalg.Vector docConcentration ()  { throw new RuntimeException(); }
  private  double topicConcentration ()  { throw new RuntimeException(); }
  private  long seed ()  { throw new RuntimeException(); }
  private  int checkpointInterval ()  { throw new RuntimeException(); }
  private  org.apache.spark.mllib.clustering.LDAOptimizer ldaOptimizer ()  { throw new RuntimeException(); }
  // not preceding
  private   LDA (int k, int maxIterations, org.apache.spark.mllib.linalg.Vector docConcentration, double topicConcentration, long seed, int checkpointInterval, org.apache.spark.mllib.clustering.LDAOptimizer ldaOptimizer)  { throw new RuntimeException(); }
  /**
   * Constructs a LDA instance with default parameters.
   */
  public   LDA ()  { throw new RuntimeException(); }
  /**
   * Number of topics to infer, i.e., the number of soft cluster centers.
   * @return (undocumented)
   */
  public  int getK ()  { throw new RuntimeException(); }
  /**
   * Set the number of topics to infer, i.e., the number of soft cluster centers.
   * (default = 10)
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setK (int k)  { throw new RuntimeException(); }
  /**
   * Concentration parameter (commonly named "alpha") for the prior placed on documents'
   * distributions over topics ("theta").
   * <p>
   * This is the parameter to a Dirichlet distribution.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector getAsymmetricDocConcentration ()  { throw new RuntimeException(); }
  /**
   * Concentration parameter (commonly named "alpha") for the prior placed on documents'
   * distributions over topics ("theta").
   * <p>
   * This method assumes the Dirichlet distribution is symmetric and can be described by a single
   * {@link Double} parameter. It should fail if docConcentration is asymmetric.
   * @return (undocumented)
   */
  public  double getDocConcentration ()  { throw new RuntimeException(); }
  /**
   * Concentration parameter (commonly named "alpha") for the prior placed on documents'
   * distributions over topics ("theta").
   * <p>
   * This is the parameter to a Dirichlet distribution, where larger values mean more smoothing
   * (more regularization).
   * <p>
   * If set to a singleton vector Vector(-1), then docConcentration is set automatically. If set to
   * singleton vector Vector(t) where t != -1, then t is replicated to a vector of length k during
   * <code>LDAOptimizer.initialize()</code>. Otherwise, the {@link docConcentration} vector must be length k.
   * (default = Vector(-1) = automatic)
   * <p>
   * Optimizer-specific parameter settings:
   *  - EM
   *     - Currently only supports symmetric distributions, so all values in the vector should be
   *       the same.
   *     - Values should be greater than 1.0
   *     - default = uniformly (50 / k) + 1, where 50/k is common in LDA libraries and +1 follows
   *       from Asuncion et al. (2009), who recommend a +1 adjustment for EM.
   *  - Online
   *     - Values should be greater than or equal to 0
   *     - default = uniformly (1.0 / k), following the implementation from
   *       <a href="https://github.com/Blei-Lab/onlineldavb">here</a>.
   * @param docConcentration (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setDocConcentration (org.apache.spark.mllib.linalg.Vector docConcentration)  { throw new RuntimeException(); }
  /**
   * Replicates a {@link Double} docConcentration to create a symmetric prior.
   * @param docConcentration (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setDocConcentration (double docConcentration)  { throw new RuntimeException(); }
  /**
   * Alias for {@link getAsymmetricDocConcentration}
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector getAsymmetricAlpha ()  { throw new RuntimeException(); }
  /**
   * Alias for {@link getDocConcentration}
   * @return (undocumented)
   */
  public  double getAlpha ()  { throw new RuntimeException(); }
  /**
   * Alias for <code>setDocConcentration()</code>
   * @param alpha (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setAlpha (org.apache.spark.mllib.linalg.Vector alpha)  { throw new RuntimeException(); }
  /**
   * Alias for <code>setDocConcentration()</code>
   * @param alpha (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setAlpha (double alpha)  { throw new RuntimeException(); }
  /**
   * Concentration parameter (commonly named "beta" or "eta") for the prior placed on topics'
   * distributions over terms.
   * <p>
   * This is the parameter to a symmetric Dirichlet distribution.
   * <p>
   * @note The topics' distributions over terms are called "beta" in the original LDA paper
   * by Blei et al., but are called "phi" in many later papers such as Asuncion et al., 2009.
   * @return (undocumented)
   */
  public  double getTopicConcentration ()  { throw new RuntimeException(); }
  /**
   * Concentration parameter (commonly named "beta" or "eta") for the prior placed on topics'
   * distributions over terms.
   * <p>
   * This is the parameter to a symmetric Dirichlet distribution.
   * <p>
   * @note The topics' distributions over terms are called "beta" in the original LDA paper
   * by Blei et al., but are called "phi" in many later papers such as Asuncion et al., 2009.
   * <p>
   * If set to -1, then topicConcentration is set automatically.
   *  (default = -1 = automatic)
   * <p>
   * Optimizer-specific parameter settings:
   *  - EM
   *     - Value should be greater than 1.0
   *     - default = 0.1 + 1, where 0.1 gives a small amount of smoothing and +1 follows
   *       Asuncion et al. (2009), who recommend a +1 adjustment for EM.
   *  - Online
   *     - Value should be greater than or equal to 0
   *     - default = (1.0 / k), following the implementation from
   *       <a href="https://github.com/Blei-Lab/onlineldavb">here</a>.
   * @param topicConcentration (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setTopicConcentration (double topicConcentration)  { throw new RuntimeException(); }
  /**
   * Alias for {@link getTopicConcentration}
   * @return (undocumented)
   */
  public  double getBeta ()  { throw new RuntimeException(); }
  /**
   * Alias for <code>setTopicConcentration()</code>
   * @param beta (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setBeta (double beta)  { throw new RuntimeException(); }
  /**
   * Maximum number of iterations allowed.
   * @return (undocumented)
   */
  public  int getMaxIterations ()  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations allowed.
   * (default = 20)
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setMaxIterations (int maxIterations)  { throw new RuntimeException(); }
  /**
   * Random seed for cluster initialization.
   * @return (undocumented)
   */
  public  long getSeed ()  { throw new RuntimeException(); }
  /**
   * Set the random seed for cluster initialization.
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setSeed (long seed)  { throw new RuntimeException(); }
  /**
   * Period (in iterations) between checkpoints.
   * @return (undocumented)
   */
  public  int getCheckpointInterval ()  { throw new RuntimeException(); }
  /**
   * Parameter for set checkpoint interval (greater than or equal to 1) or disable checkpoint (-1).
   * E.g. 10 means that the cache will get checkpointed every 10 iterations. Checkpointing helps
   * with recovery (when nodes fail). It also helps with eliminating temporary shuffle files on
   * disk, which can be important when LDA is run for many iterations. If the checkpoint directory
   * is not set in {@link org.apache.spark.SparkContext}, this setting is ignored. (default = 10)
   * <p>
   * @see org.apache.spark.SparkContext#setCheckpointDir
   * @param checkpointInterval (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setCheckpointInterval (int checkpointInterval)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * <p>
   * LDAOptimizer used to perform the actual calculation
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDAOptimizer getOptimizer ()  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * <p>
   * LDAOptimizer used to perform the actual calculation (default = EMLDAOptimizer)
   * @param optimizer (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setOptimizer (org.apache.spark.mllib.clustering.LDAOptimizer optimizer)  { throw new RuntimeException(); }
  /**
   * Set the LDAOptimizer used to perform the actual calculation by algorithm name.
   * Currently "em", "online" are supported.
   * @param optimizerName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDA setOptimizer (java.lang.String optimizerName)  { throw new RuntimeException(); }
  /**
   * Learn an LDA model using the given dataset.
   * <p>
   * @param documents  RDD of documents, which are term (word) count vectors paired with IDs.
   *                   The term count vectors are "bags of words" with a fixed-size vocabulary
   *                   (where the vocabulary size is the length of the vector).
   *                   Document IDs must be unique and greater than or equal to 0.
   * @return  Inferred LDA model
   */
  public  org.apache.spark.mllib.clustering.LDAModel run (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> documents)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>run()</code>
   * @param documents (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.LDAModel run (org.apache.spark.api.java.JavaPairRDD<java.lang.Long, org.apache.spark.mllib.linalg.Vector> documents)  { throw new RuntimeException(); }
}
