package org.apache.spark.sql.catalyst.expressions;
/** A base trait for functions that compare two strings, returning a boolean. */
public  interface StringPredicate extends org.apache.spark.sql.catalyst.expressions.Predicate, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public  boolean compare (org.apache.spark.unsafe.types.UTF8String l, org.apache.spark.unsafe.types.UTF8String r)  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes ()  ;
  public  Object nullSafeEval (Object input1, Object input2)  ;
  public  java.lang.String toString ()  ;
}
