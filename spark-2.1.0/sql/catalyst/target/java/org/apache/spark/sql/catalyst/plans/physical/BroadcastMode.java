package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Marker trait to identify the shape in which tuples are broadcasted. Typical examples of this are
 * identity (tuples remain unchanged) or hashed (tuples are converted into some hash index).
 */
public  interface BroadcastMode {
  public  Object transform (org.apache.spark.sql.catalyst.InternalRow[] rows)  ;
  /**
   * Returns true iff this {@link BroadcastMode} generates the same result as <code>other</code>.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  boolean compatibleWith (org.apache.spark.sql.catalyst.plans.physical.BroadcastMode other)  ;
}
