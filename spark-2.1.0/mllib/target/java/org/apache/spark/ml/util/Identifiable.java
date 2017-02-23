package org.apache.spark.ml.util;
/**
 * :: DeveloperApi ::
 * <p>
 * Trait for an object with an immutable unique ID that identifies itself and its derivatives.
 * <p>
 * WARNING: There have not yet been final discussions on this API, so it may be broken in future
 *          releases.
 */
public  interface Identifiable {
  /**
   * An immutable unique ID for the object and its derivatives.
   * @return (undocumented)
   */
  public  java.lang.String uid ()  ;
  public  java.lang.String toString ()  ;
}
