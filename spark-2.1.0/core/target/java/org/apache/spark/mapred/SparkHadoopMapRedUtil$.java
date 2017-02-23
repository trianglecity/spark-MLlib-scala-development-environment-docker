package org.apache.spark.mapred;
public  class SparkHadoopMapRedUtil$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkHadoopMapRedUtil$ MODULE$ = null;
  public   SparkHadoopMapRedUtil$ ()  { throw new RuntimeException(); }
  /**
   * Commits a task output.  Before committing the task output, we need to know whether some other
   * task attempt might be racing to commit the same output partition. Therefore, coordinate with
   * the driver in order to determine whether this attempt can commit (please see SPARK-4879 for
   * details).
   * <p>
   * Output commit coordinator is only used when <code>spark.hadoop.outputCommitCoordination.enabled</code>
   * is set to true (which is the default).
   * @param committer (undocumented)
   * @param mrTaskContext (undocumented)
   * @param jobId (undocumented)
   * @param splitId (undocumented)
   */
  public  void commitTask (org.apache.hadoop.mapreduce.OutputCommitter committer, org.apache.hadoop.mapreduce.TaskAttemptContext mrTaskContext, int jobId, int splitId)  { throw new RuntimeException(); }
}
