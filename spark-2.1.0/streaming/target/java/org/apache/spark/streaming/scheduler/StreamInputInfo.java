package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * Track the information of input stream at specified batch time.
 * <p>
 * param:  inputStreamId the input stream id
 * param:  numRecords the number of records in a batch
 * param:  metadata metadata for this batch. It should contain at least one standard field named
 *                 "Description" which maps to the content that will be shown in the UI.
 */
public  class StreamInputInfo implements scala.Product, scala.Serializable {
  /**
   * The key for description in <code>StreamInputInfo.metadata</code>.
   * @return (undocumented)
   */
  static public  java.lang.String METADATA_KEY_DESCRIPTION ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int inputStreamId ()  { throw new RuntimeException(); }
  public  long numRecords ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> metadata ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamInputInfo (int inputStreamId, long numRecords, scala.collection.immutable.Map<java.lang.String, java.lang.Object> metadata)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> metadataDescription ()  { throw new RuntimeException(); }
}
