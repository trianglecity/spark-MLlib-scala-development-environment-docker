package org.apache.spark.deploy.worker;
/**
 * Utility object for launching driver programs such that they share fate with the Worker process.
 * This is used in standalone cluster mode only.
 */
public  class DriverWrapper {
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
