package org.apache.spark.sql.execution.streaming;
/**
 * A simple offset for sources that produce a single linear stream of data.
 */
public  class LongOffset extends org.apache.spark.sql.execution.streaming.Offset implements scala.Product, scala.Serializable {
  /**
   * LongOffset factory from serialized offset.
   * @return new LongOffset
   * @param offset (undocumented)
   */
  static public  org.apache.spark.sql.execution.streaming.LongOffset apply (org.apache.spark.sql.execution.streaming.SerializedOffset offset)  { throw new RuntimeException(); }
  /**
   * Convert generic Offset to LongOffset if possible.
   * @return converted LongOffset
   * @param offset (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.execution.streaming.LongOffset> convert (org.apache.spark.sql.execution.streaming.Offset offset)  { throw new RuntimeException(); }
  static public  boolean equals (Object obj)  { throw new RuntimeException(); }
  static public  int hashCode ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long offset ()  { throw new RuntimeException(); }
  // not preceding
  public   LongOffset (long offset)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
