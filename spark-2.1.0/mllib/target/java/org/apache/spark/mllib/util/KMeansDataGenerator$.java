package org.apache.spark.mllib.util;
/**
 * :: DeveloperApi ::
 * Generate test data for KMeans. This class first chooses k cluster centers
 * from a d-dimensional Gaussian distribution scaled by factor r and then creates a Gaussian
 * cluster with scale 1 around each center.
 */
public  class KMeansDataGenerator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KMeansDataGenerator$ MODULE$ = null;
  public   KMeansDataGenerator$ ()  { throw new RuntimeException(); }
  /**
   * Generate an RDD containing test data for KMeans.
   * <p>
   * @param sc SparkContext to use for creating the RDD
   * @param numPoints Number of points that will be contained in the RDD
   * @param k Number of clusters
   * @param d Number of dimensions
   * @param r Scaling factor for the distribution of the initial centers
   * @param numPartitions Number of partitions of the generated RDD; default 2
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<double[]> generateKMeansRDD (org.apache.spark.SparkContext sc, int numPoints, int k, int d, double r, int numPartitions)  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
