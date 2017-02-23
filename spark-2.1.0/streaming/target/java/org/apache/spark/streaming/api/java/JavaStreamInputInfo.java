package org.apache.spark.streaming.api.java;
/**
 * Track the information of input stream at specified batch time.
 * <p>
 * param:  inputStreamId the input stream id
 * param:  numRecords the number of records in a batch
 * param:  metadata metadata for this batch. It should contain at least one standard field named
 *                 "Description" which maps to the content that will be shown in the UI.
 * param:  metadataDescription description of this input stream
 */
  class JavaStreamInputInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int inputStreamId ()  { throw new RuntimeException(); }
  public  long numRecords ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> metadata ()  { throw new RuntimeException(); }
  public  java.lang.String metadataDescription ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaStreamInputInfo (int inputStreamId, long numRecords, java.util.Map<java.lang.String, java.lang.Object> metadata, java.lang.String metadataDescription)  { throw new RuntimeException(); }
}
