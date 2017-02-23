package org.apache.spark.sql.catalyst.catalog;
/**
 * A container for bucketing information.
 * Bucketing is a technology for decomposing data sets into more manageable parts, and the number
 * of buckets is fixed so it does not fluctuate with data.
 * <p>
 * param:  numBuckets number of buckets.
 * param:  bucketColumnNames the names of the columns that used to generate the bucket id.
 * param:  sortColumnNames the names of the columns that used to sort data in each bucket.
 */
public  class BucketSpec implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int numBuckets ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> bucketColumnNames ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> sortColumnNames ()  { throw new RuntimeException(); }
  // not preceding
  public   BucketSpec (int numBuckets, scala.collection.Seq<java.lang.String> bucketColumnNames, scala.collection.Seq<java.lang.String> sortColumnNames)  { throw new RuntimeException(); }
}
