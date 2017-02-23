package org.apache.spark.sql.execution.datasources;
/**
 * A collection of data files from a partitioned relation, along with the partition values in the
 * form of an {@link InternalRow}.
 */
public  class PartitionDirectory implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow values ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitionDirectory (org.apache.spark.sql.catalyst.InternalRow values, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
}
