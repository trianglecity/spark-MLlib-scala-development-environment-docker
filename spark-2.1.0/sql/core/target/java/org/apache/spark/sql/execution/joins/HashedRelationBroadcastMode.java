package org.apache.spark.sql.execution.joins;
/** The HashedRelationBroadcastMode requires that rows are broadcasted as a HashedRelation. */
  class HashedRelationBroadcastMode implements org.apache.spark.sql.catalyst.plans.physical.BroadcastMode, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> key ()  { throw new RuntimeException(); }
  // not preceding
  public   HashedRelationBroadcastMode (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> key)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.HashedRelation transform (org.apache.spark.sql.catalyst.InternalRow[] rows)  { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> canonicalizedKey ()  { throw new RuntimeException(); }
  public  boolean compatibleWith (org.apache.spark.sql.catalyst.plans.physical.BroadcastMode other)  { throw new RuntimeException(); }
}
