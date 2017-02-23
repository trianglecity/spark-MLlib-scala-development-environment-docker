package org.apache.spark.sql.execution.r;
/**
 * A function wrapper that applies the given R function to each partition.
 */
public  class MapPartitionsRWrapper implements scala.Function1<scala.collection.Iterator<java.lang.Object>, scala.collection.Iterator<java.lang.Object>>, scala.Product, scala.Serializable {
  static public <A extends java.lang.Object> scala.Function1<A, R> compose (scala.Function1<A, T1> g)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.Function1<T1, A> andThen (scala.Function1<R, A> g)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  byte[] func ()  { throw new RuntimeException(); }
  public  byte[] packageNames ()  { throw new RuntimeException(); }
  public  org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType inputSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType outputSchema ()  { throw new RuntimeException(); }
  // not preceding
  public   MapPartitionsRWrapper (byte[] func, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, org.apache.spark.sql.types.StructType inputSchema, org.apache.spark.sql.types.StructType outputSchema)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> apply (scala.collection.Iterator<java.lang.Object> iter)  { throw new RuntimeException(); }
}
