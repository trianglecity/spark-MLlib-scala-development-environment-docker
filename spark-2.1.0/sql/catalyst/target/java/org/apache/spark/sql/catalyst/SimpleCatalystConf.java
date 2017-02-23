package org.apache.spark.sql.catalyst;
/** A CatalystConf that can be used for local testing. */
public  class SimpleCatalystConf implements org.apache.spark.sql.catalyst.CatalystConf, scala.Product, scala.Serializable {
  static public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  boolean caseSensitiveAnalysis ()  { throw new RuntimeException(); }
  public  boolean orderByOrdinal ()  { throw new RuntimeException(); }
  public  boolean groupByOrdinal ()  { throw new RuntimeException(); }
  public  int optimizerMaxIterations ()  { throw new RuntimeException(); }
  public  int optimizerInSetConversionThreshold ()  { throw new RuntimeException(); }
  public  int maxCaseBranchesForCodegen ()  { throw new RuntimeException(); }
  public  boolean runSQLonFile ()  { throw new RuntimeException(); }
  public  boolean crossJoinEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String warehousePath ()  { throw new RuntimeException(); }
  // not preceding
  public   SimpleCatalystConf (boolean caseSensitiveAnalysis, boolean orderByOrdinal, boolean groupByOrdinal, int optimizerMaxIterations, int optimizerInSetConversionThreshold, int maxCaseBranchesForCodegen, boolean runSQLonFile, boolean crossJoinEnabled, java.lang.String warehousePath)  { throw new RuntimeException(); }
}
