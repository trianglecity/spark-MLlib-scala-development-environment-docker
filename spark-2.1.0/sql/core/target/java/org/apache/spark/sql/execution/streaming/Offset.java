package org.apache.spark.sql.execution.streaming;
/**
 * An offset is a monotonically increasing metric used to track progress in the computation of a
 * stream. Since offsets are retrieved from a {@link Source} by a single thread, we know the global
 * ordering of two {@link Offset} instances.  We do assume that if two offsets are <code>equal</code> then no
 * new data has arrived.
 */
public abstract class Offset {
  public   Offset ()  { throw new RuntimeException(); }
  /**
   * Equality based on JSON string representation. We leverage the
   * JSON representation for normalization between the Offset's
   * in memory and on disk representations.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * A JSON-serialized representation of an Offset that is
   * used for saving offsets to the offset log.
   * Note: We assume that equivalent/equal offsets serialize to
   * identical JSON strings.
   * <p>
   * @return JSON string encoding
   */
  public abstract  java.lang.String json ()  ;
}
