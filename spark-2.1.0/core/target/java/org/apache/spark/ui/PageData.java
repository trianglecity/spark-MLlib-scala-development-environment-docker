package org.apache.spark.ui;
/**
 * The data returned by <code>PagedDataSource.pageData</code>, including the page number, the number of total
 * pages and the data in this page.
 */
  class PageData<T extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int totalPage ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<T> data ()  { throw new RuntimeException(); }
  // not preceding
  public   PageData (int totalPage, scala.collection.Seq<T> data)  { throw new RuntimeException(); }
}
