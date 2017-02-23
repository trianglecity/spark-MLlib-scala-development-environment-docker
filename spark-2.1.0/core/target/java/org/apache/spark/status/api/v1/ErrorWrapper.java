package org.apache.spark.status.api.v1;
/**
 * Signal to JacksonMessageWriter to not convert the message into json (which would result in an
 * extra set of quotes).
 */
  class ErrorWrapper implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String s ()  { throw new RuntimeException(); }
  // not preceding
  public   ErrorWrapper (java.lang.String s)  { throw new RuntimeException(); }
}
