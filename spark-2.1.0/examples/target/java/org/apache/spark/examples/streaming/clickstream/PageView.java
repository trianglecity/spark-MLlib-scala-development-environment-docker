package org.apache.spark.examples.streaming.clickstream;
/** Represents a page view on a website with associated dimension data. */
public  class PageView implements scala.Serializable {
  static public  org.apache.spark.examples.streaming.clickstream.PageView fromString (java.lang.String in)  { throw new RuntimeException(); }
  public  java.lang.String url ()  { throw new RuntimeException(); }
  public  int status ()  { throw new RuntimeException(); }
  public  int zipCode ()  { throw new RuntimeException(); }
  public  int userID ()  { throw new RuntimeException(); }
  // not preceding
  public   PageView (java.lang.String url, int status, int zipCode, int userID)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
