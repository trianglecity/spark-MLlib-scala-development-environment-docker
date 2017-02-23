package org.apache.spark.util.logging;
/**
 * Defines the policy based on which {@link org.apache.spark.util.logging.RollingFileAppender} will
 * generate rolling files.
 */
  interface RollingPolicy {
  /** Whether rollover should be initiated at this moment */
  public  boolean shouldRollover (long bytesToBeWritten)  ;
  /** Notify that rollover has occurred */
  public  void rolledOver ()  ;
  /** Notify that bytes have been written */
  public  void bytesWritten (long bytes)  ;
  /** Get the desired name of the rollover file */
  public  java.lang.String generateRolledOverFileSuffix ()  ;
}
