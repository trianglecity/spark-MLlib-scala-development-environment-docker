package org.apache.spark.sql.streaming;
/**
 * :: Experimental ::
 * Information about updates made to stateful operators in a {@link StreamingQuery} during a trigger.
 */
public  class StateOperatorProgress {
  public  long numRowsTotal ()  { throw new RuntimeException(); }
  public  long numRowsUpdated ()  { throw new RuntimeException(); }
  // not preceding
     StateOperatorProgress (long numRowsTotal, long numRowsUpdated)  { throw new RuntimeException(); }
  /** The compact JSON representation of this progress. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this progress. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
}
