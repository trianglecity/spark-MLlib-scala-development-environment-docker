package org.apache.spark.input;
/**
 * An abstract class of {@link org.apache.hadoop.mapreduce.RecordReader RecordReader}
 * to reading files out as streams
 */
 abstract class StreamBasedRecordReader<T extends java.lang.Object> extends org.apache.hadoop.mapreduce.RecordReader<java.lang.String, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   StreamBasedRecordReader (org.apache.hadoop.mapreduce.lib.input.CombineFileSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.Integer index)  { throw new RuntimeException(); }
  private  boolean processed ()  { throw new RuntimeException(); }
  private  java.lang.String key ()  { throw new RuntimeException(); }
  private  T value ()  { throw new RuntimeException(); }
  public  void initialize (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  float getProgress ()  { throw new RuntimeException(); }
  public  java.lang.String getCurrentKey ()  { throw new RuntimeException(); }
  public  T getCurrentValue ()  { throw new RuntimeException(); }
  public  boolean nextKeyValue ()  { throw new RuntimeException(); }
  /**
   * Parse the stream (and close it afterwards) and return the value as in type T
   * @param inStream the stream to be read in
   * @return the data formatted as
   */
  public abstract  T parseStream (org.apache.spark.input.PortableDataStream inStream)  ;
}
