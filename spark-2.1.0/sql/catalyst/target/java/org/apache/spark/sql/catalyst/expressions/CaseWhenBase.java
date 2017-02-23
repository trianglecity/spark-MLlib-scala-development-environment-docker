package org.apache.spark.sql.catalyst.expressions;
/**
 * Abstract parent class for common logic in CaseWhen and CaseWhenCodegen.
 * <p>
 * param:  branches seq of (branch condition, branch value)
 * param:  elseValue optional value for the else branch
 */
public abstract class CaseWhenBase extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Serializable {
  public   CaseWhenBase (scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression>> branches, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> elseValue)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> valueTypes ()  { throw new RuntimeException(); }
  public  boolean valueTypesEqual ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
}
