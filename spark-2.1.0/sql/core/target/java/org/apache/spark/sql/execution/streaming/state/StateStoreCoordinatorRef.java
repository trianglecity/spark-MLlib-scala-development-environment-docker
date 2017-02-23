package org.apache.spark.sql.execution.streaming.state;
/**
 * Reference to a {@link StateStoreCoordinator} that can be used to coordinate instances of
 * {@link StateStore}s across all the executors, and get their locations for job scheduling.
 */
public  class StateStoreCoordinatorRef {
  static private  java.lang.String endpointName ()  { throw new RuntimeException(); }
  /**
   * Create a reference to a {@link StateStoreCoordinator}
   * @param env (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef forDriver (org.apache.spark.SparkEnv env)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef forExecutor (org.apache.spark.SparkEnv env)  { throw new RuntimeException(); }
  private   StateStoreCoordinatorRef (org.apache.spark.rpc.RpcEndpointRef rpcEndpointRef)  { throw new RuntimeException(); }
    void reportActiveInstance (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId, java.lang.String host, java.lang.String executorId)  { throw new RuntimeException(); }
  /** Verify whether the given executor has the active instance of a state store */
    boolean verifyIfInstanceActive (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId, java.lang.String executorId)  { throw new RuntimeException(); }
  /** Get the location of the state store */
    scala.Option<java.lang.String> getLocation (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  { throw new RuntimeException(); }
  /** Deactivate instances related to a set of operator */
    void deactivateInstances (java.lang.String storeRootLocation)  { throw new RuntimeException(); }
    void stop ()  { throw new RuntimeException(); }
}
