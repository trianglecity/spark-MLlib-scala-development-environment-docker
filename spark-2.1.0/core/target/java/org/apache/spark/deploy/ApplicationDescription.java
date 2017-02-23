package org.apache.spark.deploy;
  class ApplicationDescription implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> maxCores ()  { throw new RuntimeException(); }
  public  int memoryPerExecutorMB ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.Command command ()  { throw new RuntimeException(); }
  public  java.lang.String appUiUrl ()  { throw new RuntimeException(); }
  public  scala.Option<java.net.URI> eventLogDir ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> eventLogCodec ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> coresPerExecutor ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> initialExecutorLimit ()  { throw new RuntimeException(); }
  public  java.lang.String user ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplicationDescription (java.lang.String name, scala.Option<java.lang.Object> maxCores, int memoryPerExecutorMB, org.apache.spark.deploy.Command command, java.lang.String appUiUrl, scala.Option<java.net.URI> eventLogDir, scala.Option<java.lang.String> eventLogCodec, scala.Option<java.lang.Object> coresPerExecutor, scala.Option<java.lang.Object> initialExecutorLimit, java.lang.String user)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
