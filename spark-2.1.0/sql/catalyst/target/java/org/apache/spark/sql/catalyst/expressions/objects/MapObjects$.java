package org.apache.spark.sql.catalyst.expressions.objects;
public  class MapObjects$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapObjects$ MODULE$ = null;
  public   MapObjects$ ()  { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger curId ()  { throw new RuntimeException(); }
  /**
   * Construct an instance of MapObjects case class.
   * <p>
   * @param function The function applied on the collection elements.
   * @param inputData An expression that when evaluated returns a collection object.
   * @param elementType The data type of elements in the collection.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.objects.MapObjects apply (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> function, org.apache.spark.sql.catalyst.expressions.Expression inputData, org.apache.spark.sql.types.DataType elementType)  { throw new RuntimeException(); }
}
