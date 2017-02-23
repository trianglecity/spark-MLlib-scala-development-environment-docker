package org.apache.spark;
/**
 * An identifier for a partition in an RDD.
 */
public  interface Partition extends scala.Serializable {
  /**
   * Get the partition's index within its parent RDD
   * @return (undocumented)
   */
  public  int index ()  ;
  public  int hashCode ()  ;
  public  boolean equals (Object other)  ;
}
