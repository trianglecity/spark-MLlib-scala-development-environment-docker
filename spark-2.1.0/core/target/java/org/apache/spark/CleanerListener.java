package org.apache.spark;
/**
 * Listener class used for testing when any item has been cleaned by the Cleaner class.
 */
  interface CleanerListener {
  public  void rddCleaned (int rddId)  ;
  public  void shuffleCleaned (int shuffleId)  ;
  public  void broadcastCleaned (long broadcastId)  ;
  public  void accumCleaned (long accId)  ;
  public  void checkpointCleaned (long rddId)  ;
}
