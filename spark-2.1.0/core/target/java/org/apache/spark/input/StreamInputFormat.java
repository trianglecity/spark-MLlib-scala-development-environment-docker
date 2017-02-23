package org.apache.spark.input;
/**
 * The format for the PortableDataStream files
 */
  class StreamInputFormat extends org.apache.spark.input.StreamFileInputFormat<org.apache.spark.input.PortableDataStream> {
  public   StreamInputFormat ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.lib.input.CombineFileRecordReader<java.lang.String, org.apache.spark.input.PortableDataStream> createRecordReader (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext taContext)  { throw new RuntimeException(); }
}
