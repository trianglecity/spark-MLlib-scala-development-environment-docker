package org.apache.spark.sql.catalyst.expressions;
public abstract class UnixTime extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes {
  public   UnixTime ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  private  org.apache.spark.unsafe.types.UTF8String constFormat ()  { throw new RuntimeException(); }
  private  java.text.SimpleDateFormat formatter ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
