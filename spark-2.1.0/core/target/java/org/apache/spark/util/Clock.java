package org.apache.spark.util;
/**
 * An interface to represent clocks, so that they can be mocked out in unit tests.
 */
  interface Clock {
  public  long getTimeMillis ()  ;
  public  long waitTillTime (long targetTime)  ;
}
