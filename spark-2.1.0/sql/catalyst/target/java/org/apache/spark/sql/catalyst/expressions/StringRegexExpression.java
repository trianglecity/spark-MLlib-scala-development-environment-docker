package org.apache.spark.sql.catalyst.expressions;
public  interface StringRegexExpression extends org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public  java.lang.String escape (java.lang.String v)  ;
  public  boolean matches (java.util.regex.Pattern regex, java.lang.String str)  ;
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes ()  ;
  public  java.util.regex.Pattern cache ()  ;
  public  java.util.regex.Pattern compile (java.lang.String str)  ;
  public  java.util.regex.Pattern pattern (java.lang.String str)  ;
  public  Object nullSafeEval (Object input1, Object input2)  ;
  public  java.lang.String sql ()  ;
}
