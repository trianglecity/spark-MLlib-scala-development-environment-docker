package org.apache.spark.mllib.clustering;
/**
 * Clustering model produced by {@link BisectingKMeans}.
 * The prediction is done level-by-level from the root node to a leaf node, and at each node among
 * its children the closest to the input point is selected.
 * <p>
 * param:  root the root node of the clustering tree
 */
public  class BisectingKMeansModel implements scala.Serializable, org.apache.spark.mllib.util.Saveable, org.apache.spark.internal.Logging {
  static private  class Data implements scala.Product, scala.Serializable {
    public  int index ()  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.linalg.Vector center ()  { throw new RuntimeException(); }
    public  double norm ()  { throw new RuntimeException(); }
    public  double cost ()  { throw new RuntimeException(); }
    public  double height ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> children ()  { throw new RuntimeException(); }
    // not preceding
    public   Data (int index, long size, org.apache.spark.mllib.linalg.Vector center, double norm, double cost, double height, scala.collection.Seq<java.lang.Object> children)  { throw new RuntimeException(); }
  }
  static private  class Data$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Data$ MODULE$ = null;
    public   Data$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.BisectingKMeansModel.Data apply (org.apache.spark.sql.Row r)  { throw new RuntimeException(); }
  }
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    private  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, org.apache.spark.mllib.clustering.BisectingKMeansModel model, java.lang.String path)  { throw new RuntimeException(); }
    private  org.apache.spark.mllib.clustering.ClusteringTreeNode[] getNodes (org.apache.spark.mllib.clustering.ClusteringTreeNode node)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.BisectingKMeansModel load (org.apache.spark.SparkContext sc, java.lang.String path, int rootId)  { throw new RuntimeException(); }
    private  org.apache.spark.mllib.clustering.ClusteringTreeNode buildTree (int rootId, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.clustering.BisectingKMeansModel.Data> nodes)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.clustering.BisectingKMeansModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
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
    org.apache.spark.mllib.clustering.ClusteringTreeNode root ()  { throw new RuntimeException(); }
  // not preceding
     BisectingKMeansModel (org.apache.spark.mllib.clustering.ClusteringTreeNode root)  { throw new RuntimeException(); }
  /**
   * Leaf cluster centers.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  /**
   * Number of leaf clusters.
   * @return (undocumented)
   */
  public  int k ()  { throw new RuntimeException(); }
  /**
   * Predicts the index of the cluster that the input point belongs to.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  int predict (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Predicts the indices of the clusters that the input points belong to.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predict()</code>.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Integer> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Computes the squared distance between the input point and the cluster center it belongs to.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Computes the sum of squared distances between the input points and their corresponding cluster
   * centers.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>computeCost()</code>.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
