package org.apache.spark.sql.execution.streaming;
public  class LongOffset$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LongOffset$ MODULE$ = null;
  public   LongOffset$ ()  { throw new RuntimeException(); }
  /**
   * LongOffset factory from serialized offset.
   * @return new LongOffset
   * @param offset (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.LongOffset apply (org.apache.spark.sql.execution.streaming.SerializedOffset offset)  { throw new RuntimeException(); }
  /**
   * Convert generic Offset to LongOffset if possible.
   * @return converted LongOffset
   * @param offset (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.execution.streaming.LongOffset> convert (org.apache.spark.sql.execution.streaming.Offset offset)  { throw new RuntimeException(); }
}
