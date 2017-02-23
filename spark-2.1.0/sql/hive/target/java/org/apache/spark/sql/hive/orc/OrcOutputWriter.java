package org.apache.spark.sql.hive.orc;
  class OrcOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter {
  public   OrcOutputWriter (java.lang.String path, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  private  boolean recordWriterInstantiated ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.mapred.RecordWriter<org.apache.hadoop.io.NullWritable, org.apache.hadoop.io.Writable> recordWriter ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  protected  void writeInternal (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
