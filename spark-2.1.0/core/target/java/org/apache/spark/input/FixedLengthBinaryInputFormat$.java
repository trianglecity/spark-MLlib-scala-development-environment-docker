package org.apache.spark.input;
/**
 * Custom Input Format for reading and splitting flat binary files that contain records,
 * each of which are a fixed size in bytes. The fixed record size is specified through
 * a parameter recordLength in the Hadoop configuration.
 */
public  class FixedLengthBinaryInputFormat$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FixedLengthBinaryInputFormat$ MODULE$ = null;
  public   FixedLengthBinaryInputFormat$ ()  { throw new RuntimeException(); }
  /** Property name to set in Hadoop JobConfs for record length */
  public  java.lang.String RECORD_LENGTH_PROPERTY ()  { throw new RuntimeException(); }
  /** Retrieves the record length property from a Hadoop configuration */
  public  int getRecordLength (org.apache.hadoop.mapreduce.JobContext context)  { throw new RuntimeException(); }
}
