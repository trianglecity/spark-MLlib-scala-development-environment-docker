package org.apache.spark.deploy.history;
/**
 * Cache key: compares on <code>appId</code> and then, if non-empty, <code>attemptId</code>.
 * The {@link hashCode()} function uses the same fields.
 * param:  appId application ID
 * param:  attemptId attempt ID
 */
 final class CacheKey implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> attemptId ()  { throw new RuntimeException(); }
  // not preceding
  public   CacheKey (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
