package org.apache.spark.mllib.clustering;
/**
 * A bisecting k-means algorithm based on the paper "A comparison of document clustering techniques"
 * by Steinbach, Karypis, and Kumar, with modification to fit Spark.
 * The algorithm starts from a single cluster that contains all points.
 * Iteratively it finds divisible clusters on the bottom level and bisects each of them using
 * k-means, until there are <code>k</code> leaf clusters in total or no leaf clusters are divisible.
 * The bisecting steps of clusters on the same level are grouped together to increase parallelism.
 * If bisecting all divisible clusters on the bottom level would result more than <code>k</code> leaf clusters,
 * larger clusters get higher priority.
 * <p>
 * param:  k the desired number of leaf clusters (default: 4). The actual number could be smaller if
 *          there are no divisible leaf clusters.
 * param:  maxIterations the max number of k-means iterations to split clusters (default: 20)
 * param:  minDivisibleClusterSize the minimum number of points (if greater than or equal 1.0) or
 *                                the minimum proportion of points (if less than 1.0) of a divisible
 *                                cluster (default: 1)
 * param:  seed a random seed (default: hash value of the class name)
 * <p>
 * @see <a href="http://glaros.dtc.umn.edu/gkhome/fetch/papers/docclusterKDDTMW00.pdf">
 * Steinbach, Karypis, and Kumar, A comparison of document clustering techniques,
 * KDD Workshop on Text Mining, 2000.</a>
 */
public  class BisectingKMeans implements org.apache.spark.internal.Logging {
  /**
   * Summary of a cluster.
   * <p>
   * param:  size the number of points within this cluster
   * param:  center the center of the points within this cluster
   * param:  cost the sum of squared distances to the center
   */
  static private  class ClusterSummary implements scala.Product, scala.Serializable {
    public  long size ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.VectorWithNorm center ()  { throw new RuntimeException(); }
    public  double cost ()  { throw new RuntimeException(); }
    // not preceding
    public   ClusterSummary (long size, org.apache.spark.mllib.clustering.VectorWithNorm center, double cost)  { throw new RuntimeException(); }
  }
  static private  class ClusterSummary$ extends scala.runtime.AbstractFunction3<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm, java.lang.Object, org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummary> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ClusterSummary$ MODULE$ = null;
    public   ClusterSummary$ ()  { throw new RuntimeException(); }
  }
  /**
   * Cluster summary aggregator.
   * param:  d feature dimension
   */
  static private  class ClusterSummaryAggregator implements scala.Serializable {
    public  int d ()  { throw new RuntimeException(); }
    // not preceding
    public   ClusterSummaryAggregator (int d)  { throw new RuntimeException(); }
    private  long n ()  { throw new RuntimeException(); }
    private  org.apache.spark.mllib.linalg.Vector sum ()  { throw new RuntimeException(); }
    private  double sumSq ()  { throw new RuntimeException(); }
    /** Adds a point. */
    public  org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummaryAggregator add (org.apache.spark.mllib.clustering.VectorWithNorm v)  { throw new RuntimeException(); }
    /** Merges another aggregator. */
    public  org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummaryAggregator merge (org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummaryAggregator other)  { throw new RuntimeException(); }
    /** Returns the summary. */
    public  org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummary summary ()  { throw new RuntimeException(); }
  }
  /** The index of the root node of a tree. */
  static private  long ROOT_INDEX ()  { throw new RuntimeException(); }
  static private  long MAX_DIVISIBLE_CLUSTER_INDEX ()  { throw new RuntimeException(); }
  static private  double LEVEL_LIMIT ()  { throw new RuntimeException(); }
  /** Returns the left child index of the given node index. */
  static private  long leftChildIndex (long index)  { throw new RuntimeException(); }
  /** Returns the right child index of the given node index. */
  static private  long rightChildIndex (long index)  { throw new RuntimeException(); }
  /** Returns the parent index of the given node index, or 0 if the input is 1 (root). */
  static private  long parentIndex (long index)  { throw new RuntimeException(); }
  /**
   * Summarizes data by each cluster as Map.
   * @param d feature dimension
   * @param assignments pairs of point and its cluster index
   * @return a map from cluster indices to corresponding cluster summaries
   */
  static private  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummary> summarize (int d, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm>> assignments)  { throw new RuntimeException(); }
  /**
   * Bisects a cluster center.
   * <p>
   * @param center current cluster center
   * @param random a random number generator
   * @return initial centers
   */
  static private  scala.Tuple2<org.apache.spark.mllib.clustering.VectorWithNorm, org.apache.spark.mllib.clustering.VectorWithNorm> splitCenter (org.apache.spark.mllib.clustering.VectorWithNorm center, java.util.Random random)  { throw new RuntimeException(); }
  /**
   * Updates assignments.
   * @param assignments current assignments
   * @param divisibleIndices divisible cluster indices
   * @param newClusterCenters new cluster centers
   * @return new assignments
   */
  static private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm>> updateAssignments (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm>> assignments, scala.collection.immutable.Set<java.lang.Object> divisibleIndices, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.clustering.VectorWithNorm> newClusterCenters)  { throw new RuntimeException(); }
  /**
   * Builds a clustering tree by re-indexing internal and leaf clusters.
   * @param clusters a map from cluster indices to corresponding cluster summaries
   * @return the root node of the clustering tree
   */
  static private  org.apache.spark.mllib.clustering.ClusteringTreeNode buildTree (scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.clustering.BisectingKMeans.ClusterSummary> clusters)  { throw new RuntimeException(); }
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
  private  double minDivisibleClusterSize ()  { throw new RuntimeException(); }
  private  long seed ()  { throw new RuntimeException(); }
  // not preceding
  private   BisectingKMeans (int k, int maxIterations, double minDivisibleClusterSize, long seed)  { throw new RuntimeException(); }
  /**
   * Constructs with the default configuration
   */
  public   BisectingKMeans ()  { throw new RuntimeException(); }
  /**
   * Sets the desired number of leaf clusters (default: 4).
   * The actual number could be smaller if there are no divisible leaf clusters.
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setK (int k)  { throw new RuntimeException(); }
  /**
   * Gets the desired number of leaf clusters.
   * @return (undocumented)
   */
  public  int getK ()  { throw new RuntimeException(); }
  /**
   * Sets the max number of k-means iterations to split clusters (default: 20).
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setMaxIterations (int maxIterations)  { throw new RuntimeException(); }
  /**
   * Gets the max number of k-means iterations to split clusters.
   * @return (undocumented)
   */
  public  int getMaxIterations ()  { throw new RuntimeException(); }
  /**
   * Sets the minimum number of points (if greater than or equal to <code>1.0</code>) or the minimum proportion
   * of points (if less than <code>1.0</code>) of a divisible cluster (default: 1).
   * @param minDivisibleClusterSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setMinDivisibleClusterSize (double minDivisibleClusterSize)  { throw new RuntimeException(); }
  /**
   * Gets the minimum number of points (if greater than or equal to <code>1.0</code>) or the minimum proportion
   * of points (if less than <code>1.0</code>) of a divisible cluster.
   * @return (undocumented)
   */
  public  double getMinDivisibleClusterSize ()  { throw new RuntimeException(); }
  /**
   * Sets the random seed (default: hash value of the class name).
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeans setSeed (long seed)  { throw new RuntimeException(); }
  /**
   * Gets the random seed.
   * @return (undocumented)
   */
  public  long getSeed ()  { throw new RuntimeException(); }
  /**
   * Runs the bisecting k-means algorithm.
   * @param input RDD of vectors
   * @return model for the bisecting kmeans
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeansModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> input)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>run()</code>.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.BisectingKMeansModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
}
