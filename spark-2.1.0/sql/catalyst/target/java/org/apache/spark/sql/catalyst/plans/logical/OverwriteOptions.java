package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Options for writing new data into a table.
 * <p>
 * param:  enabled whether to overwrite existing data in the table.
 * param:  staticPartitionKeys if non-empty, specifies that we only want to overwrite partitions
 *                            that match this partial partition spec. If empty, all partitions
 *                            will be overwritten.
 */
public  class OverwriteOptions implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  boolean enabled ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> staticPartitionKeys ()  { throw new RuntimeException(); }
  // not preceding
  public   OverwriteOptions (boolean enabled, scala.collection.immutable.Map<java.lang.String, java.lang.String> staticPartitionKeys)  { throw new RuntimeException(); }
}
