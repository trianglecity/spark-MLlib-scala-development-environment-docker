package org.apache.spark.api.python;
/**
 * A wrapper for chained Python functions (from bottom to top).
 * param:  funcs
 */
  class ChainedPythonFunctions implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.api.python.PythonFunction> funcs ()  { throw new RuntimeException(); }
  // not preceding
  public   ChainedPythonFunctions (scala.collection.Seq<org.apache.spark.api.python.PythonFunction> funcs)  { throw new RuntimeException(); }
}
