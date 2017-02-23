package org.apache.spark.util;
  class AccumulatorMetadata implements scala.Serializable, scala.Product {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  long id ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> name ()  { throw new RuntimeException(); }
  public  boolean countFailedValues ()  { throw new RuntimeException(); }
  // not preceding
  public   AccumulatorMetadata (long id, scala.Option<java.lang.String> name, boolean countFailedValues)  { throw new RuntimeException(); }
}
