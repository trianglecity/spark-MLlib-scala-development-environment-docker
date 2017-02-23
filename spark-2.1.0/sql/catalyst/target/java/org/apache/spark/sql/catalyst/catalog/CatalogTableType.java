package org.apache.spark.sql.catalyst.catalog;
public  class CatalogTableType implements scala.Product, scala.Serializable {
  static public  org.apache.spark.sql.catalyst.catalog.CatalogTableType EXTERNAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.catalog.CatalogTableType MANAGED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.catalog.CatalogTableType VIEW ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  private   CatalogTableType (java.lang.String name)  { throw new RuntimeException(); }
}
