package org.apache.spark.deploy;
  class Command implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String mainClass ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> arguments ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.String, java.lang.String> environment ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> classPathEntries ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> libraryPathEntries ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> javaOpts ()  { throw new RuntimeException(); }
  // not preceding
  public   Command (java.lang.String mainClass, scala.collection.Seq<java.lang.String> arguments, scala.collection.Map<java.lang.String, java.lang.String> environment, scala.collection.Seq<java.lang.String> classPathEntries, scala.collection.Seq<java.lang.String> libraryPathEntries, scala.collection.Seq<java.lang.String> javaOpts)  { throw new RuntimeException(); }
}
