package org.apache.spark.sql.execution.datasources.text;
public  class TextOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter {
  /** Returns the compression codec extension to be used in a file name, e.g. ".gzip"). */
  static public  java.lang.String getCompressionExtension (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  static protected  void initConverter (org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  public   TextOutputWriter (java.lang.String path, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  private  org.apache.hadoop.mapreduce.RecordWriter<org.apache.hadoop.io.NullWritable, org.apache.hadoop.io.Text> recordWriter ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  protected  void writeInternal (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
