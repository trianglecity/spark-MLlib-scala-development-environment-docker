package org.apache.spark.sql.execution.datasources.parquet;
  class ParquetOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter {
  public   ParquetOutputWriter (java.lang.String path, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  private  org.apache.hadoop.mapreduce.RecordWriter<java.lang.Void, org.apache.spark.sql.catalyst.InternalRow> recordWriter ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  public  void writeInternal (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
