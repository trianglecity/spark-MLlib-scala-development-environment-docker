package org.apache.spark.streaming.dstream;
public  class FileInputDStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileInputDStream$ MODULE$ = null;
  public   FileInputDStream$ ()  { throw new RuntimeException(); }
  public  boolean defaultFilter (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Calculate the number of last batches to remember, such that all the files selected in
   * at least last minRememberDurationS duration can be remembered.
   * @param batchDuration (undocumented)
   * @param minRememberDurationS (undocumented)
   * @return (undocumented)
   */
  public  int calculateNumBatchesToRemember (org.apache.spark.streaming.Duration batchDuration, org.apache.spark.streaming.Duration minRememberDurationS)  { throw new RuntimeException(); }
}
