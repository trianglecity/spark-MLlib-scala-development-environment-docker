package org.apache.spark.sql.hive;
  class SparkHiveDynamicPartitionWriterContainer extends org.apache.spark.sql.hive.SparkHiveWriterContainer {
  static public  java.lang.String SUCCESSFUL_JOB_OUTPUT_DIR_MARKER ()  { throw new RuntimeException(); }
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
  static public  org.apache.spark.sql.types.DataType javaClassToDataType (java.lang.Class<?> clz)  { throw new RuntimeException(); }
  static protected  scala.Function1<java.lang.Object, java.lang.Object> wrapperFor (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  scala.Function1<java.lang.Object, java.lang.Object> unwrapperFor (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector objectInspector)  { throw new RuntimeException(); }
  static public  scala.Function3<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, java.lang.Object, scala.runtime.BoxedUnit> unwrapperFor (org.apache.hadoop.hive.serde2.objectinspector.StructField field)  { throw new RuntimeException(); }
  static public  java.lang.Object wrap (Object a, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Object[] wrap (org.apache.spark.sql.catalyst.InternalRow row, scala.Function1<java.lang.Object, java.lang.Object>[] wrappers, java.lang.Object[] cache, org.apache.spark.sql.types.DataType[] dataTypes)  { throw new RuntimeException(); }
  static public  java.lang.Object[] wrap (scala.collection.Seq<java.lang.Object> row, scala.Function1<java.lang.Object, java.lang.Object>[] wrappers, java.lang.Object[] cache, org.apache.spark.sql.types.DataType[] dataTypes)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector toInspector (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector toInspector (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType inspectorToDataType (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector inspector)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.hive.HiveInspectors.typeInfoConversions typeInfoConversions (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static protected  org.apache.spark.util.SerializableJobConf conf ()  { throw new RuntimeException(); }
  static protected  org.apache.hadoop.mapred.OutputCommitter committer ()  { throw new RuntimeException(); }
  static protected  org.apache.hadoop.mapred.JobContextImpl jobContext ()  { throw new RuntimeException(); }
  static public  void driverSideSetup ()  { throw new RuntimeException(); }
  static public  void executorSideSetup (int jobId, int splitId, int attemptId)  { throw new RuntimeException(); }
  static protected  java.lang.String getOutputName ()  { throw new RuntimeException(); }
  static protected  void commit ()  { throw new RuntimeException(); }
  static public  void abortTask ()  { throw new RuntimeException(); }
  static public  org.apache.hadoop.hive.serde2.Serializer newSerializer (org.apache.hadoop.hive.ql.plan.TableDesc tableDesc)  { throw new RuntimeException(); }
  static protected  scala.Tuple6<org.apache.hadoop.hive.serde2.Serializer, org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector[], scala.collection.Seq<org.apache.spark.sql.types.DataType>, scala.Function1<java.lang.Object, java.lang.Object>[], java.lang.Object[]> prepareForWrite ()  { throw new RuntimeException(); }
  public   SparkHiveDynamicPartitionWriterContainer (org.apache.hadoop.mapred.JobConf jobConf, org.apache.spark.sql.hive.HiveShim.ShimFileSinkDesc fileSinkConf, java.lang.String[] dynamicPartColNames, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  private  java.lang.String defaultPartName ()  { throw new RuntimeException(); }
  protected  void initWriters ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void commitJob ()  { throw new RuntimeException(); }
  public  void writeToFile (org.apache.spark.TaskContext context, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator)  { throw new RuntimeException(); }
}
