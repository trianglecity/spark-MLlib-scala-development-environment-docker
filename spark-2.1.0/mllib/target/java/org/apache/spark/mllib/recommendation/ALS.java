package org.apache.spark.mllib.recommendation;
/**
 * Alternating Least Squares matrix factorization.
 * <p>
 * ALS attempts to estimate the ratings matrix <code>R</code> as the product of two lower-rank matrices,
 * <code>X</code> and <code>Y</code>, i.e. <code>X * Yt = R</code>. Typically these approximations are called 'factor' matrices.
 * The general approach is iterative. During each iteration, one of the factor matrices is held
 * constant, while the other is solved for using least squares. The newly-solved factor matrix is
 * then held constant while solving for the other factor matrix.
 * <p>
 * This is a blocked implementation of the ALS factorization algorithm that groups the two sets
 * of factors (referred to as "users" and "products") into blocks and reduces communication by only
 * sending one copy of each user vector to each product block on each iteration, and only for the
 * product blocks that need that user's feature vector. This is achieved by precomputing some
 * information about the ratings matrix to determine the "out-links" of each user (which blocks of
 * products it will contribute to) and "in-link" information for each product (which of the feature
 * vectors it receives from each user block it will depend on). This allows us to send only an
 * array of feature vectors between each user block and product block, and have the product block
 * find the users' ratings and update the products based on these messages.
 * <p>
 * For implicit preference data, the algorithm used is based on
 * "Collaborative Filtering for Implicit Feedback Datasets", available at
 * <a href="http://dx.doi.org/10.1109/ICDM.2008.22">here</a>, adapted for the blocked approach
 * used here.
 * <p>
 * Essentially instead of finding the low-rank approximations to the rating matrix <code>R</code>,
 * this finds the approximations for a preference matrix <code>P</code> where the elements of <code>P</code> are 1 if
 * r &amp;gt; 0 and 0 if r &amp;lt;= 0. The ratings then act as 'confidence' values related to strength of
 * indicated user
 * preferences rather than explicit ratings given to items.
 */
public  class ALS implements scala.Serializable, org.apache.spark.internal.Logging {
  /**
   * Train a matrix factorization model given an RDD of ratings by users for a subset of products.
   * The ratings matrix is approximated as the product of two lower-rank matrices of a given rank
   * (number of features). To solve for these features, ALS is run iteratively with a configurable
   * level of parallelism.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param blocks     level of parallelism to split computation into
   * @param seed       random seed for initial matrix factorization model
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, long seed)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings by users for a subset of products.
   * The ratings matrix is approximated as the product of two lower-rank matrices of a given rank
   * (number of features). To solve for these features, ALS is run iteratively with a configurable
   * level of parallelism.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param blocks     level of parallelism to split computation into
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings by users for a subset of products.
   * The ratings matrix is approximated as the product of two lower-rank matrices of a given rank
   * (number of features). To solve for these features, ALS is run iteratively with a level of
   * parallelism automatically based on the number of partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings by users for a subset of products.
   * The ratings matrix is approximated as the product of two lower-rank matrices of a given rank
   * (number of features). To solve for these features, ALS is run iteratively with a level of
   * parallelism automatically based on the number of partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' given by users
   * to some products, in the form of (userID, productID, preference) pairs. We approximate the
   * ratings matrix as the product of two lower-rank matrices of a given rank (number of features).
   * To solve for these features, we run a given number of iterations of ALS. This is done using
   * a level of parallelism given by <code>blocks</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param blocks     level of parallelism to split computation into
   * @param alpha      confidence parameter
   * @param seed       random seed for initial matrix factorization model
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha, long seed)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' of users for a
   * subset of products. The ratings matrix is approximated as the product of two lower-rank
   * matrices of a given rank (number of features). To solve for these features, ALS is run
   * iteratively with a configurable level of parallelism.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param blocks     level of parallelism to split computation into
   * @param alpha      confidence parameter
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' of users for a
   * subset of products. The ratings matrix is approximated as the product of two lower-rank
   * matrices of a given rank (number of features). To solve for these features, ALS is run
   * iteratively with a level of parallelism determined automatically based on the number of
   * partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @param lambda     regularization parameter
   * @param alpha      confidence parameter
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, double alpha)  { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' of users for a
   * subset of products. The ratings matrix is approximated as the product of two lower-rank
   * matrices of a given rank (number of features). To solve for these features, ALS is run
   * iteratively with a level of parallelism determined automatically based on the number of
   * partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of {@link Rating} objects with userID, productID, and rating
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations)  { throw new RuntimeException(); }
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
  private  int numUserBlocks ()  { throw new RuntimeException(); }
  private  int numProductBlocks ()  { throw new RuntimeException(); }
  private  int rank ()  { throw new RuntimeException(); }
  private  int iterations ()  { throw new RuntimeException(); }
  private  double lambda ()  { throw new RuntimeException(); }
  private  boolean implicitPrefs ()  { throw new RuntimeException(); }
  private  double alpha ()  { throw new RuntimeException(); }
  private  long seed ()  { throw new RuntimeException(); }
  // not preceding
  private   ALS (int numUserBlocks, int numProductBlocks, int rank, int iterations, double lambda, boolean implicitPrefs, double alpha, long seed)  { throw new RuntimeException(); }
  /**
   * Constructs an ALS instance with default parameters: {numBlocks: -1, rank: 10, iterations: 10,
   * lambda: 0.01, implicitPrefs: false, alpha: 1.0}.
   */
  public   ALS ()  { throw new RuntimeException(); }
  /** If true, do alternating nonnegative least squares. */
  private  boolean nonnegative ()  { throw new RuntimeException(); }
  /** storage level for user/product in/out links */
  private  org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel ()  { throw new RuntimeException(); }
  private  org.apache.spark.storage.StorageLevel finalRDDStorageLevel ()  { throw new RuntimeException(); }
  /** checkpoint interval */
  private  int checkpointInterval ()  { throw new RuntimeException(); }
  /**
   * Set the number of blocks for both user blocks and product blocks to parallelize the computation
   * into; pass -1 for an auto-configured number of blocks. Default: -1.
   * @param numBlocks (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.ALS setBlocks (int numBlocks)  { throw new RuntimeException(); }
  /**
   * Set the number of user blocks to parallelize the computation.
   * @param numUserBlocks (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.ALS setUserBlocks (int numUserBlocks)  { throw new RuntimeException(); }
  /**
   * Set the number of product blocks to parallelize the computation.
   * @param numProductBlocks (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.ALS setProductBlocks (int numProductBlocks)  { throw new RuntimeException(); }
  /** Set the rank of the feature matrices computed (number of features). Default: 10. */
  public  org.apache.spark.mllib.recommendation.ALS setRank (int rank)  { throw new RuntimeException(); }
  /** Set the number of iterations to run. Default: 10. */
  public  org.apache.spark.mllib.recommendation.ALS setIterations (int iterations)  { throw new RuntimeException(); }
  /** Set the regularization parameter, lambda. Default: 0.01. */
  public  org.apache.spark.mllib.recommendation.ALS setLambda (double lambda)  { throw new RuntimeException(); }
  /** Sets whether to use implicit preference. Default: false. */
  public  org.apache.spark.mllib.recommendation.ALS setImplicitPrefs (boolean implicitPrefs)  { throw new RuntimeException(); }
  /**
   * Sets the constant used in computing confidence in implicit ALS. Default: 1.0.
   * @param alpha (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.ALS setAlpha (double alpha)  { throw new RuntimeException(); }
  /** Sets a random seed to have deterministic results. */
  public  org.apache.spark.mllib.recommendation.ALS setSeed (long seed)  { throw new RuntimeException(); }
  /**
   * Set whether the least-squares problems solved at each iteration should have
   * nonnegativity constraints.
   * @param b (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.ALS setNonnegative (boolean b)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Sets storage level for intermediate RDDs (user/product in/out links). The default value is
   * <code>MEMORY_AND_DISK</code>. Users can change it to a serialized storage, e.g., <code>MEMORY_AND_DISK_SER</code> and
   * set <code>spark.rdd.compress</code> to <code>true</code> to reduce the space requirement, at the cost of speed.
   * @param storageLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.ALS setIntermediateRDDStorageLevel (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Sets storage level for final RDDs (user/product used in MatrixFactorizationModel). The default
   * value is <code>MEMORY_AND_DISK</code>. Users can change it to a serialized storage, e.g.
   * <code>MEMORY_AND_DISK_SER</code> and set <code>spark.rdd.compress</code> to <code>true</code> to reduce the space requirement,
   * at the cost of speed.
   * @param storageLevel (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.ALS setFinalRDDStorageLevel (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Set period (in iterations) between checkpoints (default = 10). Checkpointing helps with
   * recovery (when nodes fail) and StackOverflow exceptions caused by long lineage. It also helps
   * with eliminating temporary shuffle files on disk, which can be important when there are many
   * ALS iterations. If the checkpoint directory is not set in {@link org.apache.spark.SparkContext},
   * this setting is ignored.
   * @param checkpointInterval (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.ALS setCheckpointInterval (int checkpointInterval)  { throw new RuntimeException(); }
  /**
   * Run ALS with the configured parameters on an input RDD of {@link Rating} objects.
   * Returns a MatrixFactorizationModel with feature vectors for each user and product.
   * @param ratings (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>ALS.run</code>.
   * @param ratings (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> ratings)  { throw new RuntimeException(); }
}
