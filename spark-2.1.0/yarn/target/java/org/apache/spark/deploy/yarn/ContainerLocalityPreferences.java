package org.apache.spark.deploy.yarn;
  class ContainerLocalityPreferences implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String[] nodes ()  { throw new RuntimeException(); }
  public  java.lang.String[] racks ()  { throw new RuntimeException(); }
  // not preceding
  public   ContainerLocalityPreferences (java.lang.String[] nodes, java.lang.String[] racks)  { throw new RuntimeException(); }
}
