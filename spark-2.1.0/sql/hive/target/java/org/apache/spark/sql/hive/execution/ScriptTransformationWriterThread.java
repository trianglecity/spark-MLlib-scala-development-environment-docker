package org.apache.spark.sql.hive.execution;
public  class ScriptTransformationWriterThread extends java.lang.Thread implements org.apache.spark.internal.Logging {
  public   ScriptTransformationWriterThread (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iter, scala.collection.Seq<org.apache.spark.sql.types.DataType> inputSchema, org.apache.spark.sql.catalyst.expressions.Projection outputProjection, org.apache.hadoop.hive.serde2.AbstractSerDe inputSerde, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector inputSoi, org.apache.spark.sql.hive.execution.HiveScriptIOSchema ioschema, java.io.OutputStream outputStream, java.lang.Process proc, org.apache.spark.util.CircularBuffer stderrBuffer, org.apache.spark.TaskContext taskContext, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  private  java.lang.Throwable _exception ()  { throw new RuntimeException(); }
  /** Contains the exception thrown while writing the parent iterator to the external process. */
  public  scala.Option<java.lang.Throwable> exception ()  { throw new RuntimeException(); }
  public  void run ()  { throw new RuntimeException(); }
}
