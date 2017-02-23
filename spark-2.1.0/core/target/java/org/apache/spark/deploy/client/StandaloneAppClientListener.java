package org.apache.spark.deploy.client;
/**
 * Callbacks invoked by deploy client when various events happen. There are currently four events:
 * connecting to the cluster, disconnecting, being given an executor, and having an executor
 * removed (either due to failure or due to revocation).
 * <p>
 * Users of this API should *not* block inside the callback methods.
 */
  interface StandaloneAppClientListener {
  public  void connected (java.lang.String appId)  ;
  /** Disconnection may be a temporary state, as we fail over to a new Master. */
  public  void disconnected ()  ;
  /** An application death is an unrecoverable failure condition. */
  public  void dead (java.lang.String reason)  ;
  public  void executorAdded (java.lang.String fullId, java.lang.String workerId, java.lang.String hostPort, int cores, int memory)  ;
  public  void executorRemoved (java.lang.String fullId, java.lang.String message, scala.Option<java.lang.Object> exitStatus, boolean workerLost)  ;
}
