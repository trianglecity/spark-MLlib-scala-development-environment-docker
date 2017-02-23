package org.apache.spark;
  class GetMapOutputMessage implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcCallContext context ()  { throw new RuntimeException(); }
  // not preceding
  public   GetMapOutputMessage (int shuffleId, org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
}
