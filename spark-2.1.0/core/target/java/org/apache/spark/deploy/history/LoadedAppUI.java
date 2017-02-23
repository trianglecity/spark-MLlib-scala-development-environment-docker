package org.apache.spark.deploy.history;
/**
 * All the information returned from a call to <code>getAppUI()</code>: the new UI
 * and any required update state.
 * param:  ui Spark UI
 * param:  updateProbe probe to call to check on the update state of this application attempt
 */
  class LoadedAppUI implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.ui.SparkUI ui ()  { throw new RuntimeException(); }
  public  scala.Function0<java.lang.Object> updateProbe ()  { throw new RuntimeException(); }
  // not preceding
  public   LoadedAppUI (org.apache.spark.ui.SparkUI ui, scala.Function0<java.lang.Object> updateProbe)  { throw new RuntimeException(); }
}
