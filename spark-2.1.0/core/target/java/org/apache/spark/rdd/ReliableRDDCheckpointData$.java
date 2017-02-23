package org.apache.spark.rdd;
public  class ReliableRDDCheckpointData$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReliableRDDCheckpointData$ MODULE$ = null;
  public   ReliableRDDCheckpointData$ ()  { throw new RuntimeException(); }
  /** Return the path of the directory to which this RDD's checkpoint data is written. */
  public  scala.Option<org.apache.hadoop.fs.Path> checkpointPath (org.apache.spark.SparkContext sc, int rddId)  { throw new RuntimeException(); }
  /** Clean up the files associated with the checkpoint data for this RDD. */
  public  void cleanCheckpoint (org.apache.spark.SparkContext sc, int rddId)  { throw new RuntimeException(); }
}
