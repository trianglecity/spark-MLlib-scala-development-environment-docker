package org.apache.spark.sql.hive.execution;
public  class HiveScriptIOSchema implements org.apache.spark.sql.hive.HiveInspectors, scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.hive.execution.HiveScriptIOSchema apply (org.apache.spark.sql.catalyst.plans.logical.ScriptInputOutputSchema input)  { throw new RuntimeException(); }
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
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputRowFormat ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputRowFormat ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> inputSerdeClass ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputSerdeClass ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputSerdeProps ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputSerdeProps ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> recordReaderClass ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> recordWriterClass ()  { throw new RuntimeException(); }
  public  boolean schemaLess ()  { throw new RuntimeException(); }
  // not preceding
  public   HiveScriptIOSchema (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputRowFormat, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputRowFormat, scala.Option<java.lang.String> inputSerdeClass, scala.Option<java.lang.String> outputSerdeClass, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> inputSerdeProps, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> outputSerdeProps, scala.Option<java.lang.String> recordReaderClass, scala.Option<java.lang.String> recordWriterClass, boolean schemaLess)  { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.String, java.lang.String> defaultFormat ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> inputRowFormatMap ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> outputRowFormatMap ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<org.apache.hadoop.hive.serde2.AbstractSerDe, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector>> initInputSerDe (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> input)  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<org.apache.hadoop.hive.serde2.AbstractSerDe, org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector>> initOutputSerDe (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
  private  scala.Tuple2<scala.collection.Seq<java.lang.String>, scala.collection.Seq<org.apache.spark.sql.types.DataType>> parseAttrs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> attrs)  { throw new RuntimeException(); }
  private  org.apache.hadoop.hive.serde2.AbstractSerDe initSerDe (java.lang.String serdeClassName, scala.collection.Seq<java.lang.String> columns, scala.collection.Seq<org.apache.spark.sql.types.DataType> columnTypes, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> serdeProps)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.hadoop.hive.ql.exec.RecordReader> recordReader (java.io.InputStream inputStream, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.hadoop.hive.ql.exec.RecordWriter> recordWriter (java.io.OutputStream outputStream, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
