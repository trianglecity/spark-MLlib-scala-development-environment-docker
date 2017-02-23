package org.apache.spark.streaming;
public  class CheckpointReader$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CheckpointReader$ MODULE$ = null;
  public   CheckpointReader$ ()  { throw new RuntimeException(); }
  /**
   * Read checkpoint files present in the given checkpoint directory. If there are no checkpoint
   * files, then return None, else try to return the latest valid checkpoint object. If no
   * checkpoint files could be read correctly, then return None.
   * @param checkpointDir (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.streaming.Checkpoint> read (java.lang.String checkpointDir)  { throw new RuntimeException(); }
  /**
   * Read checkpoint files present in the given checkpoint directory. If there are no checkpoint
   * files, then return None, else try to return the latest valid checkpoint object. If no
   * checkpoint files could be read correctly, then return None (if ignoreReadError = true),
   * or throw exception (if ignoreReadError = false).
   * @param checkpointDir (undocumented)
   * @param conf (undocumented)
   * @param hadoopConf (undocumented)
   * @param ignoreReadError (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.streaming.Checkpoint> read (java.lang.String checkpointDir, org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, boolean ignoreReadError)  { throw new RuntimeException(); }
}
