package org.apache.spark.sql.catalyst.catalog;
/**
 * A database defined in the catalog.
 */
public  class CatalogDatabase implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  java.lang.String locationUri ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   CatalogDatabase (java.lang.String name, java.lang.String description, java.lang.String locationUri, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
}
