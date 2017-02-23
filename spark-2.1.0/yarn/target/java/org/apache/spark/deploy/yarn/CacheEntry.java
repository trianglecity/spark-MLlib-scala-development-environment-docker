package org.apache.spark.deploy.yarn;
public  class CacheEntry implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.net.URI uri ()  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
  public  long modTime ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.LocalResourceVisibility visibility ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.yarn.api.records.LocalResourceType resType ()  { throw new RuntimeException(); }
  // not preceding
  public   CacheEntry (java.net.URI uri, long size, long modTime, org.apache.hadoop.yarn.api.records.LocalResourceVisibility visibility, org.apache.hadoop.yarn.api.records.LocalResourceType resType)  { throw new RuntimeException(); }
}
