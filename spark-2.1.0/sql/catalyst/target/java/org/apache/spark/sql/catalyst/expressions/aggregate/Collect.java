package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * The Collect aggregate function collects all seen expression values into a list of values.
 * <p>
 * The operator is bound to the slower sort based aggregation path because the number of
 * elements (and their memory usage) can not be determined in advance. This also means that the
 * collected elements are stored on heap, and that too many elements can cause GC pauses and
 * eventually Out of Memory Errors.
 */
public abstract class Collect extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate {
  public   Collect ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression child ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  boolean supportsPartial ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType aggBufferSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  { throw new RuntimeException(); }
  public  boolean deterministic ()  { throw new RuntimeException(); }
  protected abstract  scala.collection.generic.Growable<java.lang.Object> buffer ()  ;
  public  void initialize (org.apache.spark.sql.catalyst.InternalRow b)  { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.InternalRow b, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.sql.catalyst.InternalRow buffer, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
}
