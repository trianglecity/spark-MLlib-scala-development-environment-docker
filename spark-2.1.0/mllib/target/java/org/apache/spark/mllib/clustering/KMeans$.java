package org.apache.spark.mllib.clustering;
/**
 * Top-level methods for calling K-means clustering.
 */
public  class KMeans$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KMeans$ MODULE$ = null;
  public   KMeans$ ()  { throw new RuntimeException(); }
  public  java.lang.String RANDOM ()  { throw new RuntimeException(); }
  public  java.lang.String K_MEANS_PARALLEL ()  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data Training points as an <code>RDD</code> of <code>Vector</code> types.
   * @param k Number of clusters to create.
   * @param maxIterations Maximum number of iterations allowed.
   * @param initializationMode The initialization algorithm. This can either be "random" or
   *                           "k-means||". (default: "k-means||")
   * @param seed Random seed for cluster initialization. Default is to generate seed based
   *             on system time.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, java.lang.String initializationMode, long seed)  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data Training points as an <code>RDD</code> of <code>Vector</code> types.
   * @param k Number of clusters to create.
   * @param maxIterations Maximum number of iterations allowed.
   * @param initializationMode The initialization algorithm. This can either be "random" or
   *                           "k-means||". (default: "k-means||")
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, java.lang.String initializationMode)  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data Training points as an <code>RDD</code> of <code>Vector</code> types.
   * @param k Number of clusters to create.
   * @param maxIterations Maximum number of iterations allowed.
   * @param runs This param has no effect since Spark 2.0.0.
   * @param initializationMode The initialization algorithm. This can either be "random" or
   *                           "k-means||". (default: "k-means||")
   * @param seed Random seed for cluster initialization. Default is to generate seed based
   *             on system time.
   * @return (undocumented)
   *
   * @deprecated Use train method without 'runs'. Since 2.1.0. 
  */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs, java.lang.String initializationMode, long seed)  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data Training points as an <code>RDD</code> of <code>Vector</code> types.
   * @param k Number of clusters to create.
   * @param maxIterations Maximum number of iterations allowed.
   * @param runs This param has no effect since Spark 2.0.0.
   * @param initializationMode The initialization algorithm. This can either be "random" or
   *                           "k-means||". (default: "k-means||")
   * @return (undocumented)
   *
   * @deprecated Use train method without 'runs'. Since 2.1.0. 
  */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs, java.lang.String initializationMode)  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   * @param data (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations)  { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   * @param data (undocumented)
   * @param k (undocumented)
   * @param maxIterations (undocumented)
   * @param runs (undocumented)
   * @return (undocumented)
   *
   * @deprecated Use train method without 'runs'. Since 2.1.0. 
  */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs)  { throw new RuntimeException(); }
  /**
   * Returns the index of the closest center to the given point, as well as the squared distance.
   * @param centers (undocumented)
   * @param point (undocumented)
   * @return (undocumented)
   */
    scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point)  { throw new RuntimeException(); }
  /**
   * Returns the K-means cost of a given point against the given cluster centers.
   * @param centers (undocumented)
   * @param point (undocumented)
   * @return (undocumented)
   */
    double pointCost (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point)  { throw new RuntimeException(); }
  /**
   * Returns the squared Euclidean distance between two vectors computed by
   * {@link org.apache.spark.mllib.util.MLUtils#fastSquaredDistance}.
   * @param v1 (undocumented)
   * @param v2 (undocumented)
   * @return (undocumented)
   */
    double fastSquaredDistance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2)  { throw new RuntimeException(); }
    boolean validateInitMode (java.lang.String initMode)  { throw new RuntimeException(); }
}
