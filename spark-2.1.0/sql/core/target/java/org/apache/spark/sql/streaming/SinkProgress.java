package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * Information about progress made for a sink in the execution of a {@link StreamingQuery}
 * during a trigger. See {@link StreamingQueryProgress} for more information.
 * <p>
 * param:  description Description of the source corresponding to this status.
 * @since 2.1.0
 */
public  class SinkProgress {
  public  java.lang.String description ()  { throw new RuntimeException(); }
  // not preceding
  protected   SinkProgress (java.lang.String description)  { throw new RuntimeException(); }
  /** The compact JSON representation of this progress. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this progress. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
}
