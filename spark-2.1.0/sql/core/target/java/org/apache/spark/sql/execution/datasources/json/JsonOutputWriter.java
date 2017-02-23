package org.apache.spark.sql.execution.datasources.json;
  class JsonOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter implements org.apache.spark.internal.Logging {
  public   JsonOutputWriter (java.lang.String path, org.apache.spark.sql.catalyst.json.JSONOptions options, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  private  org.apache.hadoop.mapreduce.RecordWriter<org.apache.hadoop.io.NullWritable, org.apache.hadoop.io.Text> recordWriter ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  protected  void writeInternal (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
