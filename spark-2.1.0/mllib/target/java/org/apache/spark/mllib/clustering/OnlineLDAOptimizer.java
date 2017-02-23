package org.apache.spark.mllib.clustering;
/**
 * :: DeveloperApi ::
 * <p>
 * An online optimizer for LDA. The Optimizer implements the Online variational Bayes LDA
 * algorithm, which processes a subset of the corpus on each iteration, and updates the term-topic
 * distribution adaptively.
 * <p>
 * Original Online LDA paper:
 *   Hoffman, Blei and Bach, "Online Learning for Latent Dirichlet Allocation." NIPS, 2010.
 */
public final class OnlineLDAOptimizer implements org.apache.spark.mllib.clustering.LDAOptimizer {
  /**
   * Uses variational inference to infer the topic distribution <code>gammad</code> given the term counts
   * for a document. <code>termCounts</code> must contain at least one non-zero entry, otherwise Breeze will
   * throw a BLAS error.
   * <p>
   * An optimization (Lee, Seung: Algorithms for non-negative matrix factorization, NIPS 2001)
   * avoids explicit computation of variational parameter <code>phi</code>.
   * @see <a href="http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.31.7566">here</a>
   * <p>
   * @return Returns a tuple of <code>gammad</code> - estimate of gamma, the topic distribution, <code>sstatsd</code> -
   *         statistics for updating lambda and <code>ids</code> - list of termCounts vector indices.
   * @param termCounts (undocumented)
   * @param expElogbeta (undocumented)
   * @param alpha (undocumented)
   * @param gammaShape (undocumented)
   * @param k (undocumented)
   */
  static   scala.Tuple3<breeze.linalg.DenseVector<java.lang.Object>, breeze.linalg.DenseMatrix<java.lang.Object>, scala.collection.immutable.List<java.lang.Object>> variationalTopicInference (org.apache.spark.mllib.linalg.Vector termCounts, breeze.linalg.DenseMatrix<java.lang.Object> expElogbeta, breeze.linalg.Vector<java.lang.Object> alpha, double gammaShape, int k)  { throw new RuntimeException(); }
  public   OnlineLDAOptimizer ()  { throw new RuntimeException(); }
  private  int k ()  { throw new RuntimeException(); }
  private  long corpusSize ()  { throw new RuntimeException(); }
  private  int vocabSize ()  { throw new RuntimeException(); }
  /** alias for docConcentration */
  private  org.apache.spark.mllib.linalg.Vector alpha ()  { throw new RuntimeException(); }
  /** (for debugging)  Get docConcentration */
    org.apache.spark.mllib.linalg.Vector getAlpha ()  { throw new RuntimeException(); }
  /** alias for topicConcentration */
  private  double eta ()  { throw new RuntimeException(); }
  /** (for debugging)  Get topicConcentration */
    double getEta ()  { throw new RuntimeException(); }
  private  java.util.Random randomGenerator ()  { throw new RuntimeException(); }
  /** (for debugging) Whether to sample mini-batches with replacement. (default = true) */
  private  boolean sampleWithReplacement ()  { throw new RuntimeException(); }
  private  double tau0 ()  { throw new RuntimeException(); }
  private  double kappa ()  { throw new RuntimeException(); }
  private  double miniBatchFraction ()  { throw new RuntimeException(); }
  private  boolean optimizeDocConcentration ()  { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> docs ()  { throw new RuntimeException(); }
  /** Dirichlet parameter for the posterior over topics */
  private  breeze.linalg.DenseMatrix<java.lang.Object> lambda ()  { throw new RuntimeException(); }
  /** (for debugging) Get parameter for topics */
    breeze.linalg.DenseMatrix<java.lang.Object> getLambda ()  { throw new RuntimeException(); }
  /** Current iteration (count of invocations of {@link next()}) */
  private  int iteration ()  { throw new RuntimeException(); }
  private  double gammaShape ()  { throw new RuntimeException(); }
  /**
   * A (positive) learning parameter that downweights early iterations. Larger values make early
   * iterations count less.
   * @return (undocumented)
   */
  public  double getTau0 ()  { throw new RuntimeException(); }
  /**
   * A (positive) learning parameter that downweights early iterations. Larger values make early
   * iterations count less.
   * Default: 1024, following the original Online LDA paper.
   * @param tau0 (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.OnlineLDAOptimizer setTau0 (double tau0)  { throw new RuntimeException(); }
  /**
   * Learning rate: exponential decay rate
   * @return (undocumented)
   */
  public  double getKappa ()  { throw new RuntimeException(); }
  /**
   * Learning rate: exponential decay rate---should be between
   * (0.5, 1.0] to guarantee asymptotic convergence.
   * Default: 0.51, based on the original Online LDA paper.
   * @param kappa (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.OnlineLDAOptimizer setKappa (double kappa)  { throw new RuntimeException(); }
  /**
   * Mini-batch fraction, which sets the fraction of document sampled and used in each iteration
   * @return (undocumented)
   */
  public  double getMiniBatchFraction ()  { throw new RuntimeException(); }
  /**
   * Mini-batch fraction in (0, 1], which sets the fraction of document sampled and used in
   * each iteration.
   * <p>
   * @note This should be adjusted in synch with <code>LDA.setMaxIterations()</code>
   * so the entire corpus is used.  Specifically, set both so that
   * maxIterations * miniBatchFraction is at least 1.
   * <p>
   * Default: 0.05, i.e., 5% of total documents.
   * @param miniBatchFraction (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.OnlineLDAOptimizer setMiniBatchFraction (double miniBatchFraction)  { throw new RuntimeException(); }
  /**
   * Optimize docConcentration, indicates whether docConcentration (Dirichlet parameter for
   * document-topic distribution) will be optimized during training.
   * @return (undocumented)
   */
  public  boolean getOptimizeDocConcentration ()  { throw new RuntimeException(); }
  /**
   * Sets whether to optimize docConcentration parameter during training.
   * <p>
   * Default: false
   * @param optimizeDocConcentration (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.OnlineLDAOptimizer setOptimizeDocConcentration (boolean optimizeDocConcentration)  { throw new RuntimeException(); }
  /**
   * Set the Dirichlet parameter for the posterior over topics.
   * This is only used for testing now. In the future, it can help support training stop/resume.
   * @param lambda (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer setLambda (breeze.linalg.DenseMatrix<java.lang.Object> lambda)  { throw new RuntimeException(); }
  /**
   * Used for random initialization of the variational parameters.
   * Larger value produces values closer to 1.0.
   * This is only used for testing currently.
   * @param shape (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer setGammaShape (double shape)  { throw new RuntimeException(); }
  /**
   * Sets whether to sample mini-batches with or without replacement. (default = true)
   * This is only used for testing currently.
   * @param replace (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer setSampleWithReplacement (boolean replace)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer initialize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> docs, org.apache.spark.mllib.clustering.LDA lda)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer next ()  { throw new RuntimeException(); }
  /**
   * Submit a subset (like 1%, decide by the miniBatchFraction) of the corpus to the Online LDA
   * model, and it will update the topic distribution adaptively for the terms appearing in the
   * subset.
   * @param batch (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.clustering.OnlineLDAOptimizer submitMiniBatch (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> batch)  { throw new RuntimeException(); }
  /**
   * Update lambda based on the batch submitted. batchSize can be different for each iteration.
   * @param stat (undocumented)
   * @param batchSize (undocumented)
   */
  private  void updateLambda (breeze.linalg.DenseMatrix<java.lang.Object> stat, int batchSize)  { throw new RuntimeException(); }
  /**
   * Update alpha based on <code>gammat</code>, the inferred topic distributions for documents in the
   * current mini-batch. Uses Newton-Rhapson method.
   * @see Section 3.3, Huang: Maximum Likelihood Estimation of Dirichlet Distribution Parameters
   *      (http://jonathan-huang.org/research/dirichlet/dirichlet.pdf)
   * @param gammat (undocumented)
   */
  private  void updateAlpha (breeze.linalg.DenseMatrix<java.lang.Object> gammat)  { throw new RuntimeException(); }
  /** Calculate learning rate rho for the current {@link iteration}. */
  private  double rho ()  { throw new RuntimeException(); }
  /**
   * Get a random matrix to initialize lambda.
   * @param row (undocumented)
   * @param col (undocumented)
   * @return (undocumented)
   */
  private  breeze.linalg.DenseMatrix<java.lang.Object> getGammaMatrix (int row, int col)  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.LDAModel getLDAModel (double[] iterationTimes)  { throw new RuntimeException(); }
}
