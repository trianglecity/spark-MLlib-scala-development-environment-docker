package org.apache.spark.deploy;
  class DriverDescription implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String jarUrl ()  { throw new RuntimeException(); }
  public  int mem ()  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  boolean supervise ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.Command command ()  { throw new RuntimeException(); }
  // not preceding
  public   DriverDescription (java.lang.String jarUrl, int mem, int cores, boolean supervise, org.apache.spark.deploy.Command command)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
