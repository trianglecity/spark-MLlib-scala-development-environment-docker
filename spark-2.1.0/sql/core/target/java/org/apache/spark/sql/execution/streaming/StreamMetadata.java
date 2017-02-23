package org.apache.spark.sql.execution.streaming;
/**
 * Contains metadata associated with a {@link StreamingQuery}. This information is written
 * in the checkpoint location the first time a query is started and recovered every time the query
 * is restarted.
 * <p>
 * param:  id  unique id of the {@link StreamingQuery} that needs to be persisted across restarts
 */
public  class StreamMetadata implements scala.Product, scala.Serializable {
  static public  java.lang.Object format ()  { throw new RuntimeException(); }
  /** Read the metadata from file if it exists */
  static public  scala.Option<org.apache.spark.sql.execution.streaming.StreamMetadata> read (org.apache.hadoop.fs.Path metadataFile, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /** Write metadata to file */
  static public  void write (org.apache.spark.sql.execution.streaming.StreamMetadata metadata, org.apache.hadoop.fs.Path metadataFile, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamMetadata (java.lang.String id)  { throw new RuntimeException(); }
  public  java.lang.String json ()  { throw new RuntimeException(); }
}
