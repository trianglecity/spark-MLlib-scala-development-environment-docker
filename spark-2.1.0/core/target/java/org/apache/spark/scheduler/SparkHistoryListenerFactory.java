package org.apache.spark.scheduler;
/**
 * Interface for creating history listeners defined in other modules like SQL, which are used to
 * rebuild the history UI.
 */
  interface SparkHistoryListenerFactory {
  /**
   * Create listeners used to rebuild the history UI.
   * @param conf (undocumented)
   * @param sparkUI (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.scheduler.SparkListener> createListeners (org.apache.spark.SparkConf conf, org.apache.spark.ui.SparkUI sparkUI)  ;
}
