package org.apache.spark.rpc;
  class RpcEnvConfig implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String bindAddress ()  { throw new RuntimeException(); }
  public  java.lang.String advertiseAddress ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager ()  { throw new RuntimeException(); }
  public  boolean clientMode ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcEnvConfig (org.apache.spark.SparkConf conf, java.lang.String name, java.lang.String bindAddress, java.lang.String advertiseAddress, int port, org.apache.spark.SecurityManager securityManager, boolean clientMode)  { throw new RuntimeException(); }
}
