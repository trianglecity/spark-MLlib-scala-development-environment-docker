package org.apache.spark.input;
/**
 * A general format for reading whole files in as streams, byte arrays,
 * or other functions to be added
 */
 abstract class StreamFileInputFormat<T extends java.lang.Object> extends org.apache.hadoop.mapreduce.lib.input.CombineFileInputFormat<java.lang.String, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   StreamFileInputFormat ()  { throw new RuntimeException(); }
  protected  boolean isSplitable (org.apache.hadoop.mapreduce.JobContext context, org.apache.hadoop.fs.Path file)  { throw new RuntimeException(); }
  /**
   * Allow minPartitions set by end-user in order to keep compatibility with old Hadoop API
   * which is set through setMaxSplitSize
   * @param sc (undocumented)
   * @param context (undocumented)
   * @param minPartitions (undocumented)
   */
  public  void setMinPartitions (org.apache.spark.SparkContext sc, org.apache.hadoop.mapreduce.JobContext context, int minPartitions)  { throw new RuntimeException(); }
  public abstract  org.apache.hadoop.mapreduce.RecordReader<java.lang.String, T> createRecordReader (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext taContext)  ;
}
