package org.apache.spark.sql;
/**
 * A container for a {@link Dataset}, used for implicit conversions in Scala.
 * <p>
 * To use this, import implicit conversions in SQL:
 * <pre><code>
 *   import sqlContext.implicits._
 * </code></pre>
 * <p>
 * @since 1.6.0
 */
public  class DatasetHolder<T extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  private  org.apache.spark.sql.Dataset<T> ds ()  { throw new RuntimeException(); }
  // not preceding
     DatasetHolder (org.apache.spark.sql.Dataset<T> ds)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<T> toDS ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> toDF (scala.collection.Seq<java.lang.String> colNames)  { throw new RuntimeException(); }
}
