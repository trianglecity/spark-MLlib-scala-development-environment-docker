package org.apache.spark.input;
  class FixedLengthBinaryInputFormat extends org.apache.hadoop.mapreduce.lib.input.FileInputFormat<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.BytesWritable> implements org.apache.spark.internal.Logging {
  /** Property name to set in Hadoop JobConfs for record length */
  static public  java.lang.String RECORD_LENGTH_PROPERTY ()  { throw new RuntimeException(); }
  /** Retrieves the record length property from a Hadoop configuration */
  static public  int getRecordLength (org.apache.hadoop.mapreduce.JobContext context)  { throw new RuntimeException(); }
  static protected  long getFormatMinSplitSize ()  { throw new RuntimeException(); }
  static protected  java.util.List<org.apache.hadoop.fs.FileStatus> listStatus (org.apache.hadoop.mapreduce.JobContext x$1) throws java.io.IOException { throw new RuntimeException(); }
  static protected  void addInputPathRecursively (java.util.List<org.apache.hadoop.fs.FileStatus> x$1, org.apache.hadoop.fs.FileSystem x$2, org.apache.hadoop.fs.Path x$3, org.apache.hadoop.fs.PathFilter x$4) throws java.io.IOException { throw new RuntimeException(); }
  static protected  org.apache.hadoop.mapreduce.lib.input.FileSplit makeSplit (org.apache.hadoop.fs.Path x$1, long x$2, long x$3, java.lang.String[] x$4)  { throw new RuntimeException(); }
  static public  java.util.List<org.apache.hadoop.mapreduce.InputSplit> getSplits (org.apache.hadoop.mapreduce.JobContext x$1) throws java.io.IOException { throw new RuntimeException(); }
  static protected  int getBlockIndex (org.apache.hadoop.fs.BlockLocation[] x$1, long x$2)  { throw new RuntimeException(); }
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
  public   FixedLengthBinaryInputFormat ()  { throw new RuntimeException(); }
  private  int recordLength ()  { throw new RuntimeException(); }
  /**
   * Override of isSplitable to ensure initial computation of the record length
   * @param context (undocumented)
   * @param filename (undocumented)
   * @return (undocumented)
   */
  public  boolean isSplitable (org.apache.hadoop.mapreduce.JobContext context, org.apache.hadoop.fs.Path filename)  { throw new RuntimeException(); }
  /**
   * This input format overrides computeSplitSize() to make sure that each split
   * only contains full records. Each InputSplit passed to FixedLengthBinaryRecordReader
   * will start at the first byte of a record, and the last byte will the last byte of a record.
   * @param blockSize (undocumented)
   * @param minSize (undocumented)
   * @param maxSize (undocumented)
   * @return (undocumented)
   */
  public  long computeSplitSize (long blockSize, long minSize, long maxSize)  { throw new RuntimeException(); }
  /**
   * Create a FixedLengthBinaryRecordReader
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.LongWritable, org.apache.hadoop.io.BytesWritable> createRecordReader (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
}
