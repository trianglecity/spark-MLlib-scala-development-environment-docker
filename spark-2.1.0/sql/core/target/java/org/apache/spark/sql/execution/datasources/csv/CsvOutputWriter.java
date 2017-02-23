package org.apache.spark.sql.execution.datasources.csv;
  class CsvOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter implements org.apache.spark.internal.Logging {
  public   CsvOutputWriter (java.lang.String path, org.apache.spark.sql.types.StructType dataSchema, org.apache.hadoop.mapreduce.TaskAttemptContext context, org.apache.spark.sql.execution.datasources.csv.CSVOptions params)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object, java.lang.String>[] valueConverters ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.mapreduce.RecordWriter<org.apache.hadoop.io.NullWritable, org.apache.hadoop.io.Text> recordWriter ()  { throw new RuntimeException(); }
  private  long FLUSH_BATCH_SIZE ()  { throw new RuntimeException(); }
  private  long records ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.execution.datasources.csv.LineCsvWriter csvWriter ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> rowToString (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object, java.lang.String> makeConverter (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  protected  void writeInternal (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  private  void flush ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}
