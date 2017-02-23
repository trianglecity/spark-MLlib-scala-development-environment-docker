package org.apache.spark.rpc.netty;
  class RpcOutboxMessage implements org.apache.spark.rpc.netty.OutboxMessage, org.apache.spark.network.client.RpcResponseCallback, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.nio.ByteBuffer content ()  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> _onFailure ()  { throw new RuntimeException(); }
  public  scala.Function2<org.apache.spark.network.client.TransportClient, java.nio.ByteBuffer, scala.runtime.BoxedUnit> _onSuccess ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcOutboxMessage (java.nio.ByteBuffer content, scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> _onFailure, scala.Function2<org.apache.spark.network.client.TransportClient, java.nio.ByteBuffer, scala.runtime.BoxedUnit> _onSuccess)  { throw new RuntimeException(); }
  private  org.apache.spark.network.client.TransportClient client ()  { throw new RuntimeException(); }
  private  long requestId ()  { throw new RuntimeException(); }
  public  void sendWith (org.apache.spark.network.client.TransportClient client)  { throw new RuntimeException(); }
  public  void onTimeout ()  { throw new RuntimeException(); }
  public  void onFailure (java.lang.Throwable e)  { throw new RuntimeException(); }
  public  void onSuccess (java.nio.ByteBuffer response)  { throw new RuntimeException(); }
}
