package org.apache.spark.mllib.clustering;
/**
 * A clustering model for K-means. Each point belongs to the cluster with the closest center.
 */
public  class KMeansModel implements org.apache.spark.mllib.util.Saveable, scala.Serializable, org.apache.spark.mllib.pmml.PMMLExportable {
  static private  class Cluster implements scala.Product, scala.Serializable {
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.linalg.Vector point ()  { throw new RuntimeException(); }
    // not preceding
    public   Cluster (int id, org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  }
  static private  class Cluster$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Cluster$ MODULE$ = null;
    public   Cluster$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.KMeansModel.Cluster apply (org.apache.spark.sql.Row r)  { throw new RuntimeException(); }
  }
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    private  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, org.apache.spark.mllib.clustering.KMeansModel model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.KMeansModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.clustering.KMeansModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  static public  void toPMML (java.lang.String localPath)  { throw new RuntimeException(); }
  static public  void toPMML (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  static public  void toPMML (java.io.OutputStream outputStream)  { throw new RuntimeException(); }
  static public  java.lang.String toPMML ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  // not preceding
  public   KMeansModel (org.apache.spark.mllib.linalg.Vector[] clusterCenters)  { throw new RuntimeException(); }
  /**
   * A Java-friendly constructor that takes an Iterable of Vectors.
   * @param centers (undocumented)
   */
  public   KMeansModel (java.lang.Iterable<org.apache.spark.mllib.linalg.Vector> centers)  { throw new RuntimeException(); }
  /**
   * Total number of clusters.
   * @return (undocumented)
   */
  public  int k ()  { throw new RuntimeException(); }
  /**
   * Returns the cluster index that a given point belongs to.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  int predict (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Maps given points to their cluster indices.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Maps given points to their cluster indices.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Integer> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Return the K-means cost (sum of squared distances of points to their nearest center) for this
   * model on the given data.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  private  scala.collection.Iterable<org.apache.spark.mllib.clustering.VectorWithNorm> clusterCentersWithNorm ()  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
