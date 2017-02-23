package org.apache.spark.sql.catalyst.catalog;
/**
 * Storage format, used to describe how a partition or a table is stored.
 */
public  class CatalogStorageFormat implements scala.Product, scala.Serializable {
  /** Empty storage format for default values and copies. */
  static public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat empty ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> locationUri ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> inputFormat ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputFormat ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> serde ()  { throw new RuntimeException(); }
  public  boolean compressed ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   CatalogStorageFormat (scala.Option<java.lang.String> locationUri, scala.Option<java.lang.String> inputFormat, scala.Option<java.lang.String> outputFormat, scala.Option<java.lang.String> serde, boolean compressed, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
