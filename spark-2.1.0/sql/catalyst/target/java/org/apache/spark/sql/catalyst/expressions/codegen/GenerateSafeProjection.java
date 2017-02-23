package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Generates byte code that produces a {@link InternalRow} object (not an {@link UnsafeRow}) that can update
 * itself based on a new input {@link InternalRow} for a fixed set of {@link Expression Expressions}.
 */
public  class GenerateSafeProjection {
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> canonicalize (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> bind (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode createCodeForStruct (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode createCodeForArray (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType elementType)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode createCodeForMap (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType)  { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode convertToSafe (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Projection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
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
