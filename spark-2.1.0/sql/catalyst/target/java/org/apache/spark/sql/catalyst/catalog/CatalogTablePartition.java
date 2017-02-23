package org.apache.spark.sql.catalyst.catalog;
/**
 * A partition (Hive style) defined in the catalog.
 * <p>
 * param:  spec partition spec values indexed by column name
 * param:  storage storage format of the partition
 * param:  parameters some parameters for the partition, for example, stats.
 */
public  class CatalogTablePartition implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> spec ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat storage ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters ()  { throw new RuntimeException(); }
  // not preceding
  public   CatalogTablePartition (scala.collection.immutable.Map<java.lang.String, java.lang.String> spec, org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat storage, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** Return the partition location, assuming it is specified. */
  public  java.lang.String location ()  { throw new RuntimeException(); }
  /**
   * Given the partition schema, returns a row with that schema holding the partition values.
   * @param partitionSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow toRow (org.apache.spark.sql.types.StructType partitionSchema)  { throw new RuntimeException(); }
}
