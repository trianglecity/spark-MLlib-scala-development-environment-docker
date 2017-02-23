package org.apache.spark.sql.catalyst.encoders;
public  class ExpressionEncoder<T extends java.lang.Object> implements org.apache.spark.sql.Encoder<T>, scala.Product, scala.Serializable {
  static public <T extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> apply (scala.reflect.api.TypeTags.TypeTag<T> evidence$1)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> javaBean (java.lang.Class<T> beanClass)  { throw new RuntimeException(); }
  /**
   * Given a set of N encoders, constructs a new encoder that produce objects as items in an
   * N-tuple.  Note that these encoders should be unresolved so that information about
   * name/positional binding is preserved.
   * @param encoders (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<?> tuple (scala.collection.Seq<org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<?>> encoders)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple1<T>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> e)  { throw new RuntimeException(); }
  static public <T1 extends java.lang.Object, T2 extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple2<T1, T2>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T1> e1, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T2> e2)  { throw new RuntimeException(); }
  static public <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple3<T1, T2, T3>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T1> e1, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T2> e2, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T3> e3)  { throw new RuntimeException(); }
  static public <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object, T4 extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple4<T1, T2, T3, T4>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T1> e1, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T2> e2, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T3> e3, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T4> e4)  { throw new RuntimeException(); }
  static public <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object, T4 extends java.lang.Object, T5 extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<scala.Tuple5<T1, T2, T3, T4, T5>> tuple (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T1> e1, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T2> e2, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T3> e3, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T4> e4, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T5> e5)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  boolean flat ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> serializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression deserializer ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> clsTag ()  { throw new RuntimeException(); }
  // not preceding
  public   ExpressionEncoder (org.apache.spark.sql.types.StructType schema, boolean flat, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> serializer, org.apache.spark.sql.catalyst.expressions.Expression deserializer, scala.reflect.ClassTag<T> clsTag)  { throw new RuntimeException(); }
  /**
   * Returns a new copy of this encoder, where the <code>deserializer</code> is resolved and bound to the
   * given schema.
   * <p>
   * Note that, ideally encoder is used as a container of serde expressions, the resolution and
   * binding stuff should happen inside query framework.  However, in some cases we need to
   * use encoder as a function to do serialization directly(e.g. Dataset.collect), then we can use
   * this method to do resolution and binding outside of query framework.
   * @param attrs (undocumented)
   * @param analyzer (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> resolveAndBind (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attrs, org.apache.spark.sql.catalyst.analysis.Analyzer analyzer)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.UnsafeProjection extractProjection ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.GenericInternalRow inputRow ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Projection constructProjection ()  { throw new RuntimeException(); }
  /**
   * Returns a new set (with unique ids) of {@link NamedExpression} that represent the serialized form
   * of this object.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> namedExpressions ()  { throw new RuntimeException(); }
  /**
   * Returns an encoded version of <code>t</code> as a Spark SQL row.  Note that multiple calls to
   * toRow are allowed to return the same actual {@link InternalRow} object.  Thus, the caller should
   * copy the result before making another call if required.
   * @param t (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow toRow (T t)  { throw new RuntimeException(); }
  /**
   * Returns an object of type <code>T</code>, extracting the required values from the provided row.  Note that
   * you must <code>resolveAndBind</code> an encoder to a specific schema before you can call this
   * function.
   * @param row (undocumented)
   * @return (undocumented)
   */
  public  T fromRow (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  /**
   * The process of resolution to a given schema throws away information about where a given field
   * is being bound by ordinal instead of by name.  This method checks to make sure this process
   * has not been done already in places where we plan to do later composition of encoders.
   */
  public  void assertUnresolved ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<java.lang.String> attrs ()  { throw new RuntimeException(); }
  protected  java.lang.String schemaString ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
