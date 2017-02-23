package org.apache.spark.sql.catalyst.catalog;
public  class FunctionResource implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.FunctionResourceType resourceType ()  { throw new RuntimeException(); }
  public  java.lang.String uri ()  { throw new RuntimeException(); }
  // not preceding
  public   FunctionResource (org.apache.spark.sql.catalyst.catalog.FunctionResourceType resourceType, java.lang.String uri)  { throw new RuntimeException(); }
}
