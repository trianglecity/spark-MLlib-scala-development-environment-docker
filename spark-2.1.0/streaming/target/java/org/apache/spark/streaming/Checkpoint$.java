package org.apache.spark.streaming;
public  class Checkpoint$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Checkpoint$ MODULE$ = null;
  public   Checkpoint$ ()  { throw new RuntimeException(); }
  public  java.lang.String PREFIX ()  { throw new RuntimeException(); }
  public  scala.util.matching.Regex REGEX ()  { throw new RuntimeException(); }
  /** Get the checkpoint file for the given checkpoint time */
  public  org.apache.hadoop.fs.Path checkpointFile (java.lang.String checkpointDir, org.apache.spark.streaming.Time checkpointTime)  { throw new RuntimeException(); }
  /** Get the checkpoint backup file for the given checkpoint time */
  public  org.apache.hadoop.fs.Path checkpointBackupFile (java.lang.String checkpointDir, org.apache.spark.streaming.Time checkpointTime)  { throw new RuntimeException(); }
  /**
   * @param checkpointDir checkpoint directory to read checkpoint files from
   * @return checkpoint files from the <code>checkpointDir</code> checkpoint directory, ordered by oldest-first
   * @param fsOption (undocumented)
   */
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> getCheckpointFiles (java.lang.String checkpointDir, scala.Option<org.apache.hadoop.fs.FileSystem> fsOption)  { throw new RuntimeException(); }
  /** Serialize the checkpoint, or throw any exception that occurs */
  public  byte[] serialize (org.apache.spark.streaming.Checkpoint checkpoint, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Deserialize a checkpoint from the input stream, or throw any exception that occurs */
  public  org.apache.spark.streaming.Checkpoint deserialize (java.io.InputStream inputStream, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
