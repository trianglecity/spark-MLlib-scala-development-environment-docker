package org.apache.spark.sql.internal;
public  class HiveSerDe implements scala.Product, scala.Serializable {
  /**
   * Get the Hive SerDe information from the data source abbreviation string or classname.
   * <p>
   * @param source Currently the source abbreviation can be one of the following:
   *               SequenceFile, RCFile, ORC, PARQUET, and case insensitive.
   * @return HiveSerDe associated with the specified source
   */
  static public  scala.Option<org.apache.spark.sql.internal.HiveSerDe> sourceToSerDe (java.lang.String source)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> inputFormat ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputFormat ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> serde ()  { throw new RuntimeException(); }
  // not preceding
  public   HiveSerDe (scala.Option<java.lang.String> inputFormat, scala.Option<java.lang.String> outputFormat, scala.Option<java.lang.String> serde)  { throw new RuntimeException(); }
}
