package org.apache.spark.sql.execution.columnar;
/**
 * Generates bytecode for a {@link ColumnarIterator} for columnar cache.
 */
public  class GenerateColumnAccessor {
  static protected  scala.collection.Seq<org.apache.spark.sql.types.DataType> canonicalize (scala.collection.Seq<org.apache.spark.sql.types.DataType> in)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.types.DataType> bind (scala.collection.Seq<org.apache.spark.sql.types.DataType> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.columnar.ColumnarIterator create (scala.collection.Seq<org.apache.spark.sql.types.DataType> columnTypes)  { throw new RuntimeException(); }
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
  static protected  java.lang.String genericMutableRowType ()  { throw new RuntimeException(); }
  static public  OutType generate (InType expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static public  OutType generate (InType expressions)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext newCodeGenContext ()  { throw new RuntimeException(); }
}
