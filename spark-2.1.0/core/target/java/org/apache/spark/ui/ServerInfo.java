package org.apache.spark.ui;
  class ServerInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.eclipse.jetty.server.Server server ()  { throw new RuntimeException(); }
  public  int boundPort ()  { throw new RuntimeException(); }
  public  org.eclipse.jetty.server.handler.ContextHandlerCollection rootHandler ()  { throw new RuntimeException(); }
  // not preceding
  public   ServerInfo (org.eclipse.jetty.server.Server server, int boundPort, org.eclipse.jetty.server.handler.ContextHandlerCollection rootHandler)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
