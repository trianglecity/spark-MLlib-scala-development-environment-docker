package org.apache.spark.util.random;
/**
 * :: DeveloperApi ::
 * A class with pseudorandom behavior.
 */
public  interface Pseudorandom {
  /** Set random seed. */
  public  void setSeed (long seed)  ;
}
