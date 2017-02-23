package org.apache.spark.sql.execution.streaming;
/**
 * Used when loading a JSON serialized offset from external storage.
 * We are currently not responsible for converting JSON serialized
 * data into an internal (i.e., object) representation. Sources should
 * define a factory method in their source Offset companion objects
 * that accepts a {@link SerializedOffset} for doing the conversion.
 */
public  class SerializedOffset extends org.apache.spark.sql.execution.streaming.Offset implements scala.Product, scala.Serializable {
  static public  boolean equals (Object obj)  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
  // not preceding
  public   SerializedOffset (java.lang.String json)  { throw new RuntimeException(); }
}
