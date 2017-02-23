package org.apache.spark.sql.catalyst.expressions;
/**
 * A {@link MutableProjection} that is calculated by calling <code>eval</code> on each of the specified
 * expressions.
 * <p>
 * param:  expressions a sequence of expressions that determine the value of each column of the
 *                    output row.
 */
public  class InterpretedMutableProjection extends org.apache.spark.sql.catalyst.expressions.MutableProjection implements scala.Product, scala.Serializable {
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<T1, A> andThen (scala.Function1<R, A> g)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions ()  { throw new RuntimeException(); }
  // not preceding
  public   InterpretedMutableProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  public   InterpretedMutableProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  public  void initialize (int partitionIndex)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow currentValue ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.MutableProjection target (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow apply (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
}
