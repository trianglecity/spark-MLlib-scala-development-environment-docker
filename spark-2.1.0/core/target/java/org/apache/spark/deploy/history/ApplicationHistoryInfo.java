package org.apache.spark.deploy.history;
  class ApplicationHistoryInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.deploy.history.ApplicationAttemptInfo> attempts ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplicationHistoryInfo (java.lang.String id, java.lang.String name, scala.collection.immutable.List<org.apache.spark.deploy.history.ApplicationAttemptInfo> attempts)  { throw new RuntimeException(); }
  /**
   * Has this application completed?
   * @return true if the most recent attempt has completed
   */
  public  boolean completed ()  { throw new RuntimeException(); }
}
