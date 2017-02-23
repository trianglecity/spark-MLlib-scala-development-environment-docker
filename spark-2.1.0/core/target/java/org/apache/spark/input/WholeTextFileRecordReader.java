package org.apache.spark.input;
/**
 * A {@link org.apache.hadoop.mapreduce.RecordReader RecordReader} for reading a single whole text file
 * out in a key-value pair, where the key is the file path and the value is the entire content of
 * the file.
 */
  class WholeTextFileRecordReader extends org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.Text, org.apache.hadoop.io.Text> implements org.apache.spark.input.Configurable {
  public   WholeTextFileRecordReader (org.apache.hadoop.mapreduce.lib.input.CombineFileSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.Integer index)  { throw new RuntimeException(); }
  public  void initialize (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  float getProgress ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.Text getCurrentKey ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.Text getCurrentValue ()  { throw new RuntimeException(); }
  public  boolean nextKeyValue ()  { throw new RuntimeException(); }
}
