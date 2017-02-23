package org.apache.spark.sql.catalyst.plans;
public  class ExistenceJoin extends org.apache.spark.sql.catalyst.plans.JoinType implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute exists ()  { throw new RuntimeException(); }
  // not preceding
  public   ExistenceJoin (org.apache.spark.sql.catalyst.expressions.Attribute exists)  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
}
