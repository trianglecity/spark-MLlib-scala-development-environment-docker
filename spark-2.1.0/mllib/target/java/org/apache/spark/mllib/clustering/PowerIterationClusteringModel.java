package org.apache.spark.mllib.clustering;
/**
 * Model produced by {@link PowerIterationClustering}.
 * <p>
 * param:  k number of clusters
 * param:  assignments an RDD of clustering <code>PowerIterationClustering#Assignment</code>s
 */
public  class PowerIterationClusteringModel implements org.apache.spark.mllib.util.Saveable, scala.Serializable {
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    private  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
      java.lang.String thisClassName ()  { throw new RuntimeException(); }
    public  void save (org.apache.spark.SparkContext sc, org.apache.spark.mllib.clustering.PowerIterationClusteringModel model, java.lang.String path)  { throw new RuntimeException(); }
    public  org.apache.spark.mllib.clustering.PowerIterationClusteringModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  }
  static public  org.apache.spark.mllib.clustering.PowerIterationClusteringModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.clustering.PowerIterationClustering.Assignment> assignments ()  { throw new RuntimeException(); }
  // not preceding
  public   PowerIterationClusteringModel (int k, org.apache.spark.rdd.RDD<org.apache.spark.mllib.clustering.PowerIterationClustering.Assignment> assignments)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  protected  java.lang.String formatVersion ()  { throw new RuntimeException(); }
}
