package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Task failed to fetch shuffle data from a remote node. Probably means we have lost the remote
 * executors the task is trying to fetch from, and thus need to rerun the previous stage.
 */
public  class FetchFailed implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId bmAddress ()  { throw new RuntimeException(); }
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  int mapId ()  { throw new RuntimeException(); }
  public  int reduceId ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  // not preceding
  public   FetchFailed (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, int mapId, int reduceId, java.lang.String message)  { throw new RuntimeException(); }
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
  /**
   * Fetch failures lead to a different failure handling path: (1) we don't abort the stage after
   * 4 task failures, instead we immediately go back to the stage which generated the map output,
   * and regenerate the missing data.  (2) we don't count fetch failures for blacklisting, since
   * presumably its not the fault of the executor where the task ran, but the executor which
   * stored the data. This is especially important because we we might rack up a bunch of
   * fetch-failures in rapid succession, on all nodes of the cluster, due to one bad node.
   * @return (undocumented)
   */
  public  boolean countTowardsTaskFailures ()  { throw new RuntimeException(); }
}
